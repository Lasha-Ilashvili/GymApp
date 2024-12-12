package com.internship.gym.data.service;

import com.internship.gym.data.model.user.Trainee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TraineeServiceTest {

    @Autowired
    private TraineeService traineeService;

    @Test
    public void testTraineeServiceInitialization() {
        assertNotNull(traineeService, "TraineeService should be initialized by Spring");
    }

    @Test
    public void testCreateTrainee() {
        Trainee trainee = new Trainee("John", "Doe", "john.doe", "password123", true, 1L, "123 Elm Street", "1990-01-01");
        Trainee createdTrainee = traineeService.createTrainee(trainee);
        assertNotNull(createdTrainee, "Created trainee should not be null");
        assertEquals("John", createdTrainee.getFirstName(), "Trainee first name should match");
    }

    @Test
    public void testUpdateTrainee() {
        Trainee trainee = new Trainee("John", "Doe", "john.doe", "password123", true, 1L, "123 Elm Street", "1990-01-01");
        traineeService.createTrainee(trainee);
        trainee.setAddress("456 Oak Avenue");
        Trainee updatedTrainee = traineeService.updateTrainee(trainee);
        assertNotNull(updatedTrainee, "Updated trainee should not be null");
        assertEquals("456 Oak Avenue", updatedTrainee.getAddress(), "Trainee address should be updated");
    }

    @Test
    public void testDeleteTrainee() {
        Trainee trainee = new Trainee("John", "Doe", "john.doe", "password123", true, 1L, "123 Elm Street", "1990-01-01");
        traineeService.createTrainee(trainee);
        boolean isDeleted = traineeService.deleteTrainee(1L);
        assertTrue(isDeleted, "Trainee should be successfully deleted");
    }

    @Test
    public void testSelectTrainee() {
        Trainee trainee = new Trainee("John", "Doe", "john.doe", "password123", true, 1L, "123 Elm Street", "1990-01-01");
        traineeService.createTrainee(trainee);
        Trainee selectedTrainee = traineeService.selectTrainee(1L);
        assertNotNull(selectedTrainee, "Selected trainee should not be null");
        assertEquals("John", selectedTrainee.getFirstName(), "Selected trainee first name should match");
    }
}