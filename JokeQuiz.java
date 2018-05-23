import javax.swing.JOptionPane;

public class JokeQuiz {
	public static void main(String[] args) {
		String jack = JOptionPane.showInputDialog("What's something that is true and false at the same time ");
		if (jack.equals("boolcrap")) {
			JOptionPane.showMessageDialog(null, "you just gots it wrightyo, message");
			// MessageDialog("you just gots it wrightyo ");
			
		}
		else {
			JOptionPane.showMessageDialog(null,"sorry guy or girl gender equalty but you just gots it wrong");
		}
	}
}
