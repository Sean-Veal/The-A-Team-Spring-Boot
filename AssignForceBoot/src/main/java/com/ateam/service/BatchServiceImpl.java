package com.ateam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ateam.beans.Batch;
import com.ateam.beans.Curriculum;
import com.ateam.beans.Room;
import com.ateam.beans.Topic;
import com.ateam.beans.Trainer;

@Service
public class BatchServiceImpl implements BatchService{

	//Using Dao operations for Service operations
	@Autowired
	DaoService dao;
	
	public List<Curriculum> getCurriculums(){
		return dao.getAllCurriculums();
	}

	@Override
	@Transactional
	public void saveBatch(Batch b) {
		
		dao.saveItem(b);
		
	}
/*
 * Trim all strings that come from client-side 
 */
	@Override
	public Trainer getTrainerByName(String name) {
		
		return dao.findByTrainerFirstName(name.trim());
	}

	@Override
	public Topic getTopicByName(String name) {
		return dao.findTopicByTopicName(name.trim());
	}

	@Override
	public Curriculum getCurriculumByName(String name) {
		
		return dao.findCurriculumByCurriculumName(name.trim());
	}

	@Override
	public Room getRoomByName(String name) {
		
		return dao.findRoomByRoomName(name.trim());
	}
}
