public class Main {
    public static void main(String[] args) {
        Product product = Product.getProductInstance();
        product.processPayment(1555.55);

        Product product1 = Product.getProductInstance();
        product1.processPayment(5555);
        System.out.println("New object has been created.....!" + product);
        System.out.println("New object has been created.....!" + product1);
//        if(product == product1){
//            System.out.println("Both instances are the same. Singleton pattern is working.");
//        }else {
//            System.out.println("Singleton pattern is not working........!");
//        }
    }
}