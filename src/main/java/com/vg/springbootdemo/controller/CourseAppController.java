package com.vg.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.vg.springbootdemo.model.Topic;
import com.vg.springbootdemo.service.TopicService;

@RestController
public class CourseAppController {

	@Autowired
	private TopicService topicService;

	@RequestMapping("/hello")
	public String sayHi() {
		return "hi";
	}
	
	@RequestMapping("/")
	public String welcome() {
		return "Welcome";
	}

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}

	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopicById(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(topic, id);
	}
	//testing
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
	public void updateTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
