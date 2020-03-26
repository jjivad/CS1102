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
public class Zap {
    static boolean zap() { return true; }
    static int zap(boolean x) { return 0; }
    static double zap(int x) { return 0.5; }
    static String zap(double x) { return "Zap!"; }
    static boolean zap(String x) { return false; }
    public static void main(String[] args) {
        System.out.println(zap(zap(zap(zap()))));
    }  
}
