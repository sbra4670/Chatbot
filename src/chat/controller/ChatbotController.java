package chat.controller;

import  chat.view.PopupDisplay;
import chat.model.Chatbot;
import chat.view.ChatFrame;
import java.util.List;

/**
 * Manages the Chatbot application including the model and Frame of the View package
 * @author Sebastian Bravo
 * @version 21.11.17 Added Frame 1.3
 */

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

	public String useCheckers(String text)
	{
		String response = "";
		
		if(chatbot.contentChecker(text))
		{
			response += "This text matches the special content\n";
		}
		
		if (chatbot.cuteAnimalMemeChecker(text))
		{
			response += "";
			
			return response;
		}
	}
	
}
