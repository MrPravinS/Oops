package Encapsulation;

class Product{
    private int productId;
    private String productName;
    private float productPrice;

    public void setID(int id){
       this.productId = id;
    }

     public void setProduct(String name){
       this.productName = name;
    }
     public void setPrice(float price){
       this.productPrice = price;
    }

    public int getId(){
        return productId;
    }
    public String getProductName(){
        return productName;
    }
    public float getPrice(){
        return productPrice;
    }

}

public class part_03 {
    public static void main(String[] args) {
        Product product = new Product();
        product.setID(11);
        product.setProduct("Laptop");
        product.setPrice(200);

        System.out.println("Product Details: \nProduct ID: "+ product.getId() + "\nProduct Name : " + product.getProductName()+ "\nPrice : "+ product.getPrice());
    }
    
}
