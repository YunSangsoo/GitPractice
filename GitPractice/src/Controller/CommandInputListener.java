package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import javax.swing.JTextField;


public class CommandInputListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		//textfield�κ��� �Է� ���� �����´�.
		JTextField txtField = (JTextField) e.getSource();
		String textFieldValue = txtField.getText();
		
		//Model�� ���� �Ǿ��ִ� ��ɾ��Ʈ�� ������
		Model.CommandList cmdlist = new Model.CommandList();
		String cmds[] = cmdlist.getCommandList();
		Arrays.sort(cmds);
			
		//�迭�� �Էµ� ��ɾ �ִ��� �˻�
		int index = Arrays.binarySearch(cmds, textFieldValue); /*****����ó�� �ؾ���, ã�� ���� ������ �������� ��ȯ.**/
		
		//��ɾ ���� �̸����� ���������Ƿ� �ش� ��ɾ����� ���ο� ���� Ŭ���� �̸��� ��� ���� ���� ��ü��  FileReader�� �����.
		File f = new File(".\\src\\Model\\cmdlist",cmds[index]);
		FileReader fin;
		char []buf = new char [1024];
		try {
			fin = new FileReader(".\\src\\Model\\cmdlist\\"+cmds[index]);
			fin.read(buf);
			fin.close();
		} catch (FileNotFoundException e1) {} catch (IOException e1) {}
		
		//������ ���� ������ ����
		String Clazz = String.valueOf(buf).trim();
        
        //���� ����
        try {
        	Class<?> clazz = Class.forName(Clazz);	//Clazz�� ���� Ŭ���� ����
        	Object newObj = clazz.getDeclaredConstructor().newInstance();	//Ŭ������ ��ü����
        	
        	Method m = clazz.getDeclaredMethod("executeCommand", null);	//�Ķ���ͷ� �޼ҵ� �̸�, �ش� �޼ҵ��� �Ķ���͵��� Ÿ��(.class ����)
        	m.invoke(newObj,null);	//�Ķ���ͷ� �޼ҵ��� Ŭ����, �޼ҵ��� �ĸ����͵�     	
        } catch (ClassNotFoundException e1) {
        	System.out.println("error1");
        } catch (Exception e1) {
        	System.out.println("error2");
        }
	}
}