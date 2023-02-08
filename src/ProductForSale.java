public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;



    public double getSalesPrice(int quantity){
        return quantity * price;

    }
    public void printPricedLineItem(int quantity){
        System.out.println(quantity + " is quantity, and the price is: " + price);
    }
   public abstract void showDetails();

}
