package lab2hometask4;
class Color {
    private int red, green, blue;
    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;}
    @Override
    public String toString() {
        return "Color{red=" + red + ", green=" + green + ", blue=" + blue + "}";}}
public class Lab2HomeTask4 {
    public static void main(String[] args) {
        Color[] colors = {
            new Color(255, 0, 0), // Red
            new Color(0, 255, 0), // Green
            new Color(0, 0, 255)  // Blue
        };
        for (Color color : colors) {
            System.out.println(color);}}}