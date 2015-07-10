import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by coadmin on 10.07.2015.
 */
public class X0GUI {

    public static int state = 1;

    public void buildGUI() {
        JFrame xoFrame = new JFrame("Krestiki-Noliki");
        MyButton[] button = new MyButton[9];

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
        StepListener stepListener = new StepListener();
        for (int i = 0; i < button.length; i++) {
            button[i] = new MyButton(" ");
            grid.add(button[i]);
            //final int k = i;
            button[i].addActionListener(stepListener);

        }

        /*JButton firstButton = new JButton(" ");
        firstButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((state % 2) == 0) {
                    firstButton.setText("O");
                } else {
                    firstButton.setText("X");
                }
                state++;
            }
        });
        JButton secondButton = new JButton(" ");
        secondButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((state % 2) == 0) {
                    secondButton.setText("O");
                } else {
                    secondButton.setText("X");
                }
                state++;
            }
        });
        JButton thirdButton = new JButton(" ");
        thirdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((state % 2) == 0) {
                    thirdButton.setText("O");
                } else {
                    thirdButton.setText("X");
                }
                state++;
            }
        });
        JButton fourthButton = new JButton(" ");
        fourthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((state % 2) == 0) {
                    fourthButton.setText("O");
                } else {
                    fourthButton.setText("X");
                }
                state++;
            }
        });
        JButton fifthButton = new JButton(" ");
        fifthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((state % 2) == 0) {
                    fifthButton.setText("O");
                } else {
                    fifthButton.setText("X");
                }
                state++;
            }
        });
        JButton sixthButton = new JButton(" ");
        sixthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((state % 2) == 0) {
                    sixthButton.setText("O");
                } else {
                    sixthButton.setText("X");
                }
                state++;
            }
        });
        JButton seventhButton = new JButton(" ");
        seventhButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((state % 2) == 0) {
                    seventhButton.setText("O");
                } else {
                    seventhButton.setText("X");
                }
                state++;
            }
        });
        JButton eigthButton = new JButton(" ");
        eigthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((state % 2) == 0) {
                    eigthButton.setText("O");
                } else {
                    eigthButton.setText("X");
                }
                state++;
            }
        });
        JButton ninethButton = new JButton(" ");
        ninethButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((state % 2) == 0) {
                    ninethButton.setText("O");
                } else {
                    ninethButton.setText("X");
                }
                state++;
            }
        });


        grid.add(firstButton);
        grid.add(secondButton);
        grid.add(thirdButton);
        grid.add(fourthButton);
        grid.add(fifthButton);
        grid.add(sixthButton);
        grid.add(seventhButton);
        grid.add(eigthButton);
        grid.add(ninethButton);*/

        xoFrame.add(grid);
        xoFrame.setJMenuBar(bar); //специальный метод для bar, север не занят


        xoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ПРИ ЗАКРЫТИИ ОКНА ЗАВЕРШИТЬ ПРОГРАММУ
        xoFrame.setBounds(1920, 0, 200, 200);
        xoFrame.setVisible(true);
    }
}
