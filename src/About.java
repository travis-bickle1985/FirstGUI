import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by coadmin on 10.07.2015.
 */
public class About {

    public void buildGUI() {
        JFrame credits = new JFrame("О программе");
        JLabel txt = new JLabel("Автор Вованыч. e-mail luja@ya.ru");
        JButton closeCredits = new JButton("OK");

        closeCredits.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                credits.dispose(); //уничтожит окно
            }
        });

        credits.add(BorderLayout.NORTH, txt);
        credits.add(BorderLayout.SOUTH, closeCredits);

        //credits.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ПРИ ЗАКРЫТИИ ОКНА ЗАВЕРШИТЬ ПРОГРАММУ
        credits.setBounds(0, 0, 250, 100);
        credits.setLocationRelativeTo(null);
        credits.setVisible(true);
    }

}
