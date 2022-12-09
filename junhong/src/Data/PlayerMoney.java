package Data;

public class PlayerMoney {
	private int playerMoney = 1000000;
	private int IsCalled = 0;
	private int Isdie = 0;
	public void setPlayerMoney() {
		this.playerMoney = 1000000;
	}
	public int getPlayerMoney() {
		return playerMoney;
	}
	public void losePlayerMoney(int betMoney) {
		if(this.playerMoney-betMoney < 0) {
			this.playerMoney = 0;
		}else
			this.playerMoney = this.playerMoney - betMoney;
	}
	public void gainPlayerMoney(int gainMoney) {
		this.playerMoney = this.playerMoney + gainMoney;
	}
	public void setIsCalled(int n) {
		this.IsCalled = n;
	}
	public int getIsCalled() {
		return IsCalled;
	}
	public void setIsdie(int n) {
		this.Isdie = n;
	}
	public int getIsdie() {
		return Isdie;
	}
	public void resetPoint() {
		this.IsCalled = 0;
		this.Isdie = 0;
	}
}
