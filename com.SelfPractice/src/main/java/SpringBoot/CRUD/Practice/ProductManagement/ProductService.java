package SpringBoot.CRUD.Practice.ProductManagement;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    ArrayList<Product> products=new ArrayList<>();

    public List<Product> allProductsList(){
        return products;
    }

    public Product getProductById(int id){
        for(Product p: products){
            if(p.getProductId()==id){
                return p;
            }
        }
        return null;
    }


    public List<Product> getProductByCategory(String category){
        ArrayList<Product> categories=new ArrayList<>();
        for(Product p: products){
            if(p.getpCategory().equalsIgnoreCase(category)){
                categories.add(p);
            }
        }
        return categories;
    }

    public String addProducts(Product product){
        products.add(product);
        return "product added";
    }

    public String updateProductById(Product product, int id){
        for(Product p: products){
            if(p.getProductId()==id){
                p.setProductName(product.getProductName());
                p.setpCategory(product.getpCategory());
                p.setpPrice(product.getpPrice());
                p.setpQuantity(product.getpQuantity());
                return "updated successfully";
            }
        }
       return "id doesn't exits";
    }

    public String deleteById(int id){
         for(int i=0; i<products.size(); i++){
             if(products.get(i).getProductId()==id){
                 products.remove(i);
                 return "deleted";
             }
         }
         return "id doesn't exit";
    }

    //stock value
    public void productStockValue(){
        for(Product p: products){
            System.out.println(p.getProductName()+" " +p.getpPrice()+" * "+p.getpQuantity() +" = "+ p.getpPrice()*p.getpQuantity());
        }

    }

}
