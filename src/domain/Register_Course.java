package domain;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JOptionPane; // Added for confirmation message

public class Register_Course extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Register_Course frame = new Register_Course();
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
    public Register_Course() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 526, 357);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);

        JButton btnNewButton = new JButton("Register Course");
        btnNewButton.setBounds(132, 125, 228, 48);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
        contentPane.add(btnNewButton);

        JButton btnGoToDashboard = new JButton("Go to Dashboard");
        btnGoToDashboard.setBounds(132, 198, 228, 48);
        btnGoToDashboard.setFont(new Font("Tahoma", Font.BOLD, 15));
        contentPane.add(btnGoToDashboard);

        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setBounds(132, 50, 228, 48);
        // Add options to the JComboBox
        comboBox.addItem("CS 221");
        comboBox.addItem("CS 414");
        comboBox.addItem("CS 105");
        contentPane.add(comboBox);

        // ActionListener for the "Register Course" button
        btnNewButton.addActionListener(e -> {
            // Get the selected item from the JComboBox
            String selectedCourse = (String) comboBox.getSelectedItem();
            // Display a confirmation message
            String message = "You have registered for the course: " + selectedCourse;
            JOptionPane.showMessageDialog(this, message, "Registration Confirmation", JOptionPane.INFORMATION_MESSAGE);
        });
    }
}
