package seotda;

public class cardScore {
	public static String Score(int[] array){
		int first = array[0];
		int second = array[1];
		return compare(first,second);
	} 
	
	public static String compare(int first,int second) {
		String score = "";
		String[] num = {"��","��","��","��","��","��","��","ĥ","��","��"};
		int defnum =(first + second)%10;
		if (first == second) {
			if(first == 10) {
				score = "�ʽ�";
			}else if(first == 9) {
				score = "����";
			}else if(first == 8) {
				score = "�Ƚ�";
			}else if(first == 7) {
				score = "ĥ��";
			}else if(first == 6) {
				score = "���";
			}else if(first == 5) {
				score = "����";
			}else if(first == 4) {
				score = "���";
			}else if(first == 3) {
				score = "���";
			}else if(first == 2) {
				score = "�̽�";
			}else if(first == 1) {
				score = "�Ͻ�";
			}
			
		}
		
		else if(first ==1) {
			if(second ==2) {
				score = "�˸�";
			}else if(second ==4) {
				score ="����";
			}else if(second ==9) {
				score ="����";
			}else if(second ==10) {
				score ="���";
			}else {
				if(defnum ==0) {
					score = "0��";
				}else if(defnum == 1) {
					score = "1��";
				}else if(defnum == 2) {
					score = "2��";
				}else if(defnum == 3) {
					score = "3��";
				}else if(defnum == 4) {
					score = "4��";
				}else if(defnum == 5) {
					score = "5��";
				}else if(defnum == 6) {
					score = "6��";
				}else if(defnum == 7) {
					score = "7��";
				}else if(defnum == 8) {
					score = "8��";
				}else if(defnum == 9) {
					score = "9��";
				}
			}
		}
		else if(first ==4) {
			if(second ==10) {
				score = "���";
			}else if(second ==6) {
				score = "����";
			}else if(second ==9) {
				score ="����";
			}else {
				if(defnum ==0) {
					score = "0��";
				}else if(defnum == 1) {
					score = "1��";
				}else if(defnum == 2) {
					score = "2��";
				}else if(defnum == 3) {
					score = "3��";
				}else if(defnum == 4) {
					score = "4��";
				}else if(defnum == 5) {
					score = "5��";
				}else if(defnum == 6) {
					score = "6��";
				}else if(defnum == 7) {
					score = "7��";
				}else if(defnum == 8) {
					score = "8��";
				}else if(defnum == 9) {
					score = "9��";
				}
			}
		}
		else if(first ==11) {
			if(second == 33) {
				score = "�ϻﱤ��";
			}else if(second == 88) {
				score = "���ȱ���";
			}else if(second ==2) {
				score = "�˸�";
			}else if(second ==4) {
				score ="����";
			}else if(second ==9) {
				score ="����";
			}else if(second ==10) {
				score ="���";
			}else {
				if(defnum ==0) {
					score = "0��";
				}else if(defnum == 1) {
					score = "1��";
				}else if(defnum == 2) {
					score = "2��";
				}else if(defnum == 3) {
					score = "3��";
				}else if(defnum == 4) {
					score = "4��";
				}else if(defnum == 5) {
					score = "5��";
				}else if(defnum == 6) {
					score = "6��";
				}else if(defnum == 7) {
					score = "7��";
				}else if(defnum == 8) {
					score = "8��";
				}else if(defnum == 9) {
					score = "9��";
				}
			}
			
		}else if(first == 33) {
			if(second == 88) {
				score = "���ȱ���";			
			}else if(second == 77) {
				score = "������";
			}else {
				score = compare(3,second);
				
			}
		}else if(first ==44) {
			if(second == 77) {
				score = "������";
			}else if(second == 99){
				score = "�۱���";
			}
			else {
				score = compare(4,second);
			}
		}
		else { //������ ������
			if(defnum ==0) {
				score = "0��";
			}else if(defnum == 1) {
				score = "1��";
			}else if(defnum == 2) {
				score = "2��";
			}else if(defnum == 3) {
				score = "3��";
			}else if(defnum == 4) {
				score = "4��";
			}else if(defnum == 5) {
				score = "5��";
			}else if(defnum == 6) {
				score = "6��";
			}else if(defnum == 7) {
				score = "7��";
			}else if(defnum == 8) {
				score = "8��";
			}else if(defnum == 9) {
				score = "9��";
			}
			
		}
		return score;
	} 

	public static int scorePrize(String score) {
		int prize = 0;
		if (score =="���ȱ���") {
			prize = 1;
		}else if(score == "�ϻﱤ��" || score =="���ȱ���") {
			prize = 2;
		}else if(score =="�ʽ�") {
			prize = 3;
		}else if(score =="����") {
			prize = 4;
		}else if(score =="�Ƚ�") {
			prize = 5;
		}else if(score =="ĥ��") {
			prize = 6;
		}else if(score =="����") {
			prize = 7;
		}else if(score =="����") {
			prize = 8;
		}else if(score =="���") {
			prize = 9;
		}else if(score =="���") {
			prize = 10;
		}else if(score =="�̽�") {
			prize = 11;
		}else if(score =="�˸�") {
			prize = 12;
		}else if(score =="����") {
			prize = 13;
		}else if(score =="����") {
			prize = 14;
		}else if(score =="���") {
			prize = 15;
		}else if(score =="���") {
			prize = 16;
		}else if(score =="����") {
			prize = 17;
		}else if(score =="9��") {
			prize = 18;
		}else if(score =="8��") {
			prize = 19;
		}else if(score =="7��") {
			prize = 20;
		}else if(score =="6��") {
			prize = 21;
		}else if(score =="5��") {
			prize = 22;
		}else if(score =="4��") {
			prize = 23;
		}else if(score =="3��") {
			prize = 24;
		}else if(score =="2��") {
			prize = 25;
		}else if(score =="1��") {
			prize = 26;
		}else if(score =="0��") {
			prize = 27;
		}else if(score == "����") {
			prize = 999;
		}else if(score =="�۱���") {
			prize = 1001;
		}
		return prize;
	}
	public static void main(String[] args) {
		cardScore check = new cardScore();
		int[] arr = {3,88};
		
		String checkng = check.Score(arr);
		System.out.println(checkng);
		System.out.println(check.scorePrize(checkng));
	}

}
