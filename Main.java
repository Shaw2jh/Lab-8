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
import java.util.Scanner;
import java.util.Random;

class Main {

    public static void main(String args[]) {
      SwingUtilities.invokeLater(new Runnable() {
        public void run() {
          new GuessingGame();
        }
      });
    }
  
}