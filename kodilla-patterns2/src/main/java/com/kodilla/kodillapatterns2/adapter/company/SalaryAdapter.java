package com.kodilla.kodillapatterns2.adapter.company;

import com.kodilla.kodillapatterns2.adapter.company.oldhrsystem.SalaryCalculator;
import com.kodilla.kodillapatterns2.adapter.company.newhrsystem.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalaryAdapter extends SalaryAdaptee implements SalaryCalculator {

    @Override
    public double totalSalary(String[][] workers, double[] salaries){
        List<Empolyee> empolyeeList = new ArrayList<>();

        for (int i = 0; i < salaries.length; i++){
            empolyeeList.add(new Empolyee(
                    workers[i][0],
                    workers[i][1],
                    workers[i][2],
                    new BigDecimal(salaries[i])
            ));
        }
        return calculateSalaries(empolyeeList).doubleValue();
    }
}
