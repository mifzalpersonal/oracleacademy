package inventory;

public class DVD extends Product {
    private int duration;
    private int ageRating;
    private String studio;

    public DVD(String name, int quantity, double price, int itemNumber, int duration, int ageRating, String studio) {
        super(name, quantity, price, itemNumber);
        this.duration = duration;
        this.ageRating = ageRating;
        this.studio = studio;
    }

    @Override
    public double getInventoryValue() {
        return super.getInventoryValue() * 1.05;
    }

    @Override
    public String toString() {
        return 
        "Nomor Item : " + getItemNumber() +
        "\nNama : " + getName() +
        "\nDurasi Film : " + duration +
        "\nNilai Usia : " + ageRating  +
        "\nStudio Film : " + studio +
        "\nJumlah : " + getQuantity() +
        "\nHarga : " + getPrice() +
        "\nNilaiPersediaan : " + getInventoryValue() +
        "\nStatus produk : " + (isActive() ? "AKtif" : "Dihentikan");
    }
}

