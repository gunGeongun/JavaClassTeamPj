package test;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
public class swingtest extends JFrame {
	public swingtest() {
		setTitle("°Å½Ã±â");
		setVisible(true);
		setSize(500,500);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("New button");
		
		btnNewButton.setBounds(0, 0 , 90, 90);
		btnNewButton.setLayout(null);
		add(btnNewButton);
		
		
	}
	public void paint(Graphics g) {
		g.drawString("sex",250,250);
	}
	public static void main(String[] args) {
		new swingtest();

	}

}
