package database;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.swing.JOptionPane;

public class ModelFactory {

	    public static Player_data login(String name,String password) throws SQLException, ClassNotFoundException{	
	    	//��¼
	    	Player_data player = null;
			String sql = "select * from player where name ='"+name+"' and password='"+password+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				player = new Player_data(rs.getString(1),rs.getString(2));
			}
			return player;
		}
	    
		public static Player_data register(String name,String password,int friendVerify,String mail) throws SQLException, ClassNotFoundException{
			//ע��
			Player_data player2 = null;
			String sql = "insert into player(name,password,friendVerify,mail) value('"+name+"','"+password+"',"+friendVerify+",'"+mail+"')";
			int rs = DataConnect.getStat().executeUpdate(sql);
			sql = "select * from player where name ='"+name+"' and password='"+password+"'";
			ResultSet rs2 = DataConnect.getStat().executeQuery(sql);
			if(rs2.next()){
				player2 = new Player_data(rs2.getString(1),rs2.getString(2));
			}
			return player2;
			
		}
		public static void updatePlayer(String name,String password,int friendVerify,String mail,String  name2) throws SQLException, ClassNotFoundException{
			//������Ҹ�����Ϣ
			String sql = "update player set name = '"+name+"',password = '"+password+"',friendVerify ="+friendVerify+",mail = '"+mail+"' where name= '"+name2+"'";
			int rs = DataConnect.getStat().executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "�޸ĳɹ�");
		}
		
	//���-----------------------------------------------------------------

		public static int getCG(String name) throws SQLException, ClassNotFoundException{
			//���CG��Ŀ
			int cgnumber = 0;
			String sql = "select * from player where name ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				cgnumber = rs.getInt(8);
			}
			return cgnumber;
		}
		
		public static int getMoney(String name) throws SQLException, ClassNotFoundException{
			//��ý�ɫ�����
			int glod = 0;
			String sql = "select * from player where name ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				glod = rs.getInt(3);
			}
			return glod;
			
		}
		public static int getFriendVerify(String name) throws SQLException, ClassNotFoundException{
			//�������id
			int friendVerify = 0;
			String sql = "select * from player where name ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				friendVerify = rs.getInt(4);
			}
			return friendVerify;
		}
		
		public static int getFriend(String name) throws SQLException, ClassNotFoundException{
			//��ú�����Ϣ
			int friendVerify = 0;
			String sql = "select * from player where name ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				friendVerify = rs.getInt(4);
			}
			return friendVerify;
		}
		
		public String getVoice(String name) throws SQLException, ClassNotFoundException{
			//��ý�ɫ����
			String voice = null;
			String sql = "select * from role where name ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				voice = rs.getString(5);
			}
			return voice;
		}


		
		public static int getBannad(String name) throws SQLException, ClassNotFoundException{
			//�����ҷ����Ϣ
			int banned = 0;
			String sql = "select * from player where name ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				banned = rs.getInt(7);
			}
			return banned;
		}
		
	    
		public static int getGameTime(String name) throws SQLException, ClassNotFoundException{
			//�����Ϸʱ��
			int gametime = 0;
			String sql = "select * from player where name ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				gametime = rs.getInt(6);
			}
			return gametime;
		}
		public static void sendGameTime(int time,String name) throws SQLException, ClassNotFoundException{
			//��¼��Ϸʱ��
			int gametime = getGameTime(name)+time;
			String sql = "update player set gametime ="+gametime+" where name= '"+name+"'";
			int rs = DataConnect.getStat().executeUpdate(sql);
		}
		public static String getDialogue(int dialoguenumber) throws SQLException, ClassNotFoundException{
			//��ȡ�Ի�
			String dialogue = null;
			String sql = "select * from dialogue where dialoguenumber ='"+dialoguenumber+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				dialogue = rs.getString(2);
			}
			return dialogue;
		}
		public static String getDialogueName(int dialoguenumber) throws SQLException, ClassNotFoundException{
			//��ȡ��ɫ��
			String dialogue = null;
			String sql = "select * from dialogue where dialoguenumber ='"+dialoguenumber+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				dialogue = rs.getString(3);
			}
			return dialogue;
		}
		static AudioClip ac;
		static AudioClip ac3;
		public static void playBackmusic(int i){
			//���ű�������
			URL url = null;
			
			File f1 = new File("./src/Music/backmusic"+String.valueOf(i)+".wav");
			   try {
			    url= f1.toURL();
			} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} 
			   ac= Applet.newAudioClip(url);
			   ac.play();
		}
		public static void playMusic(int i){
			//������Ч
			URL url = null;
			AudioClip ac2;
			File f1 = new File("./src/Music/��Ч"+String.valueOf(i)+".wav");
			   try {
			    url= f1.toURL();
			} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} 
			   ac2= Applet.newAudioClip(url);
			   ac2.play();
			
		}
		
		public static void playDub(int i){
			//��������
			
			URL url = null;
			File f1 = new File("./src/TFP����/"+String.valueOf(i)+".wav");
			   try {
			    url= f1.toURL();
			} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			} 
			   ac3= Applet.newAudioClip(url);
			   ac3.play();
		}
		public static void stopBackmusic(){
			//ֹͣ��������
		
			   ac.stop();
		}
		
		public static String getLocalTime(){
			//��ȡ����ʱ��
			Calendar c = Calendar.getInstance();
		    String time = "����ʱ�䣺" +c.get(Calendar.YEAR)+"��"+(c.get(Calendar.MONTH)+1)+"��"+c.get(Calendar.DATE)+"��"+ c.get(Calendar.HOUR) + "ʱ"+c.get(Calendar.MINUTE)+"��"+c.get(Calendar.SECOND)+"��";
			return time;
			
		}
		
		
		//GM-----------------------------------------------------------------
		public static Player_data getPlayer(String name) throws SQLException, ClassNotFoundException{
			//��������Ϣ
			Player_data player = null;
			String sql = "select * from player where name ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				player = new Player_data(rs.getString(1), rs.getString(2), rs.getInt(3),
						rs.getInt(4), rs.getString(5), rs.getInt(6),rs.getInt(7),
						 rs.getString(8));
			}
			return player;			
		}
		
        public static void increaseMoney(int glod,String name) throws SQLException, ClassNotFoundException{
        	//�޸Ľ�ɫ�����
        	String sql = "update player set glod ="+glod+" where name= '"+name+"'";
			int rs = DataConnect.getStat().executeUpdate(sql);
			
		}
        
		public static void deletePlayer(String name) throws SQLException, ClassNotFoundException{
			//������
        	String sql = "update player set banned = 2 where name= '"+name+"'";
			int rs = DataConnect.getStat().executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "����ɹ�");
		}
		
		public static void deblockingPlayer(String name) throws SQLException, ClassNotFoundException{
			//������
        	String sql = "update player set banned = 1 where name= '"+name+"'";
			int rs = DataConnect.getStat().executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "����ɹ�");
		}
		
		public static GM_data getGM(String name) throws SQLException, ClassNotFoundException{
			//���GM��Ϣ
			GM_data gm = null;
			String sql = "select * from gm where name ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				gm = new GM_data(rs.getString(1), rs.getString(2),rs.getString(3),rs.getString(4),
						rs.getString(5));
			}
			return gm;
		}
		
        public static void sendAnnouncement(String writor,String message) throws SQLException, ClassNotFoundException{	
			//��������
        	String sql = "update message set message = '"+message+"' where writor= '"+writor+"'";
			int rs = DataConnect.getStat().executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "�����ɹ�");
		}
        public static message getAnnouncement(String name) throws SQLException, ClassNotFoundException{
			//��ù���
			message message = null;
			String sql = "select * from message where writor ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				message = new message(rs.getString(1), rs.getString(2),rs.getString(3));
			}
			return message;
		}
		public static void uploadCard(){
			
			//�ϴ�����
		}
		 public static void sendNewgame(String gamename,String player) throws SQLException, ClassNotFoundException{	
				//�������Ϸ
	        	String sql = "insert into game(stroyName,player) values ('"+gamename+"','"+player+"')";
				int rs = DataConnect.getStat().executeUpdate(sql);
			}
		 public static int checkGame(String gamename,String player) throws SQLException, ClassNotFoundException{
			 //�鿴�Ƿ���ӵ�и���Ϸ
			 int i = 1;
			 String sql = "select * from game where stroyName ='"+gamename+"' and player='"+player+"'";
			 ResultSet rs = DataConnect.getStat().executeQuery(sql);
				if(rs.next()){
					i=2;
				}
				return i;
		 }
		 public static void addFriend(String name,int friendVerify,String myself) throws SQLException, ClassNotFoundException{	
				//����
	        	String sql = "insert into friend(name,friendVerify,myself) values ('"+name+"',"+friendVerify+",'"+myself+"')";
				int rs = DataConnect.getStat().executeUpdate(sql);
				JOptionPane.showMessageDialog(null, "��ӳɹ�");
			}
		 public static String findName(int friendVerify) throws SQLException, ClassNotFoundException{
				//��������Ϣ
				String name = null;
				String sql = "select * from player where friendVerify ="+friendVerify;
				ResultSet rs = DataConnect.getStat().executeQuery(sql);
				if(rs.next()){
					name = rs.getString(1);
				}
				return name;			
			}
		 

		 
		
		
		//����-----------------------------------------------------------------
		public static void sendProgress(int progress,String stroyName,String player) throws SQLException, ClassNotFoundException{
			//��¼�������
			String sql = "update game set progress ="+progress+" where stroyName= '"+stroyName+"' and player= '"+player+"'";
			int rs = DataConnect.getStat().executeUpdate(sql);
		}

		public static int getProgress(String stroyName,String player) throws SQLException, ClassNotFoundException{
			//��þ���øж���Ϣ
			int progress = 0;
			String sql = "select * from game where stroyName ='"+stroyName+"' and player= '"+player+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				progress = rs.getInt(3);
			}
			return progress;
		}
		

}
