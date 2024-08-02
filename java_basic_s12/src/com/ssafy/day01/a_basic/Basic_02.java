package com.ssafy.day01.a_basic;

public class Basic_02 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        stringCompare(str1, str2);
        stringCompare(str3, str4);

        textBlockTest();
    }

    private static void stringCompare(String s1, String s2) {
        System.out.println("equal(내용이 같나요?) " + (s1.equals(s2)));
        System.out.println("==(같은 객체인가요?) " + (s1 == s2));
    }
    
    private static void textBlockTest() {
        String str = """
                내 이름은 %s.
                나이는 %d살이고, 사는 곳은 %s.
                """.formatted("hong gil dong", 20, "율도국");

                System.out.println(str);

    }
}
