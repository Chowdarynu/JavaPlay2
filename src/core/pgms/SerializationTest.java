package core.pgms;

import java.io.*;

public class SerializationTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        serialize();
        deserialize();
    }

    private static void deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("C://tmp/test.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
//        /A o = (A)ois.readObject();
        B o = (B)ois.readObject();
        System.out.println("******"+o);
    }

    private static void serialize() throws IOException {

        FileOutputStream fous = new FileOutputStream("C://tmp/test.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fous);
        /*A a= new A();
        a.a=10;
        a.setB(20);
        a.name="NC";*/

        B obj = new B();
        obj.bb = 30;
        oos.writeObject(obj);
    }

}

class A {
    int a;

    String name;

    private static int b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "A{" +
                "a=" + a +
                ", name='" + name + '\'' +
                ", b=" + b +
                '}';
    }
}

class B extends A implements Serializable{
    int bb;
}
