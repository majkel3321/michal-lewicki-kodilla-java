package com.kodilla.stream.sand;

import java.math.BigDecimal;

public final class Asia implements SandStorage {

    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantiy = new BigDecimal("98765432101234567890");
        return sandQuantiy;
    }
}
