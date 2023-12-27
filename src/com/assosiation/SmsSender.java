package com.assosiation;

public class SmsSender implements MessageSender {

	@Override
	public String sendMessage(String msg) {
		
		return "Sending sms : "+msg;
	}

}
