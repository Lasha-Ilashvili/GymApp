package com.internship.gym.data.service;

import com.internship.gym.data.dao.TrainerDao;
import com.internship.gym.data.model.user.Trainer;
import org.springframework.stereotype.Service;

@Service
public class TrainerService {

    private final TrainerDao trainerDao;

    public TrainerService(final TrainerDao trainerDao) {
        this.trainerDao = trainerDao;
    }

    public Trainer createTrainer(final Trainer trainer) {
        return trainerDao.addTrainer(trainer);
    }

    public Trainer updateTrainer(final Trainer updatedTrainer) {
        return trainerDao.addTrainer(updatedTrainer);
    }

    public Trainer selectTrainer(final long trainerId) {
        return trainerDao.getTrainer(trainerId);
    }
}