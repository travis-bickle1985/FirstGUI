import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by coadmin on 07.07.2015.
 */
public class GUI {
    //private JButton button;
    private int count = 0;
    private static int fontSize = 20;

    public void buildGUI() {
        JFrame mainFrame = new JFrame("First GUI");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ПРИ ЗАКРЫТИИ ОКНА ЗАВЕРШИТЬ ПРОГРАММУ
        mainFrame.setBounds(1920, 0, 400, 400);

//        button = new JButton("Push me!");
//        button.addActionListener(new ActionListener() {   //обработчик события
//            public void actionPerformed(ActionEvent e) {
//                //count = count + 1;
//                button.setText(Integer.toString(++count));
//            }
//        });

        //JFrame - диспетчер компоновки BorderLayout
        //mainFrame.add(button);
        //JPanel- диспетчер компоновки FlowLayout

        Font font = new Font("Arial", Font.BOLD, fontSize); //дефольный шрифт
        JPanel mainPanel = new JPanel();
        JTextArea mainTextArea = new JTextArea();
        mainTextArea.setFont(font);
        JLabel label = new JLabel("Input text:");
        //JTextField() - текстовое поле для одной строки
        //private static int fontSize;


        JButton incButton = new JButton("+A");
        incButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //увеличить шрифт
                fontSize++;
                Font font = new Font("BMW1", Font.PLAIN, fontSize);
                mainTextArea.setFont(font);

            }
        });
        JButton decButton = new JButton("-a");
        decButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //уменьшение шрифтаk
                fontSize = fontSize - 1;
                Font font = new Font("BMW1", Font.PLAIN, fontSize);
                mainTextArea.setFont(font);
            }
        });
        JButton clearButton = new JButton("clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //очистка
                mainTextArea.setText("");
            }
        });
        JButton quitButton = new JButton("quit");
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //выход
                //mainFrame.setVisible(false);
                System.exit(0);
            }
        });
        //JButton centerButton = new JButton("Center");

        mainPanel.add(incButton);
        mainPanel.add(decButton);
        mainPanel.add(clearButton);
        mainPanel.add(quitButton);
        //mainPanel.add(centerButton);

        mainFrame.add(BorderLayout.NORTH, label);
        mainFrame.add(BorderLayout.CENTER, mainTextArea);
        mainFrame.add(BorderLayout.SOUTH, mainPanel);

//        mainFrame.add(BorderLayout.NORTH, northButton);
//        mainFrame.add(BorderLayout.SOUTH, southButton);
//        mainFrame.add(BorderLayout.WEST, westButton);
//        mainFrame.add(BorderLayout.EAST, eastButton);
//        mainFrame.add(BorderLayout.CENTER, centerButton);

        mainFrame.setVisible(true);
    }

}
