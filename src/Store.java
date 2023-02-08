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
    public void addItemToOrder(){}
    public void printOrderedItems(){}
}