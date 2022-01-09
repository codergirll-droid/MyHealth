package com.example.myhealth;

import com.google.firebase.firestore.Exclude;

public class user_stats {



    @Exclude
    public String id;
    public String Name;
    public int Age = 18;
    public int Height = 160;
    public int Weight = 60;
    public int distanceInKm = 0;
    public int stepsCount = 0;
    public int extraBurnedCalories = 0;
    public float totalCaloriesBurned = 0f;
    //calculate according to age
    //steps, km etc
    public int medVideoSec = 0;
    public int breathExVideoSec = 0;
    public int watchedSeconds = 0;
    public int totalSeconds = medVideoSec + breathExVideoSec;
    public int totalCalorieIntake = 0;
    public int waterNeed = 0;
    //calculate according to age, weight etc.
    public int waterDrunk = 0;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(int distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public int getStepsCount() {
        return stepsCount;
    }

    public void setStepsCount(int stepsCount) {
        this.stepsCount = stepsCount;
    }

    public int getExtraBurnedCalories() {
        return extraBurnedCalories;
    }

    public void setExtraBurnedCalories(int extraBurnedCalories) {
        this.extraBurnedCalories = extraBurnedCalories;
    }

    public float getTotalCaloriesBurned() {
        return totalCaloriesBurned;
    }

    public void setTotalCaloriesBurned(float totalCaloriesBurned) {
        this.totalCaloriesBurned = totalCaloriesBurned;
    }

    public int getMedVideoSec() {
        return medVideoSec;
    }

    public void setMedVideoSec(int medVideoSec) {
        this.medVideoSec = medVideoSec;
    }

    public int getBreathExVideoSec() {
        return breathExVideoSec;
    }

    public void setBreathExVideoSec(int breathExVideoSec) {
        this.breathExVideoSec = breathExVideoSec;
    }

    public int getWatchedSeconds() {
        return watchedSeconds;
    }

    public void setWatchedSeconds(int watchedSeconds) {
        this.watchedSeconds = watchedSeconds;
    }

    public int getTotalSeconds() {
        return totalSeconds;
    }

    public void setTotalSeconds(int totalSeconds) {
        this.totalSeconds = totalSeconds;
    }

    public int getTotalCalorieIntake() {
        return totalCalorieIntake;
    }

    public void setTotalCalorieIntake(int totalCalorieIntake) {
        this.totalCalorieIntake = totalCalorieIntake;
    }

    public int getWaterNeed() {
        return waterNeed;
    }

    public void setWaterNeed(int waterNeed) {
        this.waterNeed = waterNeed;
    }

    public int getWaterDrunk() {
        return waterDrunk;
    }

    public void setWaterDrunk(int waterDrunk) {
        this.waterDrunk = waterDrunk;
    }


    public user_stats() {
    }

    public String  getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
