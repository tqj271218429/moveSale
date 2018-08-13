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
	
	//�����ǩ����
	private  JLabel lbl1,lbl2,lbl3,lbl5;
	//�����б��
	private JComboBox  cho;
	//�ı���	
	private JTextField txt1,txt2,txt4;
	//��ť
	private JButton btn1,btn2;
	//��ѡ��		
	private JCheckBox jc;	
	
	private JPanel jpanl;
	
	public  RegisterWindow(){
		this.setTitle("��Ӱ��Ʊע��ϵͳ--(�ο�)");
		this.setBounds(300, 300, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//��ʼ������
		initialize();
		
		
	}

	private void initialize() {
		jpanl = new JPanel();
		jpanl.setBackground(Color.WHITE);
		jpanl.setLayout(null);
		
		//�ֻ�����
		lbl1 = new JLabel("*�ֻ�����:");
		lbl1.setBounds(50, 100, 70, 40);
		DefaultComboBoxModel model = new DefaultComboBoxModel<>();
		model.addElement("�й� 0086");
		model.addElement("�й� 0081");
		cho = new JComboBox<>(model);
		cho.setBounds(120,110,90,20);
		jpanl.add(lbl1);
		jpanl.add(cho);
		
		//�����û����ı����е�����
		txt1 = new JTextField();
		txt1.setColumns(15);
		txt1.setText("     �������ֻ�����");
		txt1.setBounds(210,110,200,20);
		jpanl.add(txt1);
		
		//��֤��
		lbl2 = new JLabel("* ��֤��:");
		lbl2.setBounds(60, 150, 60, 40);
		jpanl.add(lbl2);
		
		txt2 = new JTextField();
		txt2.setColumns(15);
		
		txt2.setText("    ��������֤��");
		txt2.setBounds(240, 160, 160, 20);
		
		jpanl.add(txt2);
		//���ý�ֹʹ��
		txt2.setEditable(false);
		
		//���û�ȡ��̬���밴ť
		btn1 = new JButton("��ȡ��̬����");
		btn1.setBounds(120, 160, 120, 20);
		btn1.setBackground(Color.gray);
		jpanl.add(btn1);
		
		//��ѡ��
		jc = new JCheckBox("ͬ��");
		//��ѡ��ѡ��		
		jc.setSelected(true);
		jc.setBackground(Color.white);
		jc.setBounds(120, 200, 70, 40);
		jpanl.add(jc);
		
		lbl3 = new JLabel("ע��Э��");
		lbl3.setBounds(190,200, 100, 40);
		jpanl.add(lbl3);
		
		btn2 = new JButton("ע��");
		btn2.setBounds(190, 260, 100, 40);
		btn2.setBackground(Color.GRAY);
		jpanl.add(btn2);
	
		this.add(jpanl);
	}

	public static void main(String[] args) {
		new RegisterWindow().setVisible(true);
	}
}


