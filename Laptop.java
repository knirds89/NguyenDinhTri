public class Laptop extends Product {
    private String brand;

    public Laptop(String id, String name, double price, String brand) {
        super(id, name, price);
        this.brand = brand;
    }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    @Override
    public String toString() {
        return "Laptop [" + super.toString() + ", Brand: " + brand + "]";
    }
}