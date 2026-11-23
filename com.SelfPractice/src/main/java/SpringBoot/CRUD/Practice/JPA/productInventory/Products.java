package SpringBoot.CRUD.Practice.JPA.productInventory;

import jakarta.persistence.*;

@Entity
@Table (name = "Products")
public class Products {
    @Id
   // @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int productId;
    @Column(name = "productName")
    private String productName;
    @Column(name="category")
    private String category;
    @Column(name = "price")
    private double price;
    @Column(name = "quantity")
    private int quantity;

    public Products() {
    }

    public Products(int quantity, double price, String category, String productName, int productId) {
        this.quantity = quantity;
        this.price = price;
        this.category = category;
        this.productName = productName;
        this.productId = productId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
