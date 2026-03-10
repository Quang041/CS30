import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LocalBank {

	private JFrame frame;
	private JTextField UserInput_AccountNum;
	private JTextField UserInput_Withdraw_Deposit;
	private JTextField FName;
	private JTextField LName;
	private JTextField Starting_Num;
	private JLabel guidance;
	private JLabel last_name;
	private JLabel first_balance;
	private JLabel Money_flow;
	private JLabel first_name;
	private JLabel Account_num;
	
	private Bank bank = new Bank();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBank window = new LocalBank();
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
	public LocalBank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox Options = new JComboBox();
		Options.setModel(new DefaultComboBoxModel(new String[] {"", "Create New Account", "Delete Account", "Deposit", "Withdraw"}));
		Options.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				if (Options.getSelectedItem().equals("Create New Account")) {
					first_name.setForeground(Color.RED);
					first_name.setText("First Name: *");
					last_name.setForeground(Color.RED);
					last_name.setText("Last Name: *");
					first_balance.setForeground(Color.RED);
					first_balance.setText("Beginning Balance: *");
					Account_num.setForeground(Color.BLACK);
					Account_num.setText("Account Number:");
					Money_flow.setForeground(Color.BLACK);
					Money_flow.setText("Amount of Withdraw/Deposit:");
				}
				else if (Options.getSelectedItem().equals("Delete Account")) {
					first_name.setForeground(Color.RED);
					first_name.setText("First Name: *");
					last_name.setForeground(Color.RED);
					last_name.setText("Last Name: *");
					first_balance.setForeground(Color.RED);
					first_balance.setText("Beginning Balance: *");
					Account_num.setForeground(Color.BLACK);
					Account_num.setText("Account Number: ");
					Money_flow.setForeground(Color.BLACK);
					Money_flow.setText("Amount of Withdraw/Deposit: ");
				}
				else if (Options.getSelectedItem().equals("Deposit")) {
					first_name.setForeground(Color.BLACK);
					first_name.setText("First Name:");
					last_name.setForeground(Color.BLACK);
					last_name.setText("Last Name:");
					first_balance.setForeground(Color.BLACK);
					first_balance.setText("Beginning Balance:");
					Account_num.setForeground(Color.RED);
					Account_num.setText("Account Number: *");
					Money_flow.setForeground(Color.RED);
					Money_flow.setText("Amount of Deposit: *");
					
				}
				else if (Options.getSelectedItem().equals("Withdraw")) {
					first_name.setForeground(Color.BLACK);
					first_name.setText("First Name:");
					last_name.setForeground(Color.BLACK);
					last_name.setText("Last Name:");
					first_balance.setForeground(Color.BLACK);
					first_balance.setText("Beginning Balance:");
					Account_num.setForeground(Color.RED);
					Account_num.setText("Account Number: *");
					Money_flow.setForeground(Color.RED);
					Money_flow.setText("Amount of Withdraw: *");
				}
	}
		});
		Options.setBounds(24, 48, 387, 22);
		frame.getContentPane().add(Options);
		
		
		
		/** User Input/ User interaction**/
		
		UserInput_AccountNum = new JTextField();
		UserInput_AccountNum.setBounds(24, 164, 387, 20);
		frame.getContentPane().add(UserInput_AccountNum);
		UserInput_AccountNum.setColumns(10);
		
		UserInput_Withdraw_Deposit = new JTextField();
		UserInput_Withdraw_Deposit.setColumns(10);
		UserInput_Withdraw_Deposit.setBounds(24, 206, 387, 20);
		frame.getContentPane().add(UserInput_Withdraw_Deposit);
		
		FName = new JTextField();
		FName.setColumns(10);
		FName.setBounds(24, 250, 387, 20);
		frame.getContentPane().add(FName);
		
		LName = new JTextField();
		LName.setColumns(10);
		LName.setBounds(24, 293, 387, 20);
		frame.getContentPane().add(LName);
		
		Starting_Num = new JTextField();
		Starting_Num.setColumns(10);
		Starting_Num.setBounds(24, 339, 387, 20);
		frame.getContentPane().add(Starting_Num);
		
		/** Guidance **/
		
		guidance = new JLabel("Complete the information in RED");
		guidance.setFont(new Font("Tahoma", Font.PLAIN, 16));
		guidance.setBounds(24, 112, 387, 26);
		frame.getContentPane().add(guidance);
		
		JLabel Option = new JLabel("Section an option");
		Option.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Option.setBounds(24, 23, 387, 26);
		frame.getContentPane().add(Option);
		
		last_name = new JLabel("Last Name:");
		last_name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		last_name.setBounds(24, 272, 387, 26);
		frame.getContentPane().add(last_name);
		
		first_balance = new JLabel("Beginning Balance:");
		first_balance.setFont(new Font("Tahoma", Font.PLAIN, 14));
		first_balance.setBounds(24, 318, 387, 26);
		frame.getContentPane().add(first_balance);
		
		Money_flow = new JLabel("Amount of Withdraw/Deposit:");
		Money_flow.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Money_flow.setBounds(24, 185, 387, 26);
		frame.getContentPane().add(Money_flow);
		
		first_name = new JLabel("First Name:");
		first_name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		first_name.setBounds(24, 234, 387, 16);
		frame.getContentPane().add(first_name);
		
		Account_num = new JLabel("Accound Number:");
		Account_num.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Account_num.setBounds(24, 140, 387, 31);
		frame.getContentPane().add(Account_num);
		
		JButton Check = new JButton("Process Transaction");
		Check.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Check.setBounds(19, 465, 182, 31);
		frame.getContentPane().add(Check);
		
		/** User Response **/
		
		JLabel Information = new JLabel("");
		Information.setBounds(24, 370, 387, 84);
		frame.getContentPane().add(Information);
		
	}	
}
		
