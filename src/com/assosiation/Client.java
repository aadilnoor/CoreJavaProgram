package com.assosiation;

public class Client {
private MessageSender mesSender;

public Client(MessageSender mesSender)
{
	this.mesSender=mesSender;
	
}
public String sendMessage(String message)
{
	return mesSender.sendMessage(message);
	
}
}
