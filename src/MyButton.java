import javax.swing.*;
import java.awt.*;

/**
 * Created by coadmin on 10.07.2015.
 */
public class MyButton extends JButton {

    public MyButton(String title) {
        super(title); //new JButton("") super вызывает конструктор родителя
        setFont(new Font("BMW1", Font.PLAIN, 35));
        setForeground(Color.BLUE);
    }



}
