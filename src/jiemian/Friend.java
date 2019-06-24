/*
 * Friend.java
 *
 * Created on __DATE__, __TIME__
 */

package jiemian;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import server.Client;

import database.ModelFactory;
import database.Player_data;

/**
 *
 * @author  __USER__
 */
public class Friend extends javax.swing.JFrame {

	private Player_data player;

	/** Creates new form Friend */
	public Friend() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	public Friend(Player_data player) {

		try {
			this.player = player;
			initComponents();
			this.jTextField2.setText(""
					+ ModelFactory.getFriendVerify(player.getName()));
			this.setLocationRelativeTo(null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jSplitPane1 = new javax.swing.JSplitPane();
		jToolBar1 = new javax.swing.JToolBar();
		jSplitPane2 = new javax.swing.JSplitPane();
		jLabel9 = new javax.swing.JLabel();
		jButton9 = new javax.swing.JButton();
		imageJpanel1 = new jiemian.ImageJpanel();
		jButton1 = new javax.swing.JButton();
		jTabbedPane3 = new javax.swing.JTabbedPane();
		jScrollPane3 = new javax.swing.JScrollPane();
		jPanel9 = new javax.swing.JPanel();
		jPanel5 = new javax.swing.JPanel();
		jButton6 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jButton7 = new javax.swing.JButton();
		jButton13 = new javax.swing.JButton();
		jPanel6 = new javax.swing.JPanel();
		jButton8 = new javax.swing.JButton();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jButton14 = new javax.swing.JButton();
		jButton15 = new javax.swing.JButton();
		jPanel7 = new javax.swing.JPanel();
		jButton10 = new javax.swing.JButton();
		jLabel10 = new javax.swing.JLabel();
		jLabel11 = new javax.swing.JLabel();
		jButton16 = new javax.swing.JButton();
		jButton17 = new javax.swing.JButton();
		jPanel12 = new javax.swing.JPanel();
		jPanel10 = new javax.swing.JPanel();
		jLabel12 = new javax.swing.JLabel();
		jLabel13 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jButton18 = new javax.swing.JButton();
		jPanel11 = new javax.swing.JPanel();
		jLabel14 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jButton19 = new javax.swing.JButton();

		jToolBar1.setRollover(true);

		jLabel9.setText("jLabel9");

		jButton9.setText("jButton9");

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("\u597d\u53cb\u754c\u9762");
		setBackground(new java.awt.Color(102, 255, 255));
		setForeground(java.awt.Color.black);
		setIconImage(new ImageIcon("./src/img/8.gif").getImage());
		setResizable(false);

		imageJpanel1.setImage(new ImageIcon("./src/img/∫√”—Banner.png")
				.getImage());

		jButton1.setContentAreaFilled(false);
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout imageJpanel1Layout = new javax.swing.GroupLayout(
				imageJpanel1);
		imageJpanel1.setLayout(imageJpanel1Layout);
		imageJpanel1Layout.setHorizontalGroup(imageJpanel1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						imageJpanel1Layout.createSequentialGroup()
								.addComponent(jButton1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										123,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(879, Short.MAX_VALUE)));
		imageJpanel1Layout.setVerticalGroup(imageJpanel1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE,
						68, Short.MAX_VALUE));

		jTabbedPane3.setBackground(new java.awt.Color(255, 153, 153));

		jPanel9.setBackground(new java.awt.Color(204, 255, 255));

		jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/∫√”—Õ∑œÒ¿˝◊”.png"))); // NOI18N

		jLabel5.setText("\u597d\u53cb\u6635\u79f0");

		jLabel6.setBackground(new java.awt.Color(204, 204, 255));
		jLabel6
				.setText("\u597d\u53cb\u62e5\u6709\u5361\uff0c\u597d\u53cb\u4fe1\u606f");

		jButton7.setBackground(new java.awt.Color(255, 51, 51));
		jButton7.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 18));
		jButton7.setForeground(new java.awt.Color(102, 102, 102));
		jButton7.setText("\u5220\u9664\u597d\u53cb");

		jButton13.setBackground(new java.awt.Color(255, 51, 51));
		jButton13.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 18));
		jButton13.setForeground(new java.awt.Color(102, 102, 102));
		jButton13.setText("\u53d1\u8d77\u4f1a\u8bdd");
		jButton13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout
				.setHorizontalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addComponent(
												jButton6,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												123,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																144,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel5Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel6,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				394,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				62,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton13,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				148,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton7,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				148,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jButton6,
								javax.swing.GroupLayout.DEFAULT_SIZE, 137,
								Short.MAX_VALUE)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addGap(17, 17, 17)
										.addComponent(
												jLabel5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												26,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jButton7,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																47,
																Short.MAX_VALUE)
														.addComponent(
																jButton13,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																47,
																Short.MAX_VALUE)
														.addComponent(
																jLabel6,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																73,
																Short.MAX_VALUE))));

		jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/∫√”—Õ∑œÒ¿˝◊”.png"))); // NOI18N

		jLabel7.setText("\u597d\u53cb\u6635\u79f0");

		jLabel8.setBackground(new java.awt.Color(204, 204, 255));
		jLabel8
				.setText("\u597d\u53cb\u62e5\u6709\u5361\uff0c\u597d\u53cb\u4fe1\u606f");

		jButton14.setBackground(new java.awt.Color(255, 51, 51));
		jButton14.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 18));
		jButton14.setForeground(new java.awt.Color(102, 102, 102));
		jButton14.setText("\u53d1\u8d77\u4f1a\u8bdd");
		jButton14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton13ActionPerformed(evt);
			}
		});

		jButton15.setBackground(new java.awt.Color(255, 51, 51));
		jButton15.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 18));
		jButton15.setForeground(new java.awt.Color(102, 102, 102));
		jButton15.setText("\u5220\u9664\u597d\u53cb");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout
				.setHorizontalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addComponent(
												jButton8,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												123,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																144,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																jPanel6Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel8,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				356,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				94,
																				94,
																				94)
																		.addComponent(
																				jButton14,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				148,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				9,
																				9,
																				9)
																		.addComponent(
																				jButton15,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				148,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(21, Short.MAX_VALUE)));
		jPanel6Layout
				.setVerticalGroup(jPanel6Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jButton8,
								javax.swing.GroupLayout.DEFAULT_SIZE, 137,
								Short.MAX_VALUE)
						.addGroup(
								jPanel6Layout
										.createSequentialGroup()
										.addGap(17, 17, 17)
										.addComponent(
												jLabel7,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												26,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel6Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel8,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																73,
																Short.MAX_VALUE)
														.addComponent(
																jButton14,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																47,
																Short.MAX_VALUE)
														.addComponent(
																jButton15,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																47,
																Short.MAX_VALUE))));

		jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/∫√”—Õ∑œÒ¿˝◊”.png"))); // NOI18N

		jLabel10.setText("\u597d\u53cb\u6635\u79f0");

		jLabel11.setBackground(new java.awt.Color(204, 204, 255));
		jLabel11
				.setText("\u597d\u53cb\u62e5\u6709\u5361\uff0c\u597d\u53cb\u4fe1\u606f");

		jButton16.setBackground(new java.awt.Color(255, 51, 51));
		jButton16.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 18));
		jButton16.setForeground(new java.awt.Color(102, 102, 102));
		jButton16.setText("\u5220\u9664\u597d\u53cb");

		jButton17.setBackground(new java.awt.Color(255, 51, 51));
		jButton17.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 18));
		jButton17.setForeground(new java.awt.Color(102, 102, 102));
		jButton17.setText("\u53d1\u8d77\u4f1a\u8bdd");
		jButton17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton12ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(
				jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout
				.setHorizontalGroup(jPanel7Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel7Layout
										.createSequentialGroup()
										.addComponent(
												jButton10,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												123,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel7Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jLabel10,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																144,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel7Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel11,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				403,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				53,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton17,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				148,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jButton16,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				148,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap()));
		jPanel7Layout
				.setVerticalGroup(jPanel7Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jButton10,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)
						.addGroup(
								jPanel7Layout
										.createSequentialGroup()
										.addGap(17, 17, 17)
										.addComponent(
												jLabel10,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												26,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel7Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jButton16,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																47,
																Short.MAX_VALUE)
														.addComponent(
																jButton17,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																47,
																Short.MAX_VALUE)
														.addComponent(
																jLabel11,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																73,
																Short.MAX_VALUE))));

		javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(
				jPanel9);
		jPanel9.setLayout(jPanel9Layout);
		jPanel9Layout
				.setHorizontalGroup(jPanel9Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel9Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel9Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																false)
														.addComponent(
																jPanel7,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jPanel6,
																javax.swing.GroupLayout.Alignment.LEADING,
																0,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jPanel5,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addContainerGap(851, Short.MAX_VALUE)));
		jPanel9Layout.setVerticalGroup(jPanel9Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel9Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel5,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								52, 52, 52).addComponent(jPanel7,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								46, 46, 46).addComponent(jPanel6,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(96, Short.MAX_VALUE)));

		jScrollPane3.setViewportView(jPanel9);

		jTabbedPane3.addTab("\u597d\u53cb\u5217\u8868", jScrollPane3);

		jPanel12.setBackground(new java.awt.Color(0, 204, 204));

		jPanel10.setBackground(new java.awt.Color(40, 52, 59));

		jLabel12.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 24));
		jLabel12.setForeground(new java.awt.Color(255, 255, 255));
		jLabel12.setText("\u901a\u8fc7\u8f93\u5165\u7528\u6237\u7684ID");

		jLabel13.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 24));
		jLabel13.setForeground(new java.awt.Color(255, 255, 255));
		jLabel13
				.setText("\u53ef\u641c\u7d22\u60f3\u8981\u7533\u8bf7\u6210\u4e3a\u597d\u53cb\u7684\u7528\u6237");

		jTextField1.setBackground(new java.awt.Color(0, 204, 204));
		jTextField1.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 18));
		jTextField1.setForeground(new java.awt.Color(0, 153, 153));
		jTextField1.setText("\u60f3\u8981\u6dfb\u52a0\u7684\u7528\u6237ID");
		jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				clear(evt);
			}
		});
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jButton18.setBackground(new java.awt.Color(0, 204, 204));
		jButton18.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 18));
		jButton18.setForeground(new java.awt.Color(0, 102, 102));
		jButton18.setText("\u6dfb\u52a0");
		jButton18.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton18ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(
				jPanel10);
		jPanel10.setLayout(jPanel10Layout);
		jPanel10Layout
				.setHorizontalGroup(jPanel10Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel10Layout
										.createSequentialGroup()
										.addGap(147, 147, 147)
										.addComponent(
												jTextField1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												388,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												9, Short.MAX_VALUE)
										.addComponent(
												jButton18,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												84,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(47, 47, 47))
						.addGroup(
								jPanel10Layout
										.createSequentialGroup()
										.addGroup(
												jPanel10Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel10Layout
																		.createSequentialGroup()
																		.addGap(
																				245,
																				245,
																				245)
																		.addComponent(
																				jLabel12,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				210,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel10Layout
																		.createSequentialGroup()
																		.addGap(
																				176,
																				176,
																				176)
																		.addComponent(
																				jLabel13,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				351,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(148, Short.MAX_VALUE)));
		jPanel10Layout
				.setVerticalGroup(jPanel10Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel10Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jLabel12,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												42,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jLabel13,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												47,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel10Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																40,
																Short.MAX_VALUE)
														.addComponent(
																jButton18,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																36,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap()));

		jLabel14.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 24));
		jLabel14.setText("\u4f60\u7684\u7528\u6237ID");

		jTextField2.setBackground(new java.awt.Color(0, 255, 255));
		jTextField2.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 18));
		jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				Clear(evt);
			}
		});
		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		jButton19.setBackground(new java.awt.Color(0, 204, 204));
		jButton19.setFont(new java.awt.Font("Œ¢»Ì—≈∫⁄", 1, 18));
		jButton19.setForeground(new java.awt.Color(0, 102, 102));
		jButton19.setText("\u590d\u5236");
		jButton19.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton19ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(
				jPanel11);
		jPanel11.setLayout(jPanel11Layout);
		jPanel11Layout
				.setHorizontalGroup(jPanel11Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel11Layout
										.createSequentialGroup()
										.addGroup(
												jPanel11Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel11Layout
																		.createSequentialGroup()
																		.addGap(
																				276,
																				276,
																				276)
																		.addComponent(
																				jLabel14))
														.addGroup(
																jPanel11Layout
																		.createSequentialGroup()
																		.addGap(
																				153,
																				153,
																				153)
																		.addComponent(
																				jTextField2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				384,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel11Layout
																		.createSequentialGroup()
																		.addGap(
																				298,
																				298,
																				298)
																		.addComponent(
																				jButton19,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				84,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(138, Short.MAX_VALUE)));
		jPanel11Layout
				.setVerticalGroup(jPanel11Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel11Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jLabel14,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												42,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(
												jTextField2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												44,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jButton19,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												36,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(26, Short.MAX_VALUE)));

		javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(
				jPanel12);
		jPanel12.setLayout(jPanel12Layout);
		jPanel12Layout
				.setHorizontalGroup(jPanel12Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel12Layout
										.createSequentialGroup()
										.addGap(144, 144, 144)
										.addGroup(
												jPanel12Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jPanel10,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jPanel11,
																javax.swing.GroupLayout.Alignment.LEADING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addGap(178, 178, 178)));
		jPanel12Layout.setVerticalGroup(jPanel12Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel12Layout.createSequentialGroup().addGap(41, 41, 41)
						.addComponent(jPanel10,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								34, 34, 34).addComponent(jPanel11,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(63, Short.MAX_VALUE)));

		jTabbedPane3.addTab("\u597d\u53cb\u67e5\u8be2", jPanel12);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jTabbedPane3, 0, 0, Short.MAX_VALUE).addComponent(imageJpanel1,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addComponent(
												imageJpanel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTabbedPane3,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												558, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

		String idd = jTextField1.getText();
		try {
			ModelFactory.addFriend(
					ModelFactory.findName(Integer.parseInt(idd)), Integer
							.parseInt(idd), player.getName());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection selection = new StringSelection(jTextField2.getText());
		clipboard.setContents(selection, null);
	}

	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			Client c = new Client();
			String name = player.getName();
			if (c.login(name)) {
				JOptionPane.showMessageDialog(this, "ª∂”≠”√ªß" + name + "º”»Î¡ƒÃÏ");
				new Dialog(name);
				this.dispose();
			} else
				JOptionPane.showMessageDialog(this, "”√ªß√˚“—¥Ê‘⁄");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
		new Dialog().setVisible(true);
	}

	private void Clear(java.awt.event.MouseEvent evt) {

	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void clear(java.awt.event.MouseEvent evt) {
		jTextField1.setText("");
	}

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
		new Dialog().setVisible(true);
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new GUI_Main(player);
		this.dispose();
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
				new Friend().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private jiemian.ImageJpanel imageJpanel1;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton10;
	private javax.swing.JButton jButton13;
	private javax.swing.JButton jButton14;
	private javax.swing.JButton jButton15;
	private javax.swing.JButton jButton16;
	private javax.swing.JButton jButton17;
	private javax.swing.JButton jButton18;
	private javax.swing.JButton jButton19;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel10;
	private javax.swing.JPanel jPanel11;
	private javax.swing.JPanel jPanel12;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel9;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JSplitPane jSplitPane1;
	private javax.swing.JSplitPane jSplitPane2;
	private javax.swing.JTabbedPane jTabbedPane3;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JToolBar jToolBar1;
	// End of variables declaration//GEN-END:variables

}