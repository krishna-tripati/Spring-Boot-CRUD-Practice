package SpringBoot.CRUD.Practice.ProductManagement;

public class Product {

    private int productId;
    private String productName;
    private String pCategory;
    private double pPrice;
    private int pQuantity;

    public Product() {
    }

    public Product(int productId, String productName, String pCategory, double pPrice, int pQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.pCategory = pCategory;
        this.pPrice = pPrice;
        this.pQuantity = pQuantity;
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

    public String getpCategory() {
        return pCategory;
    }

    public void setpCategory(String pCategory) {
        this.pCategory = pCategory;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }

    public int getpQuantity() {
        return pQuantity;
    }

    public void setpQuantity(int pQuantity) {
        this.pQuantity = pQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", pCategory='" + pCategory + '\'' +
                ", pPrice=" + pPrice +
                ", pQuantity=" + pQuantity +
                '}';
    }
}
