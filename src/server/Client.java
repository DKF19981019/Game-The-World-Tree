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
		//ʵ��Զ���������ݿ��¼
	}
	protected void register(){
		
		//ʵ��Զ���������ݿ�ע��
	}
	public String send(String name, String content) throws IOException{
		oos.writeInt(CHAT);
		oos.flush();
		oos.writeUTF(name);
		oos.flush();
		oos.writeUTF(content);
		oos.flush();
		return ois.readUTF();
		//����������Ϣ
	}
	protected void accept(){
		
		//����������Ϣ
	}
}
