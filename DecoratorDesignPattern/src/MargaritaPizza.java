public class MargaritaPizza implements BasePizza{
    @Override
    public String Description() {
        return "Regular Size Margarita Pizza";
    }

    @Override
    public double price() {
        return 150;
    }
}
