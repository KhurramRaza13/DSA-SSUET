public class Lab4HomeTask1 {
    public static void main(String[] args) {
        double[] arr = {2.5, 3.7, 4.1, 5.6, 6.3, 1.8, 9.4};
        double sum = 0;
        for (double num : arr) {
            sum += num;}
        double mean = sum / arr.length;
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);}}