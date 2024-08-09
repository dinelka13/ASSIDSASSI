package com.codegama.assignmentassistant.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity
public class Assignment implements Serializable {

    @PrimaryKey(autoGenerate = true)
    int assignmentId;
    @ColumnInfo(name = "assignmentTitle")
    String assignmentTitle;
    @ColumnInfo(name = "date")
    String date;
    @ColumnInfo(name = "assignmentDescription")
    String assignmentDescrption;
    @ColumnInfo(name = "isComplete")
    boolean isComplete;
    @ColumnInfo(name = "firstAlarmTime")
    String firstAlarmTime;
    @ColumnInfo(name = "secondAlarmTime")
    String secondAlarmTime;
    @ColumnInfo(name = "lastAlarm")
    String lastAlarm;
    @ColumnInfo(name = "event")
    String event;

    public Assignment() {

    }

    public boolean isComplete() {
        return isComplete;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public String getFirstAlarmTime() {
        return firstAlarmTime;
    }

    public void setFirstAlarmTime(String firstAlarmTime) {
        this.firstAlarmTime = firstAlarmTime;
    }

    public String getSecondAlarmTime() {
        return secondAlarmTime;
    }

    public void setSecondAlarmTime(String secondAlarmTime) {
        this.secondAlarmTime = secondAlarmTime;
    }

    public String getLastAlarm() {
        return lastAlarm;
    }

    public void setLastAlarm(String lastAlarm) {
        this.lastAlarm = lastAlarm;
    }

    public int getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(int assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getAssignmentTitle() {
        return assignmentTitle;
    }

    public void setAssignmentTitle(String assignmentTitle) {
        this.assignmentTitle = assignmentTitle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAssignmentDescrption() {
        return assignmentDescrption;
    }

    public void setAssignmentDescrption(String assignmentDescrption) {
        this.assignmentDescrption = assignmentDescrption;
    }
}