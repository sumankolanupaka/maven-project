package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
  *hello name method
  *@param name string
  *@return hello name string
  **/
  public String greet(String someone) {
    return String.format("Hello, %s!", someone);
  }
}
