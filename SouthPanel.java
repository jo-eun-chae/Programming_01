import javax.swing.*;
import java.awt.*;

/**
 * 과제#1 : 남쪽 패널 만들기
 *
 * @author (2019315026 전유정)
 * @version (2020.11.03)
 */
public class SouthPanel extends JPanel
{
    /**
     * Constructor for objects of class SouthPanel
     */
    public SouthPanel()
    {
        
        this.setBackground(Color.YELLOW);
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        JLabel lresult = new JLabel("계산 결과");
        JTextField fresult = new JTextField(16);
        
        this.add(lresult);
        this.add(fresult);

    }
}
