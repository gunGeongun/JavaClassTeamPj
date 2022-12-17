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
      
      //�� �� �ϳ��� �Ļ��ϸ� ��.
      while(ComMoney.getCPUMoney() != 0 && playerMoney.getPlayerMoney() != 0) {
         final int cardSize = 2;
         int[] user = new int[cardSize];
         int[] com = new int[cardSize];
         int[] shuffleDeck = Card.card;
         Shuffle.cardShuffle(shuffleDeck); // ī�� ����
         CardDivision.Div(shuffleDeck, user, com); //ī�� �й�
         String userScore = cardScore.Score(user); // �÷��̾� ī�� ���� Ȯ��
         String comScore = cardScore.Score(com); //��ǻ�� ī�� ���� Ȯ��
         int userScorePrize = cardScore.scorePrize(userScore); // �÷��̾� ���� ��
         int comScorePrize = cardScore.scorePrize(comScore); //��ǻ�� ���� ��
         int gameResult = winner.result(userScorePrize,comScorePrize); // ���� ���
         System.out.println("Player ī�� �� " + Arrays.toString(user));
         System.out.println("Computer ī�� �� " + Arrays.toString(com));
         System.out.println("Player ���� " + userScore);
         System.out.println("Computer ����" + comScore);
         System.out.println("Player �� ���� " + userScorePrize);
         System.out.println("Computer �� ���� " + comScorePrize);
         System.out.println("����� " + gameResult);
         System.out.println("�÷��̾��� ù��° ī��� " + user[0]);
         
         playerMoney.losePlayerMoney(betMoney.getexBetted());
         ComMoney.loseCPUMoney(betMoney.getexBetted());
          
         //��� ���ÿϷ��ϰų� �� �� �ϳ��� ������ ��.
         while(betMoney.getCycle() < 3 && ComMoney.getIsdie() != 1 && playerMoney.getIsdie() != 1) {
            //�� �� �����ϸ� ����.
            while( !(playerMoney.getIsCalled() == 1 && ComMoney.getIsCalled() == 1) && playerMoney.getIsdie() == 0 && ComMoney.getIsdie() == 0) {
               //���� �̱� ������� ���ý���
               if(betMoney.getHis() == 0) {
                  //��ǻ�� ����
                  int CPUbettedMoney = CPUBet.CPUplay(ComMoney.getCPUMoney(), betMoney.getCycle(), comScorePrize, betMoney.getexBetted(), betMoney.getMoney(), betMoney.getplayerHis());
                  //��ǻ�Ͱ� �׾����� �Ǵ�.
                  System.out.println("��ǻ���� ����"+CPUBet.getchoice());
                  if(CPUbettedMoney == 0) {
                     ComMoney.setIsdie(1);
                     continue;
                  }else if(CPUbettedMoney == betMoney.getexBetted()) {//������ �Ǵ�.
                     betMoney.setexBetted(CPUbettedMoney);//���� ������ �� ����
                     ComMoney.loseCPUMoney(CPUbettedMoney);//������ ������ �� ���� �ڻ꿡�� ����
                     betMoney.addMoney(CPUbettedMoney);
                     ComMoney.setIsCalled(1);
                  }else {
                     betMoney.setexBetted(CPUbettedMoney);//���� ������ �� ����
                     ComMoney.loseCPUMoney(CPUbettedMoney);//������ ������ �� ���� �ڻ꿡�� ����
                     betMoney.addMoney(CPUbettedMoney);
                     ComMoney.setIsCalled(0);
                  }
                  betMoney.setHistory(1);
                  		//�Ѵ� ���ߴ��� �Ǵ�.
                  if(playerMoney.getIsCalled() == 1 && ComMoney.getIsCalled() == 1) {
                      continue;
                   }
               }
               System.out.println("�����ϼ���. 1: ����, 2: ��, 3:����");
               int playersChoice = scan.nextInt();//�÷��̾��� �ൿ
               //�÷��̾� ����.
               
               int playerBettedMoney = playerBet.playersBet(playersChoice, playerMoney.getPlayerMoney(), betMoney.getMoney(), betMoney.getexBetted());
               //�÷��̾��� ���� �Ǵ�.
               System.out.println("�÷��̾��� ����" + playersChoice);
               if(playerBettedMoney == 0) {
                  playerMoney.setIsdie(1);
                  continue;
               }else if(playerBettedMoney == betMoney.getexBetted()) {
                  betMoney.setexBetted(playerBettedMoney);//�����ѵ� ����
                  playerMoney.losePlayerMoney(playerBettedMoney);//���õ� �� ����
                  betMoney.addMoney(playerBettedMoney);
                  playerMoney.setIsCalled(1);
                  
               }else if(playerBettedMoney > betMoney.getexBetted()) {
                  betMoney.setexBetted(playerBettedMoney);//�����ѵ� ����
                  playerMoney.losePlayerMoney(playerBettedMoney);//���õ� �� ����
                  betMoney.addMoney(playerBettedMoney);
                  playerMoney.setIsCalled(0);
               }
               
               //�÷��̾ ���� ������ �ݷ� ��ȯ.
               if(playerMoney.getPlayerMoney() == 0) {
                  playerMoney.setIsCalled(1);
               }
               //�Ѵ� ���ߴ��� �Ǵ�.
               if(playerMoney.getIsCalled() == 1 && ComMoney.getIsCalled() == 1) {
                  continue;
               }
               int CPUbettedMoney = CPUBet.CPUplay(ComMoney.getCPUMoney(), betMoney.getCycle(), comScorePrize, betMoney.getexBetted(), betMoney.getMoney(), betMoney.getplayerHis());

               System.out.println("��ǻ���� ����"+CPUBet.getchoice());
               if(CPUbettedMoney == 0) {
                  ComMoney.setIsdie(1);
                  continue;
               }else if(CPUbettedMoney == betMoney.getexBetted()) {//������ �Ǵ�.
                  betMoney.setexBetted(CPUbettedMoney);//���� ������ �� ����
                  ComMoney.loseCPUMoney(CPUbettedMoney);//������ ������ �� ���� �ڻ꿡�� ����
                  betMoney.addMoney(CPUbettedMoney);
                  ComMoney.setIsCalled(1);
               }else {
                  betMoney.setexBetted(CPUbettedMoney);//���� ������ �� ����
                  ComMoney.loseCPUMoney(CPUbettedMoney);//������ ������ �� ���� �ڻ꿡�� ����
                  betMoney.addMoney(CPUbettedMoney);
                  ComMoney.setIsCalled(0);
               }
               if(ComMoney.getCPUMoney()==0) {
                  ComMoney.setIsCalled(1);
               }//�Ѵ� ���ߴ��� �Ǵ�.
               if(playerMoney.getIsCalled() == 1 && ComMoney.getIsCalled() == 1) {
                   continue;
                }
               System.out.println("�÷��̾� �� "+playerMoney.getPlayerMoney());
               System.out.println("��ǻ�� ��" +ComMoney.getCPUMoney());
               System.out.println("���� �Ӵ�"+betMoney.getMoney());

            }
            if(playerMoney.getIsdie() == 1 || ComMoney.getIsdie() == 1) {
               continue;
            }else {	
	            betMoney.addCycle();
	            ComMoney.resetPoint();
	            playerMoney.resetPoint();	
	            System.out.println("�÷��̾�� "+user[0] + user[1]);
	            
            }
         }     
         //����������, �ǵ��� �������� �ڵ�.
         if(ComMoney.getIsdie() == 1) {
            System.out.println(gameResult);
            playerMoney.gainPlayerMoney(betMoney.getMoney());
            betMoney.setHistory(1);        
            betMoney.setrematchp();
         }else if(playerMoney.getIsdie() == 1) {
             System.out.println("��ǻ�� ��");
             ComMoney.gainCPUMoney(betMoney.getMoney());
             betMoney.setHistory(0);        
             betMoney.setrematchC();       
             
         }else if(gameResult==3) {
        	 System.out.println("���º� ����");
             betMoney.setHistory(1);
             continue;
         }else if(gameResult==4) {
        	 System.out.println("���� ����");
        	 continue;        	 
         }else if(gameResult==5) {
        	 System.out.println("�۱��� ����");
        	 continue;    
         }else if(gameResult==6) {
        	 System.out.println("������");
        	 continue;    
        	 
         }
         else if(gameResult==2) {
            System.out.println("�÷��̾� ��");
            playerMoney.gainPlayerMoney(betMoney.getMoney());
            betMoney.setHistory(1);        
            betMoney.setrematchp();
         }else if(gameResult==1) {
            System.out.println("��ǻ�� ��");
             ComMoney.gainCPUMoney(betMoney.getMoney());
             betMoney.setHistory(0);        
             betMoney.setrematchC();
         }
         
         System.out.println("���� �÷��̾� �� "+playerMoney.getPlayerMoney());
         System.out.println("���� ��ǻ�� ��" +ComMoney.getCPUMoney());
         System.out.println(playerMoney.getPlayerMoney()+ComMoney.getCPUMoney());
         
         ComMoney.resetPoint();
         playerMoney.resetPoint();
         betMoney.resetPoint();
         
         
      }
      System.out.println("������ �������ϴ�.");
      scan.close();
   }
}