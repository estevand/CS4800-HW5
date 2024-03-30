public class Ketchup extends Toppings
{
    private final double cost;

    public Ketchup(Item item, double cost)
    {
        super(item);
        this.cost = cost;
    }
    @Override
    public double getCost()
    {
        return item.getCost() + cost;
    }
}
