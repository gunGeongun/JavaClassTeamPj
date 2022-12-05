package Data;

public class BettingMoney {
	private int BetMoney = 1000;//총 베탕된 돈.
	private int BetCycle;//카드를 가진 수.
	private int betHistory = 0;//전판 이긴사람 찾기.
	private int[] playersHis = {0, 0, 0};// 플레이어의 배팅기록.
	private int exBetted = 500;//이전에 배팅한 돈
	
	public BettingMoney() {
		this.BetMoney = 1000;
		this.BetCycle = 1;
	}
	public BettingMoney(int betMoney){
		this.BetMoney =  betMoney;
		this.BetCycle = 1;
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
		this.BetCycle = this.BetCycle + 1;
	}
	public void setHistory(int i) {
		this.betHistory = i;		
	}
	public int getHis() {
		return betHistory;
	}
	public void setHis(int i) {
		this.betHistory = i;
	}
	public void setplayerHis(int num, int data) {
		this.playersHis[num] = data;
	}
	public int[] getplayerHis() {
		return playersHis;
	}
	public void firstexBetted() {
		this.exBetted = 500;
	}
	public void setexBetted(int Money) {
		this.exBetted = Money;
	}
	public int getexBetted() {
		return exBetted;
	}
	public void resetPoint() {
		this.BetCycle = 0;
		this.exBetted = 500;
		this.playersHis = new int[] {0,0,0};
	}
}
