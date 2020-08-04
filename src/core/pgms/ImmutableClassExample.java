package core.pgms;

import java.util.Date;

public final class ImmutableClassExample {
    //Both String and Integer is Immutable
    private final String val1;
    private final Integer val2;

    //Date is a Mutable field
    private final Date date1;

    public ImmutableClassExample(String val1, Integer val2, Date date1) {
        this.val1 = val1;
        this.val2 = val2;
        this.date1 = new Date(date1.getTime());
    }

    public String getVal1() {
        return val1;
    }

    public Integer getVal2() {
        return val2;
    }

    public Date getDate() {
        return new Date(date1.getTime());
    }

    public static ImmutableClassExample getImmutableClassExampleObject(String a, Integer b, Date c) {
        return new ImmutableClassExample(a, b, c);
    }

    public String toString() {
        return val1 + " --- " + val2 + " --- " + date1;
    }
}