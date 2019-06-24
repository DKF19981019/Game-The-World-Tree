/*
 * Reg.java
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
public class Reg extends javax.swing.JFrame {

	/** Creates new form Reg */
	public Reg() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel3 = new javax.swing.JLabel();
		imageJpanel1 = new jiemian.ImageJpanel();
		jButton5 = new javax.swing.JButton();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jPasswordField1 = new javax.swing.JPasswordField();
		jLabel5 = new javax.swing.JLabel();
		jPasswordField2 = new javax.swing.JPasswordField();
		jLabel6 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();

		jLabel3.setText("jLabel3");

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setIconImage(new ImageIcon("./src/img/8.gif").getImage());

		imageJpanel1.setImage(new ImageIcon("card_bg.jpg").getImage());

		jButton5.setBackground(new java.awt.Color(153, 255, 255));
		jButton5.setFont(new java.awt.Font("Ò¶¸ùÓÑÃ«±ÊÐÐÊé¼òÌå", 0, 24));
		jButton5.setForeground(new java.awt.Color(0, 153, 153));
		jButton5.setText("\u2190\u8fd4\u56de");
		jButton5.setContentAreaFilled(false);
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jLabel1.setFont(new java.awt.Font("ººÒÇ×ÛÒÕÌå¼ò", 0, 48));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u6e38\u620f\u6ce8\u518c\u754c\u9762");

		jLabel2.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel2.setText("\u7528\u6237\u540d/\u6635\u79f0\uff1a");

		jLabel4.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel4.setText("\u5bc6\u7801\uff1a");

		jLabel5.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel5.setText("\u518d\u6b21\u8f93\u5165\uff1a");

		jLabel6.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel6.setForeground(new java.awt.Color(204, 255, 255));
		jLabel6.setText("\u7535\u5b50\u90ae\u7bb1\uff1a");

		jLabel7.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 0, 18));
		jLabel7.setForeground(new java.awt.Color(204, 255, 255));
		jLabel7.setText("     \u5e78\u8fd0\u6570\u5b57\uff1a");

		jTextField3.setForeground(new java.awt.Color(0, 204, 204));
		jTextField3.setText("1-10000\u4efb\u610f\u6570");
		jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				Clear(evt);
			}
		});

		jButton1.setFont(new java.awt.Font("Î¢ÈíÑÅºÚ", 1, 18));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("\u63d0\u4ea4\u6ce8\u518c\u4fe1\u606f");
		jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
		jButton1.setContentAreaFilled(false);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jLabel8.setText("\uff08\u4e0d\u80fd\u4e3a\u7a7a\uff09");

		jLabel9.setText("\uff08\u4e0d\u80fd\u4e3a\u7a7a\uff09");

		jLabel10.setText("\uff08\u4e0d\u80fd\u4e3a\u7a7a\uff09");

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
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																imageJpanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton5,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				116,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				43,
																				43,
																				43)
																		.addComponent(
																				jLabel1))
														.addGroup(
																imageJpanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				23,
																				23,
																				23)
																		.addGroup(
																				imageJpanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								imageJpanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel7)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jTextField3,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												336,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addComponent(
																												jLabel10))
																						.addGroup(
																								imageJpanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												imageJpanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.TRAILING)
																														.addComponent(
																																jLabel4)
																														.addComponent(
																																jLabel2)
																														.addComponent(
																																jLabel5)
																														.addComponent(
																																jLabel6))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												imageJpanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jTextField2,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																336,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jPasswordField2,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																336,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addGroup(
																																imageJpanel1Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jPasswordField1,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				336,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jLabel9))
																														.addGroup(
																																imageJpanel1Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jTextField1,
																																				javax.swing.GroupLayout.PREFERRED_SIZE,
																																				336,
																																				javax.swing.GroupLayout.PREFERRED_SIZE)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																																		.addComponent(
																																				jLabel8)))))))
										.addContainerGap(23, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								imageJpanel1Layout.createSequentialGroup()
										.addContainerGap(246, Short.MAX_VALUE)
										.addComponent(jButton1).addGap(241,
												241, 241)));
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
														.addGroup(
																imageJpanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				45,
																				45,
																				45)
																		.addComponent(
																				jLabel1))
														.addComponent(
																jButton5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																48,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(52, 52, 52)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																39,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(30, 30, 30)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																39,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(31, 31, 31)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jPasswordField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																39,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel5))
										.addGap(31, 31, 31)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																39,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel6))
										.addGap(32, 32, 32)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel7)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																39,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(44, 44, 44)
										.addComponent(
												jButton1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												46,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(57, Short.MAX_VALUE))
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addGap(166, 166, 166)
										.addComponent(jLabel8)
										.addGap(52, 52, 52)
										.addComponent(jLabel9)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												193, Short.MAX_VALUE)
										.addComponent(jLabel10).addGap(147,
												147, 147)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				imageJpanel1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				imageJpanel1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		String id = jTextField1.getText();
		String pw = String.valueOf(this.jPasswordField1.getPassword());
		String pw2 = String.valueOf(this.jPasswordField2.getPassword());
		String friendVerify = jTextField3.getText();
		String mail = jTextField2.getText();
		try {
			if (pw.equals(pw2)) {
				Player_data player = ModelFactory.register(id, pw, Integer
						.parseInt(friendVerify), mail);
				if (player != null) {
					JOptionPane.showMessageDialog(this, "Ìá½»³É¹¦");
				}
			} else {
				JOptionPane.showMessageDialog(this, "ÃÜÂë²»Ò»ÖÂ");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, "×¢²áÊ§°Ü£¡");
			e.printStackTrace();
		}

	}

	private void Clear(java.awt.event.MouseEvent evt) {
		jTextField3.setText("");
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		new Login().setVisible(true);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Reg().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private jiemian.ImageJpanel imageJpanel1;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton5;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPasswordField jPasswordField2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	// End of variables declaration//GEN-END:variables

}