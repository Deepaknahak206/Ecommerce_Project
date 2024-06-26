package com.deepak.calling_3rdpartyapi.Service;

import com.deepak.calling_3rdpartyapi.ExceptionHandling.ProductNotExist;
import com.deepak.calling_3rdpartyapi.Models.Category;
import com.deepak.calling_3rdpartyapi.Models.Product;
import com.deepak.calling_3rdpartyapi.Repo.CategoryRepo;
import com.deepak.calling_3rdpartyapi.Repo.ProductRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service("SelfProductService")
public class SelfProductService implements  ProductService{

private ProductRepo productRepo ;
    private CategoryRepo categoryRepo ;
SelfProductService(ProductRepo productRepo, CategoryRepo categoryRepo){

    this.productRepo=productRepo ;
    this.categoryRepo=categoryRepo ;
}
    @Override
    public Product getProductById(long id) throws ProductNotExist {
        return null;
    }

    @Override
    public Product DeleteProduct(Long id) {
        return null;
    }

    @Override
    public Product[] getAllProducts() throws ProductNotExist {
        return new Product[0];
    }

    @Override
    public Product createProduct(Product p) {
// Before saving product we need to create category in db
        Category category = p.getCategory();
        if(category.getId()==null){
         Category savedcategory = (Category) categoryRepo.save(category) ;
         p.setCategory(savedcategory);
        }else{
           throw new RuntimeException("Hangon Id exists") ;
        }
     Product saveProduct = productRepo.save(p);
        Optional<Category> optionalCategory = categoryRepo.findById(category.getId()) ;
        if(optionalCategory.isEmpty()){
            throw new RuntimeException("Category is Not found");
        }
        saveProduct.setCategory(optionalCategory.get());
        //check edge cases
      return saveProduct ;
    }

    @Override
    public Product updateProduct(String id, Product product) {
        return null;
    }
}
