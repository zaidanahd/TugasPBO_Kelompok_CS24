public class PencarianPeringkat {
    public static void main(String[] args) {
        String[] mahasiswa = {"Alwi", "Zaidan", "Intan", "Silvi", "Haruka"};
        
        int peringkatDicari = 10;
        
        System.out.println("Data mahasiswa yang tersedia: Peringkat 1 - 5");
        System.out.println("Mencari peringkat ke-" + peringkatDicari);
        System.out.println();
        
        try {
            int index = peringkatDicari - 1;
            String nama = mahasiswa[index];
            System.out.println("Mahasiswa peringkat ke-" + peringkatDicari + " adalah: " + nama);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: Peringkat ke-" + peringkatDicari + " tidak ditemukan!");
            System.out.println("Peringkat yang tersedia hanya 1 sampai " + mahasiswa.length);
        }
        
        System.out.println();
        System.out.println("Program selesai berjalan.");
    }
}