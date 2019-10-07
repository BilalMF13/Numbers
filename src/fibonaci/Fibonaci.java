/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaci;

/**
 *
 * @author fakih
 */
public class Fibonaci {
    public static void main(String[] args) {
        
        int [] fib = new int [20];
        
        fib[0] = 0;
        fib[1] = 1;
        
        System.out.printf("000     " + "%05d\n",fib[0]);
        System.out.printf("001     " + "%05d\n",fib[1]);
        
        for(int i = 2; i < fib.length; i++)
        {
            fib[i] = fib[i-2] + fib[i-1];
                        
            System.out.printf("%03d" + "     " +"%05d\n", i, fib[i]);
        }//ends loop
        
        System.out.printf("Have a good day!");
        
    }//ends main
}//ends class
