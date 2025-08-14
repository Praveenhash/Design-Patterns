public class Product extends ProductPrototype{
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    @Override
    public ProductPrototype Clone() {
        return new Product(name, price);
    }

    @Override
    public void display() {
        System.out.println("Product name is : "+name);
        System.out.println("Product price is : "+price);
    }
}
