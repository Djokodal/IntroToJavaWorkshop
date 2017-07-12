package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak ( "You're hungry");
		// 2. Catch the user's answer in a String
		String answer = JOptionPane.showInputDialog("Please spell the word you just heard.");
		// 3. If the user spelled the word correctly, speak "correct"
		if (answer.equalsIgnoreCase("You're hungry")) {
			speak (" Correct ");
		}
		// 4. Otherwise say "wrong"
		else {
			speak ("Wrong");
		}
		// 5. repeat the process for other words
		speak ( "Chicken Wings");
		String answers = JOptionPane.showInputDialog("Please spell the word you just heard.");
		if (answers.equalsIgnoreCase("Chicken Wings")) {
			speak (" Correct ");
		}
		else {
			speak ("Wrong");
		}
		speak ( "Vernacular");
		String answerss = JOptionPane.showInputDialog("Please spell the word you just heard.");
		if (answerss.equalsIgnoreCase("Vernacular")) {
			speak (" Correct ");
		}
		else {
			speak ("Wrong");
		}
		speak ( "xD");
		String answersss = JOptionPane.showInputDialog("Please spell the word you just heard.");
		if (answersss.equalsIgnoreCase("xD")) {
			speak (" Correct ");
		}
		else {
			speak ("Wrong");
		}
		
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


