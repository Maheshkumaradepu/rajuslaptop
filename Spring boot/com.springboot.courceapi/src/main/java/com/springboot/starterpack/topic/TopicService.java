package com.springboot.starterpack.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(new Topic("Spring", "Spring Framework", "Springboot decription"),
			new Topic("java", "java Framework", "java decription"),
			new Topic("javascripts", "javascript Framework", "javascript decription")

	);

	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}
}
