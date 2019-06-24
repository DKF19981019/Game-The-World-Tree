package jiemian;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import database.Player_data;

public class TFP_Welcome extends JWindow implements MouseListener{
	private Player_data player;

	JButton j2;
	ImageJpanel bg;
	public TFP_Welcome(){
		bg = new ImageJpanel(); 
		bg.setImage(new ImageIcon("./src/TFPimg/²£Á§.gif")
		.getImage());
		bg.setBounds(0,0,837,457);
		this.add(bg);
		bg.addMouseListener(this);
		
		
	
		
			
        
        this.setLayout(null);
		this.setLocation(900, 210);
		this.setSize(837,457);
		this.setLocationRelativeTo(null);
		this.setVisible(true);	
	}

	public static void main(String[] args) {
	    new TFP_Welcome();
	  }

	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
     if(e.getSource().equals(bg)){
			this.dispose();
			new TFP_Frame(player).setVisible(true);
     }
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}