public class RewardValue {
    private double cashValue;
    private double milesValue;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; // Convert cash to miles
    }

    public RewardValue(double milesValue, boolean isMiles) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // Convert miles to cash
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        RewardValue reward1 = new RewardValue(100.0);
        System.out.println("Cash Value: " + reward1.getCashValue()); // Output: 100.0
        System.out.println("Miles Value: " + reward1.getMilesValue()); // Output: 28571428.5714

        RewardValue reward2 = new RewardValue(28571428.5714, true);
        System.out.println("Cash Value: " + reward2.getCashValue()); // Output: 100.0
        System.out.println("Miles Value: " + reward2.getMilesValue()); // Output: 28571428.5714
    }
}
