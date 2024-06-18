package com.deepak.calling_3rdpartyapi.Service;

import com.deepak.calling_3rdpartyapi.Models.Category;
import com.deepak.calling_3rdpartyapi.Models.Product;
import com.deepak.calling_3rdpartyapi.dtos.FakeStoreResposeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakestoreProductservice implements  ProductService{
    private RestTemplate restTemplate ;
    public FakestoreProductservice (RestTemplate restTemplate){
        this.restTemplate = restTemplate ;
    }
    @Override
    public Product getProductbyId(Long id) {
       FakeStoreResposeDTO fsrd = restTemplate.getForObject("https://fakestoreapi.com/Products/"+id, FakeStoreResposeDTO.class);
    if(fsrd==null){
        return null ;
    }

    //  if there is any response than convert to product
      return converFakestoredtosToProduct(fsrd) ;

        }
        public Product converFakestoredtosToProduct(FakeStoreResposeDTO fsrd){
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
        public Product[] getAllProducts(){
        FakeStoreResposeDTO[] ftdo = restTemplate.getForObject("https://fakestoreapi.com/Products/", FakeStoreResposeDTO[].class) ;

        if(ftdo==null){
            return null ;
        }
        Product[] products = new Product[ftdo.length] ;
        for(int i =0;i< ftdo.length;i++){
            products[i] = converFakestoredtosToProduct(ftdo[i]) ;
        }
        return products;
        }
    @Override
    public Product UpdateProduct(Long id) {
        return null;
    }

    @Override
    public Product DeleteProduct(Long id) {
        return null;
    }

    @Override
    public Product CreateProduct(Product p) {
        return null;
    }
}
