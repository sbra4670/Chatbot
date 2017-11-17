package chat.controller;

import  chat.view.PopupDisplay;
import chat.model.Chatbot;
import chat.view.ChatFrame;
import java.util.List;

public class ChatbotController
{
	private PopupDisplay display;
	private Chatbot chatbot;
	private ChatFrame appFrame;
	
	public ChatbotController()
	{
		chatbot = new Chatbot("Chatbot");
		display = new PopupDisplay();
		appFrame = new ChatFrame(this);
		
	}
	
	
	public void start()
	{
		display.displayText("Hello...Welcome!");
		
	}
	
	private String popupChat(String chat)
	{
		String chatbotSays = ""; //Assigns a valid value to a variable that will be returned for the method
		
		chatbotSays += chatbot.processConversation(chat);
		
		return chatbotSays;
	}
	
	public String interactWithChatbot(String input)
	{
		String chatbotSays = "";
		
		if(chatbot.quitChecker(input))
		{
			close();
		}
		
		chatbotSays += chatbot.processConversation(input);
		
		return chatbotSays;
		
	}
	
	public PopupDisplay getDisplay()
	{
		return display;
	}
	
	private void close()
	{
		display.displayText("Goodbye");
		System.exit(0);
	}
}
