import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Product {
    private static Product productInstance;

    private Product(){
        System.out.println("Payment Gateway Manager initialized for the product....!");
    }
    private static Lock mtx = new ReentrantLock();
    public static Product getProductInstance(){
        if(productInstance == null){
            mtx.lock();
            try{
                if(productInstance == null){
                    productInstance = new Product();
                }
            }finally {
                mtx.unlock();
            }
        }
        return productInstance;
    }

    public void processPayment(double amount){
        System.out.println("Processing Payment for the amount "+amount);
    }
}
