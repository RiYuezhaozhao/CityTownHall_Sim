package com.ssm.domain;

public class people {
    private String Name;
    private String serviceType;
    private int time;

    public people(String name, String serviceType, int time) {
        Name = name;
        this.serviceType = serviceType;
        this.time = time;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
