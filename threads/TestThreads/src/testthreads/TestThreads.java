/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testthreads;

/**
 *
 * @author jconner
 */
public class TestThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new Thread(new NewThread("child1")).start();
        new Thread(new NewThread("child2")).start();

        for (int x = 0; x < 100; x++) {
            System.out.println("parent " + x);
        }
    }

}
