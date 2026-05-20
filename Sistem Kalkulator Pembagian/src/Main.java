import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // 1. Membuat objek dari class Kalkulator agar fungsinya bisa dipakai
        Kalkulator kal = new Kalkulator();
        
        System.out.println("=== KALKULATOR PEMBAGIAN (FILE TERPISAH) ===");
        
        System.out.print("Masukkan angka pembilang: ");
        int pembilang = input.nextInt();
        
        System.out.print("Masukkan angka penyebut: ");
        int penyebut = input.nextInt();
        
        // 2. Memanggil method hitungPembagian yang ada di file Kalkulator.java
        kal.hitungPembagian(pembilang, penyebut);
        
        input.close();
        System.out.println("Program selesai.");
    }
}