package com.test.rules.concrete;

public class Account {
    public boolean isChannelEligible(){
        return true;
    }
    public String getAccountStatus(){
        return "Active";
    }
    public Boolean setInEligible(){
        System.out.println("Product in ineligible: " + "0101," + "C2");
        return true;
    }
}
