package io.javabrains.springbootstarter.topic;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	//list for reference
	private List<Topic> topics=Arrays.asList(
			new Topic("Spring","Spring Framework","Spring Framework Description"),
			new Topic("Java","Core Java","Core Java Description"),
			new Topic("Javascript","Javascript js","Javascript Description")
			);
	
	public List<Topic> getAllTopics(){
		List<Topic> topics=new ArrayList<>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}
	public Optional<Topic> getTopic(String id) {
		return topicRepository.findById(id);
	}
	
	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void updateTopic(String id,Topic topic) {
		topicRepository.save(topic);
	}
	
	public void deleteTopic(String id) {
		topicRepository.deleteById(id);
	}
}