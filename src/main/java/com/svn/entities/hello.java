package main.java.com.svn.entities;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class hello {

	public static void main(String[] args) {
		
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++) {
				
				JFrame fenetre = new JFrame();
			    fenetre.setSize((int)(Math.random() * 800), (int)(Math.random() *  500));
			    fenetre.setUndecorated(true);
			    //fenetre.setTitle("MOUAHAHAHAHAHAAHAH");
			    fenetre.setIconImage(new ImageIcon("image.gif").getImage());
			    fenetre.setLocation((int)(Math.random() * 1600), (int)(Math.random() *  1000)); 
			    
			    JPanel pan = new JPanel();
			    int vert  = (int)(Math.random()*255.99);
			    int bleu  = (int)(Math.random()*255.99);
			    int rouge = (int)(Math.random()*255.99);
			    pan.setBackground(new Color(rouge,vert,bleu));
			    
			    fenetre.setContentPane(pan);               
			    fenetre.setVisible(true);
			}
		}
		System.out.println("début des fenetres");
	}

}