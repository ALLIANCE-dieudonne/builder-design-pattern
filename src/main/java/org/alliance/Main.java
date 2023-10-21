package org.alliance;

public class Main {
  public static void main(String[] args) {

    Burger burger = new Burger.BurgerBuilder()
      .mayonaise(true)
      .egg(true).extraCheese(false)
      .size("SMALL")
      .build();

    System.out.println(burger);
  }


}
