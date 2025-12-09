package com.dam2.calculator.ops;

import com.dam2.calculator.utils.ParserUtils;
 
public class OpDivision {
 
    public static String run(String input) {
        int[] nums = ParserUtils.parseInts(input);
        if (nums == null) return "Error: formato inválido";
        if (nums.length != 2) return "Error: div necesita exactamente 2 números";
 
        int a = nums[0];
        int b = nums[1];
 
        if (b == 0) return "Error: división por cero";
 
        return String.valueOf(a / b);
    }
}
 

