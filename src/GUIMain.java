import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class GUIMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMain frame = new GUIMain();
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
	public GUIMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblTitleAndVersion = new JLabel("DnD 3.5 Character Manager v1.0");
		contentPane.add(lblTitleAndVersion);
		
		JButton btnNewCharacter = new JButton("New Character");
		btnNewCharacter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("Character Maker");
				frame.setVisible(true);
				frame.setSize(500, 400);
				JLabel CharMaker = new JLabel("Character Builder");
				frame.add(CharMaker);
			}
		});
		contentPane.add(btnNewCharacter);
		
		JButton btnLoadCharacter = new JButton("Load Character");
		btnLoadCharacter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("Character Loader");
				frame.setVisible(true);
				frame.setSize(500, 400);
				JLabel CharMaker = new JLabel("Select a character");
				frame.add(CharMaker);
			}
		});
		contentPane.add(btnLoadCharacter);
	}

}
