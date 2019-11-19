package Controller;

import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.io.File;
import java.io.IOException;

/*
 new ��ư�� ������ ���鿡��ó�� â�� �߸鼭
 ���ο� Repository�� ������ �� �ְ� �ϴ� Ŭ�����Դϴ�.
 */

public class NewRepoClickListener extends JFrame implements MouseListener {

	private static final long serialVersionUID = 1L;
	String input = "";
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		getRepoName();
	}
	
	public void getRepoName() {
		//String[] repoName = new String[100];
		//String[] buttons = {"create", "close"};
		// showInputDialog�δ� Ȯ��/��� ��ư ���ڿ� ������ �ȵǳ׿�Ф�
		// ����� �ִ��� �� ã�ƺ��� ������ �� �ּ� ����ڽ��ϴ� 
		
		
		input = JOptionPane.showInputDialog(null, "Repository name", "Repository ����",
								JOptionPane.PLAIN_MESSAGE);
		//System.out.println(input);
		
		if (input != null) {
			dirCreate();
			repoCreate();
		} 		
		
	}
	
	public void dirCreate() { // ���� ����ҿ� ���丮�� ������ִ� �Լ��Դϴ�.
		String repoDir = "C:\\" + input;
		String repoFile = input;
		File fdir = new File(repoDir); // ���� ������ �ٷ�� ���� ��ü
		File file = new File(repoFile);
		
		if (!fdir.exists()) {
			if (fdir.mkdirs()) {
				//���� ����  
				if (!file.exists()) {
					try {
						if (file.createNewFile()) {
							// repository ����  
						} else {
							System.out.println("Repository ������ �����߽��ϴ�.");
						}
					} catch (IOException e) {
						//TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					System.out.println("���� �̸��� Repository�� �̹� �����մϴ�.");
				}
			} 
		}
		
	}
	
	public void repoCreate() { // GUI â���� ���ο� JTextArea â�� ����ִ� �Լ��Դϴ�.
		String init = "Quick setup - if you've done this kind of thing before" + 
				"/n HTTPS : https://github.com/users/" + input  + ".git"
				+ "\n\n ...or create a new repository on the command line"
				+ "\n echo '# " + input + "' >> README.md"
				+ "\n git init \n git add README.md \n git commit -m " + "first commit"
				+ "\n git remote and origin https://github.com/user/" + input + ".git"
				+ "\n git push -u origin master"
				+ "\n\n ...or push an existing repository from the command line"
				+ "\n git remote add origin https://github.com/user/" + input + ".git"
				+ "\n git push -u origin master";
		
		JTextArea ta = new JTextArea(init);
		JScrollPane scrollPane = new JScrollPane(ta);
		
		// �ϴ��� repository ���� �� �ߴ� ù ȭ�鸸 �����غý��ϴ�  
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
