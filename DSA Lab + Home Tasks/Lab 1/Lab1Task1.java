package lab1task1;
public class Lab1Task1 {
    public static void main(String[] args) {
    String str1 = "Java";
    String str2 = "Python";
    String str3 = "Java";
    String str4 = new String ("Java").intern();
    String str5 = new String ("Hello World");
    String str6 = new String ("Python");
    System.out.println(str1==str3);
    System.out.println(str1==str4);
    System.out.println(str2==str6);
    }
}
