package hello.model;

/**
 * Created by mengliang on 2018/9/1.
 * Copyright (c) 2015年 Vipshop Holdings Limited. All rights reserved.
 */
public class UserScore {
    private Integer userId;
    private String username;
    private Integer points;
    private Integer goalDifferential;
    private Integer goals;

    public UserScore() {
        points = 0;
        goalDifferential = 0;
        goals = 0;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getGoalDifferential() {
        return goalDifferential;
    }

    public void setGoalDifferential(Integer goalDifferential) {
        this.goalDifferential = goalDifferential;
    }

    public Integer getGoals() {
        return goals;
    }

    public void setGoals(Integer goals) {
        this.goals = goals;
    }
}
