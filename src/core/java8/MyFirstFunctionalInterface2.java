package core.java8;

@FunctionalInterface
public interface MyFirstFunctionalInterface2
{
    public void firstWork();
 
    default void doSomeMoreWork1(){
    //Method body
    }
 
    default void doSomeMoreWork2(){
    //Method body
    }
}