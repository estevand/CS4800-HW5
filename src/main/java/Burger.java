public class Burger implements Item
{
    private final double basePrice;
    public Burger(double basePrice)
    {
        this.basePrice = basePrice;
    }

    @Override
    public double getCost()
    {
        return basePrice;
    }
}
