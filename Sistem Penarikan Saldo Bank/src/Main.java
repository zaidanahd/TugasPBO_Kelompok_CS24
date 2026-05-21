import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek rekening dengan saldo awal Rp 200.000
        BankAccount myAccount = new BankAccount(
                "1234567890",
                "Budi Santoso",
                200000.0);

        // Tampilkan info awal
        myAccount.displayInfo();

        System.out.println("\n💰 Masukkan jumlah penarikan: Rp ");
        double amount = scanner.nextDouble();

        // === TRY-CATCH UNTUK MENANGANI CUSTOM EXCEPTION ===
        try {
            // Memanggil method yang bisa throw InsufficientBalanceException
            myAccount.withdraw(amount);

            // Jika berhasil, tampilkan saldo terbaru
            System.out.println("💳 Sisa saldo: Rp " + myAccount.getBalance());

        } catch (InsufficientBalanceException e) {
            // Menangkap custom exception
            System.out.println("\n  ERROR: " + e.getMessage());
            System.out.println(" Tips: Silakan cek kembali saldo Anda.");

        } catch (IllegalArgumentException e) {
            // Menangkap exception untuk input tidak valid
            System.out.println("\n ERROR: " + e.getMessage());

        } finally {
            
            System.out.println("\n Transaksi selesai. Terima kasih!");
            scanner.close();
        }
    }
}