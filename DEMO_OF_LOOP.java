import javax.swing.*;
import java.awt.*;
import java.util.*;

public class DEMO_OF_LOOP extends JPanel{
	DEMO_OF_LOOP(){
		setPreferredSize(new Dimension(200,520));
		setBackground(Color.black);
	}
	public boolean okay;
	public int x =0, y=0;
	public void paintComponent(Graphics page){
		do{
			if (x == 180 && y == 480){
				okay = true;
			}else if (x != 180 && y != 480){
				okay = false;
				if (x > y){
					page.setColor(Color.yellow);
					y += 20;
					page.fillRect(x,y,20,20);
				}else if (x < y){
					page.setColor(Color.blue);
					x += 20;
					page.fillRect(x,y,20,20);
				}else{
					page.setColor(Color.red);
					page.fillRect(x,y,20,20);
					x+= 20;
				}
			}else {}
		}while (!okay);
	}
	public static void main(String [] args){
		JFrame f = new JFrame("DEMO_OF_LOOP");
		DEMO_OF_LOOP panel = new DEMO_OF_LOOP();
		f.getContentPane().add(panel);
		f.pack();
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
