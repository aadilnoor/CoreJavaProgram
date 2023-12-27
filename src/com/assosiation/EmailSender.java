package com.assosiation;

public class EmailSender implements MessageSender {

	@Override
	public String sendMessage(String msg) {
		
		return "Sending eamil : "+msg;
	}
}
