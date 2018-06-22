package com.infosys.collectdetails.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@RequestMapping("/topics")
	
	public List<Topic> getAllTopics() {	 
		return Arrays.asList(
				new Topic("Spring","Spring Framework","a large spring framework description"),
				new Topic("java","Java 8","Platform indipendent language description"),
				new Topic("SQL","SQL 11g","Database description"),
				new Topic("Angular","Angular 4","Front End development description")
			    );
	}

}
