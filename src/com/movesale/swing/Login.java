package com.movesale.swing;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;


public class Login extends JFrame{

	private JLabel lbl;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lblpwd;
	private JTextField txt;
	private JPasswordField pwd;
	private JButton but;
	
	public Login(){
		this.setBounds(760, 350, 350, 350);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("��¼");
		
		this.setLayout(null);
		
		lbl1 = new JLabel();
		lbl1.setIcon(new ImageIcon("D:\\Backup\\Documents\\My Music\\��Ӱ.png"));
		lbl1.setBounds(26, 22, 40, 40);
		
		lbl3 = new JLabel();
		lbl3.setText("��ӭ�����ֲ���ӰԺ~");
		lbl3.setBounds(100, 22, 150, 40);
		
		lbl2 = new JLabel();
		lbl2.setIcon(new ImageIcon("D:\\Backup\\Documents\\My Music\\��Ӱ(1).png"));
		lbl2.setBounds(250, 22, 40, 40);
		
		lbl = new JLabel();
		lbl.setIcon(new ImageIcon("D:\\Backup\\Documents\\My Music\\�û�.png"));
		lbl.setBounds(26, 82, 40, 40);
		txt = new JTextField();
		txt.setColumns(10);
		txt.setText("�����������û���");
		txt.setBounds(70, 82, 240, 40);
		
		lblpwd = new JLabel();
		lblpwd.setIcon(new ImageIcon("D:\\Backup\\Documents\\My Music\\����.png"));
		lblpwd.setBounds(26, 144, 40, 40);
		pwd = new JPasswordField();
		pwd.setEchoChar('*');
		pwd.setBounds(70, 144, 240, 40);
		
		Font f = new Font("����",Font.PLAIN,13); 
		UIManager.put("Button.font",f); 
		but = new JButton("��¼");
		but.setBounds(35, 210, 280, 40);
		but.setBackground(Color.ORANGE);
			
		this.add(lbl);
		this.add(lbl1);
		this.add(lbl2);
		this.add(lbl3);
		this.add(txt);
		this.add(lblpwd);
		this.add(pwd);
		this.add(but);
		
	}
	
	public static void main(String[] args) {
		new Login().setVisible(true);
	}
}
