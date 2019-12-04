package com.spring.algorithm.kakao.programmers.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hash2 {

    public static void main(String[] args){
        test1();
        test2();
    }

    public static void test1(){
        String[] phone_book = {"12","123","1235","567","88"};
        Boolean answer = true;

        Arrays.sort(phone_book, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        String phone;
        for(int i=0; i<phone_book.length; i++){
            phone = phone_book[i];
            for(int j=i+1; j<phone_book.length; j++){
                if(phone.equals(phone_book[j].substring(0, phone.length()))){
                    answer = false;
                    break;
                }
            }
            if(answer == false) break;
        }

        System.out.println(answer);
    }

    public static void test2(){
        String[] phone_book = {"12","123","1235","567","88"};
        Boolean answer = true;

        Arrays.sort(phone_book, (s1, s2) -> Integer.compare(s1.length(), s2.length()));

        String phone;
        for(int i=0; i<phone_book.length; i++){
            phone = phone_book[i];
            for(int j=i+1; j<phone_book.length; j++){
                if(phone_book[j].startsWith(phone)){
                    answer = false;
                    break;
                }
            }
            if(answer == false) break;
        }

        System.out.println(answer);
    }


    public static void test3(){
        String[] phone_book = {"12","123","1235","567","88"};
        Boolean answer = true;

        for(int i=0; i<phone_book.length-1; i++) {
            for(int j=i+1; j<phone_book.length; j++) {
                if(phone_book[i].startsWith(phone_book[j])) {answer = false;}
                if(phone_book[j].startsWith(phone_book[i])) {answer = false;}
            }
        }

    }
}
