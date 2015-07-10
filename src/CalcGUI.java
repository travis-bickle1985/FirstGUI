import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by coadmin on 10.07.2015.
 */
public class CalcGUI {
    public void buildGUI() {
        JFrame mainFrame = new JFrame("Calc");
        Font font = new Font("BMW1", Font.PLAIN, 40);
        JTextField textField= new JTextField("0");
        textField.setFont(font);
        JPanel clava = new JPanel(new GridLayout(5,4,5,5));

        JButton backspaceButton = new JButton("<-");
        backspaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // удаление одной цифры с конца
            }
        });
        JButton wipeButton = new JButton("C");
        wipeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // очистка
            }
        });
        JButton sqrtButton = new JButton("sqrt");
        sqrtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // корень
            }
        });
        JButton percentButton = new JButton("%");
        percentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // %
            }
        });
        JButton sevenButton = new JButton("7");
        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 7
            }
        });
        JButton eightButton = new JButton("8");
        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 8
            }
        });
        JButton nineButton = new JButton("9");
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 9
            }
        });
        JButton plusButton = new JButton("+");
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // +
            }
        });
        JButton fourButton = new JButton("4");
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 4
            }
        });
        JButton fiveButton = new JButton("5");
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 5
            }
        });
        JButton sixButton = new JButton("6");
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 6
            }
        });
        JButton minusButton = new JButton("-");
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // -
            }
        });
        JButton oneButton = new JButton("1");
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 1
            }
        });JButton twoButton = new JButton("2");
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 2
            }
        });
        JButton threeButton = new JButton("1");
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 1
            }
        });
        JButton divisionButton = new JButton("/");
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // /
            }
        });
        JButton zeroButton = new JButton("0");
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 0
            }
        });
        JButton dotButton = new JButton(".");
        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // .
            }
        });
        JButton enterButton = new JButton("=");
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // =
            }
        });
        JButton multipleButton = new JButton("*");
        multipleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // *
            }
        });

        mainFrame.add(BorderLayout.NORTH, textField);

        clava.add(backspaceButton);
        clava.add(wipeButton);
        clava.add(sqrtButton);
        clava.add(percentButton);
        clava.add(sevenButton);
        clava.add(eightButton);
        clava.add(nineButton);
        clava.add(plusButton);
        clava.add(fourButton);
        clava.add(fiveButton);
        clava.add(sixButton);
        clava.add(minusButton);
        clava.add(oneButton);
        clava.add(twoButton);
        clava.add(threeButton);
        clava.add(divisionButton);
        clava.add(zeroButton);
        clava.add(dotButton);
        clava.add(enterButton);
        clava.add(multipleButton);
        clava.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        mainFrame.add(BorderLayout.CENTER, clava);

        mainFrame.setBounds(0, 0, 250, 400);
        mainFrame.setLocationRelativeTo(null); // по центру экрана

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);



    }
}
