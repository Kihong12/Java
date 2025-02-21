package com.kihongkim.section03.overrriding;

public class Subclass extends SuperClass {

    /* 메소드명, 리턴 타입, 매개변수 개수&타입&순서 일치해야 성립 */
    @Override
//    public void method(String num) {}
//    public int method(int num) { return 0; }
//    public void method2(int num) { }
    public void method(int num) { }

    /* private 메소드 오버라이딩 불가 */
//    @Override
//    private void privateMethod() {}

    /* final 메소드 오버라이딩 불가 */
//    @Override
//    public void finalMethod() {}

    /* protected -> default 로 변경 시 보다 좁은 범위로 변경하는 것은 불가능 */
//    @Override
//    void protectedMethod() {}

    /* protected -> default 로 변경 시 보다 좁은 범위로 변경하는 것은 가능 */
    @Override
    public void protectedMethod() {}

}
