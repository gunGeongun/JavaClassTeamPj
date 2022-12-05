package seotda;

public class cardScore {
	public static String Score(int[] array){
		int first = array[0];
		int second = array[1];
		return compare(first,second);
	} 
	
	public static String compare(int first,int second) {
		String score = "";
		String[] num = {"¿µ","ÀÏ","ÀÌ","»ï","»ç","¿À","À°","Ä¥","ÆÈ","±¸"};
		int defnum =(first + second)%10;
		if (first == second) {
			if(first == 10) {
				score = "½Ê½Ö";
			}else if(first == 9) {
				score = "±¸½Ö";
			}else if(first == 8) {
				score = "ÆÈ½Ö";
			}else if(first == 7) {
				score = "Ä¥½Ö";
			}else if(first == 6) {
				score = "¿í½Ö";
			}else if(first == 5) {
				score = "¿À½Ö";
			}else if(first == 4) {
				score = "»ç½Ö";
			}else if(first == 3) {
				score = "»ï½Ö";
			}else if(first == 2) {
				score = "ÀÌ½Ö";
			}else if(first == 1) {
				score = "ÀÏ½Ö";
			}
			
		}
		
		else if(first ==1) {
			if(second ==2) {
				score = "¾Ë¸®";
			}else if(second ==4) {
				score ="µ¶»ç";
			}else if(second ==9) {
				score ="±¸»æ";
			}else if(second ==10) {
				score ="Àå»æ";
			}else {
				if(defnum ==0) {
					score = "0²ý";
				}else if(defnum == 1) {
					score = "1²ý";
				}else if(defnum == 2) {
					score = "2²ý";
				}else if(defnum == 3) {
					score = "3²ý";
				}else if(defnum == 4) {
					score = "4²ý";
				}else if(defnum == 5) {
					score = "5²ý";
				}else if(defnum == 6) {
					score = "6²ý";
				}else if(defnum == 7) {
					score = "7²ý";
				}else if(defnum == 8) {
					score = "8²ý";
				}else if(defnum == 9) {
					score = "9²ý";
				}
			}
		}
		else if(first ==4) {
			if(second ==10) {
				score = "Àå»ç";
			}else if(second ==6) {
				score = "¼¼·ú";
			}else if(second ==9) {
				score ="±¸»ç";
			}else {
				if(defnum ==0) {
					score = "0²ý";
				}else if(defnum == 1) {
					score = "1²ý";
				}else if(defnum == 2) {
					score = "2²ý";
				}else if(defnum == 3) {
					score = "3²ý";
				}else if(defnum == 4) {
					score = "4²ý";
				}else if(defnum == 5) {
					score = "5²ý";
				}else if(defnum == 6) {
					score = "6²ý";
				}else if(defnum == 7) {
					score = "7²ý";
				}else if(defnum == 8) {
					score = "8²ý";
				}else if(defnum == 9) {
					score = "9²ý";
				}
			}
		}
		else if(first ==11) {
			if(second == 33) {
				score = "ÀÏ»ï±¤¶¯";
			}else if(second == 88) {
				score = "ÀÏÆÈ±¤¶¯";
			}else if(second ==2) {
				score = "¾Ë¸®";
			}else if(second ==4) {
				score ="µ¶»ç";
			}else if(second ==9) {
				score ="±¸»æ";
			}else if(second ==10) {
				score ="Àå»æ";
			}else {
				if(defnum ==0) {
					score = "0²ý";
				}else if(defnum == 1) {
					score = "1²ý";
				}else if(defnum == 2) {
					score = "2²ý";
				}else if(defnum == 3) {
					score = "3²ý";
				}else if(defnum == 4) {
					score = "4²ý";
				}else if(defnum == 5) {
					score = "5²ý";
				}else if(defnum == 6) {
					score = "6²ý";
				}else if(defnum == 7) {
					score = "7²ý";
				}else if(defnum == 8) {
					score = "8²ý";
				}else if(defnum == 9) {
					score = "9²ý";
				}
			}
			
		}else if(first == 33) {
			if(second == 88) {
				score = "»ïÆÈ±¤¶¯";			
			}else if(second == 77) {
				score = "¶¯ÀâÀÌ";
			}else {
				score = compare(3,second);
				
			}
		}else if(first ==44) {
			if(second == 77) {
				score = "¾ÏÇà¾î»ç";
			}else if(second == 99){
				score = "¸Û±¸»ç";
			}
			else {
				score = compare(4,second);
			}
		}
		else { //³ª¸ÓÁö Á·º¸µé
			if(defnum ==0) {
				score = "0²ý";
			}else if(defnum == 1) {
				score = "1²ý";
			}else if(defnum == 2) {
				score = "2²ý";
			}else if(defnum == 3) {
				score = "3²ý";
			}else if(defnum == 4) {
				score = "4²ý";
			}else if(defnum == 5) {
				score = "5²ý";
			}else if(defnum == 6) {
				score = "6²ý";
			}else if(defnum == 7) {
				score = "7²ý";
			}else if(defnum == 8) {
				score = "8²ý";
			}else if(defnum == 9) {
				score = "9²ý";
			}
			
		}
		return score;
	} 

	public static int scorePrize(String score) {
		int prize = 0;
		if (score =="»ïÆÈ±¤¶¯") {
			prize = 1;
		}else if(score == "ÀÏ»ï±¤¶¯" || score =="ÀÏÆÈ±¤¶¯") {
			prize = 2;
		}else if(score =="½Ê½Ö") {
			prize = 3;
		}else if(score =="±¸½Ö") {
			prize = 4;
		}else if(score =="ÆÈ½Ö") {
			prize = 5;
		}else if(score =="Ä¥½Ö") {
			prize = 6;
		}else if(score =="À°½Ö") {
			prize = 7;
		}else if(score =="¿À½Ö") {
			prize = 8;
		}else if(score =="»ç½Ö") {
			prize = 9;
		}else if(score =="»ï½Ö") {
			prize = 10;
		}else if(score =="ÀÌ½Ö") {
			prize = 11;
		}else if(score =="¾Ë¸®") {
			prize = 12;
		}else if(score =="µ¶»ç") {
			prize = 13;
		}else if(score =="±¸»æ") {
			prize = 14;
		}else if(score =="Àå»æ") {
			prize = 15;
		}else if(score =="Àå»ç") {
			prize = 16;
		}else if(score =="¼¼·ú") {
			prize = 17;
		}else if(score =="9²ý") {
			prize = 18;
		}else if(score =="8²ý") {
			prize = 19;
		}else if(score =="7²ý") {
			prize = 20;
		}else if(score =="6²ý") {
			prize = 21;
		}else if(score =="5²ý") {
			prize = 22;
		}else if(score =="4²ý") {
			prize = 23;
		}else if(score =="3²ý") {
			prize = 24;
		}else if(score =="2²ý") {
			prize = 25;
		}else if(score =="1²ý") {
			prize = 26;
		}else if(score =="0²ý") {
			prize = 27;
		}else if(score == "±¸»ç") {
			prize = 999;
		}else if(score =="¸Û±¸»ç") {
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
