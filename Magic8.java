package Day4;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8 {
	public static void main(String[] args){
		Random num = new Random();
		int randInt = num.nextInt(4);
		String answer = JOptionPane.showInputDialog("Ask a yes or no question.");
		if (num.equals(0)){
			JOptionPane.showMessageDialog(null, "Yes");
		}
		else {
			if (num.equals(1)){
				JOptionPane.showMessageDialog(null, "No");
			}
			if (num.equals(2)){
				JOptionPane.showMessageDialog(null, "Maybe you should ask google?");
			}
			if (num.equals(3)){
				String Choice = JOptionPane.showInputDialog("Write your own answer.");
				JOptionPane.showMessageDialog(null, Choice );
			}
		}
	}
}

// 1. Make a main method that includes all the steps below….

// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"

// 3. Print out this variable

// 4. Get the user to enter a question for the 8 ball

// 5. If the random number is 0

// -- tell the user "Yes"

// 6. If the random number is 1

// -- tell the user "No"

// 7. If the random number is 2

// -- tell the user "Maybe you should ask Google?"

// 8. If the random number is 3

// -- write your own answer

