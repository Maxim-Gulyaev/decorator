public class PensionerDiscount extends Decorator{

    public PensionerDiscount(Product product) {
        super(product);
    }

    @Override
    public int getPrice() {
        return product.getPrice() - 20;
    }
}
