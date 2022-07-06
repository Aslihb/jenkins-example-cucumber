package com.planetpope.cucumber;

public class Calculator {
  public Calculator() {}

  public int add(int x,int y) {
    return x+y;
  } // PL-347: When user try take sum of 2 and 3 it is failing => PL-346
  
}

// JIRA PL-346: Create a function will take sum of two numbers
// Developer:
// Platform, PL-1, PL-2,
