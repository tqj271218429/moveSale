package com.movesale.swing;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * 管理员登录的主界面
 * @author Administrator
 *
 */

public class MainWindow extends JFrame{

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
		this.setTitle("电影售票系统--(游客)");
		
		menubar = new JMenuBar();
		//开始项
		menuStrat = new JMenu("开始");
		itemLogin = new JMenuItem("登录");
		itemRegister = new JMenuItem("注册");
		itemCancellation = new JMenuItem("注销");
		itemExit = new JMenuItem("退出");
		menuStrat.add(itemLogin);
		menuStrat.add(itemRegister);
		menuStrat.add(itemCancellation);
		menuStrat.addSeparator();
		menuStrat.add(itemExit);
		//查询项
		menuQuery = new JMenu("查询");
		itemAll = new JMenuItem("查询所有电影");
		itemName = new JMenuItem("按电影名称查询");
		itemTime = new JMenuItem("按放映时间查询");
		menuQuery.add(itemAll);
		menuQuery.addSeparator();
		menuQuery.add(itemName);
		menuQuery.add(itemTime);
		//管理
		menuManage = new JMenu("电影管理");
		itemMoveup = new JMenuItem("电影上架");
		itemMovedown = new JMenuItem("电影下架");
		menuManage.add(itemMoveup);
		menuManage.addSeparator();
		menuManage.add(itemMovedown);
		menuManage.setEnabled(false);
		
		menuInfo = new JMenu("用户管理");
		itemUserall = new JMenuItem("查看所有用户信息");
		menuInfo.add(itemUserall);
		menuInfo.setEnabled(false);
		
		menuPay = new JMenu("付款");
		itemPayfor = new JMenuItem("确认支付");
		menuPay.add(itemPayfor);
		menuPay.setEnabled(false);
		
		menuOrder = new JMenu("我的订单");
		itemCheck = new JMenuItem("检查订单");
		itemDelete = new JMenuItem("删除订单");
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
