package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

import View.CommandIndexPane;


public class CommandSearchListener implements ActionListener {
	
	private JList list;
	
	public CommandSearchListener(CommandIndexPane view) {
		this.list = view.getJList();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//�ؽ�Ʈ �ʵ�� ���� �Է� �� �޾ƿ���
		JTextField txtField = (JTextField) e.getSource();
		String textFieldValue = txtField.getText();
		
		Model.CommandExplainList cmdlist = new Model.CommandExplainList();
		String cmds[] = cmdlist.getCommandList();
		
		/*list�� ��� �߰��ϱ� ���� �ӽ� �� ����
		* list�� addElement ���� �޼ҵ尡 ���� �ϼ��� ������ ����Ʈ�� �Ѱ� ��� �Ѵ�.
		*/
		DefaultListModel listModel = new DefaultListModel();
		
		for(String cmd : cmds) {
			//��ɾ� ���� ������ �˻��� ��츦 ���� ���� ���� �о����
			String cmdlistPath = "." + File.separator + "src" + File.separator + "Model" + File.separator + "cmdexplain";
			File f = new File(cmdlistPath,cmd);
			char []buf = new char [1024];
			try {
				FileReader fin = new FileReader(cmdlistPath + File.separator + cmd);
				fin.read(buf);
				fin.close();
			} catch (FileNotFoundException e1) {} catch (IOException e1) {}
			String explain = String.valueOf(buf).trim();
			
			if(cmd.contains(textFieldValue)) {	//��ɾ �˻��� ���
				listModel.addElement(cmd);
			} else if(explain.contains(textFieldValue)) {	//��ɾ� ���� ���� �˻��� ������ ���� ���
				listModel.addElement(cmd);
			}
		}
		list.setModel(listModel);
		list.repaint();
	}
}
