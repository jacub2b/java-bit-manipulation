package jack.awsome;

import java.util.function.Function;

public class BitManipulator {
    //todo: minus representation cases
    //todo: << vs <<<
    private BitManipulator() {};

    public static XFunction<Integer, Integer> modOne =  num -> num & 1;
    public static XFunction<Integer, Boolean> isPow =  num -> num != 0 && (num & (num -1)) == 0;
    public static XKFunction<Integer, Integer, Boolean> getKthLSB =  (num, k) -> (num & (1 << k)) == 1 << k;
    public static XKFunction<Integer, Integer, Integer> toggleKthLSB = (num, k) -> (num ^ (1 << k));
    public static XKFunction<Integer, Integer, Integer> setKthBit = (num, k) -> (num | (1 << k));
    public static XKFunction<Integer, Integer, Integer> unsetKthBit = (num, k) -> (num & ~(1 << k));
    public static XKFunction<Integer, Integer, Integer> multiplyByTwoToThePowerOfK = (num, k) -> num << k;
    public static XKFunction<Integer, Integer, Integer> divideByTwoToThePowerOfK = (num, k) -> num >> k;
    public static XKFunction<Integer, Integer, Integer> modByTwoToThePowerOfk = (num, k) -> num & ((1 << k) - 1);
}
