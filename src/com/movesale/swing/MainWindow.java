package com.movesale.swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * ����Ա��¼��������
 * @author Administrator
 *
 */

public class MainWindow extends JFrame{

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
	
	private JMenuItem itemAll;
	private JMenuItem itemName;
	private JMenuItem itemTime;
	
	private JMenuItem itemMoveup;
	private JMenuItem itemMovedown;
	
	private JMenuItem itemUserall;
	
	private JMenuItem itemPayfor;
	
	private JMenuItem itemCheck;
	private JMenuItem itemDelete;
	
	public MainWindow(){
		this.setBounds(300, 300, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("��Ӱ��Ʊϵͳ--(�ο�)");
		
		menubar = new JMenuBar();
		//��ʼ��
		menuStrat = new JMenu("��ʼ");
		itemLogin = new JMenuItem("��¼");
		itemRegister = new JMenuItem("ע��");
		itemCancellation = new JMenuItem("ע��");
		itemExit = new JMenuItem("�˳�");
		menuStrat.add(itemLogin);
		menuStrat.add(itemRegister);
		menuStrat.add(itemCancellation);
		menuStrat.addSeparator();
		menuStrat.add(itemExit);
		//��ѯ��
		menuQuery = new JMenu("��ѯ");
		itemAll = new JMenuItem("��ѯ���е�Ӱ");
		itemName = new JMenuItem("����Ӱ���Ʋ�ѯ");
		itemTime = new JMenuItem("����ӳʱ���ѯ");
		menuQuery.add(itemAll);
		menuQuery.addSeparator();
		menuQuery.add(itemName);
		menuQuery.add(itemTime);
		//����
		menuManage = new JMenu("��Ӱ����");
		itemMoveup = new JMenuItem("��Ӱ�ϼ�");
		itemMovedown = new JMenuItem("��Ӱ�¼�");
		menuManage.add(itemMoveup);
		menuManage.addSeparator();
		menuManage.add(itemMovedown);
		menuManage.setEnabled(false);
		
		menuInfo = new JMenu("�û�����");
		itemUserall = new JMenuItem("�鿴�����û���Ϣ");
		menuInfo.add(itemUserall);
		menuInfo.setEnabled(false);
		
		menuPay = new JMenu("����");
		itemPayfor = new JMenuItem("ȷ��֧��");
		menuPay.add(itemPayfor);
		menuPay.setEnabled(false);
		
		menuOrder = new JMenu("�ҵĶ���");
		itemCheck = new JMenuItem("��鶩��");
		itemDelete = new JMenuItem("ɾ������");
		menuOrder.add(itemCheck);
		menuOrder.addSeparator();
		menuOrder.add(itemDelete);
		menuOrder.setEnabled(false);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		menubar.add(menuStrat);
		menubar.add(menuQuery);
		menubar.add(menuManage);
		menubar.add(menuInfo);
		menubar.add(menuPay);
		menubar.add(menuOrder);
		
		this.add(menubar,BorderLayout.NORTH);
		
		
	}
	
	
	public static void main(String[] args) {
		new MainWindow().setVisible(true);
	}
	
}
