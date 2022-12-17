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
      
      ComMoney.setCPUMoney();
      playerMoney.setPlayerMoney(); 
      
      //둘 중 하나가 파산하면 끝.
      while(ComMoney.getCPUMoney() != 0 && playerMoney.getPlayerMoney() != 0) {
         final int cardSize = 2;
         int[] user = new int[cardSize];
         int[] com = new int[cardSize];
         int[] shuffleDeck = Card.card;
         Shuffle.cardShuffle(shuffleDeck); // 카드 셔플
         CardDivision.Div(shuffleDeck, user, com); //카드 분배
         String userScore = cardScore.Score(user); // 플레이어 카드 족보 확인
         String comScore = cardScore.Score(com); //컴퓨터 카드 족보 확인
         int userScorePrize = cardScore.scorePrize(userScore); // 플레이어 점수 값
         int comScorePrize = cardScore.scorePrize(comScore); //컴퓨터 점수 값
         int gameResult = winner.result(userScorePrize,comScorePrize); // 게임 결과
         System.out.println("Player 카드 패 " + Arrays.toString(user));
         System.out.println("Computer 카드 패 " + Arrays.toString(com));
         System.out.println("Player 족보 " + userScore);
         System.out.println("Computer 족보" + comScore);
         System.out.println("Player 패 점수 " + userScorePrize);
         System.out.println("Computer 패 점수 " + comScorePrize);
         System.out.println("결과는 " + gameResult);
         System.out.println("플레이어의 첫번째 카드는 " + user[0]);
         
         playerMoney.losePlayerMoney(betMoney.getexBetted());
         ComMoney.loseCPUMoney(betMoney.getexBetted());
          
         //모두 배팅완료하거나 둘 중 하나가 죽으면 끝.
         while(betMoney.getCycle() < 3 && ComMoney.getIsdie() != 1 && playerMoney.getIsdie() != 1) {
            //둘 다 배팅하면 끝남.
            while( !(playerMoney.getIsCalled() == 1 && ComMoney.getIsCalled() == 1) && playerMoney.getIsdie() == 0 && ComMoney.getIsdie() == 0) {
               //전에 이긴 사람부터 배팅시작
               if(betMoney.getHis() == 0) {
                  //컴퓨터 배팅
                  int CPUbettedMoney = CPUBet.CPUplay(ComMoney.getCPUMoney(), betMoney.getCycle(), comScorePrize, betMoney.getexBetted(), betMoney.getMoney(), betMoney.getplayerHis());
                  //컴퓨터가 죽었는지 판단.
                  System.out.println("컴퓨터의 선택"+CPUBet.getchoice());
                  if(CPUbettedMoney == 0) {
                     ComMoney.setIsdie(1);
                     continue;
                  }else if(CPUbettedMoney == betMoney.getexBetted()) {//콜인지 판단.
                     betMoney.setexBetted(CPUbettedMoney);//전에 배팅한 돈 저장
                     ComMoney.loseCPUMoney(CPUbettedMoney);//배팅을 했으니 그 돈을 자산에서 제외
                     betMoney.addMoney(CPUbettedMoney);
                     ComMoney.setIsCalled(1);
                  }else {
                     betMoney.setexBetted(CPUbettedMoney);//전에 배팅한 돈 저장
                     ComMoney.loseCPUMoney(CPUbettedMoney);//배팅을 했으니 그 돈을 자산에서 제외
                     betMoney.addMoney(CPUbettedMoney);
                     ComMoney.setIsCalled(0);
                  }
                  betMoney.setHistory(1);
                  		//둘다 콜했는지 판단.
                  if(playerMoney.getIsCalled() == 1 && ComMoney.getIsCalled() == 1) {
                      continue;
                   }
               }
               System.out.println("배팅하세요. 1: 다이, 2: 콜, 3:하프");
               int playersChoice = scan.nextInt();//플레이어의 행동
               //플레이어 배팅.
               
               int playerBettedMoney = playerBet.playersBet(playersChoice, playerMoney.getPlayerMoney(), betMoney.getMoney(), betMoney.getexBetted());
               //플레이어의 다이 판단.
               System.out.println("플레이어의 선택" + playersChoice);
               if(playerBettedMoney == 0) {
                  playerMoney.setIsdie(1);
                  continue;
               }else if(playerBettedMoney == betMoney.getexBetted()) {
                  betMoney.setexBetted(playerBettedMoney);//베팅한돈 저장
                  playerMoney.losePlayerMoney(playerBettedMoney);//배팅된 돈 제외
                  betMoney.addMoney(playerBettedMoney);
                  playerMoney.setIsCalled(1);
                  
               }else if(playerBettedMoney > betMoney.getexBetted()) {
                  betMoney.setexBetted(playerBettedMoney);//베팅한돈 저장
                  playerMoney.losePlayerMoney(playerBettedMoney);//배팅된 돈 제외
                  betMoney.addMoney(playerBettedMoney);
                  playerMoney.setIsCalled(0);
               }
               
               //플레이어가 돈이 없으면 콜로 변환.
               if(playerMoney.getPlayerMoney() == 0) {
                  playerMoney.setIsCalled(1);
               }
               //둘다 콜했는지 판단.
               if(playerMoney.getIsCalled() == 1 && ComMoney.getIsCalled() == 1) {
                  continue;
               }
               int CPUbettedMoney = CPUBet.CPUplay(ComMoney.getCPUMoney(), betMoney.getCycle(), comScorePrize, betMoney.getexBetted(), betMoney.getMoney(), betMoney.getplayerHis());

               System.out.println("컴퓨터의 선택"+CPUBet.getchoice());
               if(CPUbettedMoney == 0) {
                  ComMoney.setIsdie(1);
                  continue;
               }else if(CPUbettedMoney == betMoney.getexBetted()) {//콜인지 판단.
                  betMoney.setexBetted(CPUbettedMoney);//전에 배팅한 돈 저장
                  ComMoney.loseCPUMoney(CPUbettedMoney);//배팅을 했으니 그 돈을 자산에서 제외
                  betMoney.addMoney(CPUbettedMoney);
                  ComMoney.setIsCalled(1);
               }else {
                  betMoney.setexBetted(CPUbettedMoney);//전에 배팅한 돈 저장
                  ComMoney.loseCPUMoney(CPUbettedMoney);//배팅을 했으니 그 돈을 자산에서 제외
                  betMoney.addMoney(CPUbettedMoney);
                  ComMoney.setIsCalled(0);
               }
               if(ComMoney.getCPUMoney()==0) {
                  ComMoney.setIsCalled(1);
               }//둘다 콜했는지 판단.
               if(playerMoney.getIsCalled() == 1 && ComMoney.getIsCalled() == 1) {
                   continue;
                }
               System.out.println("플레이어 돈 "+playerMoney.getPlayerMoney());
               System.out.println("컴퓨터 돈" +ComMoney.getCPUMoney());
               System.out.println("베팅 머니"+betMoney.getMoney());

            }
            if(playerMoney.getIsdie() == 1 || ComMoney.getIsdie() == 1) {
               continue;
            }else {	
	            betMoney.addCycle();
	            ComMoney.resetPoint();
	            playerMoney.resetPoint();	
	            System.out.println("플레이어는 "+user[0] + user[1]);
	            
            }
         }     
         //다이했을때, 판돈을 가져가는 코드.
         if(ComMoney.getIsdie() == 1) {
            System.out.println(gameResult);
            playerMoney.gainPlayerMoney(betMoney.getMoney());
            betMoney.setHistory(1);        
            betMoney.setrematchp();
         }else if(playerMoney.getIsdie() == 1) {
             System.out.println("컴퓨터 승");
             ComMoney.gainCPUMoney(betMoney.getMoney());
             betMoney.setHistory(0);        
             betMoney.setrematchC();       
             
         }else if(gameResult==3) {
        	 System.out.println("무승부 재경기");
             betMoney.setHistory(1);
             continue;
         }else if(gameResult==4) {
        	 System.out.println("구사 재경기");
        	 continue;        	 
         }else if(gameResult==5) {
        	 System.out.println("멍구사 재경기");
        	 continue;    
         }else if(gameResult==6) {
        	 System.out.println("암행어사");
        	 continue;    
        	 
         }
         else if(gameResult==2) {
            System.out.println("플레이어 승");
            playerMoney.gainPlayerMoney(betMoney.getMoney());
            betMoney.setHistory(1);        
            betMoney.setrematchp();
         }else if(gameResult==1) {
            System.out.println("컴퓨터 승");
             ComMoney.gainCPUMoney(betMoney.getMoney());
             betMoney.setHistory(0);        
             betMoney.setrematchC();
         }
         
         System.out.println("최종 플레이어 돈 "+playerMoney.getPlayerMoney());
         System.out.println("최종 컴퓨터 돈" +ComMoney.getCPUMoney());
         System.out.println(playerMoney.getPlayerMoney()+ComMoney.getCPUMoney());
         
         ComMoney.resetPoint();
         playerMoney.resetPoint();
         betMoney.resetPoint();
         
         
      }
      System.out.println("게임이 끝났습니다.");
      scan.close();
   }
}