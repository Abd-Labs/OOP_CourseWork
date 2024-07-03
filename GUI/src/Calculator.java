
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator extends JFrame{
    
   private JTextField Amount;
    private JTextField Tip;
    private JTextField TipPercentage;
    private JTextField Total;
    private JButton calculate;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JPanel jPanel1;
    private JSlider Slider;

   Calculator()  {
       
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLayout(null);
       
       l1= new JLabel("Amount");
       l2 = new JLabel("Tip");
       l3 = new JLabel("Amount");
       Slider = new JSlider();
       Amount = new JTextField();
       Tip = new JTextField();
       TipPercentage = new JTextField();
       Total = new JTextField();
       
       
       Slider.setPreferredSize(new Dimension(10,20));
       Slider.setPaintTrack(true);
       Slider.setMinorTickSpacing(10);
       
      l1.setFont(new Font("Times New Roman",Font.BOLD,22));
      l1.setBounds(60,10,300,45);
      
      l2.setFont(new Font("Times New Roman",Font.BOLD,22));
      l2.setBounds(60,10,300,300);
      
      l3.setFont(new Font("Times New Roman",Font.BOLD,22));
      l3.setBounds(60,10,300,455);
      
      Amount.setBounds(60,10,370,45);
      Tip.setBounds(60,10,350,290);
      TipPercentage.setBounds(60,10,500,245);
      Total.setBounds(60,10,300,75);
   
       add(l1);
       add(l2);
       add(l3);
       add(Slider);
       add(Amount);
       add(Tip);
       add(TipPercentage);
       add(Total);
       add(calculate);
       
       calculate.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               float amount = Float.parseFloat(Amount.getText());
                float perc = Float.parseFloat(TipPercentage.getText());
                 float tip = amount* (perc/100);
        
                   float total = amount + tip;
        
                   Total.setText(String.valueOf(total));
           }
       });
       
       Slider.addMouseListener(new MouseAdapter() {
           public void mouseReleased(MouseEvent evt) {
                 int value = Slider.getValue();
        
        TipPercentage.setText(String.valueOf(value));
        
        float amount = Float.parseFloat(Amount.getText());
        float perc = Float.parseFloat(TipPercentage.getText());
        float tip = amount* (perc/100);
        
        Tip.setText(String.valueOf(tip));
            }
       });
       
       
   }
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.setVisible(true);
        obj.setBounds(100, 100, 500, 400);
        obj.setTitle("Tip Calculator");
        
        
    }

}