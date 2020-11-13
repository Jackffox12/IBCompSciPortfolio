package Project3;

import android.net.wifi.p2p.WifiP2pManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Game extends JPanel{
    private JButton[] buttons = new JButton[9];

    public Game() {
        this.setLayout(new GridLayout(3,3));
        for(int i = 0; i<9; i++){
            buttons[i] = new JButton();
            buttons[i].setText("_");
            this.add(buttons[i]);
        }
    }
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            JButton buttonClicked = (JButton e.getSource);
            buttonClicked.setText("hello");
        }



    }
}
