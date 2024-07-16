package org.example;

import java.util.Set;

public class CalculatorService {

    private final AdvancedCalculatorService advancedCalculatorService;

    public CalculatorService(AdvancedCalculatorService advancedCalculatorService) {
        this.advancedCalculatorService = advancedCalculatorService;
    }

    public Integer calculate(Set<Integer> integers) {
        return integers.stream().reduce(0, Integer::sum) + advancedCalculatorService.getValue5();
    }
}
