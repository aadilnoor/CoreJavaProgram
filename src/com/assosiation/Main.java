package com.assosiation;

public class Main {
	public static void main(String[] args) {
		MessageSender emailSender = new EmailSender();
		Client c = new Client(emailSender);
		String email = c.sendMessage("this email by MessageSender interface :");

		MessageSender smsSender = new SmsSender();
		Client c1 = new Client(smsSender);
		String sms = c1.sendMessage("this sms by MessageSender interface :");
		System.out.println(email + "\n" + sms);
	}
}
