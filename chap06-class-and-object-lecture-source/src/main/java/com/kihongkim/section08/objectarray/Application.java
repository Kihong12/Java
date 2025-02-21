package com.kihongkim.section08.objectarray;

public class Application {
    public static void main(String[] args) {
        Car[] cars = new Car[5];

        /* cars의 각 인덱스는 기본 값 null로 초기화 되어 있는 상태이며
        * 인덱스 별로 Car 타입의 인스턴스를 생성해야한다. */
        System.out.println(cars);
        System.out.println(cars[0]);
//        cars[0].driveMaxSpeed(); -> NullPointerException

        cars[0] = new Car("페라리", 300);
        cars[1] = new Car("람보르기니", 300);
        cars[2] = new Car("롤스로이스", 300);
        cars[3] = new Car("부가티베이론", 300);
        cars[4] = new Car("포터", 300);

        /* 배열은 반복문을 통해 일괄 처리가 가능하다는 장점이 있다. */
        for (int i = 0; i < cars.length; i++) {
            cars[i].driveMaxSpeed();
        }

        /* 객체 배열도 할당과 동시에 초기화 가능하다. */
        Car[] cars2 = {
                new Car("부가티베이론", 300),
                new Car("포터", 300) };

        for (Car car : cars2) {
            car.driveMaxSpeed();
        }




    }
}
