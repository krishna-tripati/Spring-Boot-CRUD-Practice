package SpringBoot.CRUD.Practice.ProductManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.allProductsList();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable ("id") int id){
        return productService.getProductById(id);
    }

    @GetMapping("/category/{category}")
    public List<Product> getProductByList(@PathVariable ("category") String category){
        return productService.getProductByCategory(category);
    }

    @PostMapping("/add")
    public String addProduct(@RequestBody Product p){
       return productService.addProducts(p);
    }

    @PutMapping("/update/{id}")
    public String updateProduct(@RequestBody Product p, @PathVariable ("id") int id){
        return productService.updateProductById(p,id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteById(@PathVariable ("id") int id){
        return productService.deleteById(id);
    }

    @GetMapping("/stockvalue")
    public void ProductStockValue(){
         productService.productStockValue();
    }
}
