public class ExtraCheeseDecorator extends Decorator{
    private double ExtraCheesePrice;

    public ExtraCheeseDecorator(BasePizza pizza, double ExtraCheesePrice){
        super(pizza);
        this.ExtraCheesePrice = ExtraCheesePrice;
    }
    public String Description() {
        return basePizza.Description() + " with Extra Cheese";
    }

    @Override
    public double price() {
        return basePizza.price() + ExtraCheesePrice;
    }
}
