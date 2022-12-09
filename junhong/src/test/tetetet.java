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
		betMoneyNumber.setFont(new Font("����", Font.PLAIN, 22));
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
			         userCardNumber.setText(Integer.toString(user[0]));
			         userCardValue.setText(userScore);
			         comCardNumber.setText(Integer.toString(com[0]));
			         comCardValue.setText(comScore);
			         //��� ���ÿϷ��ϰų� �� �� �ϳ��� ������ ��.
			         while(betMoney.getCycle() < 3 && ComMoney.getIsdie() != 1 && playerMoney.getIsdie() != 1) {
			            //�� �� �����ϸ� ����.
			            while(playerMoney.getIsCalled() != 1 && ComMoney.getIsCalled() != 1) {
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
			                     betMoney.addMoney(CPUbettedMoney);
			                     ComMoney.setIsCalled(1);
			                     
			                  }else {
			                     betMoney.setexBetted(CPUbettedMoney);//���� ������ �� ����
			                     ComMoney.loseCPUMoney(CPUbettedMoney);//������ ������ �� ���� �ڻ꿡�� ����
			                     betMoney.addMoney(CPUbettedMoney);
			                     ComMoney.setIsCalled(0);
			                  }
			                  betMoney.setHistory(1);
			                  if(CPUBet.getchoice() == 1) {  //��ǻ�͹��� ǥ�� ���̾�α�
				            	   JOptionPane.showMessageDialog(null, "��ǻ�͹��� ����");
				               }else if(CPUBet.getchoice() == 2) {
				            	   JOptionPane.showMessageDialog(null, "��ǻ�͹��� ��");
				               }else if(CPUBet.getchoice() == 3) {
				            	   JOptionPane.showMessageDialog(null, "��ǻ�͹��� ����");
				               }
			               }
			             
			               String[] buttons = { "����", "��", "����"};
			       		   int ChoiceNum = JOptionPane.showOptionDialog(null, "���� ����", "���� ǥ�����Դϴ�.", JOptionPane.YES_NO_CANCEL_OPTION,
			       				JOptionPane.QUESTION_MESSAGE, null, buttons, "�ұ���"); //���̾�α�
			               //�÷��̾� ����.
				           int  playersChoice = ChoiceNum + 1;
				              
				           if (playersChoice == 0) {
				            	break;
				           }
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
			                  
			               }else {
			                  betMoney.setexBetted(playerBettedMoney);//�����ѵ� ����
			                  playerMoney.losePlayerMoney(playerBettedMoney);//���õ� �� ����
			                  betMoney.addMoney(playerBettedMoney);
			                  playerMoney.setIsCalled(0);
			               }
			               if(playerMoney.getPlayerMoney() == 0) {
			                  playerMoney.setIsCalled(1);
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
			               }
			               System.out.println("�÷��̾� �� "+playerMoney.getPlayerMoney());
			               System.out.println("��ǻ�� ��" +ComMoney.getCPUMoney());
			               System.out.println("���� �Ӵ�"+betMoney.getMoney());
			               System.out.println("��ǻ���� ����"+CPUBet.getchoice());
			               
			               userMoney.setText(Integer.toString(playerMoney.getPlayerMoney()));
			               comMoney.setText(Integer.toString(ComMoney.getCPUMoney()));
			               betMoneyNumber.setText("�ǵ� : "+Integer.toString(betMoney.getMoney()));
			               if(CPUBet.getchoice() == 1) {  //��ǻ�͹��� ǥ�� ���̾�α�
			            	   JOptionPane.showMessageDialog(null, "��ǻ�͹��� ����");
			               }else if(CPUBet.getchoice() == 2) {
			            	   JOptionPane.showMessageDialog(null, "��ǻ�͹��� ��");
			               }else if(CPUBet.getchoice() == 3) {
			            	   JOptionPane.showMessageDialog(null, "��ǻ�͹��� ����");
			               }
			               

			            }
			            if(playerMoney.getIsdie() == 1 || ComMoney.getIsdie() == 1) {
			               continue;
			            }
			            betMoney.addCycle();
			            ComMoney.resetPoint();
			            playerMoney.resetPoint();
			         }     
			         //����������, �ǵ��� �������� �ڵ�.
			         System.out.println("�÷��̾�� "+user[0] + user[1]);
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
			      
			   }
			
		}
	
		);
		
}
}
