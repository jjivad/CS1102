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
public class objectClass {
    public String world;
    public int num;
    public String status;
    public String getWold(){
        return (world);
    }
    public int getNum(){
        return(num);
    }
    public String getStatus(){
        return(status);
    }
    public objectClass(String world, int num, String status){
        this.world = world;
        this.num = num;
        this.status = status;
    }
    public String mySentence(){
        return(world + " is my planet number," + num + " and it is " + status);
    }
    public static void main(String[] args){
        objectClass wld1 = new objectClass("Earth", 1, "habitable");
        objectClass wld2 = new objectClass("Mars", 2, "inhabitable");
        System.out.println(wld1.mySentence());
        System.out.println(wld2.mySentence());
    }
}
