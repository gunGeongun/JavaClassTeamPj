package seotda;

public class winner {
	public static String result(int user,int com) {
		String result = "";
		if(user>com) {
			if(user==999 && com >11) {
				result = "���� ����";
				
			}else if(user==1001 && com>3) {
				result = "�۱��� ����";
			}
			else {
				result = "��ǻ���� �¸�";
			}
		}else if(user<com) {
			if(com==999 && user >11) {
				result = "���� ����";
				
			}else if(com==1001 && user>3) {
				result = "�۱��� ����";
			}
			else {
				result = "�÷��̾��� �¸�";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		winner win = new winner();
		System.out.println(win.result(23,1));


	}

}
