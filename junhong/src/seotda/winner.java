package seotda;

public class winner {
	public static String result(int user,int com) {
		String result = "";
		if(user>com) {
			if(user==999 && com >11) {
				result = "구사 재경기";
				
			}else if(user==1001 && com>3) {
				result = "멍구사 재경기";
			}
			else {
				result = "컴퓨터의 승리";
			}
		}else if(user<com) {
			if(com==999 && user >11) {
				result = "구사 재경기";
				
			}else if(com==1001 && user>3) {
				result = "멍구사 재경기";
			}
			else {
				result = "플레이어의 승리";
			}
		}
		return result;
	}

	public static void main(String[] args) {
		winner win = new winner();
		System.out.println(win.result(23,1));


	}

}
