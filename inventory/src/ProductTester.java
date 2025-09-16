public class ProductTester {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();

        Product p3 = new Product(1, "Nasi Goreng", 100, 12000);
        Product p4 = new Product(2, "Mi Goreng", 125, 15000);
        Product p5 = new Product(3, "Kwetiaw Goreng",150, 18000 );
        Product p6 = new Product(4, "Es Teh Manis Panas", 500, 10000);
        

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
    }
}
