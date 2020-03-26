/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VIJ Global
 */
/*
public class Pepper extends Food2  {
    //Pepper() { this("spicy"); }
    //Pepper(String flavor) { System.out.println(flavor); }
    //Pepper() { System.out.println("spicy"); }
    //void flavor() { System.out.println("spicy"); }
    //void printFlavor() { System.out.println("spicy"); }
    Pepper() { super("spicy"); }
}
*/
/*
class Pepper extends Food2 {
    void flavor() { System.out.println("spicy"); }
}
*/

//class Pepper extends Food2 {}
/*
class Pepper extends Food2 {
    String flavor = "spicy";
}
*/
/*
class Pepper extends Food2 {
    String flavor = "spicy";
}
*/
/*
class Pepper implements Food2 {
    public void printFlavor() { System.out.println("spicy"); }
}
*/
class Pepper extends Food2 {
    String flavor = "spicy";
    Pepper(String flavor) { this.flavor = flavor; }
}