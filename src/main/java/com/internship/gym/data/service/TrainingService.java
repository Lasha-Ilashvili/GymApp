package com.internship.gym.data.service;

import com.internship.gym.data.dao.TrainingDao;
import com.internship.gym.data.model.training.Training;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {

    private static final Logger logger = LoggerFactory.getLogger(TrainingService.class);
    private final TrainingDao trainingDao;

    public TrainingService(final TrainingDao trainingDao) {
        this.trainingDao = trainingDao;
    }

    public Training createTraining(final Training training) {
        logger.info("Training created successfully: name={}, id={}", training.getTrainingName(), training.getTrainerId());

        return trainingDao.addTraining(training);
    }

    public Training selectTraining(final long trainerId, final long traineeId) {
        Training selectedTraining = trainingDao.getTraining(trainerId, traineeId);

        if (selectedTraining != null) {
            logger.info("Training found: name={}, date={}, duration={}", selectedTraining.getTrainingName(),
                    selectedTraining.getTrainingDate(), selectedTraining.getTrainingDuration());
        } else {
            logger.info("Training not found: trainerId={}, traineeId={}", trainerId, traineeId);
        }

        return selectedTraining;
    }
}