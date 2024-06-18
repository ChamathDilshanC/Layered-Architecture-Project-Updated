package com.example.layeredarchitecture.other;
// var ags
public class Gdse {
    public static void main(String[] args) {
        Gdse gdse = new Gdse();
        gdse.example(10,20,30,40);
    }

    public void example(int... a){
        for(int  i : a){
            System.out.println(a);
        }
    }

}
