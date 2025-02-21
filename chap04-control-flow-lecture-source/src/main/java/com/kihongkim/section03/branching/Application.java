package com.kihongkim.section03.branching;

public class Application {
    public static void main(String[] args) {
        A_break a_break = new A_break();
//        a_break.testSimpleBreakStatement();
//        a_break.testSimpleBreakStatement2();
//        a_break.testJumpBreak();

        B_continue bContinue = new B_continue();
//        bContinue.testSimpleContinueStatement();
//        bContinue.testSimpleContinueStatement2();
        bContinue.testJimpContinue();
    }
}
