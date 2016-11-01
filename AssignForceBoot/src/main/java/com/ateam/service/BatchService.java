package com.ateam.service;

import java.util.List;

import com.ateam.beans.Batch;
import com.ateam.beans.Curriculum;
import com.ateam.beans.Room;
import com.ateam.beans.Topic;
import com.ateam.beans.Trainer;

//Operations for the BatchCtrl 
public interface BatchService {

	public List<Curriculum> getCurriculums();
	
	public void saveBatch(Batch b);
	
	public Trainer getTrainerByName(String name);
	
	public Topic getTopicByName(String name);
	
	public Curriculum getCurriculumByName(String name);
	
	public Room getRoomByName(String name);
}
