package SpringBoot.CRUD.Practice.JPA.productInventory;


import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/productinventory")
public class ProductsController {

   private final ProductsService service;

    public ProductsController(ProductsService service) {
        this.service = service;
    }

    @GetMapping
    public String home(){
        return " home page";
    }

   @GetMapping("/list")
    public List<Products> getAllProductList(){
       return service.getAllList();
   }

   @GetMapping("/list/{id}")
    public Optional<Products> getById(@PathVariable ("id") int id){
       return service.getById(id);
   }

  @GetMapping("/category/{category}")
    public List<Products> getByCategory(@PathVariable ("category") String category){
       return service.getByProductCategory(category);
  }

  @PostMapping("/add")
    public String addproduct(@RequestBody Products product){
        return service.addProduct(product);
  }

  @PutMapping("/update/{id}")
    public String updateById(@RequestBody Products product, @PathVariable ("id") int id){
        return service.updateById(product,id);
  }

  @DeleteMapping("/delete/{id}")
  public String deleteById(@PathVariable ("id") int id){
        return service.deteteById(id);
  }

  @GetMapping("/price/{price}")
    public List<Products> getByPriceLessThan(@PathVariable ("price") double price){
        return service.getByPriceLessThan(price);
  }

  @GetMapping("/price/between/{minprice}/{maxprice}")
  public List<Products> getByPriceBetween(@PathVariable ("minprice") double  minprice,
                                          @PathVariable  ("maxprice") double maxprice){
        return service.getByPriceBetween(minprice, maxprice);
  }

  @GetMapping("/contains/{name}")
    public List<Products> getByProductNameContains(@PathVariable  String name){
        return service.getByprodutNameContains(name);
  }

  @GetMapping("/quantity/{quantity}")
    public List<Products> getByQuantity(@PathVariable  int quantity){
        return service.getByQuantityLessThan(quantity);
  }

  //Price ascending
    @GetMapping("/sort/price/asc")
    public List<Products> asc(){
        return service.priceLowestToHeighest();
    }

    //price descending
    @GetMapping("/sort/price/desc")
    public List<Products> desc(){
        return service.priceHighestToLower();
    }

    @GetMapping("/sort/name/atoz")
    public List<Products> nameAsc(){
        return service.AtoZOrder();
    }

    @GetMapping("/sort/name/ztoa")
    public List<Products> nameDesc(){
        return service.ZtoAOrder();
    }
}
