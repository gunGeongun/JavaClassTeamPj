package CPUai;

public class CPUstate {
	private int CPUMoney;
	public void setCPUMoney() {
		this.CPUMoney = 1000000;
	}
	public int getCPUMoney() {
		return this.CPUMoney;
	}
	public void loseCPUMoney(int betMoney) {
		if(this.CPUMoney-betMoney < 0) {
			this.CPUMoney = 0;
		}else
			this.CPUMoney = this.CPUMoney - betMoney;
	}
	public void gainCPUMoney(int gainMoney) {
		this.CPUMoney = this.CPUMoney + gainMoney;
	}
}
