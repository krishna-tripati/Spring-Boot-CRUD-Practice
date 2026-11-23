package SpringBoot.CRUD.Practice.JPA.productInventory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {

    List<Products> getByCategory(String category);
    List<Products> getByPriceLessThan(double price);
    List<Products> getByPriceBetween(double minprice, double maxprice);
    List<Products> getByProductNameContaining(String productName);
    List<Products> getByQuantityLessThan(int quantity);

    //get price lowest to highest //findByOrderByPriceAsc();
    List<Products> getByOrderByPriceAsc();
     // highest to lowest
    List<Products> getByOrderByPriceDesc();

    // A to Z order
    List<Products> findByOrderByProductNameAsc();
    // Z to A order
    List<Products> findByOrderByProductNameDesc();
}



