/*
 * Message.java
 *
 * Created on __DATE__, __TIME__
 */

package jiemian;

import java.sql.SQLException;
import javax.swing.ImageIcon;
import database.ModelFactory;
import database.Player_data;
import database.message;

/**
 *
 * @author  __USER__
 */
public class Message extends javax.swing.JFrame {
	private Player_data player;

	/** Creates new form Message */
	public Message(Player_data player) {
		this.player = player;
		initComponents();
		try {
			message massage = new ModelFactory().getAnnouncement("trani");
			this.jLabel2.setText(massage.getMessage());
			this.jLabel4.setText("发布人为：" + massage.getWritor());
			this.jLabel5.setText("发布时间：" + massage.getTime());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.setLocationRelativeTo(null);
	}

	public Message() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		imageJpanel1 = new jiemian.ImageJpanel();
		jLabel1 = new javax.swing.JLabel();
		jSeparator3 = new javax.swing.JSeparator();
		jLabel2 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setIconImage(new ImageIcon("./src/img/8.gif").getImage());

		imageJpanel1.setImage(new ImageIcon("RBQ.jpg").getImage());

		jLabel1.setFont(new java.awt.Font("张海山锐线体简", 1, 48));
		jLabel1.setForeground(new java.awt.Color(255, 255, 255));
		jLabel1.setText("\u901a  \u77e5");

		jLabel2.setFont(new java.awt.Font("日本青柳衡山毛笔字体", 1, 36));
		jLabel2.setForeground(new java.awt.Color(255, 255, 255));

		jLabel4.setFont(new java.awt.Font("新蒂下午茶体", 1, 24));
		jLabel4.setForeground(new java.awt.Color(255, 255, 255));
		jLabel4.setText("\u53d1\u5e03gm\uff1a");

		jLabel5.setFont(new java.awt.Font("新蒂下午茶体", 1, 24));
		jLabel5.setForeground(new java.awt.Color(255, 255, 255));
		jLabel5.setText("\u53d1\u5e03\u65f6\u95f4\uff1a");

		javax.swing.GroupLayout imageJpanel1Layout = new javax.swing.GroupLayout(
				imageJpanel1);
		imageJpanel1.setLayout(imageJpanel1Layout);
		imageJpanel1Layout
				.setHorizontalGroup(imageJpanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								imageJpanel1Layout.createSequentialGroup()
										.addGap(382, 382, 382).addComponent(
												jLabel1).addContainerGap(458,
												Short.MAX_VALUE))
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addGap(161, 161, 161)
										.addComponent(
												jLabel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												592,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(221, Short.MAX_VALUE))
						.addGroup(
								imageJpanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jSeparator3,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												944, Short.MAX_VALUE)
										.addContainerGap())
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								imageJpanel1Layout
										.createSequentialGroup()
										.addContainerGap(595, Short.MAX_VALUE)
										.addGroup(
												imageJpanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel5)
														.addComponent(jLabel4))
										.addGap(263, 263, 263)));
		imageJpanel1Layout.setVerticalGroup(imageJpanel1Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						imageJpanel1Layout.createSequentialGroup()
								.addContainerGap().addComponent(jLabel1)
								.addGap(52, 52, 52).addComponent(jLabel2,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										278,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(jSeparator3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(36, 36, 36).addComponent(jLabel4)
								.addGap(18, 18, 18).addComponent(jLabel5)
								.addContainerGap(26, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				imageJpanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				imageJpanel1, javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Message().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private jiemian.ImageJpanel imageJpanel1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JSeparator jSeparator3;
	// End of variables declaration//GEN-END:variables

}