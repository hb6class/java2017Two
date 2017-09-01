package com.bh.tcp3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class Client extends Frame implements ActionListener {
	TextField tf;
	TextArea ta;
	Button btn;
	
	Socket sock;
	InputStream is;
	OutputStream os;
	
	InputStreamReader isr;
	OutputStreamWriter osw;
	
	BufferedReader br;
	BufferedWriter bw;
	PrintWriter pw;
	
	public Client() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				pw.println("exit");
				dispose();
			}
			@Override
			public void windowClosed(WindowEvent e) {
				pw.close();
				
				try {
					br.close();
					bw.close();
					
					isr.close();
					osw.close();
					
					is.close();
					os.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}finally{
					try {
					sock.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			}
		});
		Panel p=new Panel(new BorderLayout());
		ta=new TextArea();
		Panel south=new Panel();
		tf=new TextField(15);
		tf.addActionListener(this);
		south.add(tf);
		btn=new Button("Àü¼Û");
		btn.addActionListener(this);
		south.add(btn);
		
		p.add(ta,BorderLayout.CENTER);
		p.add(south,BorderLayout.SOUTH);
		
		add(p);
		setBounds(1600, 0, 300, 400);
		setVisible(true);
		sockConn();
	}
	
	public void sockConn(){
		String ip="203.236.209.193";
		int port=6060;//5000~
		
		
		try {
			sock=new Socket(ip,port);
			is=sock.getInputStream();
			os=sock.getOutputStream();
			
			isr=new InputStreamReader(is);
			osw=new OutputStreamWriter(os);
			
			br=new BufferedReader(isr);
			bw=new BufferedWriter(osw);
			pw=new PrintWriter(bw,true);
			
			while(true){
				String msg=br.readLine();
				if(msg==null){break;}
				ta.append(msg+"\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			dispose();
		}
		
	}

	public static void main(String[] args) {
		new Client();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg=tf.getText();
		System.out.println(msg);
		pw.println(msg);
//		pw.flush();
		tf.setText("");
	}

}
