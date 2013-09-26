package com.github.tachesimazzoca.jboss.hello;

public class HelloDao {
    public String findMessage() {
       return "Hello World! via " + this.toString();
    }
}
