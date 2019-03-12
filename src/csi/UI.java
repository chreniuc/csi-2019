package csi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UI extends JFrame {

	private JPanel contentPane;
	private JTextField txtKey;
	private JPanel menu;
	JPanel PlayFair;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 838, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		menu = new JPanel();
		contentPane.add(menu, "name_3075972205800");
		menu.setLayout(null);
		
		JButton btnPlayfair = new JButton("PlayFair");
		btnPlayfair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayFair.setVisible(true);
				menu.setVisible(false);
			}
		});
		btnPlayfair.setBounds(335, 99, 89, 23);
		menu.add(btnPlayfair);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(335, 131, 89, 23);
		menu.add(btnExit);
		
		PlayFair = new JPanel();
		contentPane.add(PlayFair, "name_3078935610900");
		PlayFair.setLayout(null);
		
		JTextArea txtrEncryptedText = new JTextArea();
		txtrEncryptedText.setText("Encrypted Text");
		txtrEncryptedText.setToolTipText("");
		txtrEncryptedText.setRows(10);
		txtrEncryptedText.setBounds(10, 37, 349, 220);
		PlayFair.add(txtrEncryptedText);
		
		JLabel lblEncryptedText = new JLabel("Encrypted text:");
		lblEncryptedText.setBounds(10, 11, 91, 14);
		PlayFair.add(lblEncryptedText);
		
		JTextArea txtrDecryptedText = new JTextArea();
		txtrDecryptedText.setText("Decrypted Text");
		txtrDecryptedText.setRows(10);
		txtrDecryptedText.setBounds(452, 37, 321, 220);
		PlayFair.add(txtrDecryptedText);
		
		JLabel lblDecryptedText = new JLabel("Decrypted text:");
		lblDecryptedText.setBounds(452, 11, 91, 14);
		PlayFair.add(lblDecryptedText);
		
		txtKey = new JTextField();
		txtKey.setText("Key");
		txtKey.setBounds(10, 298, 763, 20);
		PlayFair.add(txtKey);
		txtKey.setColumns(10);
		
		JLabel lblKey = new JLabel("Key:");
		lblKey.setBounds(10, 273, 46, 14);
		PlayFair.add(lblKey);
		
		JButton btnEncrypt = new JButton("Encrypt");
		btnEncrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PlayFair playfair = new PlayFair();
				txtrDecryptedText.setText(playfair.encrypt(txtrEncryptedText.getText(), txtKey.getText()));
			}
		});
		btnEncrypt.setBounds(270, 356, 89, 23);
		PlayFair.add(btnEncrypt);
		
		JButton btnDecrypt = new JButton("Decrypt");
		btnDecrypt.setBounds(452, 356, 89, 23);
		PlayFair.add(btnDecrypt);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(true);
				PlayFair.setVisible(false);
			}
		});
		btnBack.setBounds(10, 410, 89, 23);
		PlayFair.add(btnBack);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, "name_3081081107700");
	}
}
