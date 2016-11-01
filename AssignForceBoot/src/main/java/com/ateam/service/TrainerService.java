package com.ateam.service;

import java.util.List;

import com.ateam.beans.Trainer;

//TrainerCtrl operations
public interface TrainerService {

	List<Trainer> getTrainers();
	
	public void saveTrainer(Trainer t);
}
