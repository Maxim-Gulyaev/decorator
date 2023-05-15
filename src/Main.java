public class Main {
    public static void main(String[] args) {

        Product milk = new Milk(200);
        Product milkOnWeekend = new WeekendDiscount(new Milk(200));
        Product milkOnWeekendForPensioner = new PensionerDiscount(new WeekendDiscount(new Milk(200)));

        System.out.println("Common price is " + milk.getPrice() + " rubles.");
        System.out.println("Weekend price is " + milkOnWeekend.getPrice() + " rubles.");
        System.out.println("Weekend price for pensioners is " + milkOnWeekendForPensioner.getPrice() + " rubles.");

    }
}