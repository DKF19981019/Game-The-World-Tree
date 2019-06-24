package jiemian;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class MainBlank implements ActionListener,MouseListener{
	BackgroundPanel BG;
	JScrollPane S;
	JLabel L;
	JFrame F;
	JButton J1;
	JButton J2;
	JButton J3;
	JButton J4;
	JButton J5;
	JButton J6;
	JButton J7;
	JButton J8;
	JButton J9;
	JButton J10;
	JButton J11;
	JButton J12;
	JButton J13;
	JButton J14;
	JButton J15;
	JButton J16;
	JButton J17;
	JButton J18;
	JButton J19;
	JButton J20;
	JButton J21;
	JButton J22;
	JButton J23;
	JButton J24;
	JButton J25;
	JButton J26;
	JButton J27;
	JButton J28;
	JButton J29;
	JTextField T1;
	
	public MainBlank(){
		 F=new JFrame("ÓÈ¿ËÀ­ÌØÏ£¶û");
		 F.setIconImage(new ImageIcon("8.gif").getImage());
		 BG = new BackgroundPanel((new ImageIcon("bg1.png")).getImage());
		 BG.setBounds(0,0,1142,692);
		 BG.setLayout(new BorderLayout());
		 F.add(BG);
	           
		 Icon p1 = new ImageIcon("tm.png");
		 
		 J1=new JButton(p1);
		 J1.setSize(100,200);
		 J1.setBackground(new Color(42,69,114));
		 J1.setFont(new Font("Î¢ÈíÑÅºÚ",Font.PLAIN,14));
		 J1.setForeground(Color.white);
		 BG.add(J1);
		
		 
		 
		 F.setLocation(300,50);
		 F.setSize(1279,826);
		 F.setVisible(true);
}
	

	/**
	 * @param args
	 */
	public static void main(String[] args)  {
		new MainBlank();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
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
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}

}
