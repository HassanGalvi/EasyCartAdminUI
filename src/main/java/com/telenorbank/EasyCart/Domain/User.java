package com.telenorbank.EasyCart.Domain;

public class User {
    private String fname;
    private String lname;
    private String address;
    private String email;
    private String password;
    private Long cellnum;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getCellnum() {
        return cellnum;
    }

    public void setCellnum(Long cellnum) {
        this.cellnum = cellnum;
    }
}
