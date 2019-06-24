package server;

import java.io.*;


import java.net.*;
import java.util.*;

import database.Chat_data;





public class Server implements MyProtocal ,Runnable{

	ObjectInputStream ois;
	ObjectOutputStream oos;
	HashMap<String, Socket> hp = new HashMap<String, Socket>();
	ServerSocket ss ;
	Socket s;
	protected Server() throws IOException{
		//���캯��
		ss = new ServerSocket(12345);
		while (true) {
			s = ss.accept();
			Thread t = new Thread(this);
			t.start();
		}
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//ʵ�ֶ��߳�
		try {
			ois = new ObjectInputStream(s.getInputStream());
			oos = new ObjectOutputStream(s.getOutputStream());
			int command = ois.readInt();
			if (command == LOGIN) {
				login(s);
			} else if (command == CHAT) {
				send(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void login(Socket s) throws IOException{
		//ʵ��Զ���������ݿ��¼
		String name = ois.readUTF();
		if (hp.containsKey(name)) {
			oos.writeBoolean(false);
		} else{
			oos.writeBoolean(true);
			hp.put(name, s);
		}
		oos.flush();
	}
	protected void register(){
		//ʵ��Զ���������ݿ�ע��
		
	}
	String all="";
	protected void send(Socket s) throws IOException{	
		//����������Ϣ
		String name = ois.readUTF();
		String content =ois.readUTF();
		Chat_data c = new Chat_data(name,s.getInetAddress()+"", content
				, new Date()+"");
		String n=c.toString();
		all+=n;
		all+="\n";
		oos.writeUTF(all);
		oos.flush();
	}

	protected void CDB(String name,String pw,int port){
		//�������ݿ�

	}
	protected void close(Socket s) throws IOException{
		//�رշ�����
		ss.close();
	}
	public static void main(String[] args) {
		try {
			new Server();
			System.out.print("������������");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
