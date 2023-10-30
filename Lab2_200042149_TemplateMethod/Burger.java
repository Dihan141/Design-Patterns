package Lab2_200042149_TemplateMethod;

abstract public class Burger {
    private String bun;
    private String patty;
    private String toppings;

    public void setPatty(String patty) {
        this.patty = patty;
    }

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public String getToppings() {
        return toppings;
    }

    public String getPatty() {
        return patty;
    }

    public String getBun() {
        return bun;
    }

    //Template method
    final public void CreateBurger(){
        AddBun();
        AddPatty();
        AddToppings();
    }
    protected abstract void AddPatty();
    protected abstract void AddBun();
    protected abstract void AddToppings();

    @Override
    public String toString() {
        String line = "Burger with " + bun + ", " + patty + " and " + toppings;
        return line;
    }
}
