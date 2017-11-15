package chat.view;

import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import chat.controller.ChatbotController;
import java.awt.Color;

public class ChatPanel extends JPanel
{
	private ChatbotController appController;
	private JButton chatButton;
	private JTextField inputField;
	private JTextArea chatArea;
	private SpringLayout appLayout;
	
	
public ChatPanel(ChatbotController appController)
{
	super();
	this.appController = appController;
	
	chatButton = new JButton("chat");
	chatArea = new JTextArea(10, 25);
	inputField = new JTextField(20);
	appLayout = new SpringLayout();
	
	
	
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

}

private void setupLayout()
{
	appLayout.putConstraint(SpringLayout.NORTH, chatArea, 20, SpringLayout.NORTH, this);
	appLayout.putConstraint(SpringLayout.WEST, chatArea, 25, SpringLayout.WEST, this);
	appLayout.putConstraint(SpringLayout.EAST, chatArea, -25, SpringLayout.EAST, this);
}

private void setupListeners()
{
	
}

}
