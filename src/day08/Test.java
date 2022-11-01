package day08;

public class Test {

    public static void main(String[] args){
//        int i =10;
//        long l = i;
//
//        long l = 101;
//        int i = (int)l;

//        Student s = new Student();
//
//        Person p = s;//从子类到父类的类型转换可以自动进行

        Person p = new Student();
         p = new Student();
        Student s = (Student)p;//直接这样写会报错
        //day08.Person cannot be cast to day08.Student
        //	at day08.Test.main(Test.java:17)
        //需要父类Person进行一次向上转型(Person p = new Student();)之后才可以强制转换


    }
}
