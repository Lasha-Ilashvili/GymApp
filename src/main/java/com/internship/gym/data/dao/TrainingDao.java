package com.internship.gym.data.dao;

import com.internship.gym.data.model.training.Training;
import com.internship.gym.data.storage.TrainingStorage;
import org.springframework.stereotype.Component;

@Component
public class TrainingDao {

    private final TrainingStorage trainingStorage;

    public TrainingDao(final TrainingStorage trainingStorage) {
        this.trainingStorage = trainingStorage;
    }

    public Training addTraining(final Training training) {
        trainingStorage.addTraining(training);

        return training;
    }

    public Training getTraining(final long trainerId, final long traineeId) {
        return trainingStorage.getTraining(trainerId, traineeId);
    }
}