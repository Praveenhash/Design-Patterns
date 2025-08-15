public class FarmHousePizza implements BasePizza{
    @Override
    public String Description() {
        return "Regular Size FarmHouse Pizza";
    }

    @Override
    public double price() {
        return 250;
    }
}
