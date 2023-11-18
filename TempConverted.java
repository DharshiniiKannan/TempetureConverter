package dproject;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;

public class TempConverted  {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TempConverted window = new TempConverted();
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
	public TempConverted() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Temperature Convertor");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Segoe Print", Font.PLAIN, 30));
		lblNewLabel.setBounds(33, 11, 391, 38);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Select Temperature Type");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(23, 76, 164, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"select", "Degree Celsisus", "Fahrenheit"}));
		comboBox.setBounds(187, 81, 143, 22);
		frame.getContentPane().add(comboBox);;
		
		JLabel lblNewLabel_2 = new JLabel("Selected Temperature is");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(23, 120, 143, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setForeground(new Color(128, 128, 128));
		textField.setBounds(187, 121, 143, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Your Temperature");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(23, 162, 143, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(187, 160, 143, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Result");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(99, 195, 67, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed1(ActionEvent arg0) {
			try {
				Double a=Double.parseDouble(textField_1.getText());
				if(textField.getText().equals("Degree Celsius")) {
					double x=(9*a)/5+32;
					textField_2.setText(x+"F");
				}
				else {
					double Result=(a-32)/9*5;
					textField_2.setText(Result+"C");
				}
			}catch(Exception e){
				JOptionPane.showMessageDialog(frame, "Please enter a valid number");
			}
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Double a=Double.parseDouble(textField_1.getText());
			double Result=(a-32)/9*5;
			textField_2.setText(Result+"C");
		}
		}
		   );
		btnNewButton_1.setBounds(340, 159, 67, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(187, 196, 143, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Go");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s=""+comboBox.getItemAt(comboBox.getSelectedIndex());
				textField.setText(s);
			}
		});
		btnNewButton.setBounds(340, 81, 58, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
