package com.internship.gym.data.service;

import com.internship.gym.data.dao.TraineeDao;
import com.internship.gym.data.model.user.Trainee;
import org.springframework.stereotype.Service;

@Service
public class TraineeService {

    private final TraineeDao traineeDao;

    public TraineeService(final TraineeDao traineeDao) {
        this.traineeDao = traineeDao;
    }

    public Trainee createTrainee(final Trainee trainee) {
        return traineeDao.addTrainee(trainee);
    }

    public Trainee updateTrainee(final Trainee updatedTrainee) {
        return traineeDao.addTrainee(updatedTrainee);
    }

    public boolean deleteTrainee(final long traineeId) {
        return traineeDao.deleteTrainee(traineeId);
    }

    public Trainee selectTrainee(final long traineeId) {
        return traineeDao.getTrainee(traineeId);
    }
}