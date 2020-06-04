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
public class jawaban1 {
    public static void main (String [] args) {
            int n = 0;
            try{
                System.out.print("Ketik Sesuatu :");
                n = System.in.read();
                System.out.println("Hasil :" +(char)n);
            }
            catch (Throwable e){
                System.err.println(e);
            }         
        }
}
