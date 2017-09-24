package com.thecodevillage.intro;

import com.thecodevillage.common.MyRectangleFunctions;

import java.util.Scanner;

/**
 * Created by June on 9/24/2017.
 */
public class MyRectangleMain {

    public static void main(String[]args) {
        Scanner scanner=new Scanner(System.in);

        MyRectangle rectangle=new MyRectangle();
        rectangle.setLength(5);
        rectangle.setWidth(7);
        rectangle.setArea(MyRectangleFunctions.area(rectangle.getLength(),rectangle.getWidth()));

        System.out.println("Length =" + rectangle.getLength());
        System.out.println("width =" + rectangle.getWidth());
        System.out.println("area ="+ rectangle.getArea());

        System.out.println("enter length");
        rectangle.setLength(scanner.nextInt());

        System.out.println("enter width");
        rectangle.setWidth(scanner.nextInt());

        rectangle.setArea(MyRectangleFunctions.area(rectangle.getLength(),rectangle.getWidth()));

        System.out.println("Area =" +rectangle.getArea());
    }
}
