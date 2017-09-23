/**
 * Created by June on 9/23/2017.
 */
public class Student {
    public static void main(String[]args) {
        String name = "June";
        int age = 18;
        String college = "Jkuat";
        int javaMarks = 50;
        int phpmarks = 70;
        int pythonmarks =45;
        int sum=0;
        sum= add(javaMarks,phpmarks,pythonmarks);
        int average =0;
        average = average(sum);


        System.out.println("the name of student:" + name);
        System.out.println("age: " + age);
        System.out.println("college :" + college);
        System.out.println("java Marks :" + javaMarks);
        System.out.println("php Marks :" + phpmarks);
        System.out.println("pythonmarks :" +pythonmarks);
        System.out.println("sum ;" +sum);
        System.out.println("average :"+average);

    }

    public static int add(int javaMarks, int phpmarks,int pythonmarks) {
        return javaMarks+phpmarks+pythonmarks;

    }

    public static int average (int sum){
        return sum/3;

    }


}

