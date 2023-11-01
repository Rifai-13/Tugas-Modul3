/**
 * Kelas Segitiga digunakan untuk menghitung kemiringan segitiga berdasarkan panjang alas dan tinggi.
 */
class Segitiga {
    private double alas; // Panjang alas segitiga
    private double tinggi; // Tinggi segitiga

    /**
     * Konstruktor untuk membuat objek Segitiga dengan panjang alas dan tinggi tertentu.
     *
     * @param alas   Panjang alas segitiga.
     * @param tinggi Tinggi segitiga.
     */
    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    /**
     * Menghitung kemiringan segitiga berdasarkan Teorema Pythagoras.
     *
     * @return Kemiringan segitiga.
     */
    public double hitungKemiringan() {
        return Math.sqrt(alas * alas + tinggi * tinggi);
    }
}

public class Main {
    public static void main(String[] args) {
        // Kode main tidak berubah dan tidak perlu dimasukkan dalam JavaDoc.
    }
}
