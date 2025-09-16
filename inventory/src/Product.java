public class Product {

    private int number;
    private String name;
    private int quantity;
    private double price;


    public Product() {
        this.number = 0;
        this.name = "Unknown";
        this.quantity = 0;
        this.price = 0.0;
    }

    public Product(int number, String name, int qty, double price) {
        this.number = number;
        this.name = name;
        this.quantity = qty;
        this.price = price;
    }
// ganti section
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

// pemisah woy
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

// abis string 
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

// abis quantity
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

// abis price
    public String toString() {
        return "Item Number : " + number + "\n" + "Name : " + name + "\n" + "Quantity in stock : " + quantity + "\n" + "Price : " + price + "\n";
    }

}
