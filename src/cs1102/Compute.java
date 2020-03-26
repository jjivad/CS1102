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
public class Compute {
    static int compute() { return 42; }
    static int compute(int i) { return i+1; }
    public static void main(String[] args) {
        System.out.println(compute(compute(0)));
    }   
}
