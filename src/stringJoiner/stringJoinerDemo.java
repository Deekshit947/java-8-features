package stringJoiner;

import java.util.StringJoiner;

public class stringJoinerDemo {

    public static void main(String[] args) {

        StringJoiner sj1 = new StringJoiner(",");
        sj1.add("Java").add("Python").add("C++");
        System.out.println("Joined: " + sj1);

        StringJoiner sj2 = new StringJoiner(",", "[", "]");
        sj2.add("A").add("B").add("C");
        System.out.println("With Prefix/Suffix: " + sj2);

        StringJoiner sj3 = new StringJoiner(",");
        sj3.setEmptyValue("No Data");
        System.out.println("Empty: " + sj3);

        sj1.merge(sj2);
        System.out.println("Merged: " + sj1);
    }
}

