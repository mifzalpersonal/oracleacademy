public class Product {

    private String name;
    private int quantity;
    private double price;
    private boolean active;


    public Product(String name, int qty, double price) {
        this.name = name;
        this.quantity = qty;
        this.price = price;
        this.active = true;
    }

// pemisah woy
    public String getName() {
        return name;
    }

// abis string 
    public int getQuantity() {
        return quantity;
    }

// abis quantity
    public double getPrice() {
        return price;
    }


// otw boolean
    public boolean isActive() {
        return active;
    }

// kurangin stok
    public void deductFromInventory(int amount) {
        if (amount > 0) {
            this.quantity += amount;
        }
    }

// get inven
    public void addToInventory(int amount) {
        if (amount > 0) {
            this.quantity += amount;
        }
    }

// kurangin stok

    public void discontinue() {
        this.active = false;
    }


// string to string
    public String toString() {
    return name + " | Jumlah: " + quantity + "| Harga: " + price + "| Aktif: " + active;     
    
    }

}
