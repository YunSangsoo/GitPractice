package Controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class ExplorerClickListener implements MouseListener {
	
	MouseEvent e;
	
	public ExplorerClickListener() {
		// Model�� ���ǵǾ� �ִ� Remote Repository ����Ʈ
		Model.RemoteRepository rmrepo = new Model.RemoteRepository();
	}

	@Override
	public void mouseClicked(MouseEvent e) { // ���콺�� Ŭ�� �Ǿ��� �� 
		// TODO Auto-generated method stub
		mkRepository();
		
		
	}
	
	private void mkRepository() {
		JButton linkButton = (JButton) e.getSource();
		// ������ ��ü ����
		ExplorerClickListener listener = new ExplorerClickListener();
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
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
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
