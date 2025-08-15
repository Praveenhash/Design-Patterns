public class VeggieLoadedPizza implements BasePizza{
    @Override
    public String Description() {
        return "Regular size loaded veggie Pizza";
    }

    @Override
    public double price() {
        return 180;
    }
}
