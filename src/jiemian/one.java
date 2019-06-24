package jiemian;

import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class one extends JWindow implements MouseListener{

	JButton j2;
	ImageJpanel bg;
	public one(){
		bg = new ImageJpanel(); 
		bg.setImage(new ImageIcon("./src/CGImg/1b.png")
		.getImage());
		bg.setBounds(0,0,1142,692);
		this.add(bg);
		bg.addMouseListener(this);
		
		
	
		
			
        
        this.setLayout(null);
		this.setLocation(900, 210);
		this.setSize(1142, 692);
		this.setLocationRelativeTo(null);
		this.setVisible(true);	
	}

	public static void main(String[] args) {
	    new one();
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
     }
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}