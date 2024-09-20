package Classes;

public class Desk extends Furniture {
    private Integer height;
    private Integer width;

    public Desk(Integer stock, String name, Double price, Integer height, Integer width) {
        super(stock, name, price);
        this.height = height;
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @Override
    public double applyDiscount(double discountPorcentage){
        return getPrice() - (getPrice() * discountPorcentage / 100);
    }

    @Override
    public void increasePrice(double increasePorcentage){
        setPrice(getPrice() + getPrice() * increasePorcentage / 100);
    }

    @Override
    public String toString() {
        return "Desk{" +
                "Name: " + getName() +
                ", Price: " + getPrice() +
                ", Height: " + getHeight() +
                ", Width: " + getWidth() +
                ", Stock: " + getStock() +
                '}';
    }
}
