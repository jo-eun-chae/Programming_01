import javax.swing.*;

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
        
        //this.add(new NorthPanel());
        //this.add(new CenterPanel());
        //this.add(new SouthPanel());
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
