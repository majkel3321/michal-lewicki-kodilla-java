package com.kodilla.kodillapatterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.List;

public class CompanySalaryProcessor implements SalaryProcessor {

    @Override
    public BigDecimal calculateSalaries(List<Empolyee> empolyees){
        BigDecimal sum = BigDecimal.ZERO;
        for (Empolyee empolyee: empolyees){
            System.out.println(empolyee);
            sum = sum.add(empolyee.getBaseSalary());
        }
        return sum;
    }
}
