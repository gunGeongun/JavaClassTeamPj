package Data;

public class PlayerMoney {
	private int playerMoney = 1000000;
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

}
