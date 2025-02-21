package com.kihongkim.section01.extend;

public class RacingCar extends Car {
    @Override
    public void run() {
        System.out.println("레이싱카가 전속력으로 질주합니다!!!");
    }

    @Override
    public void stop() {
        System.out.println("레이싱카가 멈춥니다.");
    }

    /* 레이상카는 경적소리를 울리는 기능을 필요로 하지 않지만
    * Car를 상속받아 어쩔 수 없이 해당 기능을 보유하게 되었다.
    * => 상속 구조로 불필요한 기능이 추가 되었음 */
    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적을 울리지 않습니다.");
    }
}
