package domain;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;

public class RegistrationConfirmation extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationConfirmation frame = new RegistrationConfirmation();
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
	public RegistrationConfirmation() {
		setTitle("Registraipon Confirmation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 663, 327);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Register For Another Course");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(196, 149, 282, 46);
		contentPane.add(btnNewButton);
		
		JButton btnConfirmRegistration = new JButton("Confirm Registration");
		btnConfirmRegistration.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnConfirmRegistration.setBounds(196, 102, 282, 46);
		contentPane.add(btnConfirmRegistration);
		
		JButton btnNewButton_1_1 = new JButton("Go back to Dashboard");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1_1.setBounds(196, 196, 282, 46);
		contentPane.add(btnNewButton_1_1);
	}

}
