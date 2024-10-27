package com.springboot.starterpack.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@GetMapping("/topic")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("Spring","Spring Framework","Springboot decription"),
				new Topic("java","java Framework","java decription"),
				new Topic("javascript","javascript Framework","javascript decription")
				
				
				
				
				)
				
				;
	}
}
