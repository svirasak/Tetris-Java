import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.*;
import java.util.*;


public class Tetris{
	public static void main (String [] args){
		JFrame tetris = new JFrame("Tetris");
		Objects obj = new Objects();
		tetris.setVisible(true);
		tetris.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tetris.getContentPane().add(obj);
		tetris.pack();
	}
}