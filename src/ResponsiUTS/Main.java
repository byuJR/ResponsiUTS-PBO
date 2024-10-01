package ResponsiUTS;

public class Main {
    public static void main(String[] args) {
        // Demonstrasi polimorfisme untuk Produk
        Produk produk1 = new Elektronik("Sony_Experia_Mark_vi", 2000, 2);
        Produk produk2 = new Makanan("Aoka_coklat", 1, "2025-08-31");

        System.out.println("Info Produk 1:");
        produk1.tampilkanInfo();
        System.out.println("\nInfo Produk 2:");
        produk2.tampilkanInfo();

        // Demonstrasi polimorfisme untuk Pegawai
        Pegawai pegawai1 = new PegawaiTetap("MahardikaJr", 500000, 100000);
        Pegawai pegawai2 = new PegawaiKontrak("ByuJR", 100000, 12);

        System.out.println("\nInfo Pegawai 1:");
        pegawai1.tampilkanInfo();
        System.out.println("\nInfo Pegawai 2:");
        pegawai2.tampilkanInfo();
    }
}