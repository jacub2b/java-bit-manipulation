package jack.awsome.bit;

import jack.awsome.function.XFunction;
import jack.awsome.function.XKFunction;
import jack.awsome.function.XKNFunction;

import java.util.List;

public class BitManipulator {
    //todo: minus representation cases
    //todo: << vs <<<
    private BitManipulator() {};

    public static XFunction<Integer, Integer> modOne = num -> num & 1;
    public static XFunction<Integer, Boolean> isPow =  num -> num != 0 && (num & (num -1)) == 0;
    public static XKFunction<Integer, Integer, Boolean> getKthLSB =  (num, k) -> (num & (1 << k)) == 1 << k;
    public static XKFunction<Integer, Integer, Integer> toggleKthLSB = (num, k) -> (num ^ (1 << k));
    public static XKFunction<Integer, Integer, Integer> setKthBit = (num, k) -> (num | (1 << k));
    public static XKFunction<Integer, Integer, Integer> unsetKthBit = (num, k) -> (num & ~(1 << k));
    public static XKFunction<Integer, Integer, Integer> multiplyByTwoToThePowerOfK = (num, k) -> num << k;
    public static XKFunction<Integer, Integer, Integer> divideByTwoToThePowerOfK = (num, k) -> num >> k;
    public static XKFunction<Integer, Integer, Integer> modByTwoToThePowerOfk = (num, k) -> num & ((1 << k) - 1);
    public static XKFunction<Integer, Integer, List<Integer>> swapNumbers = (x, y) -> {x = x^y; y = x^y; x = x^y; return List.of(x, y);};
    public static XKFunction<Integer, Integer, String> sumEvenOrOdd = (x, y) ->  {return ((x ^ y) & 1) == 0 ? "Even" : "Odd";};
    public static XKNFunction<Integer, Integer, Integer, Integer> toggleNunBetweenXAndK = (x, k, num) -> x ^ k ^ num;
    public static XKFunction<Integer, Integer, Integer> sumNumbers = (x, k) -> x ^ k + (x & k) * 2;
    public static XKFunction<Integer, Integer, Integer> alsoSumNumbers = (x, k) -> (x | k) + (x & k);
}
