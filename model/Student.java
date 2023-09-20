package model;

import java.util.Arrays;

public class Student {
    private int id;
    private String name;
    private double [] score;
    private String sex;
    public Student (int id, String name, double [] score ,String sex){
        this.id = id;
        this.name = name;
        this.score = score;
        this.sex = sex;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getScore() {
        return score;
    }

    public void setScore(double[] score) {
        this.score = score;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + Arrays.toString(score) +
                ", sex='" + sex + '\'' +
                '}';
    }
}

