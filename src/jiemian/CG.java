/*
 * CG.java
 *
 * Created on __DATE__, __TIME__
 */

package jiemian;

import java.sql.SQLException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import database.ModelFactory;
import database.Player_data;

/**
 *
 * @author  __USER__
 */
public class CG extends javax.swing.JFrame {
	private Player_data player;

	/** Creates new form CG */
	public CG(Player_data player) {
		this.player = player;
		initComponents();
		this.setLocationRelativeTo(null);
	}

	public CG() {
		initComponents();

	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		imageJpanel1 = new jiemian.ImageJpanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setIconImage(new ImageIcon("./src/img/8.gif").getImage());

		imageJpanel1.setImage(new ImageIcon("./src/img/CG.png").getImage());

		jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/CGImg/锁.png"))); // NOI18N
		jButton1.setText("jButton1");
		jButton1.setContentAreaFilled(false);
		jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				Fangda(evt);
			}
		});
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/CGImg/锁.png"))); // NOI18N
		jButton2.setText("jButton1");
		jButton2.setContentAreaFilled(false);
		jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jButton2Fangda(evt);
			}
		});
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/CGImg/锁.png"))); // NOI18N
		jButton3.setText("jButton1");
		jButton3.setContentAreaFilled(false);
		jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jButton3Fangda(evt);
			}
		});
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/CGImg/锁.png"))); // NOI18N
		jButton4.setText("jButton1");
		jButton4.setContentAreaFilled(false);
		jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jButton4Fangda(evt);
			}
		});
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/CGImg/锁.png"))); // NOI18N
		jButton5.setText("jButton1");
		jButton5.setContentAreaFilled(false);
		jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jButton5Fangda(evt);
			}
		});
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/CGImg/锁.png"))); // NOI18N
		jButton6.setText("jButton1");
		jButton6.setContentAreaFilled(false);
		jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jButton6Fangda(evt);
			}
		});
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setFont(new java.awt.Font("微软雅黑", 1, 24));
		jButton7.setForeground(new java.awt.Color(255, 255, 255));
		jButton7.setText("\u2190\u8fd4\u56de");
		jButton7.setContentAreaFilled(false);
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

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
										.addGap(82, 82, 82)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																372,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																372,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												316, Short.MAX_VALUE)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jButton6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																372,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																372,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												300, Short.MAX_VALUE)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jButton5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																372,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																372,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(106, 106, 106))
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addComponent(
												jButton7,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												165,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(1755, Short.MAX_VALUE)));
		imageJpanel1Layout
				.setVerticalGroup(imageJpanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addGap(37, 37, 37)
										.addComponent(
												jButton7,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												84,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(112, 112, 112)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jButton1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																245,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																245,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jButton5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																245,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(191, 191, 191)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																imageJpanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																		.addComponent(
																				jButton2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				245,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				jButton3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				245,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																jButton4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																245,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(139, 139, 139)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				imageJpanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				imageJpanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1053,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {

		this.dispose();
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			if (ModelFactory.getProgress("圣杯战争", player.getName()) >= 42) {
				jButton6.setIcon(new javax.swing.ImageIcon(getClass()
						.getResource("/CGImg/2s.png")));
				new two().setVisible(true);
			} else
				JOptionPane.showMessageDialog(this, "完成度还未达到要求未能解锁");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton6Fangda(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			if (ModelFactory.getProgress("圣杯战争", player.getName()) >= 93) {
				jButton5.setIcon(new javax.swing.ImageIcon(getClass()
						.getResource("/CGImg/3s.png")));
				new three().setVisible(true);
			} else
				JOptionPane.showMessageDialog(this, "完成度还未达到要求未能解锁");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jButton5Fangda(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			if (ModelFactory.getProgress("第五人格", player.getName()) >= 20) {
				jButton4.setIcon(new javax.swing.ImageIcon(getClass()
						.getResource("/CGImg/4s.png")));
				new four().setVisible(true);
			} else
				JOptionPane.showMessageDialog(this, "完成度还未达到要求未能解锁");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton4Fangda(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			if (ModelFactory.getProgress("第五人格", player.getName()) >= 40) {
				jButton3.setIcon(new javax.swing.ImageIcon(getClass()
						.getResource("/CGImg/5s.png")));
				new five().setVisible(true);
			} else
				JOptionPane.showMessageDialog(this, "完成度还未达到要求未能解锁");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton3Fangda(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			if (ModelFactory.getProgress("第五人格", player.getName()) >= 62) {
				jButton2.setIcon(new javax.swing.ImageIcon(getClass()
						.getResource("/CGImg/6s.png")));
				new six().setVisible(true);
			} else
				JOptionPane.showMessageDialog(this, "完成度还未达到要求未能解锁");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton2Fangda(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			if (ModelFactory.getProgress("圣杯战争", player.getName()) >= 15) {
				jButton1.setIcon(new javax.swing.ImageIcon(getClass()
						.getResource("/CGImg/1s.png")));
				new one().setVisible(true);
			} else
				JOptionPane.showMessageDialog(this, "完成度还未达到要求未能解锁");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void Fangda(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CG().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private jiemian.ImageJpanel imageJpanel1;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	// End of variables declaration//GEN-END:variables

}