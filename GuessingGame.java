/**
Lab 7
Jeremiah Shaw
Date: March 29, 2021
@author Jeremiah Shaw
@version 1.1
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GuessingGame implements ActionListener {
  JTextField guess;
  JButton guessButton, playAgainButton;
  JLabel UserGuess, High_Low, PreviousGuess;
  Random r = new Random();
  int Num;
  GuessingGame() {
    //sets range for the random number
    Num = r.nextInt(101);
    //sets up the buttons, frame, and layout of the window 
    JFrame frame = new JFrame("Guessing Game"); 
    frame.setLayout(new FlowLayout()); 
    frame.setSize(250, 130); 
    guess = new JTextField(10); 
    guess.setActionCommand("myTF");
    guessButton = new JButton("Guess");
    playAgainButton = new JButton("Play Again");
    guess.addActionListener(this);
    guessButton.addActionListener(this);
    playAgainButton.addActionListener(this);
    UserGuess = new JLabel("Enter your guess: ");
    High_Low = new JLabel("");
    PreviousGuess = new JLabel("");
    frame.add(UserGuess);
    frame.add(guess);
    frame.add(guessButton);
    frame.add(High_Low);
    frame.add(PreviousGuess);
    frame.add(playAgainButton);
    frame.setVisible(true);
  }
  //reads and output for guesses
  public void actionPerformed(ActionEvent ae) {
    if(ae.getActionCommand().equals("Guess")) {
      int Guess = Integer.parseInt(guess.getText());
      //if guess is to low
      if (Guess < Num) {
        High_Low.setText("Too low!");
        PreviousGuess.setText("Last guess was " + Guess);
      }
      //if guess is to high
      else if (Guess > Num) {
        High_Low.setText("Too high!");
        PreviousGuess.setText("Last guess was " + Guess);
      }
      //if you guess the right number
      else {
        High_Low.setText("You got it!");
        PreviousGuess.setText("Last guess was " + Guess);
      }
    }
    //if you click play again
    else if(ae.getActionCommand().equals("Play Again")) {
      Num = r.nextInt(101);
      High_Low.setText("");
      PreviousGuess.setText("");
      guess.setText("");
    }
    //if you hit enter and not the guess button
    else {
      High_Low.setText("You pressed Enter. Please press the Guess Button.");
    }
  }
}
