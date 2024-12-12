package com.internship.gym.data.storage.config;

import com.internship.gym.data.storage.TraineeStorage;
import com.internship.gym.data.storage.TrainerStorage;
import com.internship.gym.data.storage.TrainingStorage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StorageConfig {

    @Bean
    TrainerStorage createTrainerStorage() {
        return new TrainerStorage();
    }

    @Bean
    TraineeStorage createTraineeStorage() {
        return new TraineeStorage();
    }

    @Bean
    TrainingStorage createTrainingStorage() {
        return new TrainingStorage();
    }
}