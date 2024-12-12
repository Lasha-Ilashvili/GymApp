package com.internship.gym.data.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class TrainerServiceTest {

    @Autowired
    private TrainerService trainerService;

    @Test
    public void testTrainerServiceInitialization() {
        assertNotNull(trainerService, "TrainerService should be initialized by Spring");
    }
}