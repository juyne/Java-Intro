package com.thecodevillage.intro;

import com.thecodevillage.common.MyFunctions;

import java.util.Scanner;

/**
 * Created by June on 9/23/2017.
 */
public class StudentMain {
    public static void main(String[]args) {
        Scanner scanner=new Scanner(System.in);

        //create an object of student class
        Student june=new Student();
        june.setName("June Kimaiyo");
        june.setAge(23);
        june.setCollege("jkuat");
        june.setJavaMarks(60);
        june.setPhpMarks(50);
        june.setPythonMarks(80);
        june.setSum(MyFunctions.add(june.getJavaMarks(),june.getPhpMarks(),june.getPythonMarks()));
        june.setAverage(MyFunctions.average(june.getSum()));

//        String name = "june";
//        int age = 18;
//        String college = "Jkuat";
//        int javaMarks = 50;
//        int phpmarks = 70;
//        int pythonmarks =45;
//        int sum=0;

//        name = june.getName();
//        age = june.getAge();


//        sum= MyFunctions.add(javaMarks,phpmarks,pythonmarks);
//        int average =0;
//        average = MyFunctions.average(sum);


        System.out.println("the name of student:" + june.getName());
        System.out.println("age: " + june.getAge());
        System.out.println("college :" + june.getCollege());
        System.out.println("java Marks :" + june.getJavaMarks());
        System.out.println("php Marks :" + june.getPhpMarks());
        System.out.println("pythonmarks :" + june.getPythonMarks());
        System.out.println("sum ;" + june.getSum());
        System.out.println("average :" +june.getAverage());

        System.out.println("Enter your name:");
        june.setName(scanner.next());


        System.out.println("enter your age :" );
        june.setAge  (scanner.nextInt());

        System.out.println("enter your college :");
        june.setCollege(scanner.next());

        System.out.println("Enter your java marks:");
        june.setJavaMarks(scanner.nextInt());

        System.out.println("enter your php marks");
        june.setPhpMarks(scanner.nextInt());

        System.out.println("enter your pythonmarks");
        june.setPythonMarks(scanner.nextInt());


        june.setSum(MyFunctions.add(june.getJavaMarks(),june.getPhpMarks(),june.getPythonMarks()));
        june.setAverage(MyFunctions.average(june.getSum()));

        System.out.println("the name of student:" +june.getName());
        System.out.println("age :" + june.getAge());
        System.out.println("college :" +june.getCollege());
        System.out.println("java Marks :" + june.getJavaMarks());
        System.out.println ("php marks :"+june.getPhpMarks());
        System.out.println("python marks :" + june.getPythonMarks());
        System.out.println("sum :" +june.getSum() );
        System.out.println("average :" + june.getAverage());




    }




}

