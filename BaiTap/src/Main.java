//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product = new Product("HT1","Bot",10000);
        Product product1 = new Product("HT1","Banh",12000);
        Product product2 = new Product("HT2","Keo",11000);
        Product product3 = new Product("HT3","Xuch xich",9000);
        ProductManager productManager = new ProductManager();
        productManager.addProduct(product);
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.printProducts();
        productManager.removeProduct(product2);
        productManager.printProducts();
        System.out.println("sort by price");
        productManager.sortByPrice();
        productManager.printProducts();
    }
}