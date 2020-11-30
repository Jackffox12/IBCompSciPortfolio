package Project3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Game extends JPanel{
    private JButton[] buttons = new JButton[9];
    private int nextTurn = 0;
    private ArrayList<String> winningPos = new ArrayList<String>();

    String titleWinner;

    public Game() {
        this.setLayout(new GridLayout(3,3));
        for(int i = 0; i<9; i++){
            buttons[i] = new JButton();
            buttons[i].setText("");
            buttons[i].addActionListener(new ButtonListener());
            this.add(buttons[i]);

        }
    }

    private class ButtonListener implements ActionListener {
       public void actionPerformed(ActionEvent e){
           JButton buttonClicked = (JButton) e.getSource();

           if(nextTurn%2 == 0){
               buttonClicked.setText("X");
           }
           else{
               buttonClicked.setText("O");
           }
           if(Win() == true)
           {
               JOptionPane.showMessageDialog(null, "Game Over, " + titleWinner + " wins.");
               resetButtons();
           }
           if(nextTurn==8){
               JOptionPane.showMessageDialog(null, "The Game Ends In A Tie :(");
               resetButtons();
           }


           nextTurn++;

        }




    }

    public boolean Win(){
        if(checkWin(0,1) && checkWin(1,2)){
            titleWinner = buttons[0].getText();
            return true;
        }
        else if(checkWin(3,4)&& checkWin(4,5)){
            titleWinner = buttons[3].getText();
            return true;
        }
        else if(checkWin(6,7) && checkWin(7,8)){
            titleWinner = buttons[6].getText();
            return true;
        }


        else if(checkWin(0,3) && checkWin(3,6)){
            titleWinner = buttons[0].getText();
            return true;
        }
        else if(checkWin(1,4) && checkWin(4,7)){
            titleWinner = buttons[1].getText();
            return true;
        }

        else if(checkWin(2,5) && checkWin(5,8)){
            titleWinner = buttons[2].getText();
            return true;
        }


        else if(checkWin(0,4) && checkWin(4,8)){
            titleWinner = buttons[0].getText();
            return true;
        }
        else if(checkWin(2,4) && checkWin(4,6)){
            titleWinner = buttons[2].getText();
            return true;
        }

        else{
            return false;
        }

    }

    public boolean checkWin(int a, int b){
        if ( buttons[a].getText().equals(buttons[b].getText()) && !buttons[a].getText().equals("") )
            return true;
        else
            return false;

    }

    public void resetButtons(){
        for(int i = 0; i<=8; i++){
            buttons[i].setText("");
        }
    }
}
