public class Product {

    private double price;
    private int Quantity;
     Product(){

     }
     Product(int Quantity){
         this.Quantity=Quantity;
     }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(int Quantity){

      return price*Quantity;
    }

    public static void main(String[] args) {

        Product product=new Product();
        Product product1=new Product(10);
        product.getPrice();
        product1.getPrice();
    }
}
