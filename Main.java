import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        // Thêm 5 sản phẩm tùy ý thuộc đủ 3 loại
        products.add(new Laptop("L01", "MacBook Pro M2", 30000000, "Apple"));
        products.add(new Laptop("L02", "Dell XPS 15", 35000000, "Dell"));
        products.add(new Smartphone("S01", "iPhone 15 Pro", 25000000, 187));
        products.add(new Smartphone("S02", "Samsung Galaxy S24 Ultra", 31000000, 232));
        products.add(new Tablet("T01", "iPad Air 5", 15000000, 10.9));

        // Hiển thị danh sách sản phẩm
        System.out.println("--- DANH SACH SAN PHAM ---");
        for (Product p : products) {
            System.out.println(p.toString());
        }
    }
}