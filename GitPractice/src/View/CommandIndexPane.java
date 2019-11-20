package View;

import java.awt.*;
import javax.swing.*;

import Controller.CommandSearchListener;
import Controller.CommandMouseEventListener;
import Controller.UpdateCommandIndexPane;

import java.util.Scanner;

public class CommandIndexPane  extends JPanel{
	
	//��� element ��������� ����
	private JPanel CommandIndexPane;
	private JLabel lblGitCommand;
	private JScrollBar scrollIndex;
	private JList list;
	
	public CommandIndexPane() {
	
	CommandIndexPane = new JPanel();
	CommandIndexPane.setBounds(0, 0, 236, 604);
	MainFrame.contentPane.add(CommandIndexPane);
	CommandIndexPane.setLayout(null);
	
	lblGitCommand = new JLabel("git ��ɾ� �˻�");
	lblGitCommand.setBounds(14, 12, 132, 18);
	CommandIndexPane.add(lblGitCommand);
	
	MainFrame.textField = new JTextField();
	MainFrame.textField.setBounds(14, 42, 208, 24);
	CommandIndexPane.add(MainFrame.textField);
	MainFrame.textField.setBackground(Color.WHITE);
	MainFrame.textField.setColumns(10);
	
	scrollIndex = new JScrollBar();
	scrollIndex.setBounds(209, 78, 13, 514);
	CommandIndexPane.add(scrollIndex);
	
	list = new JList();
	list.setBounds(14, 78, 208, 514);
	list.addMouseListener(new CommandMouseEventListener(this)); //��ɾ� ���� ������ ����
	CommandIndexPane.add(list);
	
	UpdateCommandIndexPane init = new UpdateCommandIndexPane(this);
	init.setCommandList();	//list�� ��ɾ� ��� �����ϱ� ���� controller ȣ��
	
	MainFrame.textField.addActionListener(new CommandSearchListener(this));	//��ɾ� �˻� ������ ����	
	}
	
	public JList getJList() {
		return list;
	}
}