public class KhurramLab6HomeTask3 {
    public static void checkLowBalances(double[] balances, double threshold) {
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] < threshold) {
                System.out.println("Alert: Account " + (i + 1) + " has a critically low balance: $" + balances[i]);}}}
    public static void main(String[] args) {
        double[] balances = {1200.50, 50.75, 10.3, 500.00, 3.00, 15.00, 9.99};
        double threshold = 10.00;
        checkLowBalances(balances, threshold);}}