package Controller;

import java.awt.event.MouseEvent;

import java.awt.event.MouseListener;

import java.io.File;

/*
 Repository�� �����ϴ� ��ɵ� �ʿ��� �� ���� �߰��� �������Դϴ�.
 ���� �����쿡 del ��ư�� �ִ� �� �ƴմϴ�.
 Repository�� ��ũ�� Ŭ���ϰ� ���ο� â���� �Ѿ�� ��
 ��� ȭ���� ���� ���ʿ� ��ư�� ��ġ�ϵ��� �� �����Դϴ�.
 */

public class DelRepoClickListener implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		delRepo();
	}
	
	public void delRepo() {
		File file = new File("C:/dir");
		
		if (file.exists()) {
			if (file.isDirectory()) {
				File[] files = file.listFiles();
				
				for (int i = 0; i < files.length; i++) {
					if (files[i].delete()) {
						System.out.println(files[i].getName() + "������ �����߽��ϴ�.");
					} else {
						System.out.println(files[i].getName() + "������ �����ϴ� �� �����߽��ϴ�.");
					}
				}
			}
		} else {
			System.out.println("������ �������� �ʽ��ϴ�.");
		}
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
