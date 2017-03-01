/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echo;

/**
 *
 * @author micha
 */
public class Echo_BL implements Runnable {

    private String wort;

    public Echo_BL(String s) {
        wort = s;
    }

    @Override
    public void run() {

        while (wort.length() >= 2) {
          String str= wort.substring(0, 2);
            System.out.println(str);
            wort = wort.substring(2);
        }
        if(wort.equals("")!=true){
            System.out.println(wort);
        }

    }

}
