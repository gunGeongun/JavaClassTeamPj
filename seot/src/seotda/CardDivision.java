package seotda;

public class CardDivision {
	public static void Div(int[] array,int[] user,int[] com) {
		user[0] = array[0];
		com[0] = array[1];	
		user[1] = array[2];
		com[1] =array[3];
		if(user[0] >=11 && user[1]<11) {
			 user[0] /= 10;  //first�� ��,�� �϶� first �Ϲ��з� ��ȯ
			
		}
		else if(user[0]< 11 &&  user[1]>=11) {
			 user[1]/=10; //second�� ��,�� �϶� second �Ϲ��з� ��ȯ
		}
		if(com[0] >=11 && com[1]<11) {
			 com[0] /= 10;  //first�� ��,�� �϶� first �Ϲ��з� ��ȯ
			
		}
		else if(com[0]< 11 &&  com[1]>=11) {
			 com[1]/=10; //second�� ��,�� �϶� second �Ϲ��з� ��ȯ
		}
		
		if(user[0] > user[1]) { // ����
		      cardSwap(user);
		    }
		    if(com[0] > com[1]) { // ����
		      cardSwap(com);
		    }
	
	}
	static void cardSwap(int[] playerCard) { 
	    int temp;
	    temp = playerCard[0];
	    playerCard[0] = playerCard[1];
	    playerCard[1] = temp;
	  }

}
