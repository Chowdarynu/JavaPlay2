package core.java8;

@FunctionalInterface
public interface Runnable {
    void run();

    //public void display();
    //If we add one more method it will give compilation error like multiple non over ride methods..
}
//SAM(single abstract method interface)