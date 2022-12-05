package CPUai;
import java.util.Random;

public class CPUAI {
	int[] esti1 = {2, 2, 2, 2, 3, 3, 3, 3, 3, 3};
	int[] esti2 = {1, 2, 2, 2, 2, 2, 2, 3, 3, 3};
	int[] esti3 = {1, 1, 2, 2, 2, 2, 2, 2, 2, 3};
	Random ran = new Random();
	//첫 배팅
	public int oneCardSet(int one) {
		int esti;
		switch(one) {
		case 11:
		case 33:
		case 44:
		case 88:
		case 1:
		case 4:
		case 9:
		case 10:
			esti = ran.nextInt(10);
			return esti1[esti];
		case 3:
		case 5:
		case 7:
			esti = ran.nextInt(10);
			return esti3[esti];
		default:
			esti = ran.nextInt(10);
			return esti2[esti];
		}
	}
	//2번째 카드를 본 후 베팅
	public int twoCardSet(int two, int jud) {
		if(two < 15 || two == 31) {
			int esti = ran.nextInt(10);
			return esti1[esti];
		}else if(two < 26 || two == 32) {
			int esti = ran.nextInt(10);
			return esti2[esti];
		}else if(two == 29 || two == 30) {
			if(jud == 1) {
				int esti = ran.nextInt(10);
				return esti1[esti];
			}else if(jud == 2) {
				int esti = ran.nextInt(10);
				return esti2[esti];
			}else {
				int esti = ran.nextInt(10);
				return esti3[esti];
			}
		}else {
			int esti = ran.nextInt(10);
			return esti3[esti];
		}
	}
	//판단 상대방의 하프가 많으면 땡잡이나 암행어사가 좋으니까 배팅을 올리는 것.
	public int judgement(int[] input) {
		int[] judg = input;
		int countHalf = 0;
		int countCall = 0;
		for (int i = 0; i < 3; i++) {
			if(judg[i] == 3) {
				countHalf += 1;
			}else if(judg[i]==2) {
				countCall += 1;
			}
		}
		if(countHalf > 0) {
			if(countCall == 2) {
				return 2;
			}else {
				return 3;
			}
		}else
			return 1;
	}
	
	
}
