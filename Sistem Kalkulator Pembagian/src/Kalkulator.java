public class Kalkulator {
    
    // Method untuk membagi angka dengan penanganan exception
    public void hitungPembagian(int pembilang, int penyebut) {
        try {
            int hasil = pembilang / penyebut;
            System.out.println("Hasil: " + pembilang + " / " + penyebut + " = " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("\n[ERROR] Terjadi kesalahan matematis: Pembagian dengan nol tidak diperbolehkan!");
        }
    }
}