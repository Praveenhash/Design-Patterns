public class ExtraToppingsDecorator extends Decorator{
    private double ExtraToppingsPrice;
    public ExtraToppingsDecorator(BasePizza basePizza, double ExtraToppingsPrice){
        super(basePizza);
        this.ExtraToppingsPrice = ExtraToppingsPrice;
    }

    @Override
    public String Description() {
        return basePizza.Description() + " With Extra Toppings";
    }

    @Override
    public double price() {
        return basePizza.price() + ExtraToppingsPrice;
    }
}
