package com.example.myhealth;

public class user_info {

    //general user variables
    public String userName;
    public int age, height, weight;
    public String id;

    //physical health variables
    public int walkedDistanceInKm, stepsCount, extraBurnedCalories;
    public int totalBurnedCalories;

    //mental health variables
    public int mentalHealthProgress;

    //nutrition variables
    public int caloriesNeededToTake, totalCalorieIntake;

    //hydration variables
    public int waterNeed, waterTaken;



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public int getWater() {
        return waterNeed;
    }

    public void setWater(int water) {
        this.waterNeed = water;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWaterNeed() {
        return waterNeed;
    }

    public void setWaterNeed(int waterNeed) {
        this.waterNeed = waterNeed;
    }

    public int getWalkedDistanceInKm() {
        return walkedDistanceInKm;
    }

    public void setWalkedDistanceInKm(int walkedDistanceInKm) {
        this.walkedDistanceInKm = walkedDistanceInKm;
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

    public int getTotalBurnedCalories() {
        return totalBurnedCalories;
    }

    public void setTotalBurnedCalories(int totalBurnedCalories) {
        this.totalBurnedCalories = totalBurnedCalories;
    }

    public int getMentalHealthProgress() {
        return mentalHealthProgress;
    }

    public void setMentalHealthProgress(int mentalHealthProgress) {
        this.mentalHealthProgress = mentalHealthProgress;
    }

    public int getCaloriesNeededToTake() {
        return caloriesNeededToTake;
    }

    public void setCaloriesNeededToTake(int caloriesNeededToTake) {
        this.caloriesNeededToTake = caloriesNeededToTake;
    }

    public int getTotalCalorieIntake() {
        return totalCalorieIntake;
    }

    public void setTotalCalorieIntake(int totalCalorieIntake) {
        this.totalCalorieIntake = totalCalorieIntake;
    }

    public int getWaterTaken() {
        return waterTaken;
    }

    public void setWaterTaken(int waterTaken) {
        this.waterTaken = waterTaken;
    }

    public user_info() {
    }


    public user_info(String userName, int age, int height, int weight, String id, int walkedDistanceInKm, int stepsCount, int extraBurnedCalories, int totalBurnedCalories, int mentalHealthProgress, int caloriesNeededToTake, int totalCalorieIntake, int waterNeed, int waterTaken) {
        this.userName = userName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.id = id;
        this.walkedDistanceInKm = walkedDistanceInKm;
        this.stepsCount = stepsCount;
        this.extraBurnedCalories = extraBurnedCalories;
        this.totalBurnedCalories = totalBurnedCalories;
        this.mentalHealthProgress = mentalHealthProgress;
        this.caloriesNeededToTake = caloriesNeededToTake;
        this.totalCalorieIntake = totalCalorieIntake;
        this.waterNeed = waterNeed;
        this.waterTaken = waterTaken;
    }
}
