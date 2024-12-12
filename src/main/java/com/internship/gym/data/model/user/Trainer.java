package com.internship.gym.data.model.user;

import com.internship.gym.data.model.user.base.User;

public class Trainer extends User {

    private long trainerId;
    private String specialization;

    public Trainer(String firstName, String lastName, String userName, String password, boolean isActivate, long trainerId, String specialization) {
        super(firstName, lastName, userName, password, isActivate);
        this.trainerId = trainerId;
        this.specialization = specialization;
    }

    public long getTrainerId() {
        return trainerId;
    }

    public void setTrainerId(long trainerId) {
        this.trainerId = trainerId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainerId=" + trainerId +
                ", specialization='" + specialization + '\'' +
                super.toString() +
                '}';
    }
}