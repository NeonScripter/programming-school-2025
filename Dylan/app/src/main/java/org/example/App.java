/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        int y = 0;
        for(int x=0; x<=100; x++) {
            y+=x;
            System.out.println(x);
        }
        System.out.println(y);
        System.out.println(new App().getGreeting());
        System.out.println("DYLAN");
    }
}
