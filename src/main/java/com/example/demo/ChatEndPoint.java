package com.example.demo;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatEndPoint {

	@MessageMapping("/user1") //endpoint url
	@SendTo("/sample/publish2")//subscription url
	public String publishMessage1( String message) {
		
		return message;
	}

	@MessageMapping("/user2")
	@SendTo("/sample/publish1")
	public String publishMessage2( String message) {
		
		return message;
	}
}
