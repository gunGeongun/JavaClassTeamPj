package play;

public class BettingMoney {
	private int BetMoney;
	public BettingMoney() {
		this.BetMoney = 0;
	}
	public BettingMoney(int betMoney){
		this.BetMoney =  betMoney;
	}
	public int getMoney() {
		return BetMoney;
	}
	public int addMoney(int Money) {
		this.BetMoney = this.BetMoney + Money;
		return BetMoney;		
	}
}
