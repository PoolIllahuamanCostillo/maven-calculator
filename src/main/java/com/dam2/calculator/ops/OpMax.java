package com.dam2.calculator.ops;

import com.dam2.calculator.utils.ParserUtils;

public class OpMax {
	public static String run(String input) {
		
	int[] nums = ParserUtils.parseInts(input);
    if (nums == null) return "Error: formato inválido";
    if (nums.length < 2) return "Error: sub necesita exactamente 2 números";
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
		max = Math.max(max, nums[i]);
	}
    return String.valueOf(max);

	}
}
