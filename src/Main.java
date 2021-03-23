public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itzemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is " + hamburger.itzemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthyAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition2("Lentils", 3.41);
        System.out.println("Total healthy Burger price is " + healthyBurger.itzemizeHamburger());


        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition3("Should no do this", 50.53);
        System.out.println("Total Deluxe Burger price is " + db.itzemizeHamburger());
    }
}
