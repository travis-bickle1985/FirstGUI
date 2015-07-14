import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by coadmin on 10.07.2015.
 */
public class StepListener implements ActionListener {

    private X0GUI view; //чтобы предать все функции X0GUI

    public StepListener (X0GUI view){ //чтобы предать все функции X0GUI
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        MyButton b = (MyButton) e.getSource();

        if (b.getText().equals(" ")) {
            if ((view.getState() % 2) == 0) {
                b.setText("O");
            } else {
                b.setText("X");
            }
            //button{k].setEnabled(false);
            view.setState();
            view.changeTurnText();
            view.hasWinner();
        }
        
    }
}
