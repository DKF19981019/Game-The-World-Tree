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
	    	//登录
	    	Player_data player = null;
			String sql = "select * from player where name ='"+name+"' and password='"+password+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				player = new Player_data(rs.getString(1),rs.getString(2));
			}
			return player;
		}
	    
		public static Player_data register(String name,String password,int friendVerify,String mail) throws SQLException, ClassNotFoundException{
			//注册
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
			//更新玩家个人信息
			String sql = "update player set name = '"+name+"',password = '"+password+"',friendVerify ="+friendVerify+",mail = '"+mail+"' where name= '"+name2+"'";
			int rs = DataConnect.getStat().executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "修改成功");
		}
		
	//玩家-----------------------------------------------------------------

		public static int getCG(String name) throws SQLException, ClassNotFoundException{
			//获得CG数目
			int cgnumber = 0;
			String sql = "select * from player where name ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				cgnumber = rs.getInt(8);
			}
			return cgnumber;
		}
		
		public static int getMoney(String name) throws SQLException, ClassNotFoundException{
			//获得角色金币数
			int glod = 0;
			String sql = "select * from player where name ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				glod = rs.getInt(3);
			}
			return glod;
			
		}
		public static int getFriendVerify(String name) throws SQLException, ClassNotFoundException{
			//获得自身id
			int friendVerify = 0;
			String sql = "select * from player where name ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				friendVerify = rs.getInt(4);
			}
			return friendVerify;
		}
		
		public static int getFriend(String name) throws SQLException, ClassNotFoundException{
			//获得好友信息
			int friendVerify = 0;
			String sql = "select * from player where name ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				friendVerify = rs.getInt(4);
			}
			return friendVerify;
		}
		
		public String getVoice(String name) throws SQLException, ClassNotFoundException{
			//获得角色语音
			String voice = null;
			String sql = "select * from role where name ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				voice = rs.getString(5);
			}
			return voice;
		}


		
		public static int getBannad(String name) throws SQLException, ClassNotFoundException{
			//获得玩家封禁信息
			int banned = 0;
			String sql = "select * from player where name ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				banned = rs.getInt(7);
			}
			return banned;
		}
		
	    
		public static int getGameTime(String name) throws SQLException, ClassNotFoundException{
			//获得游戏时长
			int gametime = 0;
			String sql = "select * from player where name ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				gametime = rs.getInt(6);
			}
			return gametime;
		}
		public static void sendGameTime(int time,String name) throws SQLException, ClassNotFoundException{
			//记录游戏时长
			int gametime = getGameTime(name)+time;
			String sql = "update player set gametime ="+gametime+" where name= '"+name+"'";
			int rs = DataConnect.getStat().executeUpdate(sql);
		}
		public static String getDialogue(int dialoguenumber) throws SQLException, ClassNotFoundException{
			//获取对话
			String dialogue = null;
			String sql = "select * from dialogue where dialoguenumber ='"+dialoguenumber+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				dialogue = rs.getString(2);
			}
			return dialogue;
		}
		public static String getDialogueName(int dialoguenumber) throws SQLException, ClassNotFoundException{
			//获取角色名
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
			//播放背景音乐
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
			//播放音效
			URL url = null;
			AudioClip ac2;
			File f1 = new File("./src/Music/音效"+String.valueOf(i)+".wav");
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
			//播放配音
			
			URL url = null;
			File f1 = new File("./src/TFP配音/"+String.valueOf(i)+".wav");
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
			//停止背景音乐
		
			   ac.stop();
		}
		
		public static String getLocalTime(){
			//获取本地时间
			Calendar c = Calendar.getInstance();
		    String time = "本地时间：" +c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+c.get(Calendar.DATE)+"日"+ c.get(Calendar.HOUR) + "时"+c.get(Calendar.MINUTE)+"分"+c.get(Calendar.SECOND)+"秒";
			return time;
			
		}
		
		
		//GM-----------------------------------------------------------------
		public static Player_data getPlayer(String name) throws SQLException, ClassNotFoundException{
			//获得玩家信息
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
        	//修改角色金币数
        	String sql = "update player set glod ="+glod+" where name= '"+name+"'";
			int rs = DataConnect.getStat().executeUpdate(sql);
			
		}
        
		public static void deletePlayer(String name) throws SQLException, ClassNotFoundException{
			//封禁玩家
        	String sql = "update player set banned = 2 where name= '"+name+"'";
			int rs = DataConnect.getStat().executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "封禁成功");
		}
		
		public static void deblockingPlayer(String name) throws SQLException, ClassNotFoundException{
			//解封玩家
        	String sql = "update player set banned = 1 where name= '"+name+"'";
			int rs = DataConnect.getStat().executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "封禁成功");
		}
		
		public static GM_data getGM(String name) throws SQLException, ClassNotFoundException{
			//获得GM信息
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
			//发布公告
        	String sql = "update message set message = '"+message+"' where writor= '"+writor+"'";
			int rs = DataConnect.getStat().executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "发布成功");
		}
        public static message getAnnouncement(String name) throws SQLException, ClassNotFoundException{
			//获得公告
			message message = null;
			String sql = "select * from message where writor ='"+name+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				message = new message(rs.getString(1), rs.getString(2),rs.getString(3));
			}
			return message;
		}
		public static void uploadCard(){
			
			//上传卡牌
		}
		 public static void sendNewgame(String gamename,String player) throws SQLException, ClassNotFoundException{	
				//添加新游戏
	        	String sql = "insert into game(stroyName,player) values ('"+gamename+"','"+player+"')";
				int rs = DataConnect.getStat().executeUpdate(sql);
			}
		 public static int checkGame(String gamename,String player) throws SQLException, ClassNotFoundException{
			 //查看是否已拥有改游戏
			 int i = 1;
			 String sql = "select * from game where stroyName ='"+gamename+"' and player='"+player+"'";
			 ResultSet rs = DataConnect.getStat().executeQuery(sql);
				if(rs.next()){
					i=2;
				}
				return i;
		 }
		 public static void addFriend(String name,int friendVerify,String myself) throws SQLException, ClassNotFoundException{	
				//好友
	        	String sql = "insert into friend(name,friendVerify,myself) values ('"+name+"',"+friendVerify+",'"+myself+"')";
				int rs = DataConnect.getStat().executeUpdate(sql);
				JOptionPane.showMessageDialog(null, "添加成功");
			}
		 public static String findName(int friendVerify) throws SQLException, ClassNotFoundException{
				//获得玩家信息
				String name = null;
				String sql = "select * from player where friendVerify ="+friendVerify;
				ResultSet rs = DataConnect.getStat().executeQuery(sql);
				if(rs.next()){
					name = rs.getString(1);
				}
				return name;			
			}
		 

		 
		
		
		//剧情-----------------------------------------------------------------
		public static void sendProgress(int progress,String stroyName,String player) throws SQLException, ClassNotFoundException{
			//记录剧情进度
			String sql = "update game set progress ="+progress+" where stroyName= '"+stroyName+"' and player= '"+player+"'";
			int rs = DataConnect.getStat().executeUpdate(sql);
		}

		public static int getProgress(String stroyName,String player) throws SQLException, ClassNotFoundException{
			//获得剧情好感度信息
			int progress = 0;
			String sql = "select * from game where stroyName ='"+stroyName+"' and player= '"+player+"'";
			ResultSet rs = DataConnect.getStat().executeQuery(sql);
			if(rs.next()){
				progress = rs.getInt(3);
			}
			return progress;
		}
		

}
