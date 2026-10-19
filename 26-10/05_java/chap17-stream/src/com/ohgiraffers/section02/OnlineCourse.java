package com.ohgiraffers.section02;

public class OnlineCourse {

    private String title;
    private String category;
    private int duration;
    private boolean isFree;

    public OnlineCourse(String title, String category, int duration, boolean isFree) {
        this.title = title;
        this.category = category;
        this.duration = duration;
        this.isFree = isFree;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    @Override
    public String toString() {
        return "OnlineCourse{" +
                "title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", duration=" + duration +
                ", isFree=" + isFree +
                '}';
    }
}
