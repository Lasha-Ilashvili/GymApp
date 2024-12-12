package com.internship.gym.data.storage;

import com.internship.gym.data.model.training.Training;
import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class TrainingStorage {

    private final Map<Pair<Long, Long>, Training> map = new HashMap<>();

    public void addTraining(final Training training) {
        map.put(new Pair<>(training.getTrainerId(), training.getTraineeId()), training);
    }

    public Training getTraining(final long trainerId, final long traineeId) {
        return map.get(new Pair<>(trainerId, traineeId));
    }
}