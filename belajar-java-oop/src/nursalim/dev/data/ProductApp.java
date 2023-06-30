package nursalim.dev.data;
public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Sabun", 1000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
