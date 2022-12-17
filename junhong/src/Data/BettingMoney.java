package Data;

public class BettingMoney {
	private int BetMoney = 1000;//占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙.
	private int BetCycle;//카占썲를 占쏙옙占쏙옙 占쏙옙.
	private int betHistory = 0;//占쏙옙占쏙옙 占싱깍옙占쏙옙 찾占쏙옙.
	private int[] playersHis = {0, 0, 0};// 占시뤄옙占싱억옙占쏙옙 占쏙옙占시깍옙占�.
	private int exBetted = 500;//占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙占쏙옙 占쏙옙
	private int rematchhis = 0;
	private int rematchnum = 0;
	private int bothcall = 0;//둘다 콜일때 반복을 끝내기 위한 데이터.
	
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
		System.out.println("1장 추가.");
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
	public void setrematchp() {
		this.rematchhis = 1;
	}
	public void setrematchC() {
		this.rematchhis = 0;
	}
	public int getrematchhis() {
		return rematchhis;
	}
	public void setbothcall(int c, int p) {
		if (c == 1 && p == 1) {
			this.bothcall = 1;
		}else {
			this.bothcall = 0;
		}
	}
	
	public void resetPoint() {
		this.BetCycle = 1;
		this.exBetted = 500;
		this.playersHis = new int[] {0,0,0};
		this.BetMoney = 1000;
		this.bothcall = 0;
	}
}
