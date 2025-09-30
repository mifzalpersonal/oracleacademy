package inventory;

public class Product {

    private String name;
    private int quantity;
    private double price;
    private int itemNumber;
    private boolean active;


    public Product(String name, int quantity, double price, int itemNumber) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.itemNumber = itemNumber;
        this.active = true;
    }

 // get inven   
public double getInventoryValue() {
    return quantity * price;
}

// add inven

public void addToInventory(int amount) {
    if (active) {
        this.quantity += amount;
    } else {
        System.out.println("Produk ini sudah dihentikan, tidak bisa ditambah stok!");
    }
}

public void deductFromInventory(int amount) {
    if (amount <= quantity) {
        this.quantity -= amount;
    } else {
        System.out.println("Jumlah melebihi stok yang tersedia");
    }
}

public void setActive(boolean status) {
    this.active = status;
}

// otw boolean
    public boolean isActive() {
        return active;
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

// abis quantity
    public int getItemNumber() {
        return itemNumber;
    }

@Override

// string to string
    public String toString() {
    return 
    "Nomor Item: " + itemNumber + 
    "\nNama: " + name + 
    "\nJumlah: " + quantity + 
    "\nHarga: " + price + 
    "\nNilai Persediaan: " + getInventoryValue() +     
    "\nStatus Produk: " + (active ? "Aktif" : "Dihentikan");     
    }
}
