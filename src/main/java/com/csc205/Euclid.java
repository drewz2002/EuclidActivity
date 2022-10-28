package com.csc205;

public class Euclid {

    public static int gcd1(int a, int b) {

        if(b == 0){
            return a;
        }

        return gcd1(b, a % b);
    }

    public static int gcd2(int a, int b) {
        while(b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int gcd3(int a, int b) {
        while(a != b) {
            if(a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd1(28, 128));
        System.out.println(gcd2(28, 130));
        System.out.println(gcd3(28,132));
    }
}
