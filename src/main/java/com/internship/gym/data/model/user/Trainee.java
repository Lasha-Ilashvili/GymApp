package com.internship.gym.data.model.user;

import com.internship.gym.data.model.user.base.User;

public class Trainee extends User {

    private long traineeId;
    private String address;
    private String dateOfBirth;

    public Trainee(String firstName, String lastName, String userName, String password, boolean isActivate, long traineeId, String address, String dateOfBirth) {
        super(firstName, lastName, userName, password, isActivate);
        this.traineeId = traineeId;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public long getTraineeId() {
        return traineeId;
    }

    public void setTraineeId(long traineeId) {
        this.traineeId = traineeId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "traineeId=" + traineeId +
                ", address='" + address + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                super.toString() +
                '}';
    }
}