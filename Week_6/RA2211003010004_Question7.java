import java.util.Scanner;
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}
class Rectangle implements Resizable {
    private int RA2211003010004_width;
    private int RA2211003010004_height;

    public Rectangle(int width, int height) {
        this.RA2211003010004_width = width;
        this.RA2211003010004_height = height;
    }

    public void resizeWidth(int width) {
        this.RA2211003010004_width = width;
    }

    public void resizeHeight(int height) {
        this.RA2211003010004_height = height;
    }

    public void displaySize() {
        System.out.println("Width: " + RA2211003010004_width + ", Height: " + RA2211003010004_height);
    }
}
public class RA2211003010004_Question7{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the initial width and height of the rectangle:");
        int width = scan.nextInt();
        int height = scan.nextInt();
        Rectangle rect = new Rectangle(width, height);
        System.out.println("Enter the new width and height of the rectangle:");
        int newWidth = scan.nextInt();
        int newHeight = scan.nextInt();
        rect.resizeWidth(newWidth);
        rect.resizeHeight(newHeight);
        System.out.println("The size of the rectangle after resizing is:");
        rect.displaySize();
        scan.close();
    }
}