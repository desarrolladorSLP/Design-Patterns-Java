/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devslp.designpatterns.singleton.testExample;

import java.util.Random;

public class MessageLoop implements Runnable {
    String name;

    public MessageLoop(String name) {
        this.name = name;
    }

    public void run() {
        Random rand = new Random();
        long rgenseed = System.currentTimeMillis();
        rand.setSeed(rgenseed);
        try {
            while (true) {
                Thread.sleep(rand.nextInt(500));
                Logger.getInstance().loggerString(name + " says hi\r\n");
            }
        } catch (InterruptedException e) {
            Logger.getInstance().loggerString("Exception caugth: " + e.getMessage());
        }
    }
}
