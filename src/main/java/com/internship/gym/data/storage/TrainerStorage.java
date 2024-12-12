package com.internship.gym.data.storage;

import com.internship.gym.data.model.user.Trainer;

import java.util.HashMap;
import java.util.Map;

public class TrainerStorage {

    private final Map<Long, Trainer> map = new HashMap<>();

    public void addTrainer(final Trainer trainer) {
        map.put(trainer.getTrainerId(), trainer);
    }

    public Trainer getTrainer(final long trainerId) {
        return map.get(trainerId);
    }
}