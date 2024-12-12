package com.internship.gym.data.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class TrainingServiceTest {

    @Autowired
    private TrainingService trainingService;

    @Test
    public void testTrainingServiceInitialization() {
        assertNotNull(trainingService, "TrainingService should be initialized by Spring");
    }
}