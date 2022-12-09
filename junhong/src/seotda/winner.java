package seotda;

public class winner {
   public static int result(int user,int com) {
      int result = 0;
      if(user ==com) {
         result = 3; }//"무승부 재경기"; 
      if(user>com) {
         if(user==999 && com >11) {
            result = 4; //"구사 재경기";
            
         }else if(user==1001 && com>3) {
            result = 5; // "멍구사 재경기";
         }else if (user == 777 && (com >= 4 && com <= 12)) {  //땡잡이
        	 result = 6; //"사용자의 땡잡이 승리";
         }else if ( user==888 && com ==2) { //암행어사
        	 result = 7; //"사용자의 암행어사 승리";
         }
         else {
            result = 1;//"컴퓨터의 승리";
         }
      }else if(user<com) {
         if(com==999 && user >11) {
            result = 4; //"구사 재경기";
            
         }else if(com==1001 && user>3) {
            result = 5; //"멍구사 재경기";
         }else if (com == 777 && ( user>= 4 &&  user<= 12)) {  //땡잡이
        	 result = 6; //"컴퓨터의 땡잡이 승리";
         }else if (com ==888 && user ==2) { //암행어사
        	 result = 7; //"컴퓨터의 암행어사 승리";
         }
         else {
            result = 2;//"플레이어의 승리";
         }
      }
      return result;
   }
}