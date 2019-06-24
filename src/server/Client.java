package server;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client implements MyProtocal{

	ObjectOutputStream oos;
	ObjectInputStream ois;

	public Client() throws UnknownHostException, IOException{
		String ip ="";
		int port = 12345;
		Socket s = new Socket(ip,port);
		oos = new ObjectOutputStream(s.getOutputStream());
		ois = new ObjectInputStream(s.getInputStream());
	}
	public boolean login(String name) throws IOException{
		oos.writeInt(LOGIN);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		return ois.readBoolean();
		//实现远程连接数据库登录
	}
	protected void register(){
		
		//实现远程连接数据库注册
	}
	public String send(String name, String content) throws IOException{
		oos.writeInt(CHAT);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeUTF(content);
		oos.flush();
		return ois.readUTF();
		//发送聊天信息
	}
	protected void accept(){
		
		//接受聊天信息
	}
}
