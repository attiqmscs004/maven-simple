package com.github.jitpack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println(new App().greet("Jenkins"));
    }

    public String greet(String name) {
        return "Hello " + name;
    }
}
