import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2 extends JFrame implements ActionListener {

    FlowLayout flow = new FlowLayout();
    JLabel quote = new JLabel("It was a bright cold day in April, and the clocks were striking thirteen.");
    JLabel bookInfo = new JLabel("1984 by George Orwell");
    JButton info = new JButton("Book Info");
    Boolean infoDisplayed = false;


    public JBookQuote2(){
        super("Book Quote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(quote);
        info.addActionListener(this);
        add(info);

    }

    public static void main(String[] args){
        JFrame frame = new JBookQuote2();
        frame.setSize(500, 95);
        frame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        if (action.equals("Book Info")) {
            if (!infoDisplayed){
                add(bookInfo);
                infoDisplayed = true;
            }
            else{
                remove(bookInfo);
                infoDisplayed = false;
            }
        }

        validate();
        repaint();
    }
}
