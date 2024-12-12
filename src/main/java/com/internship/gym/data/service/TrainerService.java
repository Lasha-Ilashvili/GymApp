package com.internship.gym.data.service;

import com.internship.gym.data.dao.TrainerDao;
import com.internship.gym.data.model.user.Trainer;
import com.internship.gym.utils.Generator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TrainerService {

    private static final Logger logger = LoggerFactory.getLogger(TrainerService.class);
    private final TrainerDao trainerDao;

    public TrainerService(final TrainerDao trainerDao) {
        this.trainerDao = trainerDao;
    }

    public Trainer createTrainer(final Trainer trainer) {
        String username = Generator.generateUsername(trainer.getFirstName(), trainer.getLastName());
        String password = Generator.generatePassword();

        trainer.setUsername(username);
        trainer.setPassword(password);

        logger.info("Trainer created successfully: id={}, username={}", trainer.getTrainerId(), trainer.getUsername());

        return trainerDao.addTrainer(trainer);
    }

    public Trainer updateTrainer(final Trainer updatedTrainer) {
        logger.info("Trainer updated successfully: id={}", updatedTrainer.getTrainerId());

        return trainerDao.addTrainer(updatedTrainer);
    }

    public Trainer selectTrainer(final long trainerId) {
        Trainer selectedTrainer = trainerDao.getTrainer(trainerId);

        if (selectedTrainer != null) {
            logger.info("Trainer found: id={}, firstName={}, lastName={}", selectedTrainer.getTrainerId(),
                    selectedTrainer.getFirstName(), selectedTrainer.getLastName());
        } else {
            logger.info("Trainer not found: id={}", trainerId);
        }

        return selectedTrainer;
    }
}