
package Files; 

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

public class Main{
    
    public static void main(String[] args) {
      
      JFrame frame = new JFrame("First Frame");
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(500,430);
      frame.setResizable(false);
      
      ImageIcon image = new ImageIcon("SnakeIcon.png");
      frame.setIconImage(image.getImage());
      
      frame.getContentPane().setBackground(new Color(121,123,122));
      
    }
    
}
