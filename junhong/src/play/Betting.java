package play;

public class Betting {
	public int half(int Money, int BettedMoney) {
		
		if(Money >= (BettedMoney/2)) {
			Money = BettedMoney/2;
			return Money;
		}else {
			return Money;
		}
	}
	public int call(int Money, int ExBetMoney) {
		if(Money >= ExBetMoney) {
			Money = ExBetMoney;
			return Money;
		}else {
			return Money;
		}
	}
	public int die() {
		return 0;
	}
	
}