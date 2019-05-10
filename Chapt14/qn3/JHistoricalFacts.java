import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JHistoricalFacts extends JFrame implements ActionListener {

    JButton change = new JButton("Change");
    FlowLayout flow = new FlowLayout();

    JLabel einstein = new JLabel("Albert Einstein could have been president of Israel when it was formed, " +
            "but he declined.");
    JLabel heroin = new JLabel("Heroin was once a perfectly acceptable medicine prescribed by doctors " +
            "for everything from coughs to headaches.");
    JLabel stalin = new JLabel("Russian dictator Joseph Stalin often had photos retouched to remove people " +
            "who had died or been removed from office.");
    JLabel chineseWomen= new JLabel("Chinese women used to painfully bind their feet to make them appear smaller " +
            "and more feminine.");
    JLabel shortestWar = new JLabel("The shortest war in history was the Anglo-Zanzibar War. It lasted just 38 minutes.");
    JLabel towerOfPisa= new JLabel("The Leaning Tower of Pisa was actually never straight to begin with. " +
                                "The foundation began to sink when they started on the second floor.");
    JLabel ronaldReagan = new JLabel("Ronald Reagan is best known for being President and acting in numerous films, " +
                                "but he was also a prolific lifeguard, who saved 77 people from drowning.");
    JLabel alarmClocks = new JLabel("Before there were alarm clocks, there were “knockers-up”, who were hired to shoot dried peas " +
                                "from a blow gun at people’s windows in order to wake them up in the morning.");
    JLabel largestBird= new JLabel("The largest bird ever to exist had a wingspan of almost 20 feet. " +
                                "It lived 60 million years ago.");
    JLabel potatoSacks= new JLabel("During the Great Depression, people often made clothes out of potato sacks. Seeing this, " +
                                "distributors made their sacks more colorful to help people remain at least somewhat fashionable.");

    int factCount = 0;


    public JHistoricalFacts(){
        super("Historical Facts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);

        change.addActionListener(this);

        add(change);
        add(einstein);
    }

    public static void main(String[] arguments)
    {
        JFrame frame = new JHistoricalFacts();
        frame.setSize(1200, 100);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String action = e.getActionCommand();
        if (action.equals("Change")) {
            if(factCount == 0){
                remove(einstein);
                add(heroin);
                factCount = 1;
            }
            else if(factCount == 1){
                remove(heroin);
                add(stalin);
                factCount = 2;

            }
            else if(factCount == 2){
                remove(stalin);
                add(chineseWomen);
                factCount = 3;

            }
            else if(factCount == 3){
                remove(chineseWomen);
                add(shortestWar);
                factCount = 4;

            }
            else if(factCount == 4){
                remove(shortestWar);
                add(towerOfPisa);
                factCount = 5;

            }
            else if(factCount == 5){
                remove(towerOfPisa);
                add(ronaldReagan);
                factCount = 6;

            }
            else if(factCount == 6){
                remove(ronaldReagan);
                add(alarmClocks);
                factCount = 7;

            }
            else if(factCount == 7){
                remove(alarmClocks);
                add(largestBird);
                factCount = 8;

            }
            else if(factCount == 8){
                remove(largestBird);
                add(potatoSacks);
                factCount = 9;

            }
            else if(factCount == 9){
                remove(potatoSacks);
                add(einstein);
                factCount = 0;

            }

            validate();
            repaint();
        }


    }
}
