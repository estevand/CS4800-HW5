import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DriverTest
{
    @Test
    public void testGetTotalCost()
    {
        Order order1 = new Order();
        Item burger = new Burger(5.00);
        Item fries = new Fries(3.00);
        Item hotdog = new Hotdog(2.50);
        Item burgerPlus = new Pickles(burger, 1.00);
        Item hotdogPlus = new Ketchup(hotdog, 1.00);
        order1.addItem(burgerPlus);
        order1.addItem(fries);
        order1.addItem(hotdogPlus);
        double expected = 12.5;
        double actual = order1.getTotalCost();
        assertEquals(expected, actual);
    }
    @Test
    public void testGetTotalCost2()
    {
        Order order2 = new Order();
        Item burger = new Burger(5.00);
        Item fries = new Fries(3.00);
        Item hotdog = new Hotdog(2.50);
        Item burgerPlus = new Pickles(burger, 1.00);
        Item friesPlus = new Ketchup(hotdog, 1.00);
        Item hotdogPlus = new Ketchup(hotdog, 1.00);
        order2.addItem(burger);
        order2.addItem(burgerPlus);
        order2.addItem(fries);
        order2.addItem(friesPlus);
        order2.addItem(hotdog);
        order2.addItem(hotdogPlus);
        double expected = 24;
        double actual = order2.getTotalCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testLoyaltyDiscount()
    {
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.9);
        double expected = 11.25;
        double actual = loyaltyStatus.applyDiscount(12.5);
        assertEquals(expected, actual);

    }
    @Test
    public void testLoyaltyDiscount2()
    {
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.85);
        double expected = 20.4;
        double actual = loyaltyStatus.applyDiscount(24);
        assertEquals(expected, actual);

    }

}
