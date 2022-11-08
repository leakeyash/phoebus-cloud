package com.phoebus.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.math.BigDecimal;
import java.math.RoundingMode;

@RestController()
@RequestMapping("/tool")
public class ToolController {

    @GetMapping("/cal")
    public BigDecimal detail() {
        BigDecimal loan = BigDecimal.valueOf(1650000);
        BigDecimal yearRate = BigDecimal.valueOf(4.65 * 0.01);
        int months = 360;
        BigDecimal monthRate = yearRate.divide(BigDecimal.valueOf(12), RoundingMode.HALF_UP);
        return loan.multiply(monthRate).multiply(monthRate.add(BigDecimal.ONE).pow(months)).divide(monthRate.add(BigDecimal.ONE).pow(months).subtract(BigDecimal.ONE), RoundingMode.HALF_UP);
    }
}
