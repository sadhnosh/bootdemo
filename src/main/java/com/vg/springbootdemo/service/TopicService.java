package com.vg.springbootdemo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.vg.springbootdemo.model.Topic;

@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("spring", "spring framework", "desc"),
			new Topic("java", "spring framework", "desc"),
			new Topic("js", "spring framework", "desc")
			));
	
	public List<Topic> getAllTopics() {
		return topics;
		
	}

	public Topic getTopicById(String id) {
		// TODO Auto-generated method stub
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < topics.size(); i++) {
			Topic  t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.add(i, topic);
				return;
			}
					
		}		
	}

	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topics.removeIf(t -> t.getId().equals(id));
	}
}
