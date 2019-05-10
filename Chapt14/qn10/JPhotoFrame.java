import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class JPhotoFrame extends JFrame implements ItemListener {

    FlowLayout flow = new FlowLayout();
    ButtonGroup portraitSubjects = new ButtonGroup();
    ButtonGroup locations = new ButtonGroup();

    JLabel subjectsLablel = new JLabel("Choose the number of photo subjects:");
    JCheckBox subjectOne = new JCheckBox("One ($40)", false);
    JCheckBox subjectTwoOrMore = new JCheckBox("Two or more ($75)", false);
    JCheckBox subjectWithPet = new JCheckBox("With pet ($95)", false);

    JLabel locationsLabel = new JLabel("Choose the location:");
    JCheckBox inStudio = new JCheckBox("In studio (no additional fees)", false);
    JCheckBox otherLocation = new JCheckBox("Other location (+$90)", false);

    JTextField totPrice = new JTextField(10);
    int totalPrice = 0;
    int subjectPrice = 0;
    int locationPrice = 0;

    public JPhotoFrame(){
        super("Photo Session");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);

        add(subjectsLablel);

        add(subjectOne);
        subjectOne.addItemListener(this);

        add(subjectTwoOrMore);
        subjectTwoOrMore.addItemListener(this);

        add(subjectWithPet);
        subjectWithPet.addItemListener(this);

        add(locationsLabel);

        add(inStudio);
        inStudio.addItemListener(this);

        add(otherLocation);
        otherLocation.addItemListener(this);

        portraitSubjects.add(subjectOne);
        portraitSubjects.add(subjectTwoOrMore);
        portraitSubjects.add(subjectWithPet);

        locations.add(inStudio);
        locations.add(otherLocation);

        add(totPrice);
        totPrice.setText("0");
    }

    public static void main(String[] arguments)
    {
        JFrame bFrame = new JPhotoFrame();
        bFrame.setSize(240, 230);
        bFrame.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent list) {
        Object source = list.getItem();
        if(source == subjectOne) {
            subjectPrice = 40;
        }
        else if (source == subjectTwoOrMore){
            subjectPrice = 75;
        }

        else if (source == subjectWithPet){
            subjectPrice = 95;
        }

        if (source == inStudio){
            locationPrice = 0;
        }

        else if (source == otherLocation){
            locationPrice = 90;
        }

        totPrice.setText("Total price is $" + (subjectPrice + locationPrice));
    }
}
