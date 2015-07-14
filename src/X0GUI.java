import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by coadmin on 10.07.2015.
 */
public class X0GUI {

    protected static int state = 1;
    protected JLabel labelTurn = new JLabel(("XTurn"));
    protected MyButton[] button = new MyButton[9];
    protected JFrame xoFrame = new JFrame("Krestiki-Noliki");

    public void buildGUI() {
        //Создание меню
        JMenuBar bar = new JMenuBar();
        JMenu fileMenu = new JMenu("Game");
        JMenuItem newGameMenuItem = new JMenuItem("New Game");
        JMenuItem quitMenuItem = new JMenuItem("Quit");
        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutItem = new JMenuItem("About");

        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                About about = new About();
                about.buildGUI();
            }
        });


        newGameMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < button.length; i++) {
                    button[i].setText(" ");
                }
                state = 1;
            }
        });

        quitMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        fileMenu.add(newGameMenuItem);
        fileMenu.add(quitMenuItem);
        helpMenu.add(aboutItem);
        bar.add(fileMenu);
        bar.add(helpMenu);

        //Создание кнопок
        JPanel grid = new JPanel(new GridLayout(3, 3));
        StepListener stepListener = new StepListener(this); //ATTENTION! добавили this чтобы передать steplistener весь класс
        for (int i = 0; i < button.length; i++) {
            button[i] = new MyButton(" ");
            grid.add(button[i]);
            //final int k = i;
            button[i].addActionListener(stepListener);
        }

        xoFrame.add(grid);
        xoFrame.setJMenuBar(bar); //специальный метод для bar, север не занят
        xoFrame.add(BorderLayout.NORTH, labelTurn);

        xoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ПРИ ЗАКРЫТИИ ОКНА ЗАВЕРШИТЬ ПРОГРАММУ
        xoFrame.setBounds(1920, 0, 300, 300);
        //xoFrame.setVisible(true);
    }

    public void hasWinner() {
        //проверка победителя
        if (button[0].equals("X") && button[1].equals("X") && button[2].equals("X")){
            //выиграл X в первой строчке
        }
    }

    public int getState() {
        return state;
    }

    public void setState() {
        state++;
    }

    public void changeTurnText() {
        if ((state % 2) == 0) {
            labelTurn.setText("O Turn");
        } else {
            labelTurn.setText("X Turn");
        }
    }
}
