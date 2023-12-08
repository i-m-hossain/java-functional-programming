package org.example._Predicate;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
//        method
        boolean result = isPhoneNumberValid("8801728603351");
//        Function
        boolean resultv1 = isValidV1.apply("8801728603351");
//        predicate
        boolean resultv2=isValidV2.test("8801728603351");
//       predicate  chain
        boolean resultPredicateChain=isValidV2.and(contains3).test("8801728603351");
        boolean resultPredicateChainV2 = isValidV2.and(contains3).test("8801777124567");
        boolean resultBiPredicate = containsTarget.test("8801728603351", 9);
        System.out.println(resultBiPredicate);
    }
    static BiPredicate<String, Integer>containsTarget = (number, target)->number.contains(target.toString());
    static Predicate<String>contains3 = number-> number.contains("3");
    //Predicate
    static Predicate<String>isValidV2= number->number.startsWith("880")&&number.length()==13;
    // Function
    static Function<String, Boolean> isValidV1 = number->number.startsWith("880")&&number.length()==13;
    //method
    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("880") && phoneNumber.length() == 13;
    }
}
