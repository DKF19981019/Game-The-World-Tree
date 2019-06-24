/*
 * TFP_Frame.java
 *
 * Created on __DATE__, __TIME__
 */

package jiemian;

import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import database.ModelFactory;
import database.Player_data;

/**
 *
 * @author  __USER__
 */
public class TFP_Frame extends javax.swing.JFrame {
	private Player_data player;

	private int i = 0;

	/** Creates new form TFP_Frame */
	public TFP_Frame(Player_data player) {
		this.player = player;
		initComponents();
		this.setLocationRelativeTo(null);
	}

	public TFP_Frame() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		imageJpanel1 = new jiemian.ImageJpanel();
		jLabel1 = new javax.swing.JLabel();
		jProgressBar1 = new javax.swing.JProgressBar();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setIconImage(new ImageIcon("./src/img/8.gif").getImage());
		addWindowListener(new java.awt.event.WindowAdapter() {
			public void windowClosed(java.awt.event.WindowEvent evt) {
		
			}
		});

		imageJpanel1.setImage(new ImageIcon("./src/TFPimg/背景.png").getImage());
		imageJpanel1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				change(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("张海山锐线体简", 1, 18));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u5b8c\u6210\u5ea6\uff1a");

		jProgressBar1.setForeground(new java.awt.Color(153, 255, 0));

		javax.swing.GroupLayout imageJpanel1Layout = new javax.swing.GroupLayout(
				imageJpanel1);
		imageJpanel1.setLayout(imageJpanel1Layout);
		imageJpanel1Layout
				.setHorizontalGroup(imageJpanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addGap(25, 25, 25)
										.addComponent(jLabel1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jProgressBar1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												195,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(835, Short.MAX_VALUE)));
		imageJpanel1Layout
				.setVerticalGroup(imageJpanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(
																jProgressBar1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap(611, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				imageJpanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addComponent(imageJpanel1,
						javax.swing.GroupLayout.DEFAULT_SIZE,
						javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void change(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:

		try {
			this.jProgressBar1.setMinimum(1);
			this.jProgressBar1.setMaximum(62);
			i++;
			if (i <= 7 && i >= 1) {
				imageJpanel1.setImage(new ImageIcon("./src/TFPimg/" + i
						+ ".png").getImage());
				jProgressBar1.setValue(i);
				ModelFactory.playDub(i);
				if (i > ModelFactory.getProgress("第五人格", player.getName())) {
					ModelFactory.sendProgress(i, "第五人格", player.getName());
				}
			}
			if (i == 8) {
				imageJpanel1.setImage(new ImageIcon("./src/TFPimg/" + i
						+ ".png").getImage());
				jProgressBar1.setValue(i);
				if (i > ModelFactory.getProgress("第五人格", player.getName())) {
					ModelFactory.sendProgress(i, "第五人格", player.getName());
				}
			}
			if (i <= 44 && i >= 9) {
				imageJpanel1.setImage(new ImageIcon("./src/TFPimg/" + i
						+ ".png").getImage());
				jProgressBar1.setValue(i);
				ModelFactory.playDub(i);
				if (i > ModelFactory.getProgress("第五人格", player.getName())) {
					ModelFactory.sendProgress(i, "第五人格", player.getName());
				}
			}
			if (i <= 47 && i >= 45) {
				imageJpanel1.setImage(new ImageIcon("./src/TFPimg/" + i
						+ ".png").getImage());
				jProgressBar1.setValue(i);
				if (i > ModelFactory.getProgress("第五人格", player.getName())) {
					ModelFactory.sendProgress(i, "第五人格", player.getName());
				}
			}
			if (i <= 49 && i >= 48) {
				imageJpanel1.setImage(new ImageIcon("./src/TFPimg/" + i
						+ ".png").getImage());
				jProgressBar1.setValue(i);
				ModelFactory.playDub(i);
				if (i > ModelFactory.getProgress("第五人格", player.getName())) {
					ModelFactory.sendProgress(i, "第五人格", player.getName());
				}
			}
			if (i == 50) {
				imageJpanel1.setImage(new ImageIcon("./src/TFPimg/" + i
						+ ".png").getImage());
				jProgressBar1.setValue(i);
				if (i > ModelFactory.getProgress("第五人格", player.getName())) {
					ModelFactory.sendProgress(i, "第五人格", player.getName());
				}
			}
			if (i == 51) {
				imageJpanel1.setImage(new ImageIcon("./src/TFPimg/" + i
						+ ".png").getImage());
				jProgressBar1.setValue(i);
				ModelFactory.playDub(i);
				if (i > ModelFactory.getProgress("第五人格", player.getName())) {
					ModelFactory.sendProgress(i, "第五人格", player.getName());
				}
			}
			if (i == 52) {
				imageJpanel1.setImage(new ImageIcon("./src/TFPimg/" + i
						+ ".png").getImage());
				jProgressBar1.setValue(i);
				if (i > ModelFactory.getProgress("第五人格", player.getName())) {
					ModelFactory.sendProgress(i, "第五人格", player.getName());
				}
			}
			if (i <= 59 && i >= 53) {
				imageJpanel1.setImage(new ImageIcon("./src/TFPimg/" + i
						+ ".png").getImage());
				jProgressBar1.setValue(i);
				ModelFactory.playDub(i);
				if (i > ModelFactory.getProgress("第五人格", player.getName())) {
					ModelFactory.sendProgress(i, "第五人格", player.getName());
				}
			}
			if (i <= 61 && i >= 60) {
				imageJpanel1.setImage(new ImageIcon("./src/TFPimg/" + i
						+ ".png").getImage());
				jProgressBar1.setValue(i);
				if (i > ModelFactory.getProgress("第五人格", player.getName())) {
					ModelFactory.sendProgress(i, "第五人格", player.getName());
				}
			}
			if (i == 62) {
				imageJpanel1.setImage(new ImageIcon("./src/TFPimg/" + i
						+ ".png").getImage());
				jProgressBar1.setValue(i);
				if (i > ModelFactory.getProgress("第五人格", player.getName())) {
					ModelFactory.sendProgress(i, "第五人格", player.getName());
					JOptionPane.showMessageDialog(this, "恭喜您完成了第五人格剧情");

				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new TFP_Frame().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private jiemian.ImageJpanel imageJpanel1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JProgressBar jProgressBar1;
	// End of variables declaration//GEN-END:variables

}