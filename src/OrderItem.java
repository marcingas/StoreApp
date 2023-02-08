public abstract class OrderItem {
    private int quantity;
    private String product;

    public OrderItem(int quantity, String product) {
        this.quantity = quantity;
        this.product = product;
    }
}
