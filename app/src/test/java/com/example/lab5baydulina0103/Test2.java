package com.example.lab5baydulina0103;

import com.example.lab5baydulina0103.Task2.*;
import org.junit.Test;

public class Test2 {
    @Test
    public void test() {
        Circle c1 = new Circle();
        System.out.println(c1);

        Rectangle r1 = new Rectangle();
        System.out.println(r1);

        Square s1 = new Square();
        s1.setLength(4);
        s1.setWidth(4);
        System.out.println(s1);
    }
}