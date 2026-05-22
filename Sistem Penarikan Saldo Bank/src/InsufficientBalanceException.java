
public class InsufficientBalanceException extends Exception {

    // Field untuk menyimpan detail tambahan
    private double currentBalance;
    private double requestedAmount;

    
    public InsufficientBalanceException(String message) {
        super(message);
    }

    
    public InsufficientBalanceException(String message, double currentBalance, double requestedAmount) {
        super(message);
        this.currentBalance = currentBalance;
        this.requestedAmount = requestedAmount;
    }

    // Getter untuk detail error
    public double getCurrentBalance() {
        return currentBalance;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }

    
    @Override
    public String getMessage() {
        return super.getMessage() +
                " | Saldo saat ini: Rp " + currentBalance +
                " | Jumlah diminta: Rp " + requestedAmount;
    }
}