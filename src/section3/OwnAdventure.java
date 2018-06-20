package section3;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Welcome to Own Adventure!");
		String name = JOptionPane.showInputDialog("Enter Player 1");
		int answer = JOptionPane.showConfirmDialog(null, "Welcome " + name + "! Are you ready to start?");
		int choice =JOptionPane.showOptionDialog(null, "What direction would you like to advance?", "Own Adventure", 0, JOptionPane.INFORMATION_MESSAGE, null, 
				new String[] {"Straight", "Left", "Right"}, null);
		if (choice == 0) {
			JOptionPane.showMessageDialog(null, "You lose");
		}
		if (choice ==1) {
			JOptionPane.showMessageDialog(null, "You lose");
		}
		if (choice ==2) {
			JOptionPane.showMessageDialog(null, "You win!");
		}
	}
}
