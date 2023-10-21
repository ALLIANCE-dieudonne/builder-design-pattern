package org.alliance;

public class Burger {

  private String size;
  private boolean egg;
  private boolean extraCheese;
  private boolean mayonnaise;
  private boolean onion;

  private Burger(BurgerBuilder burgerBuilder) {
    //initialize all fields and to add validations

  }

  @Override
  public String toString() {
    return "Burger{" +
      "size='" + size + '\'' +
      ", egg=" + egg +
      ", extraCheese=" + extraCheese +
      ", mayonnaise=" + mayonnaise +
      ", onion=" + onion +
      '}';
  }

  public String getSize() {
    return size;
  }

  public boolean isEgg() {
    return egg;
  }

  public boolean isExtraCheese() {
    return extraCheese;
  }

  public boolean isMayonnaise() {
    return mayonnaise;
  }

  public boolean isOnion() {
    return onion;
  }

  public static class BurgerBuilder {

    private String size;
    private boolean egg;
    private boolean extraCheese;
    private boolean mayonnaise;
    private boolean onion;

    public BurgerBuilder size(String size) {
      this.size = size;
      return this;
    }

    public BurgerBuilder egg(boolean egg) {
      this.egg = egg;
      return this;
    }

    public BurgerBuilder extraCheese(boolean extraCheese) {
      this.extraCheese = extraCheese;
      return this;
    }

    public BurgerBuilder mayonaise(boolean mayonnaise) {
      this.mayonnaise = mayonnaise;
      return this;
    }

    public BurgerBuilder onion(boolean onion) {
      this.onion = onion;
      return this;
    }

    public Burger build(){
      return new Burger(this);
    }


  }

}
