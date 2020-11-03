import javax.swing.*;
import java.awt.*;

/**
 * 과제#1 : 북쪽 패널 만들기
 *
 * @author (2019315026 전유정)
 * @version (2020.11.03)
 */
public class NorthPanel extends JPanel
{
    /**
     * Constructor for objects of class NorthPanel
     */
    public NorthPanel()
    {
        
        this.setBackground(Color.LIGHT_GRAY);

        JLabel lFormula = new JLabel("수식 입력");
        JTextField fFormula = new JTextField(16);
        
        this.add(lFormula);
        this.add(fFormula);
        
    }
}
