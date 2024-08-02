package com.ssafy.day01.a_basic;

public class Basic_06 {
    public static void main(String[] args) {

        int i = 10;
        // 기본형 --> 참조
        Integer iw = Integer.valueOf(i);
        Integer iw2 = i; // autoboxing

        // 참조형 --> 기본
        int i2 = iw.intValue();
        int i3 = iw; // unboxing

        // 기본형 --> 문자열
        String s1 = String.valueOf(i);
        String s2 = "" + i; // 결합 연산
        System.out.println("두 문자열은 같은 객체? " + (s1 == s2));

        // 문자열 --> 기본형
        int i4 = Integer.parseInt(s1);

        // 참조형 --> 문자열
        String s3 = iw.toString();
        String s4 = "" + iw;
        System.out.println("두 문자열은 같은 객체? " + (s3 == s4));

        // 문자열 --> 참조형
        Integer iw3 = Integer.valueOf(s4);
        Integer iw4 = Integer.parseInt(s4);
        System.out.println(iw3 +" : "+iw4);

    }
}
