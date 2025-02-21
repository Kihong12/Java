package com.kihongkim.section01.method;

public class Application5 {
    public static void main(String[] args) {

    /* non-static 메소드 호출 */
    Application5 application5 = new Application5();
    System.out.println(application5.plus(10, 20));

    /* static 메소드 출력 */
    System.out.println(Application5.minus(10, 20));
    /*동일 클래스 내에서 static 메소드 호출 시에는 클래스명 생략이 가능하다. */
        System.out.println(minus(10, 20));
    }

    public int plus(int a, int b) {
        return a + b;
    }

    public static int minus(int a, int b) {
        return a - b;
    }
}
