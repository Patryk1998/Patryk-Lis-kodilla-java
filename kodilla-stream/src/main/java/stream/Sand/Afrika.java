package stream.Sand;

import java.math.BigDecimal;

public class Afrika implements SandStorage{
    @Override
    public BigDecimal getSandBeansQuantity() {
        BigDecimal sandQuantity = new BigDecimal("98765432101234567890");
        return sandQuantity;
    }
}
