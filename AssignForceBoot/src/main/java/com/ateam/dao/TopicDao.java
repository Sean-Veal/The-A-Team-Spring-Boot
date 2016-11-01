package com.ateam.dao;

import org.springframework.stereotype.Repository;

import com.ateam.beans.Topic;

@Repository
public interface TopicDao extends BaseRepository<Topic, Integer>{

	public Topic findTopicByTopicName(String topicName);
}
