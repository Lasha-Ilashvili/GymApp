package com.internship.gym.data.service;

import com.internship.gym.data.dao.TrainingDao;
import com.internship.gym.data.model.training.Training;
import org.springframework.stereotype.Service;

@Service
public class TrainingService {

    private final TrainingDao trainingDao;

    public TrainingService(final TrainingDao trainingDao) {
        this.trainingDao = trainingDao;
    }

    public Training createTraining(final Training training) {
        return trainingDao.addTraining(training);
    }

    public Training selectTraining(final long trainerId, final long traineeId) {
        return trainingDao.getTraining(trainerId, traineeId);
    }
}