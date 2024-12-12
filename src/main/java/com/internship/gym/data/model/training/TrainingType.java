package com.internship.gym.data.model.training;

public class TrainingType {

    private String trainingType;

    public TrainingType(String trainingType) {
        this.trainingType = trainingType;
    }

    public String getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }

    @Override
    public String toString() {
        return "TrainingType{" +
                "trainingType='" + trainingType + '\'' +
                '}';
    }
}