import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote extends JFrame{

    FlowLayout flow = new FlowLayout();
    JLabel quote = new JLabel("It was a bright cold day in April, and the clocks were striking thirteen.");

    public JBookQuote(){
        super("Book Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(quote);

    }

    public static void main(String[] args){
        JFrame frame = new JBookQuote();
        frame.setSize(500, 80);
        frame.setVisible(true);
    }

}
