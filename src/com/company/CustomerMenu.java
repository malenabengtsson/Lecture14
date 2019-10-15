package com.company;

public enum CustomerMenu implements hasDescription {
    SHOW_ACCOUNT_DETAILS("Show account details"),
    INSERT_MONEY("Insert money"),
    LOG_OUT("Log out")
    ;
    private String description;
    CustomerMenu(String description){
        this.description = description;
    }

    @Override
    public String getInterface() {
        return description;
    }

}

