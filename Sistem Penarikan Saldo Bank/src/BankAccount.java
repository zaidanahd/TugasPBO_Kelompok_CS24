
public class BankAccount {

    // === FIELD ===
    private String accountNumber;
    private String ownerName;
    private double balance;

    // === CONSTRUCTOR ===
    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // === GETTER ===
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    

    /**
     * 
     * 
     * @param amount Jumlah uang yang ingin ditarik
     * @throws InsufficientBalanceException jika saldo tidak mencukupi
     */
    public void withdraw(double amount) throws InsufficientBalanceException {
        // Validasi: jumlah penarikan harus positif
        if (amount <= 0) {
            throw new IllegalArgumentException("Jumlah penarikan harus lebih dari 0!");
        }

        
        if (amount > balance) {
            
            throw new InsufficientBalanceException(
                    " Penarikan gagal! Saldo tidak mencukupi.",
                    this.balance, 
                    amount 
            );
        }

        
        this.balance -= amount;
        System.out.println(" Penarikan berhasil! Rp " + amount + " telah ditarik.");
    }

   
    public void displayInfo() {
        System.out.println("═══════════════════════════════════════");
        System.out.println("   INFORMASI REKENING");
        System.out.println("═══════════════════════════════════════");
        System.out.println("  No. Rekening : " + accountNumber);
        System.out.println("  Pemilik      : " + ownerName);
        System.out.println("  Saldo        : Rp " + balance);
        System.out.println("═══════════════════════════════════════");
    }
}