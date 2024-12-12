package com.internship.gym.data.dao;

import com.internship.gym.data.model.user.Trainer;
import com.internship.gym.data.storage.TrainerStorage;
import org.springframework.stereotype.Component;

@Component
public class TrainerDao {

    private final TrainerStorage trainerStorage;

    public TrainerDao(final TrainerStorage trainerStorage) {
        this.trainerStorage = trainerStorage;
    }

    public Trainer addTrainer(final Trainer trainer) {
        trainerStorage.addTrainer(trainer);

        return trainer;
    }

    public Trainer getTrainer(final long trainerId) {
        return trainerStorage.getTrainer(trainerId);
    }
}