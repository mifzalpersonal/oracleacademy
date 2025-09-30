package inventory;

import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah produk: ");
        int maxSize = in.nextInt();
        in.nextLine();

         Product[] products = new Product[maxSize];


         for (int i = 0; i < maxSize; i++) {
            int stockChoice = -1;
            while (stockChoice < 1 || stockChoice > 2) {
                System.out.println("Pilih tipe produk: \n1: CD\n2: DVD");
                stockChoice = in.nextInt();
                in.nextLine();
                if (stockChoice < 1 || stockChoice > 2) {
                    System.out.println("Hanya angka 1 atau 2 yang diperbolehkan!");
                }
            
            }

        if (stockChoice == 1) {
        System.out.print("Masukkan nama CD: ");
        String name = in.nextLine();

        System.out.print("Masukkan nama produk: ");
        String artist = in.nextLine();

        System.out.print("Masukkan jumlah stok: ");
        String label = in.nextLine();

        System.out.print("Masukkan harga: ");
        int numSongs = in.nextInt();
   
        System.out.print("Masukkan harga: ");
        int qty = in.nextInt();

        System.out.print("Masukkan harga: ");
        double price = in.nextDouble();

        System.out.print("Masukkan harga: ");
        int itemNumber = in.nextInt();

        

        products[i] = new CD(name, qty, price, itemNumber, artist, numSongs, label);
        } else {

        System.out.print("Masukkan nama DVD: ");
        String name = in.nextLine();

        System.out.print("Masukkan studio film: ");
        String studio = in.nextLine();

        System.out.print("Masukkan nilai usia: ");
        int age = in.nextInt();

        System.out.print("Masukkan durasi (menit): ");
        int duration = in.nextInt();
   
        System.out.print("Masukkan jumlah stok: ");
        int qty = in.nextInt();

        System.out.print("Masukkan harga: ");
        double price = in.nextDouble();

        System.out.print("Masukkan nomor item: ");
        int itemNumber = in.nextInt();
        in.nextLine();

        products[i] = new DVD(name, qty, price, itemNumber, duration, age, studio);
        }
    
    }

    System.out.println("\n=== Daftar Produk ===");
    for (Product p : products) {
        System.out.println(p.toString());
        System.out.println("---------------------------------------");
    }

    in.close();
    }
}
