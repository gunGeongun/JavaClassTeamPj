package seotda;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import CPUai.CPUbet;
import Data.BettingMoney;
import Data.CPUstate;
import Data.PlayerMoney;
import play.playersBetting;
import test.*;
public class tessst {
	public static int betBtn;

	private JFrame frmTwocardgame;
	private JTextField jokText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tessst window = new tessst();
					window.frmTwocardgame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public tessst() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTwocardgame = new JFrame();
		frmTwocardgame.setTitle("TwoCardGame");
		frmTwocardgame.setSize(591,442);
		frmTwocardgame.getContentPane().setBackground(new Color(0, 128, 0));
		frmTwocardgame.getContentPane().setLayout(null);
		JButton callBtn = new JButton("\uCF5C");
		
		
		
		
		callBtn.setBounds(247, 539, 97, 37);
		frmTwocardgame.getContentPane().add(callBtn);
		
		JButton halfBtn = new JButton("하프");
		halfBtn.setBounds(374, 539, 97, 37);
		frmTwocardgame.getContentPane().add(halfBtn);
		
		JButton dieBtn = new JButton("다이");
		dieBtn.setBounds(506, 539, 97, 37);
		frmTwocardgame.getContentPane().add(dieBtn);
		
		JLabel userCard1 = new JLabel("New label");
		userCard1.setIcon(new ImageIcon(tessst.class.getResource("/seotda/1.jpg")));
		userCard1.setBounds(686, 406, 146, 190);
		frmTwocardgame.getContentPane().add(userCard1);
		
		JLabel userCard2 = new JLabel("New label");
		userCard2.setIcon(new ImageIcon(tessst.class.getResource("/seotda/10.jpg")));
		userCard2.setBounds(844, 406, 146, 190);
		userCard2.setVisible(false);
		frmTwocardgame.getContentPane().add(userCard2);
		
		JLabel lblNewLabel_2 = new JLabel("COM");
		lblNewLabel_2.setFont(new Font("휴먼고딕", Font.BOLD, 20));
		lblNewLabel_2.setBounds(266, 76, 78, 37);
		frmTwocardgame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("\uD50C\uB808\uC774\uC5B4");
		lblNewLabel_3.setFont(new Font("휴먼고딕", Font.BOLD, 20));
		lblNewLabel_3.setBounds(266, 479, 97, 29);
		frmTwocardgame.getContentPane().add(lblNewLabel_3);
		
		JButton btnNewButton_3 = new JButton("\uCD1D \uBCA0\uD305 \uAE08\uC561");
		btnNewButton_3.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 18));
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setBackground(new Color(0, 128, 0));
		btnNewButton_3.setBounds(360, 227, 190, 43);
		frmTwocardgame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("      1000000");
		lblNewLabel_4.setFont(new Font("휴먼둥근헤드라인", Font.PLAIN, 40));
		lblNewLabel_4.setBounds(234, 263, 390, 118);
		frmTwocardgame.getContentPane().add(lblNewLabel_4);
		
		ImageIcon icon =new ImageIcon(tessst.class.getResource("/seotda/12.jpg"));
		JLabel comCard1 = new JLabel("New label");
		comCard1.setIcon(icon);
		comCard1.setBounds(686, 10, 146, 190);
		frmTwocardgame.getContentPane().add(comCard1);
		
		JLabel comCard2 = new JLabel("New label");
		comCard2.setIcon(new ImageIcon(tessst.class.getResource("/seotda/17.jpg")));
		comCard2.setBounds(844, 10, 146, 190);
		comCard2.setVisible(false);
		frmTwocardgame.getContentPane().add(comCard2);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon(tessst.class.getResource("/seotda/images.jpg")));
		lblNewLabel_6.setBounds(102, 437, 133, 127);
		frmTwocardgame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("New label");
		lblNewLabel_6_1.setIcon(new ImageIcon(tessst.class.getResource("/seotda/images.jpg")));
		lblNewLabel_6_1.setBounds(102, 42, 133, 127);
		frmTwocardgame.getContentPane().add(lblNewLabel_6_1);
		
		JButton btnNewButton = new JButton("족보");
		
		btnNewButton.setBounds(47, 215, 97, 23);
		frmTwocardgame.getContentPane().add(btnNewButton);
		
		
		jokText = new JTextField();
		jokText.setText("족보");
		
		jokText.setVisible(false);
		jokText.setBounds(12, 240, 169, 181);
		frmTwocardgame.getContentPane().add(jokText);
		jokText.setColumns(10);
		
		JLabel userCardValue = new JLabel("");
		userCardValue.setFont(new Font("휴먼고딕", Font.BOLD, 17));
		userCardValue.setBounds(801, 366, 169, 30);
		frmTwocardgame.getContentPane().add(userCardValue);
		
		JLabel lblNewLabel_1 = new JLabel("100000");
		lblNewLabel_1.setFont(new Font("휴먼고딕", Font.BOLD, 30));
		lblNewLabel_1.setBounds(356, 474, 216, 40);
		frmTwocardgame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("100000");
		lblNewLabel_1_1.setFont(new Font("휴먼고딕", Font.BOLD, 30));
		lblNewLabel_1_1.setBounds(352, 70, 216, 40);
		frmTwocardgame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel comCardValue = new JLabel("");
		comCardValue.setFont(new Font("함초롬바탕", Font.PLAIN, 17));
		comCardValue.setBounds(801, 210, 169, 30);
		frmTwocardgame.getContentPane().add(comCardValue);
		frmTwocardgame.setBounds(100, 100, 1048, 661);
		frmTwocardgame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
		btnNewButton.addActionListener(new ActionListener() {
			boolean testing = false;
			
			public void actionPerformed(ActionEvent e) {
				
				
				if(testing == false) {
					testing = true;
				}
				else {
					testing = false;
					
				}
				jokText.setVisible(testing);
				
			}
		});
	
		PlayerMoney playerMoney = new PlayerMoney();
	      playersBetting playerBet = new playersBetting();
	      CPUstate ComMoney = new CPUstate();
	      BettingMoney betMoney = new BettingMoney();
	      CPUbet CPUBet = new CPUbet();
	      Scanner scan = new Scanner(System.in);
	      
	      ComMoney.setCPUMoney();
	      playerMoney.setPlayerMoney();
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
	    	  String gameResult = winner.result(userScorePrize,comScorePrize); // 게임 결과
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
	               }
	               System.out.println("배팅하세요. 1: 다이, 2: 콜, 3:하프");
	               
	               callBtn.addActionListener(new ActionListener() {
	            	   
	       			public void actionPerformed(ActionEvent e) {
	       				betBtn = 2;
	       			}
	       		});

				int playerBettedMoney = playerBet.playersBet(betBtn, playerMoney.getPlayerMoney(), betMoney.getMoney(), betMoney.getexBetted());
	               //플레이어 배팅.
	               
	               //플레이어의 다이 판단.
	               
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
	               System.out.println("플레이어 돈 "+playerMoney.getPlayerMoney());
	               System.out.println("컴퓨터 돈" +ComMoney.getCPUMoney());
	               System.out.println("컴퓨터의 선택"+CPUBet.getchoice());
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
	            System.out.println("플레이어 승");
	            playerMoney.gainPlayerMoney(betMoney.getMoney());
	            betMoney.setHistory(1);            
	         }else if(playerMoney.getIsdie() == 1) {
	             System.out.println("컴퓨터 승");
	             ComMoney.gainCPUMoney(betMoney.getMoney());
	             betMoney.setHistory(0);
	         }else if(userScorePrize < comScorePrize) {
	        	 System.out.println("플레이어 승");
	             playerMoney.gainPlayerMoney(betMoney.getMoney());
	             betMoney.setHistory(1);
	         }else if(userScorePrize > comScorePrize) {
	        	 System.out.println("컴퓨터 승");
	             ComMoney.gainCPUMoney(betMoney.getMoney());
	             betMoney.setHistory(0);
	         }
	         else {
	        	 System.out.println("컴퓨터 승");
	             ComMoney.gainCPUMoney(betMoney.getMoney());
	             betMoney.setHistory(0);  
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