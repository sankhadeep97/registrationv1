package com.api;

import java.util.HashMap;
import java.util.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Input list with duplicates
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 3, 5, 6, 1);

        // Remove duplicates using Stream API
        List<Integer> uniqueNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        // Print the result
        System.out.println("List without duplicates: " + uniqueNumbers);
    }
}
