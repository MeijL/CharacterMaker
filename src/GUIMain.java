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
				JPanel panel = new JPanel();
				frame.add(panel);
				JLabel charMaker = new JLabel("Character name:");
				panel.add(charMaker);
				JTextField charName = new JTextField(20);
				panel.add(charName);
				JButton enter = new JButton("Enter");
				panel.add(enter);
				enter.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Character name = new Character(charName.getText());
						GridLayout raceLayout = new GridLayout(0,2);
						JFrame raceFrame = new JFrame(charName.getText() + "'s Race");
						raceFrame.setVisible(true);
						raceFrame.setSize(500, 500);
						raceFrame.setLayout(raceLayout);
						JPanel racePanel = new JPanel();
						raceFrame.add(racePanel);
						JLabel charRace = new JLabel("Character Race: ");
						racePanel.add(charRace);
						JTextField textRace = new JTextField(5);
						racePanel.add(textRace);
						JLabel charSTR = new JLabel("Strength Mod: ");
						racePanel.add(charSTR);
						JTextField textSTR = new JTextField(5);
						racePanel.add(textSTR);
						JLabel charINT = new JLabel("Intelligence Mod: ");
						racePanel.add(charINT);
						JTextField textINT = new JTextField(5);
						racePanel.add(textINT);
						JLabel charCON = new JLabel("Constitution Mod: ");
						racePanel.add(charCON);
						JTextField textCON = new JTextField(5);
						racePanel.add(textCON);
						JLabel charWIS = new JLabel("Wisdom Mod: ");
						racePanel.add(charWIS);
						JTextField textWIS = new JTextField(5);
						racePanel.add(textWIS);
						JLabel charDEX = new JLabel("Dexterity Mod: ");
						racePanel.add(charDEX);
						JTextField textDEX = new JTextField(5);
						racePanel.add(textDEX);
						JLabel charCHA = new JLabel("Charisma Mod: ");
						racePanel.add(charCHA);
						JTextField textCHA = new JTextField(5);
						racePanel.add(textCHA);
						JButton raceEnter = new JButton("Enter");
						racePanel.add(raceEnter);
						raceEnter.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								CharRace race = new CharRace(textRace.getText());
								race.setChaMod(Integer.parseInt(textCHA.getText()));
								race.setWisMod(Integer.parseInt(textWIS.getText()));
								race.setIntMod(Integer.parseInt(textINT.getText()));
								race.setConMod(Integer.parseInt(textCON.getText()));
								race.setDexMod(Integer.parseInt(textDEX.getText()));
								race.setStrMod(Integer.parseInt(textSTR.getText()));
								GridLayout classLayout = new GridLayout(0,2);
								JFrame classFrame = new JFrame(charName.getText() 
										+ "'s Class");
								classFrame.setVisible(true);
								classFrame.setSize(500, 400);
								classFrame.setLayout(classLayout);
							}
						});
					}
				});
			}
		});
		contentPane.add(btnNewCharacter);

		JButton btnLoadCharacter = new JButton("Load Character");
		btnLoadCharacter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame frame = new JFrame("Character Loader");
				frame.setVisible(true);
				frame.setSize(500, 400);
				JLabel charMaker = new JLabel("Select a character");
				frame.add(charMaker);
			}
		});
		contentPane.add(btnLoadCharacter);
	}

}
