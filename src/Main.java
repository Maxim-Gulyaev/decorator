public class Main {
    public static void main(String[] args) {

        Product milk = new Milk(200);
        Product milkOnWeekend = new WeekendDiscount(new Milk(200));
        Product milkOnWeekendForPensioner = new PensionerDiscount(new WeekendDiscount(new Milk(200)));

        System.out.println(milk.getPrice());
        System.out.println(milkOnWeekend.getPrice());
        System.out.println(milkOnWeekendForPensioner.getPrice());

    }
}