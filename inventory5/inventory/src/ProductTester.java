import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tempNumber, tempQty;
        String tempName;
        double tempPrice;

        System.out.println("Masukkan nomor item: ");
        tempNumber = in.nextInt();
        in.nextLine();

        System.out.println("Masukkan nama produk: ");
        tempName = in.nextLine();

        System.out.println("Masukkan jumlah stok: ");
        tempQty = in.nextInt();

        System.out.println("Masukkan harga: ");
        tempPrice = in.nextDouble();

        Product p1 = new Product(tempNumber, tempName, tempQty, tempPrice);

        System.out.println("\n Produk Kedua");
        System.out.println("\n Masukkan nomor item: ");
        tempNumber = in.nextInt();
        in.nextLine();

        System.out.println("Masukkan nama produk: ");
        tempName = in.nextLine();
        
        System.out.println("Masukkan jumlah stok: ");
        tempQty = in.nextInt();

        System.out.println("Masukkan harga: ");
        tempPrice = in.nextDouble();

        Product p2 = new Product(tempNumber, tempName, tempQty, tempPrice);

        System.out.println(" \n");



        //==================== separator =========================
       
    
        Product p3 = new Product(1, "Nasi Goreng", 100, 12000);
        Product p4 = new Product(2, "Mi Goreng", 125, 15000);
        Product p5 = new Product(3, "Kwetiaw Goreng",150, 18000 );
        Product p6 = new Product(4, "Es Teh Manis Panas", 500, 10000);
        
        System.out.println(" \n");

        System.out.println(" \n");
        System.out.println("====Detail Produk 1====");
        System.out.println(p1);

        System.out.println(" \n");
        System.out.println("====Detail Produk 2====");
        System.out.println(p2);

        in.close();

        System.out.println(" \n");
        System.out.println("====Fixed Products====");

        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);

    }
}
