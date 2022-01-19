import javax.swing.*;
import java.awt.*;
import java.util.Random;
import java.awt.event.*;

public class Objects extends JPanel{
	public Objects(){
		addKeyListener(new DirectionListener());
		setFocusable(true);
		setBackground(Color.black);
		setPreferredSize(new Dimension(200,520));
	}
	//Start the piece at the middle
	public final int MID_X = 100;
	//T_Piece
		//Tile a
		public  int pat = 20;
		//Tile b
		public  int pbt = 20;
		//Tile c
		public  int pct = 20;
		//Tile d
		public  int pdt = 20;
		//Tile e
		public  int pet =0;
		//Control Values
		public int xt = 0, yt = 0, zt =0;
	//J_Piece
		//Tile a
		public int paj =0;
		//Tile b
		public int pbj =20;
		//Tile c
		public int pcj = 0;
		//Tile d
		public int pdj = 0;
		//Tile e
		public int pej = 20;
		//Tile f
		public int pfj = 0;
		//Tile g
		public int pgj = 20;
		//Tile h
		public int phj = 20;
		//Tile i
		public int pij = 0;
		//Control values
		public int xj =0, yj =0, zj=0;

	public Random rd = new Random();
	public int PIECE = rd.nextInt(2);//It should be 7 not 2

	//Drawing Component
	public void paint(Graphics page){
		int r = rd.nextInt(255);
		int b = rd.nextInt(255);
		int g = rd.nextInt(255);
		Color rdcolor = new Color(r,b,g);
		page.setColor(rdcolor);
		switch (PIECE){
		case 0:
			//Draw Tiles
			page.fillRect(20 + xt +MID_X, 0 + yt, pat, pat);
			page.fillRect(0 + xt +MID_X, 20 + yt, pbt, pbt);
			page.fillRect(20 + xt +MID_X, 20 + yt, pct, pct);
			page.fillRect(40 + xt +MID_X, 20 + yt, pdt, pdt);
			page.fillRect(20 + xt +MID_X, 40 + yt, pet, pet);
			//Draw Parameters
			page.setColor(Color.black);
			page.drawRect(20 + xt +MID_X, 0 + yt, pat, pat);
			page.drawRect(0 + xt +MID_X, 20 + yt, pbt, pbt);
			page.drawRect(20 + xt +MID_X, 20 + yt, pct, pct);
			page.drawRect(40 + xt +MID_X, 20 + yt, pdt, pdt);
			page.drawRect(20 + xt +MID_X, 40 + yt, pet, pet);
			break;
			case 1:
			//J_Piece
			page.fillRect(0+xj+MID_X,0+yj,paj,paj);
			page.fillRect(20+xj+MID_X,0+yj,pbj,pbj);
			page.fillRect(40+xj+MID_X,0+yj,pcj,pcj);
			page.fillRect(0+xj+MID_X,20+yj,pdj,pdj);
			page.fillRect(20+xj+MID_X,20+yj,pej,pej);
			page.fillRect(40+xj+MID_X,20+yj,pfj,pfj);
			page.fillRect(0+xj+MID_X,40+yj,pgj,pgj);
			page.fillRect(20+xj+MID_X,40+yj,phj,phj);
			page.fillRect(40+xj+MID_X,40+yj,pij,pij);

			//Draw the parameter.
			page.setColor(Color.black);
			page.drawRect(0+xj+MID_X,0+yj,paj,paj);
			page.drawRect(20+xj+MID_X,0+yj,pbj,pbj);
			page.drawRect(40+xj+MID_X,0+yj,pcj,pcj);
			page.drawRect(0+xj+MID_X,20+yj,pdj,pdj);
			page.drawRect(20+xj+MID_X,20+yj,pej,pej);
			page.drawRect(40+xj+MID_X,20+yj,pfj,pfj);
			page.drawRect(0+xj+MID_X,40+yj,pgj,pgj);
			page.drawRect(20+xj+MID_X,40+yj,phj,phj);
			page.drawRect(40+xj+MID_X,40+yj,pij,pij);
			break;
		}
	}
		//Key Control System
		public class DirectionListener implements KeyListener{
			final int MOVE = 20;
			public void keyTyped(KeyEvent key){}
			public void keyReleased(KeyEvent key){}
			public void keyPressed(KeyEvent key){
				switch (key.getKeyCode()){
					case KeyEvent.VK_DOWN:
				 	switch (PIECE){
						case 0:
						yt += MOVE;
						break;
						case 1:
						yj += MOVE;
						break;
					}
				 	break;
				 	case KeyEvent.VK_RIGHT:
				 	switch (PIECE){
						//T_Piece
						case 0:
						//Limitation
							switch (zt){
								case 0:
								 if (xt == 40){
									 xt = 40;
								}else {
									 xt += MOVE;
									 }
								break;
								case 1:
								if (xt == 60){
									xt = 60;
								}else {
									xt += MOVE;
								}
								break;
								case 2:
								if (xt == 40){
									xt = 40;
								}else {
									xt += MOVE;
								}
								break;
								case 3:
								if (xt == 40){
									xt = 40;
								}else {
									xt += MOVE;
								}
								break;
							}
							break;
						//J_piece
							case 1:
								//Limitation
								switch (zj){
									case 0:
									if (xj == 60){
										xj = 60;
									}else {
										xj += MOVE;
									}
									break;
									case 1:
									if (xj == 40){
										xj = 40;
									}else {
										xj += MOVE;
									}
									break;
									case 2:
									if (xj == 40){
										xj = 40;
									}else {
										xj += MOVE;
									}
									break;
									case 3:
									if (xj == 40){
										xj = 40;
									}else {
										xj += MOVE;
									}
									break;
							}break;
						}break;
					case KeyEvent.VK_LEFT:
					switch (PIECE){
						//T_PIECE
						case 0:
						 //Limitation
						 if (pbt == 0 && xt <= - MID_X){
							 xt = -MID_X -20;
						 }else if (xt == -MID_X){
							 xt = -MID_X;
						 }else {
							 xt -= MOVE;
						 }
						 break;
						 //J_Piece
						 case 1:
						 //Limitation
						 switch (zj){
						 case 0: case 1: case 3:
						 	if (xj == -MID_X){
						 		xj = -MID_X;
						 	}else{
						 		xj -= MOVE;
						 	}
						 	break;
						 	case 2:
						 	if (xj <= -MID_X){
						 		xj = -MID_X -20;
						 	}else{
						 		xj -= MOVE;
						 	}
						 	break;
						}
				 		break;
					}
					break;
					case KeyEvent.VK_SPACE:
					switch (PIECE){
						//T_Piece
						case 0:
							switch (zt){
								case 0:
								pet =20;
								pdt = 0;
								zt++;
								break;
								case 1:
								pdt =20;
								pat=0;
								//Don't let the block leave the frame.
								if (xt ==60){
									xt = 40;
								}else {}
								zt++;
								break;
								case 2:
								pat =20;
								pbt = 0;
								zt++;
								break;
								case 3:
								pbt =20;
								pet =0;
								//Don't let the block leave the frame.
								if (xt == -MID_X -20){
									xt = -MID_X;
								}else {}
								zt= zt -3;
								break;
							}
							break;
							case 1:
							switch (zj){
								case 0:
								//Don't let the block leave the frame
								if (xj == 60){
									xj = 40;
								}else {}
									pbj = 0;
									pdj = 20;
									pfj = 20;
									pgj = 0;
									phj = 0;
									pij = 20;
									zj++;
									break;
									case 1:
									pbj = 20;
									pcj = 20;
									pdj = 0;
									pfj = 0;
									phj = 20;
									pij = 0;
									zj++;
									break;
									case 2:
									//Don't let the block leave the frame
									if (xj == -MID_X-20){
										xj = -MID_X;
									}else {}
									paj = 20;
									pbj = 0;
									pcj = 0;
									pdj = 20;
									pfj = 20;
									phj = 0;
									zj++;
									break;
									case 3:
									paj = 0;
									pbj = 20;
									pdj = 0;
									pfj = 0;
									phj = 20;
									pgj = 20;
									zj = zj-3;
									break;
								}
								break;
							}
							break;
						}repaint();
					}
				}
			}



















