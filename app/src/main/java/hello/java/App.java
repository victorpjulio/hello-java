/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hello.java;

/**
 *  This is a sample project for the Data Structures class.
 *  <p>It provides an example to follow in building programming
 *  projects during the semester.
 *  @version    1.0     2022-08-28
 *  @author     Victor Julio
 */
public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
