package seotda;

public class winner {
   public static int result(int user,int com) {
      int result = 0;
      if(user ==com) {
         result = 3; }//"���º� ����"; 
      if(user>com) {
         if(user==999 && com >11) {
            result = 4; //"���� ����";
            
         }else if(user==1001 && com>3) {
            result = 5; // "�۱��� ����";
         }else if (user == 777 && (com >= 4 && com <= 12)) {  //������
        	 result = 6; //"������� ������ �¸�";
         }else if ( user==888 && com ==2) { //������
        	 result = 7; //"������� ������ �¸�";
         }
         else {
            result = 1;//"��ǻ���� �¸�";
         }
      }else if(user<com) {
         if(com==999 && user >11) {
            result = 4; //"���� ����";
            
         }else if(com==1001 && user>3) {
            result = 5; //"�۱��� ����";
         }else if (com == 777 && ( user>= 4 &&  user<= 12)) {  //������
        	 result = 6; //"��ǻ���� ������ �¸�";
         }else if (com ==888 && user ==2) { //������
        	 result = 7; //"��ǻ���� ������ �¸�";
         }
         else {
            result = 2;//"�÷��̾��� �¸�";
         }
      }
      return result;
   }
}