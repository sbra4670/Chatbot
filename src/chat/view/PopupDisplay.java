package chat.view;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/*
 * Simple GUI class using JOPtionPane.
 * @author Sebastian Bravo
 * @version 1.0 03.10.2017
 */

public class PopupDisplay
{
	private ImageIcon icon;
	private String windowTitle;
	/**
	 * Displays a popup showing the supplied String to the user.
	 * @param textToDisplay The text to be displayed.
	 */
	
	public PopupDisplay()
	{
		icon = new ImageIcon(getClass().getResource("images/Anonymous.jpg"));
	}
	
	
	
	
public void displayText(String textToDisplay)
{
	JOptionPane.showMessageDialog(null, textToDisplay, windowTitle, JOptionPane.INFORMATION_MESSAGE, icon);
}

/**
 * Uses a popup to display a question to the user and returns their response as a String.
 * @param fromQuestion The question being asked
 * @return The users response to the question
 */

public String collectResponse(String question)
{
	String answer = "";
	
	answer += JOptionPane.showInputDialog(null, question, windowTitle, JOptionPane.PLAIN_MESSAGE, icon, null, "");
			
	return answer;
	}
}
