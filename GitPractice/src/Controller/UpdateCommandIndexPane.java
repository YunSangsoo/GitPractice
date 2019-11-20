package Controller;

import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;

import View.CommandIndexPane;

public class UpdateCommandIndexPane {
	
	private JList list;

	public UpdateCommandIndexPane(CommandIndexPane view) {
		this.list = view.getJList();
	}
	
	public void setCommandList() {
		//��ɾ� ���� ��������
		Model.CommandExplainList cmdlist = new Model.CommandExplainList();
		String cmds[] = cmdlist.getCommandList();
		
		/*list�� ��� �߰��ϱ� ���� �ӽ� �� ����
		* list�� addElement ���� �޼ҵ尡 ���� �ϼ��� ������ ����Ʈ�� �Ѱ� ��� �Ѵ�.
		*/
		DefaultListModel listModel = new DefaultListModel();
		
		for(String cmd : cmds) {
			listModel.addElement(cmd);
		}
		list.setModel(listModel);
		list.repaint();
	}
}
