package com.movesale.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class mainWindow extends JFrame{

	//菜单条
	private JMenuBar menubar;
	//菜单项
	private JMenu menuStrat;
	private JMenu menuQuery;
	private JMenu menuManage;
	private JMenu menuInfo;
	private JMenu menuPay;
	private JMenu menuOrder;
	//菜单子项目
	private JMenuItem itemLogin;
	private JMenuItem itemRegister;
	private JMenuItem itemCancellation;
	private JMenuItem itemExit;
	
	public mainWindow(){
		this.setBounds(300, 300, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("电影售票系统--(游客)");
		
		menubar = new JMenuBar();
		
		menuStrat = new JMenu("开始");
		itemLogin = new JMenuItem("登录");
		itemRegister = new JMenuItem("注册");
		itemCancellation = new JMenuItem("注销");
		itemExit = new JMenuItem("退出");
		menuStrat.add(itemLogin);
		
		menuQuery = new JMenu("查询");
		menuManage = new JMenu("电影管理");
		menuInfo = new JMenu("用户管理");
		menuPay = new JMenu("付款");
		menuOrder = new JMenu("我的订单");
		
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
