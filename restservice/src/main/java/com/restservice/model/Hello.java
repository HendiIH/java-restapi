package com.restservice.model;


public class Hello {
  private final long id;
  private final String userName;

  public Hello(){
    this.id = -1;
    this.userName = "";
  }

  public Hello(long id, String userName){
    this.id = id;
    this.userName = userName;
  }

  public long getId(){
    return id;
  }

  public String getUserName(){
    return userName;
  }
}
