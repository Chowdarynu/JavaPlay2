package core;

class CallByValue2 {
    int data = 50;

    void change(CallByValue2 op) {
        op.data = op.data + 100;//changes will be in the instance variable
    }

    public static void main(String args[]) {
        CallByValue2 op = new CallByValue2();

        System.out.println("before change " + op.data);
        op.change(op);//passing object
        System.out.println("after change " + op.data);

    }
}
//50
//150