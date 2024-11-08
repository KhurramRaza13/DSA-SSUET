import java.util.Scanner;
public class Lab3Task1 {
    static void Nnumbers(int k) {
        if (k > 0) {
            System.out.println(k);
            Nnumbers(k - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value of k: ");
        Nnumbers(input.nextInt());
        input.close();
    }
}