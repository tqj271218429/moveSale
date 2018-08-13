package com.movesale.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class mainWindow extends JFrame{

	//�˵���
	private JMenuBar menubar;
	//�˵���
	private JMenu menuStrat;
	private JMenu menuQuery;
	private JMenu menuManage;
	private JMenu menuInfo;
	private JMenu menuPay;
	private JMenu menuOrder;
	//�˵�����Ŀ
	private JMenuItem itemLogin;
	private JMenuItem itemRegister;
	private JMenuItem itemCancellation;
	private JMenuItem itemExit;
	
	public mainWindow(){
		this.setBounds(300, 300, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("��Ӱ��Ʊϵͳ--(�ο�)");
		
		menubar = new JMenuBar();
		
		menuStrat = new JMenu("��ʼ");
		itemLogin = new JMenuItem("��¼");
		itemRegister = new JMenuItem("ע��");
		itemCancellation = new JMenuItem("ע��");
		itemExit = new JMenuItem("�˳�");
		menuStrat.add(itemLogin);
		
		menuQuery = new JMenu("��ѯ");
		menuManage = new JMenu("��Ӱ����");
		menuInfo = new JMenu("�û�����");
		menuPay = new JMenu("����");
		menuOrder = new JMenu("�ҵĶ���");
		
		menubar.add(menuStrat);
		menubar.add(menuQuery);
		menubar.add(menuManage);
		menubar.add(menuInfo);
		menubar.add(menuPay);
		menubar.add(menuOrder);
		
		this.add(menubar,BorderLayout.NORTH);
		
		
	}
	
	public static void main(String[] args) {
		new mainWindow().setVisible(true);
	}
	
}
