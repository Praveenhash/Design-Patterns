abstract public class Decorator implements BasePizza{
    protected BasePizza basePizza;

    public Decorator(BasePizza pizza){
        this.basePizza = pizza;
    }
}
