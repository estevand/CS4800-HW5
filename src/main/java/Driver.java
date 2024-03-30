public class Driver
{
    public static void main(String[] args)
    {
        Item burger = new Burger(5.00);
        Item fries = new Fries(3.00);
        Item hotdog = new Hotdog(2.50);

        Item burgerPlus = new Pickles(burger, 1.00);
        Item friesPlus = new Ketchup(fries, 1.00);
        Item hotdogPlus = new Ketchup(hotdog, 1.00);

        Order order1 = new Order();
        order1.addItem(burgerPlus);
        order1.addItem(fries);
        order1.addItem(hotdogPlus);

        double totalCost1 = order1.getTotalCost();
        System.out.println("Customer 1:");
        System.out.println("Total: $" + totalCost1);

        LoyaltyStatus loyaltyStatus1 = new LoyaltyStatus(0.9);
        double discountedTotalCost1 = loyaltyStatus1.applyDiscount(totalCost1);
        System.out.println("Total with discount: $" + discountedTotalCost1);

        Order order2 = new Order();
        order2.addItem(burger);
        order2.addItem(burgerPlus);
        order2.addItem(fries);
        order2.addItem(friesPlus);
        order2.addItem(hotdog);
        order2.addItem(hotdogPlus);
        double totalCost2 = order2.getTotalCost();
        System.out.println("\nCustomer 2:");
        System.out.println("Total: $" + totalCost2);

        LoyaltyStatus loyaltyStatus2 = new LoyaltyStatus(0.85);
        double discountedTotalCost2 = loyaltyStatus2.applyDiscount(totalCost2);
        System.out.println("Total with discount: $" + discountedTotalCost2);

    }
}
