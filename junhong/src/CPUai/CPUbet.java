package CPUai;
import play.*;

public class CPUbet {
	private int playersHis = 0;
	public int CPUplay(int money, int count, int cardnumOrpriority , int exbettedmoney, int totalbettedmoney, int[] bethistory) {
		int Money = money;
		int Count = count;
		int num = cardnumOrpriority;
		int ExBettedMoney = exbettedmoney;
		int TotalBettedMoney = totalbettedmoney;
		int[] BetHistory = bethistory;
		
		Betting bet = new Betting();
		CPUAI ai = new CPUAI();
		
		if(Count == 1) {
			if(ai.oneCardSet(num) == 1) {
				bet.die();
				return 0;
			}else if(ai.oneCardSet(num) == 2) {
				return bet.call(Money, ExBettedMoney);
			}else if(ai.oneCardSet(num) != 3) {
				return 0;
			}else 
				return bet.half(Money, TotalBettedMoney);
		}else
			if(ai.twoCardSet(num, ai.judgement(BetHistory)) == 1) {
				bet.die();
				return 0;
			}else if(ai.twoCardSet(num, ai.judgement(BetHistory)) == 2) {
				return bet.call(Money, ExBettedMoney);
			}else if(ai.twoCardSet(num, ai.judgement(BetHistory)) != 3) {
				return 0;
			}else 
				return bet.half(Money, TotalBettedMoney);
	}
	public void setplayersHis(int num) {
		this.playersHis = num;
	}
	public int getplayersHis() {
		return playersHis;
	}
}
