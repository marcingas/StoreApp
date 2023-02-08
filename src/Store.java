import java.util.ArrayList;

record OrderItem(int quantity, ProductForSale product){

}
public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
   public static void main(String[] args) {
      storeProducts.add(new ArtObject("Oil Paintings", 1500, "Impressionistic work by John Whale in 2010"));
      storeProducts.add(new ArtObject("Sculpture", 2000, "Bronze work by Paul Newman, produce in 1950" ));
      listProducts();

   }
   public static void listProducts(){
       for (var item : storeProducts){
           System.out.println("-".repeat(30));
           item.showDetails();
       }
   }
    public void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int quantity){
       order.add(new OrderItem(quantity, storeProducts.get(orderIndex)));

    }
    public void printOrderedItems(ArrayList<OrderItem>order){
       double salesTotal = 0;
       for(var item : order){
           item.product().printPricedItem(item.quantity());
           salesTotal += item.product().getSalesPrice(item.quantity());
       }
        System.out.printf("Sales total = $%6.2f %n", salesTotal);
    }
}