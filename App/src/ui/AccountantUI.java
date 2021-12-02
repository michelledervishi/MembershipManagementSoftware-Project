package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JTable;

public class AccountantUI {

	private JFrame accountantFrame;
	private JTextField debtAmount;
	private JTable coachScheduleTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccountantUI window = new AccountantUI();
					window.accountantFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AccountantUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		accountantFrame = new JFrame();
		accountantFrame.setTitle("Accountant Manager");
		accountantFrame.setBounds(100, 100, 822, 620);
		accountantFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		accountantFrame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		accountantFrame.getContentPane().add(tabbedPane, "name_12110013203647");
		
		JPanel manageFinance = new JPanel();
		manageFinance.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		tabbedPane.addTab("Manage Finances", null, manageFinance, null);
		manageFinance.setLayout(null);
		
		JPanel incomePanel = new JPanel();
		incomePanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Income", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		incomePanel.setBounds(10, 11, 409, 301);
		manageFinance.add(incomePanel);
		incomePanel.setLayout(null);
		
		JScrollPane revenueView = new JScrollPane();
		revenueView.setBounds(10, 51, 389, 102);
		incomePanel.add(revenueView);
		
		JTextArea revenueText = new JTextArea();
		revenueView.setViewportView(revenueText);
		
		JComboBox incomeMonth = new JComboBox();
		incomeMonth.setBounds(286, 11, 113, 18);
		incomePanel.add(incomeMonth);
		
		JLabel lblIncomeMonth = new JLabel("Month:");
		lblIncomeMonth.setBounds(238, 13, 38, 14);
		incomePanel.add(lblIncomeMonth);
		
		JScrollPane expenseView = new JScrollPane();
		expenseView.setBounds(10, 184, 389, 102);
		incomePanel.add(expenseView);
		
		JTextArea expenseText = new JTextArea();
		expenseView.setViewportView(expenseText);
		
		JLabel lblRevenue = new JLabel("Revenue");
		lblRevenue.setBounds(10, 32, 46, 14);
		incomePanel.add(lblRevenue);
		
		JLabel lblExpense = new JLabel("Expenses");
		lblExpense.setBounds(10, 164, 46, 14);
		incomePanel.add(lblExpense);
		
		JPanel debtPanel = new JPanel();
		debtPanel.setLayout(null);
		debtPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Debt", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		debtPanel.setBounds(10, 323, 409, 220);
		manageFinance.add(debtPanel);
		
		JScrollPane debtView = new JScrollPane();
		debtView.setBounds(10, 34, 389, 108);
		debtPanel.add(debtView);
		
		JTextArea debtText = new JTextArea();
		debtView.setViewportView(debtText);
		
		JComboBox debtMonth = new JComboBox();
		debtMonth.setBounds(286, 11, 113, 18);
		debtPanel.add(debtMonth);
		
		JLabel lblDebtMonth = new JLabel("Month:");
		lblDebtMonth.setBounds(238, 13, 38, 14);
		debtPanel.add(lblDebtMonth);
		
		JButton debtSubmit = new JButton("Submit");
		debtSubmit.setBounds(310, 158, 89, 23);
		debtPanel.add(debtSubmit);
		
		JButton debtCancel = new JButton("Cancel");
		debtCancel.setBounds(310, 183, 89, 23);
		debtPanel.add(debtCancel);
		
		JLabel lblExpenseType = new JLabel("Expense:");
		lblExpenseType.setBounds(10, 162, 46, 14);
		debtPanel.add(lblExpenseType);
		
		JLabel lblDebtAmount = new JLabel("Amount:");
		lblDebtAmount.setBounds(165, 162, 46, 14);
		debtPanel.add(lblDebtAmount);
		
		JLabel lblDebtDue = new JLabel("Month:");
		lblDebtDue.setBounds(10, 187, 46, 14);
		debtPanel.add(lblDebtDue);
		
		JComboBox debtExpenseType = new JComboBox();
		debtExpenseType.setBounds(66, 158, 89, 22);
		debtPanel.add(debtExpenseType);
		
		debtAmount = new JTextField();
		debtAmount.setBounds(208, 159, 86, 20);
		debtPanel.add(debtAmount);
		debtAmount.setColumns(10);
		
		JComboBox debtDue = new JComboBox();
		debtDue.setBounds(66, 183, 89, 22);
		debtPanel.add(debtDue);
		
		JPanel profitPanel = new JPanel();
		profitPanel.setBorder(new TitledBorder(null, "Profit", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		profitPanel.setBounds(429, 11, 362, 301);
		manageFinance.add(profitPanel);
		profitPanel.setLayout(null);
		
		JComboBox profitYear = new JComboBox();
		profitYear.setBounds(239, 11, 113, 18);
		profitPanel.add(profitYear);
		
		JLabel lblProfitYear = new JLabel("Year:");
		lblProfitYear.setBounds(191, 13, 38, 14);
		profitPanel.add(lblProfitYear);
		
		JScrollPane profitView = new JScrollPane();
		profitView.setBounds(10, 50, 342, 240);
		profitPanel.add(profitView);
		
		JTextArea profitText = new JTextArea();
		profitView.setViewportView(profitText);
		
		JPanel manageCoach = new JPanel();
		tabbedPane.addTab("Manage Coach", null, manageCoach, null);
		manageCoach.setLayout(null);
		
		JScrollPane coachScheduleView = new JScrollPane();
		coachScheduleView.setBounds(10, 11, 781, 428);
		manageCoach.add(coachScheduleView);
		
		coachScheduleTable = new JTable();
		coachScheduleView.setViewportView(coachScheduleTable);
		
		JPanel coachControls = new JPanel();
		coachControls.setBorder(new TitledBorder(null, "Controls", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		coachControls.setBounds(10, 450, 781, 92);
		manageCoach.add(coachControls);
		
		JButton coachSubmit = new JButton(" Submit Changes");
		coachControls.add(coachSubmit);
		
		JButton coachCancel = new JButton("Cancel Changes");
		coachControls.add(coachCancel);
	}
}
