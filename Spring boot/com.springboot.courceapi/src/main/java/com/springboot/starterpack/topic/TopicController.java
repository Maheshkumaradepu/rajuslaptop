package com.springboot.starterpack.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	private TopicService topicService;
	
	
	
	
	@GetMapping("/topic")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	public Topic getTopic(String id) {
		
	}
}
