package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CommandList {
	private String commands[];
	
	public CommandList() {
		/*cmdlist ������ ������ ��ɾ� �̸����� ���� �����Ͽ� ����*/
		File f = new File(".\\src\\Model\\cmdlist");
		this.commands = f.list();
		
		/*Model���� commandlist ���� �ȿ� ��ɾ� ��� �ۼ�*/
//		FileReader fin = new FileReader(".\\commandlist.txt");
	}
	
	public String[] getCommandList() {
		return commands;
	}
}
