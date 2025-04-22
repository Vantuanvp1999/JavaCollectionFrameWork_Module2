import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    private ArrayList<Product> products;
    public ProductManager() {
        products = new ArrayList<>();
    }
    public void addProduct(Product p) {
        products.add(p);
    }
    public void removeProduct(Product p) {
        products.remove(p);
    }
    public void setProduct(String id, Product p) {
        for(Product p1 : products) {
            if(p1.getId().equals(id)) {
                p1 = p;
            }
        }
    }
    public Product getProduct(String name) {
        for(Product p : products) {
            if(p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }
    public void printProducts() {
        for(Product p : products) {
            System.out.println(p);
        }
    }
    public void sortByPrice(){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getPrice() > o2.getPrice()) {
                    return 1;
                }
                else if(o1.getPrice() < o2.getPrice()) {
                    return -1;
                }
                return 0;
            }
        });
    }
    public void sortReverseByPrice(){
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if(o1.getPrice() < o2.getPrice()) {
                    return -1;
                }else if(o1.getPrice() > o2.getPrice()) {
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });
    }
}
