package cs1102;

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
public class Food {
    
    /*static int count;
    private String flavor = "sweet";
    Food() { count++; }
    void setFlavor(String s) { flavor = s; }
    String getFlavor() { return flavor; }
    static public void main(String[] args) {
        Food pepper = new Food();
        pepper.setFlavor("spicy");
        System.out.println(pepper.getFlavor());
    }
    */
    /*
    static int count;
    private String flavor = "sweet";
    Food(String s) { flavor = s; }
    void setFlavor(String s) { flavor = s; }
    String getFlavor() { return flavor; }
    static public void main(String[] args) {
        Food pepper = new Food();
        System.out.println(pepper.getFlavor());
    }
    */
    /*
    static int count;
    private String flavor = "sweet";
    Food(String s) { flavor = s; }
    void setFlavor(String s) { flavor = s; }
    String getFlavor() { return flavor; }
    static public void main(String[] args) {
        Food pepper = new Food("spicy");
        Food chile = pepper;
        pepper.setFlavor("smoky");
        System.out.println(pepper == chile);
    }
}
*/
/*
public class Food {
    static int count;
    private String flavor = "sweet";
    Food(String s) { flavor = s; }
    void setFlavor(String s) { flavor = s; }
    String getFlavor() { return flavor; }
    static public void main(String[] args) {
        Food pepper = new Food("spicy");
        System.out.println(pepper.getFlavor());
    }
}
*/
/*
public class Food {
    static int count;
    private String flavor = "sweet";
    Food() { count++; }
    void setFlavor(String s) { flavor = s; }
    String getFlavor() { return flavor; }
    static public void main(String[] args) {
        Food pepper = new Food();
        new Food();
        System.out.println(pepper.count);
    }
}
*/
/*
public class Food {
    static int count;
    private String flavor = "sweet";
    Food(String s) { flavor = s; }
    void setFlavor(String s) { flavor = s; }
    String getFlavor() { return flavor; }
    static public void main(String[] args) {
        Food pepper = new Food("spicy");
        Food chile = new Food("spicy");
        System.out.println(pepper == chile);
    }
}
*/
public class Food {
    static int count;
    private String flavor = "sweet";
    Food(String s) { flavor = s; }
    void setFlavor(String s) { flavor = s; }
    String getFlavor() { return flavor; }
    static public void main(String[] args) {
        Food pepper = new Food("spicy");
        Food chile = pepper;
        pepper.setFlavor("smoky");
        System.out.println(chile.getFlavor());
    }
}