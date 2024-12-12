package com.internship.gym.data.service;

import com.internship.gym.data.dao.TraineeDao;
import com.internship.gym.data.model.user.Trainee;
import com.internship.gym.utils.Generator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TraineeService {

    private static final Logger logger = LoggerFactory.getLogger(TraineeService.class);
    private final TraineeDao traineeDao;

    public TraineeService(final TraineeDao traineeDao) {
        this.traineeDao = traineeDao;
    }

    public Trainee createTrainee(final Trainee trainee) {
        String username = Generator.generateUsername(trainee.getFirstName(), trainee.getLastName());
        String password = Generator.generatePassword();

        trainee.setUsername(username);
        trainee.setPassword(password);

        logger.info("Trainee created successfully: id={}, username={}", trainee.getTraineeId(), trainee.getUsername());

        return traineeDao.addTrainee(trainee);
    }

    public Trainee updateTrainee(final Trainee updatedTrainee) {
        logger.info("Trainee updated successfully: id={}", updatedTrainee.getTraineeId());

        return traineeDao.addTrainee(updatedTrainee);
    }

    public boolean deleteTrainee(final long traineeId) {
        boolean isDeleted = traineeDao.deleteTrainee(traineeId);

        if (isDeleted) {
            logger.info("Trainee deleted successfully: id={}", traineeId);
        } else {
            logger.info("No trainee found to delete: id={}", traineeId);
        }

        return isDeleted;
    }

    public Trainee selectTrainee(final long traineeId) {
        Trainee selectedTrainee = traineeDao.getTrainee(traineeId);

        if (selectedTrainee != null) {
            logger.info("Trainee found: id={}, firstName={}, lastName={}", selectedTrainee.getTraineeId(),
                    selectedTrainee.getFirstName(), selectedTrainee.getLastName());
        } else {
            logger.info("Trainee not found: id={}", traineeId);
        }

        return selectedTrainee;
    }
}