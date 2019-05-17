package com.kodilla.kodillapatterns2.adapter.company;

import com.kodilla.kodillapatterns2.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.kodilla.kodillapatterns2.adapter.company.newhrsystem.Empolyee;
import com.kodilla.kodillapatterns2.adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {

    @Override
    public BigDecimal calculateSalaries(List<Empolyee> empolyees){
        CompanySalaryProcessor theProcessor = new CompanySalaryProcessor();
        return theProcessor.calculateSalaries(empolyees);
    }
}
