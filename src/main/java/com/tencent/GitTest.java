package com.tencent;

/**
 * GitTest.java
 *
 * @Author: CZQ
 * @CreateTime: 21:36-2021/3/21
 * @Description:
 */
public class GitTest {
    private int aa;
    public static void main(String[] args) {

        int count = 1000;

        /*for (int i = 0; i < 3; i++) {
            while (count>=1){
                System.out.println("gooood");
                break;
            }
        }*/

        int sum = 0;
        int cout = 0;
        for (int i = 0; i < 100; i++) {
            if (i%2!=0){
                sum+=i;
            }
        }

        /*
        * */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("ggg");
                continue;
            }
            System.out.println("eee");
        }
    }
}
