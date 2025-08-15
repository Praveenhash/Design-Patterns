public class Main {
    public static void main(String[] args) {
        BasePizza margarita = new MargaritaPizza();
        margarita = new ExtraCheeseDecorator(new MargaritaPizza(), 15);
        margarita = new ExtraSauceDecorator(margarita, 25);
        margarita = new ExtraToppingsDecorator(margarita, 50);

        System.out.println("Description of the order is : "+ margarita.Description());
        System.out.println("Total price of the order is : "+ margarita.price());
    }
}