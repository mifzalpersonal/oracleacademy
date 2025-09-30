import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numProducts = getNumProducts(in);

        if (numProducts == 0) {
            System.out.println("Tidak ada produk yang perlu ditambahkan!");
            return;
        }
        //array
        Product[] products = new Product[numProducts];
        
        //data
        for (int i = 0; i < products.length; i++) {
            System.out.println("Masukkan nama produk " + (i + 1) + ":");
            String name = in.next();
            
            System.out.println("Masukkan jumlah produk " + (i + 1) + ":");
            int qty = in.nextInt();
        
            System.out.println("Masukkan harga produk " + (i + 1) + ":");
            double price = in.nextDouble();
        
            products[i] = new Product(name, qty, price);
            
        }

        int choice;
        do {
            choice = getMenuOption(in);
            executeMenuChoice(choice, products, in);
        } while (choice != 0);

        in.close();


        
    }
        public static int getNumProducts(Scanner in) {
            int n;
            do {
                System.out.println("Masukkan jumlah produk (0 untuk tidak ada): ");
                n = in.nextInt();
            }   while (n < 0);
            return n;
        }

        public static void displayInventory(Product[] products) {
            System.out.println("\n==== Daftar Produk ====");
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i]);
            }
            System.out.println();
        }

        public static void addToInventory(Product[] products, Scanner in) {
            int idx = getProductNumber(products, in);
            System.out.println("Masukkan jumlah yang ingin ditambahkan: ");
            int ant = in.nextInt();
            products[idx].addToInventory(ant);
            System.out.println("Stok berhasil ditambahkan!");
        }

        public static void deductInventory(Product[] products, Scanner in) {
            int idx = getProductNumber(products, in);
            System.out.println("Masukkan jumlah yang ingin dikurangi: ");
            int ant = in.nextInt();
            products[idx].deductFromInventory(ant);
            System.out.println("Stok berhasil dikurangi!");
        }

        public static void discontinueInventory(Product[] products, Scanner in) {
            int idx = getProductNumber(products, in);
            products[idx].discontinue();
            System.out.println("Produk berhasil dihentikan!");
        }

        public static int getProductNumber(Product[] products, Scanner in) {
            int n;
            do {
                displayInventory(products);
                System.out.println("Pilih nomor produk: ");
                n = in.nextInt();
            } while (n < 1 || n > products.length);
            return n - 1; //index array heheh
        }

        public static int getMenuOption(Scanner in) {
            int choice;
            do {
                System.out.println("\n=== Menu ===");
                System.out.println("1. Lihat Inventaris");
                System.out.println("2. Tambah Persediaan");
                System.out.println("3. Kurangin Persediaan");
                System.out.println("4. Hentikan Produk");
                System.out.println("0. Keluar");
                System.out.print("Pilihan : ");
                choice = in.nextInt();
            } while (choice < 0 || choice > 4);
            return choice;
        }

        public static void executeMenuChoice(int choice, Product[] products, Scanner in) {
            switch (choice) {
                case 1:
                    displayInventory(products);
                    break;
                case 2: 
                    addToInventory(products, in);
                    break;
                case 3:
                    deductInventory(products, in);
                    break;
                case 4: 
                    discontinueInventory(products, in);
                    break;
                case 0:
                    System.out.println("Program selesai, have a nice day!"); 
                    break;
            }
        }

}

