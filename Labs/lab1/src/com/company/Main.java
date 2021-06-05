package com.company;

public class Main {
    public static boolean isPrime(int n) {
        for (int i = 3; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {


        for (int l = 3; l <= 100; l++) {
            if (isPrime(l)) {
                System.out.println(l);
            }
        }
    }
}

