package com.ssm.domain;

import java.sql.Time;

public class counter {
  private int counterId;
  private String serviceType;
  private String employeeName;
  private int capacity;
  private Time openTime;
  private Integer status;

    public int getCounterId() {
        return counterId;
    }

    public void setCounterId(int counterId) {
        this.counterId = counterId;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Time getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Time openTime) {
        this.openTime = openTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "counter{" +
                "counterId=" + counterId +
                ", serviceType='" + serviceType + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", capacity=" + capacity +
                ", openTime='" + openTime + '\'' +
                ", status=" + status +
                '}';
    }
}
