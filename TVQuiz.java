import javax.swing.JOptionPane;

public class TVQuiz {
public static void main(String[] args) {
	String tv =JOptionPane.showInputDialog("Why doess lola loud not want to read");
	if (tv.equalsIgnoreCase("Because she can't")) {
		JOptionPane.showMessageDialog(null,"smart stuff");
		
		
	}
	else {
	   JOptionPane.showMessageDialog(null,"you got it wrong haha");	
    }
  }

}


















