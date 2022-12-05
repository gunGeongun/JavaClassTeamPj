package Data;

public class BettingMoney {
	private int BetMoney;
	private int BetCycle;
	private int CallCount;
	private int betHistory = 0;//전판 이긴사람 찾기.
	private int[] playersHis = {0, 0, 0};
	
	public BettingMoney() {
		this.BetMoney = 0;
		this.BetCycle = 1;
		this.CallCount = 0;
	}
	public BettingMoney(int betMoney){
		this.BetMoney =  betMoney;
		this.BetCycle = 1;
		this.CallCount = 0;
	}
	public int getMoney() {
		return BetMoney;
	}
	public int addMoney(int Money) {
		this.BetMoney = this.BetMoney + Money;
		return BetMoney;		
	}
	public int getCycle() {
		return BetCycle;
	}
	public void addCycle() {
		this.BetCycle += 1;
	}
	public void addCall() {
		this.CallCount += 1;
	}
	public int getCall() {
		return CallCount;
	}
	public void setHistory(int i) {
		this.betHistory = i;		
	}
	public int getHis() {
		return betHistory;
	}
	public void setplayerHis
}
