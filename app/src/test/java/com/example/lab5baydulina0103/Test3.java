package com.example.lab5baydulina0103;

import com.example.lab5baydulina0103.Task3.Movable;
import com.example.lab5baydulina0103.Task3.MovablePoint;
import org.junit.Test;

public class Test3 {

    @Test
    public void test() {
        MovablePoint p1 = new MovablePoint(0,0);
        System.out.println(p1);
        p1.moveDown();
        p1.moveDown();
        System.out.println(p1);
        p1.moveRight();
        System.out.println(p1);

        Movable p2 = new MovablePoint(2,3);
        p2.moveUP();
        System.out.println(p2);
    }
}
