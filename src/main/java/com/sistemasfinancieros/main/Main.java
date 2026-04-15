import javax.swing.*;
import com.formdev.flatlaf.FlatDarkLaf;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Initialize your application here
        System.out.println("Application started with FlatLaf theme.");
    }
}