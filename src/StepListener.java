import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by coadmin on 10.07.2015.
 */
public class StepListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        MyButton b = (MyButton) e.getSource();

        if (b.getText().equals(" ")) {
            if ((X0GUI.state % 2) == 0) {
                b.setText("O");
            } else {
                b.setText("X");
            }
            //button{k].setEnabled(false);
            X0GUI.state++;
        }
    }
}
