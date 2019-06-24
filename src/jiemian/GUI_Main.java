/*
 * GUI_Main.java
 *
 * Created on __DATE__, __TIME__
 */

package jiemian;

import database.ModelFactory;
import database.Player_data;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import database.Player_data;

/**
 *
 * @author  __USER__
 */
public class GUI_Main extends javax.swing.JFrame implements Runnable {

	private Player_data player;

	/** Creates new form GUI_Main */
	public GUI_Main(Player_data player) {
		Thread t = new Thread(this);
		t.start();
		this.player = player;
		ModelFactory.playBackmusic(1);
		initComponents();
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public GUI_Main() {
		initComponents();
		this.setLocationRelativeTo(null);

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		imageJpanel2 = new jiemian.ImageJpanel();
		imageJpanel3 = new jiemian.ImageJpanel();
		imageJpanel1 = new jiemian.ImageJpanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jButton10 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();

		javax.swing.GroupLayout imageJpanel2Layout = new javax.swing.GroupLayout(
				imageJpanel2);
		imageJpanel2.setLayout(imageJpanel2Layout);
		imageJpanel2Layout.setHorizontalGroup(imageJpanel2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));
		imageJpanel2Layout.setVerticalGroup(imageJpanel2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));

		javax.swing.GroupLayout imageJpanel3Layout = new javax.swing.GroupLayout(
				imageJpanel3);
		imageJpanel3.setLayout(imageJpanel3Layout);
		imageJpanel3Layout.setHorizontalGroup(imageJpanel3Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));
		imageJpanel3Layout.setVerticalGroup(imageJpanel3Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 100, Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon("./src/img/8.gif").getImage());
		setResizable(false);

		imageJpanel1.setImage(new ImageIcon("bg1.png").getImage());

		jButton1.setBorder(null);
		jButton1.setContentAreaFilled(false);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("张海山锐线体简", 0, 15));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setBorder(null);
		jButton2.setContentAreaFilled(false);
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBorder(null);
		jButton3.setContentAreaFilled(false);
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setBorder(null);
		jButton4.setContentAreaFilled(false);
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setBorder(null);
		jButton5.setContentAreaFilled(false);
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setBorder(null);
		jButton6.setContentAreaFilled(false);
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setBorder(null);
		jButton7.setContentAreaFilled(false);
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton8.setBorder(null);
		jButton8.setContentAreaFilled(false);
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jButton9.setToolTipText("\u70b9\u51fb\u66f4\u6362\u5934\u50cf");
		jButton9.setBorder(null);
		jButton9.setContentAreaFilled(false);
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		jButton10.setText("+");
		jButton10.setBorder(null);
		jButton10.setContentAreaFilled(false);
		jButton10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton10ActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("微软雅黑", 0, 18));

		jLabel2.setFont(new java.awt.Font("微软雅黑", 0, 18));

		javax.swing.GroupLayout imageJpanel1Layout = new javax.swing.GroupLayout(
				imageJpanel1);
		imageJpanel1.setLayout(imageJpanel1Layout);
		imageJpanel1Layout
				.setHorizontalGroup(imageJpanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								imageJpanel1Layout
										.createSequentialGroup()
										.addContainerGap(656, Short.MAX_VALUE)
										.addComponent(
												jButton3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												477,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																imageJpanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addGroup(
																				imageJpanel1Layout
																						.createSequentialGroup()
																						.addContainerGap(
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jButton9,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								105,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addComponent(
																				jButton1,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				169,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																imageJpanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				143,
																				143,
																				143)
																		.addComponent(
																				jButton10)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												436, Short.MAX_VALUE)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																imageJpanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				120,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				115,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				107,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				112,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				62,
																				62,
																				62))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																imageJpanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				imageJpanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jLabel2)
																						.addComponent(
																								jLabel1))
																		.addGap(
																				76,
																				76,
																				76))))
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addGap(659, 659, 659)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton4,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																474,
																Short.MAX_VALUE)
														.addComponent(
																jButton2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																474,
																Short.MAX_VALUE))
										.addContainerGap()));
		imageJpanel1Layout
				.setVerticalGroup(imageJpanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																78,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel2)
										.addGap(18, 18, 18)
										.addComponent(
												jButton2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												97,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(64, 64, 64)
										.addComponent(
												jButton4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												97,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(56, 56, 56)
										.addComponent(
												jButton3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												39, Short.MAX_VALUE)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																imageJpanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				91,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton10,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				37,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																imageJpanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jButton5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				79,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButton8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				79,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																imageJpanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																		.addComponent(
																				jButton6,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton7,
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				76,
																				Short.MAX_VALUE)))));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				imageJpanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				imageJpanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
		new Shop(player).setVisible(true);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

		ModelFactory.playMusic(1);
		new CG(player).setVisible(true);
		ModelFactory.stopBackmusic();
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		ModelFactory.playMusic(1);
		new Game(player).setVisible(true);
		ModelFactory.stopBackmusic();
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		ModelFactory.playMusic(1);
		new Call(player).setVisible(true);
		ModelFactory.stopBackmusic();
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		ModelFactory.playMusic(1);
		new Friend(player).setVisible(true);
		ModelFactory.stopBackmusic();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		ModelFactory.playMusic(1);
		new Juqing(player).setVisible(true);
		ModelFactory.stopBackmusic();
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		ModelFactory.playMusic(1);
		new card(player).setVisible(true);
		ModelFactory.stopBackmusic();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		ModelFactory.playMusic(1);
		new Message().setVisible(true);
		ModelFactory.stopBackmusic();
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		ModelFactory.playMusic(1);
		new Shop(player).setVisible(true);
		ModelFactory.stopBackmusic();
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(this);
		File f = jfc.getSelectedFile();
		this.jButton9.setIcon(new ImageIcon(f.getAbsolutePath()));
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			//TODO exception
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new GUI_Main().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private jiemian.ImageJpanel imageJpanel1;
	private jiemian.ImageJpanel imageJpanel2;
	private jiemian.ImageJpanel imageJpanel3;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;

	// End of variables declaration//GEN-END:variables

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int miao = 0;
		while (true) {
			try {
				Thread.sleep(1000);
				miao = 1;
				ModelFactory.sendGameTime(miao, player.getName());
				this.jLabel1.setText("已游戏的时间为："
						+ ModelFactory.getGameTime(player.getName()) + "秒");
				this.jLabel2.setText(ModelFactory.getLocalTime());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}