package com.kihongkim.section03.copy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        /* 얕은 복사에 대해 이해할 수 있다. */

        /* 원본 배열 */
        int[] orgin = {1, 2, 3, 4, 5};

        /* 얕은 복사 */
        int[] copy = orgin;

        /* hashCode 확인 */
        System.out.println(orgin.hashCode());
        System.out.println(copy.hashCode());

        System.out.println(Arrays.toString(orgin));
        System.out.println(Arrays.toString(copy));

        orgin[2] = 100;

        System.out.println(Arrays.toString(orgin));
        System.out.println(Arrays.toString(copy));



    }
}
