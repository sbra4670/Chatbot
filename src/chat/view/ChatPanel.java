package chat.view;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import chat.controller.ChatbotController;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ChatPanel extends JPanel
{
	private ChatbotController appController;
	private JButton chatButton;
	private JTextField inputField;
	private JTextArea chatArea;
	private SpringLayout appLayout;
	private JButton checkerButton;
	private JLabel infoLabel;
	
	
public ChatPanel(ChatbotController appController)
{
	super();
	this.appController = appController;

	chatButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			String userText = inputField.getText();
			String displayText = appController.interactWithChatbot(userText);
			chatArea.append(displayText);
			inputField.setText("");
		}
	});
	
	checkerButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent click)
		{
			String userText = inputField.getText();
			String displayText = appController.useCheckers(userText);
			chatArea.append(displayText);
			inputField.setText("");
		}
	});
	
	chatButton = new JButton("chat");
	chatArea = new JTextArea(10, 25);
	inputField = new JTextField(20);
	appLayout = new SpringLayout();
	checkerButton = new JButton("Call Checkers");
	infoLabel = new JLabel("Type to chat with da Chatbot ;)");

	setupPanel();
	setupLayout();
	setupListeners();
}

private void setupPanel()
{
this.setBackground(Color.DARK_GRAY);
this.setLayout(appLayout);
this.add(chatButton);
this.add(inputField);
this.add(chatArea);
this.add(infoLabel);
this.add(checkerButton);
chatArea.setEnabled(false);
chatArea.setEditable(false);
}

private void setupLayout()
{
	appLayout.putConstraint(SpringLayout.NORTH, chatArea, 20, SpringLayout.NORTH, this);
	appLayout.putConstraint(SpringLayout.WEST, chatArea, 25, SpringLayout.WEST, this);
	appLayout.putConstraint(SpringLayout.EAST, chatArea, -25, SpringLayout.EAST, this);
	appLayout.putConstraint(SpringLayout.NORTH, chatButton, 28, SpringLayout.SOUTH, chatArea);
	appLayout.putConstraint(SpringLayout.EAST, chatButton, -25, SpringLayout.EAST, this);
	appLayout.putConstraint(SpringLayout.NORTH, inputField, 0, SpringLayout.NORTH, chatButton);
	appLayout.putConstraint(SpringLayout.WEST, inputField, 0, SpringLayout.WEST, chatArea);
}

private void setupListeners()
{
	
}

}
