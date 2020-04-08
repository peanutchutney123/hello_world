package com.google.hangouts.javalearning;

/*
 * Created by Kathir Kalyanaraman on 4/8/2020.
 * Kathir Inc
 * kathirrkalyan@gmail.com
 */
public class MyExample1
{
    public static void main(String[] args){
        Food foodClass = new Food();
        String foodName = foodClass.printMyFavoriteFood("Chicken");
        System.out.println(foodName);
    }
}
