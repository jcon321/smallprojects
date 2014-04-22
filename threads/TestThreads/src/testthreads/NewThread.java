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
public class NewThread implements Runnable {

    Thread t;

    public NewThread(String name) {
        t = new Thread();
        t.setName(name);
        System.out.println(t);
    }

    @Override
    public void run() {
        for (int x = 0; x < 100; x++) {
            System.out.println(t.getName() + " " + x);
        }
    }

}
