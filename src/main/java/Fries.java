public class Fries implements Item
{
    private final double basePrice;
    public Fries(double basePrice)
    {
        this.basePrice = basePrice;
    }

    @Override
    public double getCost()
    {
        return basePrice;
    }
}
