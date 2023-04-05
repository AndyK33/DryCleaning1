package com.andiek.drycleaning;

public class Client {
    private String mName;
    private String mPassword;
    private String mLogin;
    private String mEmail;
    private int mCountOrder;

    public Client(String name, String password, String login, String email, int countOrder) {
        mName = name;
        mPassword = password;
        mLogin = login;
        mEmail = email;
        mCountOrder = countOrder;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        mPassword = password;
    }

    public String getLogin() {
        return mLogin;
    }

    public void setLogin(String login) {
        mLogin = login;
    }

    public String getEmail() {
        return mEmail;
    }

    public void setEmail(String email) {
        mEmail = email;
    }

    public int getCountOrder() {
        return mCountOrder;
    }

    public void setCountOrder(int countOrder) {
        mCountOrder = countOrder;
    }
}
