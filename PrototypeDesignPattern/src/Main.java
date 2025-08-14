public class Main {
    public static void main(String[] args) {

        ProductPrototype product = new Product("Xiaomi Pad 6", 27550);

        ProductPrototype product1 = product.Clone();

        System.out.println("Original Product......!");
        product.display();
        System.out.println("-------------------------------------");
        System.out.println("Cloned Product........!");
        product1.display();
    }
}