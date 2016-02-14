package com.shail.model;

public class Person {

  private int mID;
  private String name;
  private String password;


  public Person() {
    // Empty Constructor...
  }

  public int getID() {
    return mID;
  }

  public void setID(int ID) {
    this.mID = ID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
