package test;

import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import CPUai.CPUbet;
import Data.BettingMoney;
import Data.CPUstate;
import Data.PlayerMoney;
import play.playersBetting;
import seotda.Card;
import seotda.CardDivision;
import seotda.Shuffle;
import seotda.cardScore;
import seotda.winner;

import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Font;

public class tetetet {
	public static int betBtn;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tetetet window = new tetetet();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tetetet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void paint(Graphics g) {
		g.drawString("Score", 30,80);
	}
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 828, 652);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		PlayerMoney playerMoney = new PlayerMoney();
	      playersBetting playerBet = new playersBetting();
	      CPUstate ComMoney = new CPUstate();
	      BettingMoney betMoney = new BettingMoney();
	      CPUbet CPUBet = new CPUbet();
	      Scanner scan = new Scanner(System.in);
	      
	      ComMoney.setCPUMoney();
	      playerMoney.setPlayerMoney(); 
	
		JButton startBtn = new JButton("\uAC8C\uC784\uC2DC\uC791");
		
		startBtn.setBounds(12, 243, 133, 55);
		frame.getContentPane().add(startBtn);
		
		JLabel lblNewLabel = new JLabel("\uD50C\uB808\uC774\uC5B4 \uD328");
		lblNewLabel.setBounds(194, 419, 97, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel userCardNumber = new JLabel("");
		userCardNumber.setBounds(303, 412, 141, 45);
		frame.getContentPane().add(userCardNumber);
		
		JLabel userCardValue = new JLabel("");
		userCardValue.setBounds(460, 411, 141, 45);
		frame.getContentPane().add(userCardValue);
		
		JLabel lblNewLabel_1 = new JLabel("\uCEF4\uD4E8\uD130 \uD328");
		lblNewLabel_1.setBounds(194, 96, 97, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel comCardNumber = new JLabel("");
		comCardNumber.setBounds(286, 88, 141, 45);
		frame.getContentPane().add(comCardNumber);
		
		JLabel comCardValue = new JLabel("");
		comCardValue.setBounds(446, 88, 141, 45);
		frame.getContentPane().add(comCardValue);
		
		JLabel betMoneyNumber = new JLabel("");
		betMoneyNumber.setFont(new Font("굴림", Font.PLAIN, 22));
		betMoneyNumber.setBounds(265, 243, 351, 55);
		frame.getContentPane().add(betMoneyNumber);
		
		JLabel userMoney = new JLabel("");
		userMoney.setBounds(194, 362, 192, 40);
		frame.getContentPane().add(userMoney);
		
		JLabel comMoney = new JLabel("");
		comMoney.setBounds(194, 147, 192, 40);
		frame.getContentPane().add(comMoney);
		
		JLabel comBet = new JLabel("");
		comBet.setBounds(31, 10, 141, 55);
		frame.getContentPane().add(comBet);
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  
			      
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
			         userCardNumber.setText(Integer.toString(user[0]));
			         userCardValue.setText(userScore);
			         comCardNumber.setText(Integer.toString(com[0]));
			         comCardValue.setText(comScore);
			         //모두 배팅완료하거나 둘 중 하나가 죽으면 끝.
			         while(betMoney.getCycle() < 3 && ComMoney.getIsdie() != 1 && playerMoney.getIsdie() != 1) {
			            //둘 다 배팅하면 끝남.
			            while(playerMoney.getIsCalled() != 1 && ComMoney.getIsCalled() != 1) {
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
			                     betMoney.addMoney(CPUbettedMoney);
			                     ComMoney.setIsCalled(1);
			                     
			                  }else {
			                     betMoney.setexBetted(CPUbettedMoney);//전에 배팅한 돈 저장
			                     ComMoney.loseCPUMoney(CPUbettedMoney);//배팅을 했으니 그 돈을 자산에서 제외
			                     betMoney.addMoney(CPUbettedMoney);
			                     ComMoney.setIsCalled(0);
			                  }
			                  betMoney.setHistory(1);
			                  if(CPUBet.getchoice() == 1) {  //컴퓨터배팅 표시 다이얼로그
				            	   JOptionPane.showMessageDialog(null, "컴퓨터배팅 다이");
				               }else if(CPUBet.getchoice() == 2) {
				            	   JOptionPane.showMessageDialog(null, "컴퓨터배팅 콜");
				               }else if(CPUBet.getchoice() == 3) {
				            	   JOptionPane.showMessageDialog(null, "컴퓨터배팅 하프");
				               }
			               }
			             
			               String[] buttons = { "다이", "콜", "하프"};
			       		   int ChoiceNum = JOptionPane.showOptionDialog(null, "베팅 선택", "제목 표시줄입니다.", JOptionPane.YES_NO_CANCEL_OPTION,
			       				JOptionPane.QUESTION_MESSAGE, null, buttons, "쌀국수"); //다이얼로그
			               //플레이어 배팅.
				           int  playersChoice = ChoiceNum + 1;
				              
				           if (playersChoice == 0) {
				            	break;
				           }
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
			                  
			               }else {
			                  betMoney.setexBetted(playerBettedMoney);//베팅한돈 저장
			                  playerMoney.losePlayerMoney(playerBettedMoney);//배팅된 돈 제외
			                  betMoney.addMoney(playerBettedMoney);
			                  playerMoney.setIsCalled(0);
			               }
			               if(playerMoney.getPlayerMoney() == 0) {
			                  playerMoney.setIsCalled(1);
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
			               }
			               System.out.println("플레이어 돈 "+playerMoney.getPlayerMoney());
			               System.out.println("컴퓨터 돈" +ComMoney.getCPUMoney());
			               System.out.println("베팅 머니"+betMoney.getMoney());
			               System.out.println("컴퓨터의 선택"+CPUBet.getchoice());
			               
			               userMoney.setText(Integer.toString(playerMoney.getPlayerMoney()));
			               comMoney.setText(Integer.toString(ComMoney.getCPUMoney()));
			               betMoneyNumber.setText("판돈 : "+Integer.toString(betMoney.getMoney()));
			               if(CPUBet.getchoice() == 1) {  //컴퓨터배팅 표시 다이얼로그
			            	   JOptionPane.showMessageDialog(null, "컴퓨터배팅 다이");
			               }else if(CPUBet.getchoice() == 2) {
			            	   JOptionPane.showMessageDialog(null, "컴퓨터배팅 콜");
			               }else if(CPUBet.getchoice() == 3) {
			            	   JOptionPane.showMessageDialog(null, "컴퓨터배팅 하프");
			               }
			               

			            }
			            if(playerMoney.getIsdie() == 1 || ComMoney.getIsdie() == 1) {
			               continue;
			            }
			            betMoney.addCycle();
			            ComMoney.resetPoint();
			            playerMoney.resetPoint();
			         }     
			         //다이했을때, 판돈을 가져가는 코드.
			         System.out.println("플레이어는 "+user[0] + user[1]);
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
			      
			   }
			
		}
	
		);
		
}
}
