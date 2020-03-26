/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs1102;

/**
 *
 * @author VIJ Global
 */
import javax.swing.JOptionPane;

public class myObject {
    public static String world;
    public static int num = 1;
    public static String siteWorld(){
        //while (true){ 
            world = JOptionPane.showInputDialog("Enter the name of a planet: \n");
            if (world.equals("")){
                JOptionPane.showMessageDialog(null,"No planet added");
                num -= 1;
                //break;
            }
            JOptionPane.showMessageDialog(null, "number " + num + " is " + world);
            //num += 1;
     // }
    return (world + " is my planet number " + num);
    }
    public static void main(String[] args){
        //siteWorld();
        myObject wld;
        wld = new myObject();
        System.out.println("this is the number of your worlds: ");
        System.out.println(wld.siteWorld());
    }
}
/* static class String object(){
String std = new myObject();
} */