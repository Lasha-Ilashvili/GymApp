package com.internship.gym;

import com.internship.gym.data.service.TraineeServiceTest;
import com.internship.gym.data.service.TrainerServiceTest;
import com.internship.gym.data.service.TrainingServiceTest;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        TraineeServiceTest.class,
        TrainerServiceTest.class,
        TrainingServiceTest.class
})
public class GymServiceTests {
}