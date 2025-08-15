public class ExtraSauceDecorator extends Decorator{
    private double ExtraSaucePrice;

    public ExtraSauceDecorator(BasePizza pizza, double extraSaucePrice){
        super(pizza);
        this.ExtraSaucePrice = extraSaucePrice;
    }

    @Override
    public String Description() {
        return basePizza.Description() + " With extra sauce";
    }

    @Override
    public double price() {
        return basePizza.price() + ExtraSaucePrice;
    }
}
