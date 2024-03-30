public class Hotdog implements Item
{
    private final double basePrice;
    public Hotdog(double basePrice)
    {
        this.basePrice = basePrice;
    }

    @Override
    public double getCost()
    {
        return basePrice;
    }
}
