import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxSize = -1;

        do {
            try {
                System.out.println("Masukkan jumlah produk yang ingin anda tambahkan");
                System.out.println("Masukkan 0 jika anda tidak ingin menambahkan produk");
                maxSize = in.nextInt();
                if (maxSize < 0) {
                    System.out.println("Nilai salah dimasukkan");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                in.nextLine(); // what why are there comments?
                maxSize = -1;
            }
        } while ((maxSize < 0));

        if (maxSize == 0) {
            System.out.println("Tidak ada produk yang ditambahkan");
        } else {
            Product[] products = new Product[maxSize];
        

        for (int i = 0; i < maxSize; i++) {
            System.out.println("Masukkan detail produk ke-" + (i + 1));
        

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

        products[i] = new Product(tempNumber, tempName, tempQty, tempPrice);
        }

        System.out.println("\n====Detail Produk====");
        for (Product p : products) {
            System.out.println(p);
            }
        }
        in.close();
    }
}

