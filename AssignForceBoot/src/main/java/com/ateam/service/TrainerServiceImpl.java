package com.ateam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ateam.beans.Trainer;

@Service
public class TrainerServiceImpl implements TrainerService{

	@Autowired
	DaoService dao;
	
	public List<Trainer> getTrainers() {
		List<Trainer> trainers = dao.getAllItem(new Trainer());
		return trainers;
	}

	public void saveTrainer(Trainer t) {
		dao.saveItem(t);
	}

}
