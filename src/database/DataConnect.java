package database;

import java.sql.*;

public class DataConnect {

	private static Statement stat;

	protected static void init() throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3307/MySql?user=root&password=19981019";
		Connection con = DriverManager.getConnection(url);
		stat = con.createStatement();
		url = "use galgame";
		stat.executeUpdate(url);
		System.out.println("OK");
		//�������ݿ�
	}
	
	public static Statement getStat() throws ClassNotFoundException, SQLException{
		if(stat==null){
			init();
		}
		return stat;
		
		//ʹ�����ݿ����
	}
	
}
