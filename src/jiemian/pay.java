/*
 * pay.java
 *
 * Created on __DATE__, __TIME__
 */

package jiemian;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import database.Player_data;

/**
 *
 * @author  __USER__
 */
public class pay extends javax.swing.JFrame {
	private Player_data player;

	/** Creates new form pay */
	public pay() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jTextField1 = new javax.swing.JTextField();
		jSeparator2 = new javax.swing.JSeparator();
		jPasswordField1 = new javax.swing.JPasswordField();
		imageJpanel1 = new jiemian.ImageJpanel();
		jLabel1 = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jSeparator3 = new javax.swing.JSeparator();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jButton5 = new javax.swing.JButton();

		jTextField1.setText("jTextField1");

		jPasswordField1.setText("jPasswordField1");

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setIconImage(new ImageIcon("./src/img/8.gif").getImage());

		imageJpanel1.setImage(new ImageIcon("zfbg.jpg").getImage());

		jLabel1.setFont(new java.awt.Font("΢���ź�", 1, 18));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1
				.setText("\u60a8\u7684\u8ba2\u5355\u540d\u79f0\uff1a\u6e38\u620f\u5e01\uff08\u5723\u6676\u77f3\uff09\u8d2d\u4e70");

		jSeparator1.setBackground(new java.awt.Color(51, 255, 255));

		jLabel2.setFont(new java.awt.Font("΢���ź�", 1, 18));
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));
		jLabel2.setText("\u60a8\u7684\u4ed8\u6b3e\u91d1\u989d\u4e3a\uff1a");

		jLabel3.setFont(new java.awt.Font("΢���ź�", 1, 18));
		jLabel3.setForeground(new java.awt.Color(255, 255, 102));
		jLabel3
				.setText("\u5f85\u5b9e\u73b0\u6570\u503c\u53d8\u52a8\u529f\u80fd");

		jSeparator3.setBackground(new java.awt.Color(51, 255, 255));

		jLabel4.setFont(new java.awt.Font("΢���ź�", 1, 18));
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4
				.setText("\u9009\u62e9\u60a8\u7684\u652f\u4ed8\u65b9\u5f0f\uff1a");

		jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/img/zfb.jpg"))); // NOI18N

		jButton5.setBackground(new java.awt.Color(0, 204, 204));
		jButton5.setFont(new java.awt.Font("Ҷ����ë���������", 0, 24));
		jButton5.setForeground(new java.awt.Color(255, 255, 255));
		jButton5.setText("\u2190\u8fd4\u56de");
		jButton5.setBorder(null);
		jButton5.setContentAreaFilled(false);
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
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
										.addContainerGap()
										.addComponent(jLabel2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jLabel3)
										.addContainerGap())
						.addComponent(jSeparator3,
								javax.swing.GroupLayout.DEFAULT_SIZE, 588,
								Short.MAX_VALUE)
						.addComponent(jSeparator1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 588,
								Short.MAX_VALUE)
						.addGroup(
								imageJpanel1Layout.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabel4).addContainerGap(
												411, Short.MAX_VALUE))
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								imageJpanel1Layout
										.createSequentialGroup()
										.addContainerGap(104, Short.MAX_VALUE)
										.addComponent(
												jLabel5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												386,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(98, 98, 98))
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												558, Short.MAX_VALUE)
										.addContainerGap())
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addComponent(
												jButton5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												90,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));
		imageJpanel1Layout
				.setVerticalGroup(imageJpanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addComponent(
												jButton5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												43,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(87, 87, 87)
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												53,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jSeparator1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												10,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																33,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jLabel3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																33,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jSeparator3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												10,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jLabel4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												33,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(29, 29, 29)
										.addComponent(
												jLabel5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												503,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(31, Short.MAX_VALUE)));

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
				imageJpanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		JOptionPane.showMessageDialog(this, "֧��ʧ�ܣ�");
		new GUI_Main(player);
		this.dispose();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new pay().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private jiemian.ImageJpanel imageJpanel1;
	private javax.swing.JButton jButton5;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private javax.swing.JSeparator jSeparator3;
	private javax.swing.JTextField jTextField1;
	// End of variables declaration//GEN-END:variables

}