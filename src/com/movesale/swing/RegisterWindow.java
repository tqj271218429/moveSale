package com.movesale.swing;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class RegisterWindow extends JFrame {
	
	//定义标签属性
	private  JLabel lbl1,lbl2,lbl3,lbl5;
	//下拉列表框
	private JComboBox  cho;
	//文本框	
	private JTextField txt1,txt2,txt4;
	//按钮
	private JButton btn1,btn2;
	//复选框		
	private JCheckBox jc;	
	
	private JPanel jpanl;
	
	public  RegisterWindow(){
		this.setTitle("电影售票注册系统--(游客)");
		this.setBounds(300, 300, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//初始化方法
		initialize();
		
		
	}

	private void initialize() {
		jpanl = new JPanel();
		jpanl.setBackground(Color.WHITE);
		jpanl.setLayout(null);
		
		//手机号码
		lbl1 = new JLabel("*手机号码:");
		lbl1.setBounds(50, 100, 70, 40);
		DefaultComboBoxModel model = new DefaultComboBoxModel<>();
		model.addElement("中国 0086");
		model.addElement("中国 0081");
		cho = new JComboBox<>(model);
		cho.setBounds(120,110,90,20);
		jpanl.add(lbl1);
		jpanl.add(cho);
		
		//设置用户名文本框中的内容
		txt1 = new JTextField();
		txt1.setColumns(15);
		txt1.setText("     请输入手机号码");
		txt1.setBounds(210,110,200,20);
		jpanl.add(txt1);
		
		//验证码
		lbl2 = new JLabel("* 验证码:");
		lbl2.setBounds(60, 150, 60, 40);
		jpanl.add(lbl2);
		
		txt2 = new JTextField();
		txt2.setColumns(15);
		
		txt2.setText("    请输入验证码");
		txt2.setBounds(240, 160, 160, 20);
		
		jpanl.add(txt2);
		//设置禁止使用
		txt2.setEditable(false);
		
		//设置获取动态密码按钮
		btn1 = new JButton("获取动态密码");
		btn1.setBounds(120, 160, 120, 20);
		btn1.setBackground(Color.gray);
		jpanl.add(btn1);
		
		//复选框
		jc = new JCheckBox("同意");
		//复选框选中		
		jc.setSelected(true);
		jc.setBackground(Color.white);
		jc.setBounds(120, 200, 70, 40);
		jpanl.add(jc);
		
		lbl3 = new JLabel("注册协议");
		lbl3.setBounds(190,200, 100, 40);
		jpanl.add(lbl3);
		
		btn2 = new JButton("注册");
		btn2.setBounds(190, 260, 100, 40);
		btn2.setBackground(Color.GRAY);
		jpanl.add(btn2);
	
		this.add(jpanl);
	}

	public static void main(String[] args) {
		new RegisterWindow().setVisible(true);
	}
}


