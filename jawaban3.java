/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ULANGAN;

/**
 *
 * @author Acer
 */
public class jawaban3 {
    public static void main (String [] args) {
        byte [] b = new byte[5];
        System.out.print("Input Bilangan Bulat :");
        try{
            System.in.read(b);
        }catch (java.io.IOException e){
            System.err.println(e);
        }String c = new String(b).trim();
        int N = Integer.valueOf(c);
        System.out.println("Hasilnya : "+(N+2));
    }
}
