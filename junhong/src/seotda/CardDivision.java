package seotda;

public class CardDivision {
	public static void Div(int[] array,int[] user,int[] com) {
		user[0] = array[0];
		com[0] = array[1];	
		user[1] = array[2];
		com[1] =array[3];
		if(user[0] >=11 && user[1]<11) {
			 user[0] /= 10;  //first만 쌍,멍 일때 first 일반패로 변환
			
		}
		else if(user[0]< 11 &&  user[1]>=11) {
			 user[1]/=10; //second만 쌍,멍 일때 second 일반패로 변환
		}
		if(com[0] >=11 && com[1]<11) {
			 com[0] /= 10;  //first만 쌍,멍 일때 first 일반패로 변환
			
		}
		else if(com[0]< 11 &&  com[1]>=11) {
			 com[1]/=10; //second만 쌍,멍 일때 second 일반패로 변환
		}
		
		if(user[0] > user[1]) { // 정렬
		      cardSwap(user);
		    }
		    if(com[0] > com[1]) { // 정렬
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
