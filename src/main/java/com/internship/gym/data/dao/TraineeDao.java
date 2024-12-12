package com.internship.gym.data.dao;

import com.internship.gym.data.model.user.Trainee;
import com.internship.gym.data.storage.TraineeStorage;
import org.springframework.stereotype.Component;

@Component
public class TraineeDao {

    private final TraineeStorage traineeStorage;

    public TraineeDao(final TraineeStorage traineeStorage) {
        this.traineeStorage = traineeStorage;
    }

    public Trainee addTrainee(final Trainee trainee) {
        traineeStorage.addTrainee(trainee);

        return trainee;
    }

    public boolean deleteTrainee(final long traineeId) {
        return traineeStorage.deleteTrainee(traineeId) != null;
    }

    public Trainee getTrainee(final long traineeId) {
        return traineeStorage.getTrainee(traineeId);
    }
}