package com.driver;

 class Product{
    public int product(int x, int y) {
        return x*y;
    }
    public int product(int x, int y,int z) {
        return x*y*z;
    }
    public double product(double x, double y) {
        return x*y;
    }
}
public class Main {
    public static void main(String args[]){
        Product p = new Product();
        int result1 = p.product(10,20);
        int result2 = p.product(10,20,30);
        double result3 = p.product(10.0,20.0);

        System.out.println(result1+" "+result2+" "+result3);
    }
}