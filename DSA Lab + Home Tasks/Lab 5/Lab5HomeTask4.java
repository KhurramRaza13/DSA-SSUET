import java.util.*;
class BankAccount {
    int accountNumber, balance;
    BankAccount(int acc, int bal) {
        accountNumber = acc;
        balance = bal;}
    @Override
    public String toString() {
        return "Account: " + accountNumber + ", Balance: " + balance;}}
public class Lab5HomeTask4 {
    static void quickSort(BankAccount[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);}}
    static int partition(BankAccount[] arr, int low, int high) {
        BankAccount pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j].balance > pivot.balance) swap(arr, ++i, j);}
        swap(arr, i + 1, high);
        return i + 1;}
    static void swap(BankAccount[] arr, int i, int j) {
        BankAccount temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;}
    public static void main(String[] args) {
        Random rand = new Random();
        BankAccount[] accounts = new BankAccount[5];
        for (int i = 0; i < 5; i++) accounts[i] = new BankAccount(i + 1, rand.nextInt(100001));
        System.out.println("Before sorting:");
        Arrays.stream(accounts).forEach(System.out::println);
        quickSort(accounts, 0, accounts.length - 1);
        System.out.println("\nAfter sorting:");
        Arrays.stream(accounts).forEach(System.out::println);}}