public class WeekendDiscount extends Decorator{

    public WeekendDiscount(Product product) {
        super(product);
    }

    @Override
    public int getPrice() {
        return product.getPrice() - 30;
    }
}
