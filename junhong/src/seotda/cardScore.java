package seotda;

public class cardScore {
	public static String Score(int[] array){
		int first = array[0];
		int second = array[1];
		return compare(first,second);
	} 
	
	public static String compare(int first,int second) {
		String score = "";
		String[] num = {"영","일","이","삼","사","오","육","칠","팔","구"};
		int defnum =(first + second)%10;
		if (first == second) {
			if(first == 10) {
				score = "십쌍";
			}else if(first == 9) {
				score = "구쌍";
			}else if(first == 8) {
				score = "팔쌍";
			}else if(first == 7) {
				score = "칠쌍";
			}else if(first == 6) {
				score = "욱쌍";
			}else if(first == 5) {
				score = "오쌍";
			}else if(first == 4) {
				score = "사쌍";
			}else if(first == 3) {
				score = "삼쌍";
			}else if(first == 2) {
				score = "이쌍";
			}else if(first == 1) {
				score = "일쌍";
			}
			
		}
		
		else if(first ==1) {
			if(second ==2) {
				score = "알리";
			}else if(second ==4) {
				score ="독사";
			}else if(second ==9) {
				score ="구삥";
			}else if(second ==10) {
				score ="장삥";
			}else {
				if(defnum ==0) {
					score = "0끗";
				}else if(defnum == 1) {
					score = "1끗";
				}else if(defnum == 2) {
					score = "2끗";
				}else if(defnum == 3) {
					score = "3끗";
				}else if(defnum == 4) {
					score = "4끗";
				}else if(defnum == 5) {
					score = "5끗";
				}else if(defnum == 6) {
					score = "6끗";
				}else if(defnum == 7) {
					score = "7끗";
				}else if(defnum == 8) {
					score = "8끗";
				}else if(defnum == 9) {
					score = "9끗";
				}
			}
		}
		else if(first ==4) {
			if(second ==10) {
				score = "장사";
			}else if(second ==6) {
				score = "세륙";
			}else if(second ==9) {
				score ="구사";
			}else {
				if(defnum ==0) {
					score = "0끗";
				}else if(defnum == 1) {
					score = "1끗";
				}else if(defnum == 2) {
					score = "2끗";
				}else if(defnum == 3) {
					score = "3끗";
				}else if(defnum == 4) {
					score = "4끗";
				}else if(defnum == 5) {
					score = "5끗";
				}else if(defnum == 6) {
					score = "6끗";
				}else if(defnum == 7) {
					score = "7끗";
				}else if(defnum == 8) {
					score = "8끗";
				}else if(defnum == 9) {
					score = "9끗";
				}
			}
		}
		else if(first ==11) {
			if(second == 33) {
				score = "일삼광땡";
			}else if(second == 88) {
				score = "일팔광땡";
			}else if(second ==2) {
				score = "알리";
			}else if(second ==4) {
				score ="독사";
			}else if(second ==9) {
				score ="구삥";
			}else if(second ==10) {
				score ="장삥";
			}else {
				if(defnum ==0) {
					score = "0끗";
				}else if(defnum == 1) {
					score = "1끗";
				}else if(defnum == 2) {
					score = "2끗";
				}else if(defnum == 3) {
					score = "3끗";
				}else if(defnum == 4) {
					score = "4끗";
				}else if(defnum == 5) {
					score = "5끗";
				}else if(defnum == 6) {
					score = "6끗";
				}else if(defnum == 7) {
					score = "7끗";
				}else if(defnum == 8) {
					score = "8끗";
				}else if(defnum == 9) {
					score = "9끗";
				}
			}
			
		}else if(first == 33) {
			if(second == 88) {
				score = "삼팔광땡";			
			}else if(second == 77) {
				score = "땡잡이";
			}else {
				score = compare(3,second);
				
			}
		}else if(first ==44) {
			if(second == 77) {
				score = "암행어사";
			}else if(second == 99){
				score = "멍구사";
			}
			else {
				score = compare(4,second);
			}
		}
		else { //나머지 족보들
			if(defnum ==0) {
				score = "0끗";
			}else if(defnum == 1) {
				score = "1끗";
			}else if(defnum == 2) {
				score = "2끗";
			}else if(defnum == 3) {
				score = "3끗";
			}else if(defnum == 4) {
				score = "4끗";
			}else if(defnum == 5) {
				score = "5끗";
			}else if(defnum == 6) {
				score = "6끗";
			}else if(defnum == 7) {
				score = "7끗";
			}else if(defnum == 8) {
				score = "8끗";
			}else if(defnum == 9) {
				score = "9끗";
			}
			
		}
		return score;
	} 

	public static int scorePrize(String score) {
		int prize = 0;
		if (score =="삼팔광땡") {
			prize = 1;
		}else if(score == "일삼광땡" || score =="일팔광땡") {
			prize = 2;
		}else if(score =="십쌍") {
			prize = 3;
		}else if(score =="구쌍") {
			prize = 4;
		}else if(score =="팔쌍") {
			prize = 5;
		}else if(score =="칠쌍") {
			prize = 6;
		}else if(score =="육쌍") {
			prize = 7;
		}else if(score =="오쌍") {
			prize = 8;
		}else if(score =="사쌍") {
			prize = 9;
		}else if(score =="삼쌍") {
			prize = 10;
		}else if(score =="이쌍") {
			prize = 11;
		}else if(score =="알리") {
			prize = 12;
		}else if(score =="독사") {
			prize = 13;
		}else if(score =="구삥") {
			prize = 14;
		}else if(score =="장삥") {
			prize = 15;
		}else if(score =="장사") {
			prize = 16;
		}else if(score =="세륙") {
			prize = 17;
		}else if(score =="9끗") {
			prize = 18;
		}else if(score =="8끗") {
			prize = 19;
		}else if(score =="7끗") {
			prize = 20;
		}else if(score =="6끗") {
			prize = 21;
		}else if(score =="5끗") {
			prize = 22;
		}else if(score =="4끗") {
			prize = 23;
		}else if(score =="3끗") {
			prize = 24;
		}else if(score =="2끗") {
			prize = 25;
		}else if(score =="1끗") {
			prize = 26;
		}else if(score =="0끗") {
			prize = 27;
		}else if(score == "구사") {
			prize = 999;
		}else if(score =="멍구사") {
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
