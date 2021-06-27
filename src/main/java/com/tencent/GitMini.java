package com.tencent;

/**
 * GitMini.java
 *
 * @Author: CZQ
 * @CreateTime: 19:32-2021/3/21
 * @Description:
 */
public class GitMini {




    public static void main(String[] args) {
        Student student = new Student();
        student.haha();
//        student.age = 12;
//        System.out.println(student.toString());
    }
}
class Student{

    public String name = "zhang3";


    public Integer age = 101000;

    int arr[][];



    public void haha(){

//      二维数组
        int[][] arr = new int[4][6];
        arr[1][2] = 1;
        arr[2][1] = 2;
        arr[2][3] = 3;

        for(int i = 0; i < 4; i++) {//
            for(int j = 0;j < 6;j++) {
                System.out.print(arr[i][j]+ " "); // 比如arr[0][0]
            }
            System.out.println();
        }
    }

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
