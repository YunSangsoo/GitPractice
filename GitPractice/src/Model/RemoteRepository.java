package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// Model ���� Remote Repository �� �����ϰ�, �ҷ����� ���� Model �Դϴ�.

public class RemoteRepository {
		File reposit;
		private String repositName;
		
		public RemoteRepository() {
			getRemoteRepository();
		}
	
		public void getRemoteRepository() {
			// Repository ��ü�� ���� ���Ϸ� �޾ƿ���
			// 4�� ȭ�鿡 �ߴ� ����Ʈ�� List�� ������ ��ȹ�Դϴ�.
			reposit = new File("C:\\");
		}
}
