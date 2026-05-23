import java.util.Scanner;

public class MainValidasiUmur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur Anda: ");
        String umurInput = input.nextLine();

        try {
            int umur = Integer.parseInt(umurInput);

            System.out.println("Umur berhasil disimpan: " + umur + " tahun");

        } catch (NumberFormatException e) {
            System.out.println("Error: Input umur harus berupa angka!");
        }

        input.close();
    }
}