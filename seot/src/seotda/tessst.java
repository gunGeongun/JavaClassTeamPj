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
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class tessst {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tessst window = new tessst();
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
	public tessst() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 0));
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon(tessst.class.getResource("/seotda/images.jpg")));
		btnNewButton.setBounds(112, 442, 111, 118);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon(tessst.class.getResource("/seotda/images.jpg")));
		btnNewButton_1.setBounds(112, 10, 111, 107);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\uCF5C");
		btnNewButton_2.setBounds(247, 539, 97, 37);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("\uD558\uD504");
		btnNewButton_2_1.setBounds(374, 539, 97, 37);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_2 = new JButton("\uB2E4\uC774");
		btnNewButton_2_2.setBounds(506, 539, 97, 37);
		frame.getContentPane().add(btnNewButton_2_2);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(tessst.class.getResource("/seotda/1.jpg")));
		lblNewLabel.setBounds(686, 406, 146, 190);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(tessst.class.getResource("/seotda/10.jpg")));
		lblNewLabel_1.setBounds(844, 406, 146, 190);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\uC0C1\uB300");
		lblNewLabel_2.setFont(new Font("±º∏≤", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(263, 10, 78, 37);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(334, 14, 216, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uD50C\uB808\uC774\uC5B4");
		lblNewLabel_3.setFont(new Font("±º∏≤", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(247, 469, 56, 29);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(334, 469, 216, 29);
		frame.getContentPane().add(textField_1);
		
		JButton btnNewButton_3 = new JButton("\uCD1D \uBCA0\uD305 \uAE08\uC561");
		btnNewButton_3.setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 18));
		btnNewButton_3.setForeground(new Color(0, 0, 0));
		btnNewButton_3.setBackground(new Color(0, 128, 0));
		btnNewButton_3.setBounds(360, 227, 190, 43);
		frame.getContentPane().add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("      1000000");
		lblNewLabel_4.setFont(new Font("»ﬁ∏’µ’±Ÿ«ÏµÂ∂Û¿Œ", Font.PLAIN, 40));
		lblNewLabel_4.setBounds(234, 263, 390, 118);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(tessst.class.getResource("/seotda/12.jpg")));
		lblNewLabel_5.setBounds(686, 10, 146, 190);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("New label");
		lblNewLabel_5_1.setIcon(new ImageIcon(tessst.class.getResource("/seotda/17.jpg")));
		lblNewLabel_5_1.setBounds(844, 10, 146, 190);
		frame.getContentPane().add(lblNewLabel_5_1);
		frame.setBounds(100, 100, 1048, 661);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
