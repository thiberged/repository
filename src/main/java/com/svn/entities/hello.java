package main.java.com.svn.entities;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class hello {

	public static void main(String[] args) {
		
		for(int i=0;i<20;i++){
			for(int j=0;j<20;j++) {
				
				JFrame fenetre = new JFrame();
			    fenetre.setSize(200, 200);
			    fenetre.setTitle("MOUAHAHAHAHAHAAHAH");
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
	}

}