package com.tencent;

/**
 * GitDemo.java
 *
 * @Author: CZQ
 * @CreateTime: 17:47-2021/3/21
 * @Description:
 */
public class GitDemo {

        public static void main(String[] args) {

//单心

            heart(15,1.0,"love");

//双心

            heartTwo(15,0.9,"爱","梁山伯","祝英台");

//点缀

            heartTwoWithXK(15,0.9,"爱","梁山伯","祝英台");

        }

        private static void heart(int r,double size,String req){

            size=1/(1.5*r*size);

            StringBuilder sb=new StringBuilder();

            for (int y = r; y > -r; y--,sb.append("\n"))

                for (int x = -2*r; x < 2*r; x++ ) {

                    char msg=(req + req).charAt((x - y) % req.length() + req.length());

                    sb.append((inHeart(size,x,y)?msg+ " " : " "));

                }

            System.err.println(sb.toString());

        }

    private static boolean inHeart(double size, int x, int y) {
        return false;
    }

    private static void heartTwo(int r,double size,String center,String left,String right){

            size=1/(1.5*r*size);

            StringBuilder sb=new StringBuilder();

            for (int y = r; y > -r; y--,sb.append("\n"))

                for (int x = -2*r; x <4*r; x++ ) {

                    boolean isLeft=inHeart(size,x,y);

                    boolean isRight=inHeart(size,x-25,y-3);

//双空格

                    String req=null;

                    if(isLeft && isRight) req=center;

                    else if(isLeft) req=left;

                    else if (isRight) req=right;

                    if(req!=null) sb.append((req + req).charAt((x - y) % req.length() + req.length()));

                    else sb.append(" ");//双空格

                }

            System.err.println(sb.toString());

        }

        private static void heartTwoWithXK(int r,double size,String center,String left,String right){

            size=1/(1.5*r*size);

            StringBuilder sb=new StringBuilder();

            for (int y = r; y >=-r; y--,sb.append("\n"))

                for (int x = -2*r; x <= 4*r; x++ ) {

                    boolean isLeft=inHeart(size,x,y+3);

                    boolean isRight=inHeart(size,x-25,y);

//双空格

                    String req=null;

                    String w="";

                    if(isLeft && isRight) req=center;

                    else if(isLeft) req=left;

                    else if (isRight) req=right;

                    else if((y==-r || y==r)) {

                        if (x < 3 * r - 7) {

                            req = "♥";

                            w = " ";

                        }

                    }

                    else if(x==4*r || x==-2*r || line(x,y+3)) req="♥";

                    if(req!=null) sb.append((req + req).charAt((x - y) % req.length() + req.length()) + w);

                    else sb.append(" ");//双空格

                }
        System.out.println("hello world");
        System.out.println("world is a fdfdf");
        System.out.println("this is a good job");
        System.out.println("i love uu");

    }

    private static boolean line(int x, int i) {
        return false;
    }
}
