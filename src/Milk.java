public class Milk implements Product{

    private final int price;

    Milk(int price) {
        this.price = price;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
