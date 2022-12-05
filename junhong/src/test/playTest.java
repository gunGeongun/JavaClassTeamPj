package test;
import java.util.Arrays;
import java.util.Scanner;
import CPUai.*;
import play.*;
import seotda.*;
import Data.*;

public class playTest {
	public static void main(String[] args) {
		PlayerMoney playerMoney = new PlayerMoney();
		playersBetting playerBet = new playersBetting();
		CPUstate ComMoney = new CPUstate();
		BettingMoney betMoney = new BettingMoney();
		CPUbet CPUBet = new CPUbet();
		Scanner scan = new Scanner(System.in);
		final int cardSize = 2;
		int[] user = new int[cardSize];
		int[] com = new int[cardSize];
		
		Card deck = new Card();
		Shuffle shuf = new Shuffle();
		cardScore score = new cardScore();
		CardDivision cardDiv = new CardDivision();
		winner result = new winner();
		int[] shuffleDeck = deck.card;
		shuf.cardShuffle(shuffleDeck);
		cardDiv.Div(shuffleDeck, user, com); //ī�� �й�
		String userScore = score.Score(user); // �÷��̾� ī�� ���� Ȯ��
		String comScore = score.Score(com); //��ǻ�� ī�� ���� Ȯ��
		int userScorePrize = score.scorePrize(userScore); // �÷��̾� ���� ��
		int comScorePrize = score.scorePrize(comScore); //��ǻ�� ���� ��
		String gameResult = result.result(userScorePrize,comScorePrize); // ���� ���

		System.out.println("�÷��̾��� ù��° ī��� " + user[1]);
		ComMoney.setCPUMoney();
		playerMoney.setPlayerMoney();
		
		//�� �� �ϳ��� �Ļ��ϸ� ��.
		while(ComMoney.getCPUMoney() != 0 || playerMoney.getPlayerMoney() != 0) {
			//��� ���ÿϷ��ϰų� �� �� �ϳ��� ������ ��.
			while(betMoney.getCycle() != 3 || ComMoney.getIsdie() != 1 || playerMoney.getIsdie() != 1) {
				//�� �� �����ϸ� ����.
				while(playerMoney.getIsCalled() == 1 && ComMoney.getIsCalled() == 1) {
					//���� �̱� ������� ���ý���
					if(betMoney.getHis() == 0) {
						//��ǻ�� ����
						int CPUbettedMoney = CPUBet.CPUplay(ComMoney.getCPUMoney(), betMoney.getCycle(), comScorePrize, betMoney.getexBetted(), betMoney.getMoney(), betMoney.getplayerHis());
						//��ǻ�Ͱ� �׾����� �Ǵ�.
						if(CPUbettedMoney == 0) {
							ComMoney.setIsdie(1);
							continue;
						}else if(CPUbettedMoney == betMoney.getexBetted()) {//������ �Ǵ�.
							betMoney.setexBetted(CPUbettedMoney);//���� ������ �� ����
							ComMoney.loseCPUMoney(CPUbettedMoney);//������ ������ �� ���� �ڻ꿡�� ����
							ComMoney.setIsCalled(1);
						}else {
							betMoney.setexBetted(CPUbettedMoney);//���� ������ �� ����
							ComMoney.loseCPUMoney(CPUbettedMoney);//������ ������ �� ���� �ڻ꿡�� ����
							ComMoney.setIsCalled(0);
						}
						betMoney.setHistory(1);
					}
					System.out.println("���ϴ� ������ �Է��ϼ���. ���� : 3, �� : 2, ���� : 1");
					int playersChoice = scan.nextInt();//�÷��̾��� �ൿ
					//�÷��̾� ����.
					int playerBettedMoney = playerBet.playersBet(playersChoice, playerMoney.getPlayerMoney(), betMoney.getMoney(), betMoney.getexBetted());
					//�÷��̾��� ���� �Ǵ�.
					if(playerBettedMoney == 0) {
						playerMoney.setIsdie(1);
						continue;
					}else if(playerBettedMoney == betMoney.getexBetted()) {
						betMoney.setexBetted(playerBettedMoney);//�����ѵ� ����
						playerMoney.losePlayerMoney(playerBettedMoney);//���õ� �� ����
						playerMoney.setIsCalled(1);
						
					}else {
						betMoney.setexBetted(playerBettedMoney);//�����ѵ� ����
						playerMoney.losePlayerMoney(playerBettedMoney);//���õ� �� ����
						playerMoney.setIsCalled(0);
					}
					//�Ѵ� ���ߴ��� �Ǵ�.
					if(playerMoney.getIsCalled() == 1 && ComMoney.getIsCalled() == 1) {
						continue;
					}
					int CPUbettedMoney = CPUBet.CPUplay(ComMoney.getCPUMoney(), betMoney.getCycle(), comScorePrize, betMoney.getexBetted(), betMoney.getMoney(), betMoney.getplayerHis());
					if(CPUbettedMoney == 0) {
						ComMoney.setIsdie(1);
						continue;
					}else if(CPUbettedMoney == betMoney.getexBetted()) {//������ �Ǵ�.
						betMoney.setexBetted(CPUbettedMoney);//���� ������ �� ����
						ComMoney.loseCPUMoney(CPUbettedMoney);//������ ������ �� ���� �ڻ꿡�� ����
						ComMoney.setIsCalled(1);
					}else {
						betMoney.setexBetted(CPUbettedMoney);//���� ������ �� ����
						ComMoney.loseCPUMoney(CPUbettedMoney);//������ ������ �� ���� �ڻ꿡�� ����
						ComMoney.setIsCalled(0);
					}
				}
				
				betMoney.addCycle();
			}
			//����������, �ǵ��� �������� �ڵ�.
			System.out.print(user[2]);
			if(ComMoney.getIsdie() == 1 || userScorePrize > comScorePrize) {
				System.out.println(gameResult);
				playerMoney.gainPlayerMoney(betMoney.getMoney());
				betMoney.setHistory(1);
				continue;
			}else if(playerMoney.getIsdie() == 1 || userScorePrize < comScorePrize) {
				System.out.println(gameResult);
				ComMoney.gainCPUMoney(betMoney.getMoney());
				betMoney.setHistory(0);
				continue;
			}
			
			ComMoney.resetPoint();
			playerMoney.resetPoint();
			betMoney.resetPoint();
		}
		scan.close();
	}
}
