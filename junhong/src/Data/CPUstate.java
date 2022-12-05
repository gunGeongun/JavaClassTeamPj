package Data;

public class CPUstate {
	private int CPUMoney = 1000000;
	private int IsCalled = 0;
	private int Isdie = 0;
	
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
