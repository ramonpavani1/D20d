package D20d;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.UIManager;

public class Rolagem {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Rolagem window = new Rolagem();
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
	public Rolagem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(UIManager.getColor("Table.gridColor"));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ramon\\eclipse-workspace\\D20d\\Imagens\\d20.png"));
		frame.setResizable(false);
		frame.setBounds(100, 100, 508, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setIcon(new ImageIcon("C:\\Users\\ramon\\eclipse-workspace\\D20d\\Imagens\\d20.png"));
		lblNewLabel_5_1.setBounds(202, 77, 163, 77);
		frame.getContentPane().add(lblNewLabel_5_1);
		
		textField = new JTextField();
		textField.setBounds(29, 177, 46, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(126, 177, 46, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(222, 177, 46, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(315, 177, 46, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(411, 177, 46, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnNewButton = new JButton("Rolar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num = 0;
				Random gradle = new Random ();
				num = gradle.nextInt(100)+1;
				textField.setText(Integer.toString(num));
				
			}
		});
		btnNewButton.setBounds(10, 210, 86, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Rolar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num_1 = 0;
				Random gradle = new Random ();
				num_1 = gradle.nextInt(20)+1;
				textField_1.setText(Integer.toString(num_1));
			}
		});
		btnNewButton_1.setBounds(106, 210, 86, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Rolar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num_2 = 0;
				Random gradle = new Random ();
				num_2 = gradle.nextInt(12)+1;
				textField_2.setText(Integer.toString(num_2));
			}
		});
		btnNewButton_2.setBounds(202, 210, 86, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Rolar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num_3 = 0;
				Random gradle = new Random ();
				num_3 = gradle.nextInt(10)+1;
				textField_3.setText(Integer.toString(num_3));
			}
		});
		btnNewButton_3.setBounds(298, 210, 86, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Rolar");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num_4 = 0;
				Random gradle = new Random ();
				num_4 = gradle.nextInt(6)+1;
				textField_4.setText(Integer.toString(num_4));
			}
		});
		btnNewButton_4.setBounds(394, 210, 88, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("D100");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(29, 152, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("D20");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(126, 152, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("D12");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(222, 152, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("D10");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(315, 152, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("D6");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(411, 152, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Dice Companion");
		lblNewJgoodiesTitle.setFont(new Font("Old English Text MT", Font.BOLD, 26));
		lblNewJgoodiesTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewJgoodiesTitle.setBounds(150, 11, 188, 33);
		frame.getContentPane().add(lblNewJgoodiesTitle);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\ramon\\eclipse-workspace\\D20d\\Imagens\\d20.png"));
		lblNewLabel_5.setBounds(106, 77, 163, 77);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.setIcon(new ImageIcon("C:\\Users\\ramon\\eclipse-workspace\\D20d\\Imagens\\d20.png"));
		lblNewLabel_5_1_1.setBounds(10, 77, 163, 77);
		frame.getContentPane().add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_1_2 = new JLabel("");
		lblNewLabel_5_1_2.setIcon(new ImageIcon("C:\\Users\\ramon\\eclipse-workspace\\D20d\\Imagens\\d20.png"));
		lblNewLabel_5_1_2.setBounds(298, 77, 163, 77);
		frame.getContentPane().add(lblNewLabel_5_1_2);
		
		JLabel lblNewLabel_5_1_3 = new JLabel("");
		lblNewLabel_5_1_3.setIcon(new ImageIcon("C:\\Users\\ramon\\eclipse-workspace\\D20d\\Imagens\\d20.png"));
		lblNewLabel_5_1_3.setBounds(396, 77, 163, 77);
		frame.getContentPane().add(lblNewLabel_5_1_3);
	}
}
