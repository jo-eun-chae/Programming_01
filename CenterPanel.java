import javax.swing.*;
import java.awt.*;

/**
 * 과제#1 : 계산기 버튼 만들기
 *
 * @author (2019315011 조은채)
 * @version (2020.11.02)
 */
public class CenterPanel extends JPanel
{
    /**
     * Constructor for objects of class CenterPanel
     */
    public CenterPanel()
    {
        // 패널의 레이아웃 정하기
        this.setLayout(new GridLayout(4, 4, 5, 5));
        
        // 계산기 버튼 만들기
        JButton bNum0 = new JButton("0");
        JButton bNum1 = new JButton("1");
        JButton bNum2 = new JButton("2");
        JButton bNum3 = new JButton("3");
        JButton bNum4 = new JButton("4");
        JButton bNum5 = new JButton("5");
        JButton bNum6 = new JButton("6");
        JButton bNum7 = new JButton("7");
        JButton bNum8 = new JButton("8");
        JButton bNum9 = new JButton("9");
        
        JButton bCE = new JButton("CE");
        JButton bCal = new JButton("계산");
        JButton bAdd = new JButton("+");
        JButton bSub = new JButton("-");
        JButton bMul = new JButton("x");
        JButton bDiv = new JButton("/");
        
        // 계산기 버튼의 색 지정하기
        bNum0.setBackground(Color.white);
        bNum1.setBackground(Color.white);
        bNum2.setBackground(Color.white);
        bNum3.setBackground(Color.white);
        bNum4.setBackground(Color.white);
        bNum5.setBackground(Color.white);
        bNum6.setBackground(Color.white);
        bNum7.setBackground(Color.white);
        bNum8.setBackground(Color.white);
        bNum9.setBackground(Color.white);
        
        bCE.setBackground(Color.white);
        bCal.setBackground(Color.white);
        
        bAdd.setBackground(Color.cyan);
        bSub.setBackground(Color.cyan);
        bMul.setBackground(Color.cyan);
        bDiv.setBackground(Color.cyan);
        
        // 계산기 버튼을 패널에 붙이기
        this.add(bNum0);
        this.add(bNum1);
        this.add(bNum2);
        this.add(bNum3);
        this.add(bNum4);
        this.add(bNum5);
        this.add(bNum6);
        this.add(bNum7);
        this.add(bNum8);
        this.add(bNum9);
        
        this.add(bCE);
        this.add(bCal);
        this.add(bAdd);
        this.add(bSub);
        this.add(bMul);
        this.add(bDiv);
    }
}
