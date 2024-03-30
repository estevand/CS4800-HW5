public class Pickles extends Toppings
{
    private final double cost;

    public Pickles(Item item, double cost)
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
