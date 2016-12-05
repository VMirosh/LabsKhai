
import Lab4.okno;

import javax.swing.*;
 
public class zapusk {
    public static void main(String args[]){
        
        okno mainFrame = new okno("Работа №4. Мирошниченко");
        mainFrame.setSize(300, 300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
}