package inventory;

public class CD extends Product {
    private String artist;
    private int numSongs;
    private String label;

    public CD(String name, int quantity, double price, int itemNumber, String artist, int numSongs, String label) {
        super(name, quantity, price, itemNumber);
        this.artist = artist;
        this.numSongs = numSongs;
        this.label = label ;
    }

    @Override
    public String toString() {
        return "Nomor Item : " + getItemNumber() +
        "\nNama : " + getName() +
        "\nArtis : " + artist +
        "\nJumlah lagu : " + numSongs +
        "\nLabel : " + label +
        "\nJumlah : " + getQuantity() +
        "\nHarga : " + getPrice() +
        "\nNilaiPersediaan : " + getInventoryValue() +
        "\nStatus produk : " + (isActive() ? "AKtif" : "Dihentikan");
    }
}
