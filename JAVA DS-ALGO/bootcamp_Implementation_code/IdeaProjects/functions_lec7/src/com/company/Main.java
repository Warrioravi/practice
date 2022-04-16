package com.company;

public class Main {

    public static void main(String[] args) {
	int  x=20;
	int first=0;
	int second=1;
	while (first<=x){
        System.out.println(first);
        int temp=first;
        first=second;
        second=temp+second;
    }
    }
}
