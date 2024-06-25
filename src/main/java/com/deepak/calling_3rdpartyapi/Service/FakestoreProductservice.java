package com.deepak.calling_3rdpartyapi.Service;

import com.deepak.calling_3rdpartyapi.ExceptionHandling.ProductNotExist;
import com.deepak.calling_3rdpartyapi.Models.Category;
import com.deepak.calling_3rdpartyapi.Models.Product;
import com.deepak.calling_3rdpartyapi.dtos.FakeStoreRequestDTO;
import com.deepak.calling_3rdpartyapi.dtos.FakeStoreResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FakestoreProductservice implements  ProductService{

    private RestTemplate restTemplate ;
    FakestoreProductservice(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getProductById(long id) throws ProductNotExist {
        FakeStoreResponseDTO fsrd = restTemplate.getForObject("https://fakestoreapi.com/Products/"+id, FakeStoreResponseDTO.class);
        if(fsrd==null){
            throw new ProductNotExist("Product not Exist");
        }

        //  if there is any response than convert to product
        return converFakestoredtosToProduct(fsrd) ;
    }
    public Product converFakestoredtosToProduct(FakeStoreResponseDTO fsrd){
        Product p = new Product() ;
        p.setId(fsrd.getId());
        p.setTitle(fsrd.getTitle());
        p.setPrice(fsrd.getPrice());
        p.setImage(fsrd.getImage());
        p.setDescription(fsrd.getDescription());

        Category c = new Category();
        c.setTitle(fsrd.getCategory());
        c.setId(fsrd.getId());
        p.setCategory(c);
        return p ;
    }
    public FakeStoreRequestDTO ConvertProductToFakeStoreDTO(Product p){
        FakeStoreRequestDTO fsrd = new FakeStoreRequestDTO() ;
//        fsrd.setId(p.getId());  // Generate from Database
        fsrd.setTitle(p.getTitle());
        fsrd.setDescription(p.getDescription());
        fsrd.setPrice(p.getPrice());
        fsrd.setImage(p.getImage());
        fsrd.setCategory(p.getCategory().getTitle());

        return fsrd ;
    }
    @Override
    public Product DeleteProduct(Long id) {
        return null;
    }

    @Override
    public Product[] getAllProducts() throws ProductNotExist {
        FakeStoreResponseDTO[] ftdo = restTemplate.getForObject("https://fakestoreapi.com/Products/", FakeStoreResponseDTO[].class) ;

        if(ftdo==null){
            return  null ;
        }
        Product[] products = new Product[ftdo.length] ;
        for(int i =0;i< ftdo.length;i++){
            products[i] = converFakestoredtosToProduct(ftdo[i]) ;
        }
        return products;
    }

    @Override
    public Product createProduct(Product p) {
        FakeStoreRequestDTO fsrd = ConvertProductToFakeStoreDTO(p);
        FakeStoreResponseDTO response = restTemplate.postForObject("https://fakestoreapi.com/products/", fsrd, FakeStoreResponseDTO.class);
        if(response==null){
            throw  new RuntimeException("Product is null") ;
        }
        return converFakestoredtosToProduct(response) ;
    }

    @Override
    public Product updateProduct(String id, Product product) {
        FakeStoreRequestDTO fakeStoreRequestDTO = ConvertProductToFakeStoreDTO(product) ;
        try{
            restTemplate.put("https://fakestoreapi.com/products/"+id,fakeStoreRequestDTO);
        }catch (Exception e){
            throw new RuntimeException("Product Not updated") ;
        }
        return product ;
    }
}
