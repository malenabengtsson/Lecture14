package com.company;

public enum MainMenu implements hasDescription {
    ADD_ACCOUNT("Add account"),
    DELETE_ACCOUNT("Delete account"),
    SHOW_ACCOUNT_OVERVIEW("Show account overview"),
    QUIT("Quit");
    private String description;

    MainMenu(String description) {
        this.description = description;
    }

    @Override
    public String getInterface() {
        return description;
    }
}
