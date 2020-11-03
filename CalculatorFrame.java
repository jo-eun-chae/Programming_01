import javax.swing.*;
import java.awt.*;

/**
 * 과제#1 : 프레임 만들기
 *
 * @author (2019315011 조은채)
 * @version (2020.11.02)
 */
public class CalculatorFrame extends JFrame
{
    /**
     * Constructor for objects of class CalculatorFrame
     */
    public CalculatorFrame()
    {
        this.setTitle("계산기");
        this.setSize(300, 300);
        
        this.add(new NorthPanel(), BorderLayout.NORTH);
        this.add(new CenterPanel(), BorderLayout.CENTER);
        this.add(new SouthPanel(), BorderLayout.SOUTH);
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
