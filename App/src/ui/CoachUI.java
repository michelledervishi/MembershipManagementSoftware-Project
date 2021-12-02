package ui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

public class CoachUI extends JFrame {

	//private JFrame this;
	private JTable table;
	private JTextField recipientText;
	private JTextField txtFirst;
	private JTextField txtLast;
	private JTextField txtPhone;
	private JTextField txtAddress;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoachUI window = new CoachUI();
					window.this.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/
	/**
	 * Create the application.
	 */
	public CoachUI() {
		setResizable(false);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//this = new JFrame();
		this.setTitle("Coach Manager");
		this.setBounds(100, 100, 911, 727);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setFloatable(false);
		this.getContentPane().add(toolBar, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Shutdown");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnShutdown = new JButton("Logout");
		toolBar.add(btnShutdown);
		toolBar.add(btnNewButton);
		ActionListener logoutListen = new logoutListener();
		btnShutdown.addActionListener(logoutListen);
		
		JTabbedPane coachTabs = new JTabbedPane(JTabbedPane.TOP);
		this.getContentPane().add(coachTabs, BorderLayout.CENTER);
		
		JPanel coachMain = new JPanel();
		coachTabs.addTab("Main", null, coachMain, null);
		coachMain.setLayout(null);
		
		JScrollPane tableViewer = new JScrollPane();
		tableViewer.setBounds(330, 11, 553, 609);
		coachMain.add(tableViewer);
		
		table = new JTable();
		tableViewer.setViewportView(table);
		
		JPanel sendMessages = new JPanel();
		sendMessages.setBorder(new TitledBorder(null, "Send Messages", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		sendMessages.setBounds(10, 416, 310, 204);
		coachMain.add(sendMessages);
		sendMessages.setLayout(null);
		
		JScrollPane messagePane = new JScrollPane();
		messagePane.setBounds(10, 50, 290, 106);
		sendMessages.add(messagePane);
		
		JTextArea messageText = new JTextArea();
		messagePane.setViewportView(messageText);
		
		JLabel lblRecipient = new JLabel("Recipient:");
		lblRecipient.setBounds(88, 25, 74, 14);
		sendMessages.add(lblRecipient);
		
		recipientText = new JTextField();
		recipientText.setBounds(172, 22, 128, 20);
		sendMessages.add(recipientText);
		recipientText.setColumns(10);
		
		JButton btnSendMesssage = new JButton("Send");
		btnSendMesssage.setBounds(10, 167, 89, 23);
		sendMessages.add(btnSendMesssage);
		ActionListener sendListen = new sendMsgListener();
		btnSendMessage.addActionListener(sendListen);
		
		JButton btnCancelMessage = new JButton("Cancel");
		btnCancelMessage.setBounds(109, 167, 89, 23);
		sendMessages.add(btnCancelMessage);
		
		JPanel tableControls = new JPanel();
		tableControls.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Controls", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		tableControls.setBounds(10, 12, 310, 394);
		coachMain.add(tableControls);
		tableControls.setLayout(null);
		
		JPanel addRemove = new JPanel();
		addRemove.setBorder(new TitledBorder(null, "Add/Remove", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		addRemove.setBounds(10, 148, 290, 235);
		tableControls.add(addRemove);
		addRemove.setLayout(null);
		
		JLabel lblFirstName = new JLabel("First Name:");
		lblFirstName.setBounds(10, 31, 97, 14);
		addRemove.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name:");
		lblLastName.setBounds(10, 68, 97, 14);
		addRemove.add(lblLastName);
		
		JLabel lblPhone = new JLabel("Phone:");
		lblPhone.setBounds(10, 105, 97, 14);
		addRemove.add(lblPhone);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setBounds(10, 142, 97, 14);
		addRemove.add(lblAddress);
		
		txtFirst = new JTextField();
		txtFirst.setBounds(117, 28, 163, 20);
		addRemove.add(txtFirst);
		txtFirst.setColumns(10);
		
		txtLast = new JTextField();
		txtLast.setColumns(10);
		txtLast.setBounds(117, 65, 163, 20);
		addRemove.add(txtLast);
		
		txtPhone = new JTextField();
		txtPhone.setColumns(10);
		txtPhone.setBounds(117, 102, 163, 20);
		addRemove.add(txtPhone);
		
		txtAddress = new JTextField();
		txtAddress.setColumns(10);
		txtAddress.setBounds(117, 139, 163, 20);
		addRemove.add(txtAddress);
		
		JButton btnAddMem = new JButton("Add");
		btnAddMem.setBounds(10, 170, 130, 23);
		addRemove.add(btnAddMem);
		
		JButton btnRemoveMem = new JButton("Remove");
		btnRemoveMem.setBounds(150, 170, 130, 23);
		addRemove.add(btnRemoveMem);
		
		JButton btnCancelMem = new JButton("Cancel");
		btnCancelMem.setBounds(10, 201, 270, 23);
		addRemove.add(btnCancelMem);
		
		JButton btnSortFreq = new JButton("Sort via Frequency");
		btnSortFreq.setBounds(10, 26, 290, 41);
		tableControls.add(btnSortFreq);
		
		JButton btnSortPay = new JButton("Sort via Payment");
		btnSortPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSortPay.setBounds(10, 91, 290, 41);
		tableControls.add(btnSortPay);
		
		JPanel coachInbox = new JPanel();
		coachTabs.addTab("Inbox", null, coachInbox, null);
		coachInbox.setLayout(new BorderLayout(0, 0));
		
		JScrollPane coachInboxViewer = new JScrollPane();
		coachInbox.add(coachInboxViewer, BorderLayout.CENTER);
		
		JTextArea coachInboxText = new JTextArea();
		coachInboxText.setEditable(false);
		coachInboxViewer.setViewportView(coachInboxText);
	}
	class logoutListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JFrame loWindow = new LoginUI();
			loWindow.setVisible(true);
			setVisible(false);
		}
	}
	
	class sendMsgListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			sendmsgtoMemtxt(recipientText.getText(),messageText.getText());
		}
	}
	
	public void sendmsgtoMemtxt(String mem, String msg) {
		for(Member x : membersList) {
			if (mem.equals(x.getFirstName() + " " + x.getLastName())){
				writeToText(mem + "|" + msg, membersmsgs.txt + "\n");
			}
			else
				messageText.setText("Member not found");
		}
	}

}
