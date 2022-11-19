package model;

public class product {
    private final int id;
    private int counter;
    private final int price;
    private final String nameProduct;

    public product(int price, String nameProduct) {
        this.nameProduct = nameProduct;
        this.price = price;
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", price=" + price +
                ", nameProduct='" + nameProduct + '\'' +
                '}';
    }
}
