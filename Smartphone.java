public class Smartphone extends Product {
    private double weight;

    public Smartphone(String id, String name, double price, double weight) {
        super(id, name, price);
        this.weight = weight;
    }

    public double getWeight() { return weight; }
    public void setWeight(double weight) { this.weight = weight; }

    @Override
    public String toString() {
        return "Smartphone [" + super.toString() + ", Weight: " + weight + "g]";
    }
}