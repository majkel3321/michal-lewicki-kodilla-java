package com.kodilla.kodillapatterns2.adapter.company.newhrsystem;

import java.math.BigDecimal;
import java.util.Objects;

public class Empolyee {

    final private String peselId;
    final private String firstname;
    final private String lastname;
    final private BigDecimal baseSalary;

    public Empolyee(String peselId, String firstname, String lastname, BigDecimal baseSalary) {
        this.peselId = peselId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empolyee empolyee = (Empolyee) o;
        return Objects.equals(peselId, empolyee.peselId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(peselId);
    }

    @Override
    public String toString() {
        return "Empolyee{" +
                "peselId='" + peselId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
