package edu.xavier.csci;

public class Calculator {
    static public int add(int ...a){
        int sum = 0;
        for(int i: a){
            sum += i;
        }
        return(sum);
    }
}
