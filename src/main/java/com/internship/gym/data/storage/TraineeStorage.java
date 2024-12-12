package com.internship.gym.data.storage;

import com.internship.gym.data.model.user.Trainee;

import java.util.HashMap;
import java.util.Map;

public class TraineeStorage {

    private final Map<Long, Trainee> map = new HashMap<>();

    public void addTrainee(final Trainee trainee) {
        map.put(trainee.getTraineeId(), trainee);
    }

    public Trainee deleteTrainee(final long traineeId) {
        return map.remove(traineeId);
    }

    public Trainee getTrainee(final long traineeId) {
        return map.get(traineeId);
    }
}