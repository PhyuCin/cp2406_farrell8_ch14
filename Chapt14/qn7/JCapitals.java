import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JCapitals extends JFrame implements ItemListener {

    FlowLayout flow = new FlowLayout();
    JComboBox countriesBox = new JComboBox();

    JLabel countriesLabel = new JLabel("Choose a country to display its capital");

    JTextField capital = new JTextField(30);
    String[] capitals = new String[]{"Singapore", "Seoul", "Ottawa", "Santiago", "Beijing",
            "Paris", "Athens", "Rome", "Jakarta", "Tokyo",};

    JCapitals(){
        super("Capitals");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        countriesBox.addItemListener(this);

        add(countriesLabel);

        countriesBox.addItem("Singapore");
        countriesBox.addItem("South Korea");
        countriesBox.addItem("Canada");
        countriesBox.addItem("Chile");
        countriesBox.addItem("China");
        countriesBox.addItem("France");
        countriesBox.addItem("Greece");
        countriesBox.addItem("Italy");
        countriesBox.addItem("Indonesia");
        countriesBox.addItem("Japan");

        add(countriesBox);
        add(capital);
    }

    public static void main(String[] arguments)
    {
        JFrame frame = new JCapitals();
        frame.setSize(400, 100);
        frame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent list){
        Object source = list.getSource();
        if(source == countriesBox)
        {
            capital.setText("The capital of " + countriesBox.getSelectedItem() +
                    " is " + capitals[countriesBox.getSelectedIndex()] + ".");
        }
    }
}
