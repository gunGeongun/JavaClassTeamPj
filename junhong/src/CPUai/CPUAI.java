package CPUai;
import java.util.Random;

public class CPUAI {
	int[] esti1 = {2, 2, 2, 2, 3, 3, 3, 3, 3, 3};
	int[] esti2 = {1, 2, 2, 2, 2, 2, 2, 3, 3, 3};
	int[] esti3 = {1, 1, 2, 2, 2, 2, 2, 2, 2, 3};
	Random ran = new Random();
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
	public int judgement(int[] input) {
		int[] judg = input;
		int countHalf = 0;
		for (int i = 0; i < judg.length; i++) {
			if(judg[i] == 3) {
				countHalf++;
			}
		}
		if(countHalf > 2) {
			return 3;
		}else if(countHalf != 0) {
			return 2;
		}else
			return 1;
	}
}
