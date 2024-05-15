/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.library.objects;

/**
 * @author Jareth Bayron Baur
 * @since February 26, 2024
 */
public class Logs {

    private int logID;
    private String action;
    private String logType;
    private String timeStamp;

    public Logs(int logID, String action, String logType, String timeStamp) {
        this.logID = logID;
        this.action = action;
        this.logType = logType;
        this.timeStamp = timeStamp;
    }

    public Logs(String action, String logType, String timeStamp) {
        this.action = action;
        this.logType = logType;
        this.timeStamp = timeStamp;
    }

    public Logs() {
    }

    public int getLogID() {
        return logID;
    }

    public void setLogID(int logID) {
        this.logID = logID;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getLogType() {
        return logType;
    }

    public void setLogType(String logType) {
        this.logType = logType;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * @returns the fields to string
     */
    @Override
    public String toString() {
        return "Logs{" + "logID=" + logID + ", action=" + action + ", logType=" + logType + ", timeStamp=" + timeStamp + '}';
    }
}
