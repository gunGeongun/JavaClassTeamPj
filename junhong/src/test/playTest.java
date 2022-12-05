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
		cardDiv.Div(shuffleDeck, user, com); //카드 분배
		String userScore = score.Score(user); // 플레이어 카드 족보 확인
		String comScore = score.Score(com); //컴퓨터 카드 족보 확인
		int userScorePrize = score.scorePrize(userScore); // 플레이어 점수 값
		int comScorePrize = score.scorePrize(comScore); //컴퓨터 점수 값
		String gameResult = result.result(userScorePrize,comScorePrize); // 게임 결과

		System.out.println("플레이어의 첫번째 카드는 " + user[1]);
		ComMoney.setCPUMoney();
		playerMoney.setPlayerMoney();
		
		//둘 중 하나가 파산하면 끝.
		while(ComMoney.getCPUMoney() != 0 || playerMoney.getPlayerMoney() != 0) {
			//모두 배팅완료하거나 둘 중 하나가 죽으면 끝.
			while(betMoney.getCycle() != 3 || ComMoney.getIsdie() != 1 || playerMoney.getIsdie() != 1) {
				//둘 다 배팅하면 끝남.
				while(playerMoney.getIsCalled() == 1 && ComMoney.getIsCalled() == 1) {
					//전에 이긴 사람부터 배팅시작
					if(betMoney.getHis() == 0) {
						//컴퓨터 배팅
						int CPUbettedMoney = CPUBet.CPUplay(ComMoney.getCPUMoney(), betMoney.getCycle(), comScorePrize, betMoney.getexBetted(), betMoney.getMoney(), betMoney.getplayerHis());
						//컴퓨터가 죽었는지 판단.
						if(CPUbettedMoney == 0) {
							ComMoney.setIsdie(1);
							continue;
						}else if(CPUbettedMoney == betMoney.getexBetted()) {//콜인지 판단.
							betMoney.setexBetted(CPUbettedMoney);//전에 배팅한 돈 저장
							ComMoney.loseCPUMoney(CPUbettedMoney);//배팅을 했으니 그 돈을 자산에서 제외
							ComMoney.setIsCalled(1);
						}else {
							betMoney.setexBetted(CPUbettedMoney);//전에 배팅한 돈 저장
							ComMoney.loseCPUMoney(CPUbettedMoney);//배팅을 했으니 그 돈을 자산에서 제외
							ComMoney.setIsCalled(0);
						}
						betMoney.setHistory(1);
					}
					System.out.println("원하는 베팅을 입력하세요. 하프 : 3, 콜 : 2, 다이 : 1");
					int playersChoice = scan.nextInt();//플레이어의 행동
					//플레이어 배팅.
					int playerBettedMoney = playerBet.playersBet(playersChoice, playerMoney.getPlayerMoney(), betMoney.getMoney(), betMoney.getexBetted());
					//플레이어의 다이 판단.
					if(playerBettedMoney == 0) {
						playerMoney.setIsdie(1);
						continue;
					}else if(playerBettedMoney == betMoney.getexBetted()) {
						betMoney.setexBetted(playerBettedMoney);//베팅한돈 저장
						playerMoney.losePlayerMoney(playerBettedMoney);//배팅된 돈 제외
						playerMoney.setIsCalled(1);
						
					}else {
						betMoney.setexBetted(playerBettedMoney);//베팅한돈 저장
						playerMoney.losePlayerMoney(playerBettedMoney);//배팅된 돈 제외
						playerMoney.setIsCalled(0);
					}
					//둘다 콜했는지 판단.
					if(playerMoney.getIsCalled() == 1 && ComMoney.getIsCalled() == 1) {
						continue;
					}
					int CPUbettedMoney = CPUBet.CPUplay(ComMoney.getCPUMoney(), betMoney.getCycle(), comScorePrize, betMoney.getexBetted(), betMoney.getMoney(), betMoney.getplayerHis());
					if(CPUbettedMoney == 0) {
						ComMoney.setIsdie(1);
						continue;
					}else if(CPUbettedMoney == betMoney.getexBetted()) {//콜인지 판단.
						betMoney.setexBetted(CPUbettedMoney);//전에 배팅한 돈 저장
						ComMoney.loseCPUMoney(CPUbettedMoney);//배팅을 했으니 그 돈을 자산에서 제외
						ComMoney.setIsCalled(1);
					}else {
						betMoney.setexBetted(CPUbettedMoney);//전에 배팅한 돈 저장
						ComMoney.loseCPUMoney(CPUbettedMoney);//배팅을 했으니 그 돈을 자산에서 제외
						ComMoney.setIsCalled(0);
					}
				}
				
				betMoney.addCycle();
			}
			//다이했을때, 판돈을 가져가는 코드.
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
