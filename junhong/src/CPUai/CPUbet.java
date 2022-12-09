package CPUai;
import play.*;

public class CPUbet {
	private int choice = 0;
	public int CPUplay(int money, int count, int cardnumOrpriority , int exbettedmoney, int totalbettedmoney, int[] bethistory) {
		int Money = money;
		int Count = count;
		int num = cardnumOrpriority;
		int ExBettedMoney = exbettedmoney;
		int TotalBettedMoney = totalbettedmoney;
		int[] BetHistory = bethistory;
		
		Betting bet = new Betting();
		CPUAI ai = new CPUAI();
		
		if(Money != 0) {
			if(Count == 1) {
				this.choice = ai.oneCardSet(num);
				if(choice == 1) {
					return bet.die();
				}else if(choice == 2) {
					return bet.call(Money, ExBettedMoney);
				}else 
					return bet.half(Money, TotalBettedMoney);
			}else
				this.choice = ai.twoCardSet(num, ai.judgement(BetHistory));
				if(choice == 1) {
					return bet.die();
				}else if(choice == 2) {
					return bet.call(Money, ExBettedMoney);
				}else 
					return bet.half(Money, TotalBettedMoney);
		}else {
			return bet.call(Money, ExBettedMoney);
		}
		
	}
	
	public int getchoice() {
		return choice;
	}
	
}
