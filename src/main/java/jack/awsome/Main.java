package jack.awsome;

import java.util.HashMap;
import java.util.function.BiConsumer;

import static jack.awsome.BitManipulator.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(unsetKthBit.apply(10, 3));
        System.out.println(modByTwoToThePowerOfk.apply(10, 2));
    }
}