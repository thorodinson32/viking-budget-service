package com.viking.vikingbudget.vikingbudgetservice.model;

import com.google.cloud.Timestamp;

import java.util.List;

public class Account {

    private String id;
    private double balance;
    private List<User> users;
    private List<Detail> details;
    private Timestamp createTs;
    private Timestamp modifyTs;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public Timestamp getCreateTs() {
        return createTs;
    }

    public void setCreateTs(Timestamp createTs) {
        this.createTs = createTs;
    }

    public Timestamp getModifyTs() {
        return modifyTs;
    }

    public void setModifyTs(Timestamp modifyTs) {
        this.modifyTs = modifyTs;
    }

}
