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
import javax.swing.JTextArea;
public class LocalBank {
	private JFrame frame;
	private JTextField Num;
	private JTextField Input;
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
		
		
		/**
		 * User's information
		 */
		
		JTextArea Information = new JTextArea();
		Information.setLineWrap(true);
		Information.setBounds(24, 333, 387, 115);
		frame.getContentPane().add(Information);
		
		/** User Input/ User interaction**/
		
		Num = new JTextField();
		Num.setBounds(24, 139, 387, 20);
		frame.getContentPane().add(Num);
		Num.setColumns(10);
		
		Input = new JTextField();
		Input.setColumns(10);
		Input.setBounds(24, 178, 387, 20);
		frame.getContentPane().add(Input);
		
		FName = new JTextField();
		FName.setColumns(10);
		FName.setBounds(24, 216, 387, 20);
		frame.getContentPane().add(FName);
		
		LName = new JTextField();
		LName.setColumns(10);
		LName.setBounds(24, 257, 387, 20);
		frame.getContentPane().add(LName);
		
		Starting_Num = new JTextField();
		Starting_Num.setColumns(10);
		Starting_Num.setBounds(24, 298, 387, 20);
		frame.getContentPane().add(Starting_Num);
		
		/** Guidance **/
		
		guidance = new JLabel("Complete the information in RED");
		guidance.setFont(new Font("Tahoma", Font.PLAIN, 16));
		guidance.setBounds(24, 91, 387, 26);
		frame.getContentPane().add(guidance);
		
		JLabel Option = new JLabel("Section an option");
		Option.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Option.setBounds(24, 23, 387, 26);
		frame.getContentPane().add(Option);
		
		last_name = new JLabel("Last Name:");
		last_name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		last_name.setBounds(24, 232, 387, 26);
		frame.getContentPane().add(last_name);
		
		first_balance = new JLabel("Beginning Balance:");
		first_balance.setFont(new Font("Tahoma", Font.PLAIN, 14));
		first_balance.setBounds(24, 274, 387, 26);
		frame.getContentPane().add(first_balance);
		
		Money_flow = new JLabel("Amount of Withdraw/Deposit:");
		Money_flow.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Money_flow.setBounds(24, 157, 387, 26);
		frame.getContentPane().add(Money_flow);
		
		first_name = new JLabel("First Name:");
		first_name.setFont(new Font("Tahoma", Font.PLAIN, 14));
		first_name.setBounds(24, 199, 387, 16);
		frame.getContentPane().add(first_name);
		
		Account_num = new JLabel("Account Number:");
		Account_num.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Account_num.setBounds(24, 115, 387, 31);
		frame.getContentPane().add(Account_num);
		
		JComboBox Options = new JComboBox();
		Options.setModel(new DefaultComboBoxModel(new String[] {"", "Create New Account", "Delete Account", "Deposit", "Withdraw", "Check Balance"}));
		Options.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				Information.setText(" ");
				
				if (Options.getSelectedItem().equals("Create New Account")) {
					FName.setText("");
					LName.setText("");
					Starting_Num.setText("");
					
					FName.setVisible(true);
					LName.setVisible(true);
					Starting_Num.setVisible(true);
					Num.setVisible(false);
					Input.setVisible(false);
					
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
					Num.setText("");
					Input.setText("");
					
					FName.setVisible(false);
					LName.setVisible(false);
					Starting_Num.setVisible(false);
					Num.setVisible(true);
					Input.setVisible(false);
					
					first_name.setForeground(Color.BLACK);
					first_name.setText("First Name:");
					last_name.setForeground(Color.BLACK);
					last_name.setText("Last Name:");
					first_balance.setForeground(Color.BLACK);
					first_balance.setText("Beginning Balance:");
					Account_num.setForeground(Color.RED);
					Account_num.setText("Account Number: *");
					Money_flow.setForeground(Color.BLACK);
					Money_flow.setText("Amount of Withdraw/Deposit: ");
				}
				else if (Options.getSelectedItem().equals("Deposit")) {
					Num.setText("");
					Input.setText("");
					
					FName.setVisible(false);
					LName.setVisible(false);
					Starting_Num.setVisible(false);
					Num.setVisible(true);
					Input.setVisible(true);
					
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
					Num.setText("");
					Input.setText("");
					
					FName.setVisible(false);
					LName.setVisible(false);
					Starting_Num.setVisible(false);
					Num.setVisible(true);
					Input.setVisible(true);
					
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
				else if (Options.getSelectedItem().equals("Check Balance")) {
					Num.setText("");
					Input.setText("");
					
					FName.setVisible(false);
					LName.setVisible(false);
					Starting_Num.setVisible(false);
					Num.setVisible(true);
					Input.setVisible(false);
					
					first_name.setForeground(Color.BLACK);
					first_name.setText("First Name:");
					last_name.setForeground(Color.BLACK);
					last_name.setText("Last Name:");
					first_balance.setForeground(Color.BLACK);
					first_balance.setText("Beginning Balance:");
					Account_num.setForeground(Color.RED);
					Account_num.setText("Account Number: *");
					Money_flow.setForeground(Color.BLACK);
					Money_flow.setText("Amount of Withdraw:");
				}
	}
		});
		Options.setBounds(24, 48, 387, 22);
		frame.getContentPane().add(Options);

		/** 
		 * DONE ALL THINGS
		 */
		JButton Check = new JButton("Process Transaction");
		Check.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				String fname = FName.getText();
				String lname = LName.getText();
				String Security = Num.getText();
				
				
				if (Options.getSelectedItem().equals("Create New Account")) {
					
					if (fname == null || lname == null || Starting_Num.getText().isEmpty()) {
						Information.setText("Cannot process");
					}
					else {
						fname = FName.getText();
						lname = LName.getText();
						
						double num = Double.parseDouble(Starting_Num.getText());
						String new_acct = bank.addAccount(fname, lname, num);
						Information.setText(" New Account Created Successfully!\n" +
						"----------------------------------------------------------------------------------------------\n" +
						"First Name: " + fname + ".\n" +
						"Last Name: " + lname + ".\n" +
						"Personal ID: " + new_acct + " - Please DO NOT lose this.\n" +
						"----------------------------------------------------------------------------------------------\n" +
						"Current Balance: $" + num);
					}
				}
				else if (Options.getSelectedItem().equals("Delete Account")) {
					
					if (Security == null) {
						Information.setText("Cannot procees");
					}
					else {
						String guard = bank.deleteAccount(Security);
						Information.setText(guard);
					}
					
				}
				else if (Options.getSelectedItem().equals("Deposit")) {
					
					
					/** Input = double, Security = String **/
					if (Input.getText().isEmpty() || Security == null) {
						Information.setText("Cannot procees this transaction.\n" +
						"Please make sure you enter all the data.");
					}
					else {
						double num = Double.parseDouble(Input.getText());
						String dep = bank.transaction(1, Security, num);
						
						if (dep.equals("Account does not exist.")) {
							Information.setText(dep + "\n" +
							"----------------------------------------------------------------------------------------------\n" +
							"Please make sure checking the space/capital letters in your personal ID\n" + 
							"----------------------------------------------------------------------------------------------\n");
						}
						else {
							String balance = dep.substring(dep.indexOf("Current balance is"));
							String accountInfo = dep.substring(0, dep.indexOf("Current")).trim();
							
							Information.setText("Receipt.\n" +
							"-----------------------------------------------------------------------------------------------\n" +
							"User Name: " + accountInfo.substring(accountInfo.indexOf(" ")).trim()+ ".\n" +
							"Transaction Type: Deposit.\n" +
							"Amount of Deposit: " + num + ".\n" +
							"-----------------------------------------------------------------------------------------------\n" +
							balance);
						}
					}
				}
				else if (Options.getSelectedItem().equals("Withdraw")) {

					
					/** Input = double, Security = String **/
					if (Input.getText().isEmpty() || Security == null) {
						Information.setText("Cannot procees this transaction.\n" +
						"Please make sure you enter all the data.");
					}
					else {
						double num = Double.parseDouble(Input.getText());
						String dep = bank.transaction(1, Security, num);
						
						if (dep.equals("Account does not exist.")) {
							Information.setText(dep + "\n" +
							"----------------------------------------------------------------------------------------------\n" +
							"Please make sure checking the space/capital letters in your personal ID\n" + 
							"----------------------------------------------------------------------------------------------\n");
						}
						else {
							String balance = dep.substring(dep.indexOf("Current balance is"));
							String accountInfo = dep.substring(0, dep.indexOf("Current")).trim();
							
							Information.setText("Receipt.\n" +
							"-----------------------------------------------------------------------------------------------\n" +
							"User Name: " + accountInfo.substring(accountInfo.indexOf(" ")).trim()+ ".\n" +
							"Transaction Type: Withdraw.\n" +
							"Amount of Deposit: " + num + ".\n" +
							"-----------------------------------------------------------------------------------------------\n" +
							balance);
						}
					}
				}
				else if (Options.getSelectedItem().equals("Check Balance")) {
					
					
					if (Security == null) {
						Information.setText("Cannot process");
					}
					else {
						String check = bank.checkBalance(Security);
						String balance = check.substring(check.indexOf("Current balance is"));
						Information.setText("Account Check.\n" +
						"-----------------------------------------------------------------------------------------------\n" +
						"First Name: " + fname + ".\n" +
						"Last Name: " + lname + ".\n" + 
						"-----------------------------------------------------------------------------------------------\n" +
						balance);
					}
					}
		}
		});
		Check.setBounds(19, 465, 182, 31);
		frame.getContentPane().add(Check);
	}	
}
