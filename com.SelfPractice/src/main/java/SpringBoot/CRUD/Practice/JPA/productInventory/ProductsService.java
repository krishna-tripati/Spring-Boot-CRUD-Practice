package SpringBoot.CRUD.Practice.JPA.productInventory;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {

   private final ProductsRepository productRepository;

    public ProductsService(ProductsRepository productRepository) {
        this.productRepository = productRepository;
    }


    //getting all products
    public List<Products> getAllList(){
        return productRepository.findAll();
    }

    //getting by id
    public Optional<Products> getById(int id){
        return productRepository.findById(id);
    }

     //getting by product category
    public List<Products> getByProductCategory(String category){
        return productRepository.getByCategory(category);
    }

    //adding data
    public String addProduct(Products product){
         productRepository.save(product);
         return "product added successfully";
    }

    //update data
    public String updateById(Products product, int id){
       Products p=  productRepository.findById(id).orElse(null);
        if (p==null){
          return   "product id doesn't exits";
        }else {
            p.setProductName(product.getProductName());
            p.setCategory(product.getCategory());
            p.setPrice(product.getPrice());
            p.setQuantity(product.getQuantity());
            productRepository.save(p);
            return "updated Data";
        }
    }

    //delete by id
    public String deteteById(int id){
        Products p= productRepository.findById(id).orElse(null);
        if (p == null) {
            return "product id doesn't exits";
        }else {
            productRepository.delete(p);
            return "deleted ";
        }

    }

    //Find products cheaper than a given price
    public List<Products> getByPriceLessThan(double price){
        return productRepository.getByPriceLessThan(price);
    }

    //Find products between two prices
    public List<Products> getByPriceBetween(double minprice, double maxprice){
        return productRepository.getByPriceBetween(minprice, maxprice);
    }

    //Find products whose name contains a word
    public List<Products> getByprodutNameContains(String name){
        return productRepository.getByProductNameContaining(name);
    }

    // Find products with quantity less than a given number
    public List<Products> getByQuantityLessThan(int quantity){
        return productRepository.getByQuantityLessThan(quantity);
    }

   //price lowest to height
    public List<Products> priceLowestToHeighest(){
        return productRepository.getByOrderByPriceAsc();
    }

     //price height to lowest
    public List<Products> priceHighestToLower(){
        return productRepository.getByOrderByPriceDesc();
    }

    // A to Z order
    public List<Products> AtoZOrder(){
        return productRepository.findByOrderByProductNameAsc();
    }

     public List<Products> ZtoAOrder(){
        return productRepository.findByOrderByProductNameDesc();
     }

}
