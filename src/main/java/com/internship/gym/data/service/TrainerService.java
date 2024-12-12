package com.internship.gym.data.service;

import com.internship.gym.data.dao.TrainerDao;
import com.internship.gym.data.model.user.Trainer;
import com.internship.gym.utils.Generator;
import org.springframework.stereotype.Service;

@Service
public class TrainerService {

    private final TrainerDao trainerDao;

    public TrainerService(final TrainerDao trainerDao) {
        this.trainerDao = trainerDao;
    }

    public Trainer createTrainer(final Trainer trainer) {
        String username = Generator.generateUsername(trainer.getFirstName(), trainer.getLastName());
        String password = Generator.generatePassword();

        trainer.setUsername(username);
        trainer.setPassword(password);

        return trainerDao.addTrainer(trainer);
    }

    public Trainer updateTrainer(final Trainer updatedTrainer) {
        return trainerDao.addTrainer(updatedTrainer);
    }

    public Trainer selectTrainer(final long trainerId) {
        return trainerDao.getTrainer(trainerId);
    }
}