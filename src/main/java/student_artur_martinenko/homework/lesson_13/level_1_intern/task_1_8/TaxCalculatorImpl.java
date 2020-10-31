package student_artur_martinenko.homework.lesson_13.level_1_intern.task_1_8;

import java.math.BigDecimal;
import java.math.BigInteger;

class TaxCalculatorImpl implements TaxCalculator {

    public static final BigDecimal LVL1_AMOUNT_LIMIT = new BigDecimal("20000");
    public static final BigDecimal LVL1_TAX_RATE = new BigDecimal("0.25");
    public static final BigDecimal LVL2_TAX_RATE = new BigDecimal("0.40");

    @Override
    public BigDecimal calculateTax(BigDecimal income) {
        BigDecimal taxation = new BigDecimal(BigInteger.ZERO);
        if(income.compareTo(BigDecimal.ZERO) == 0){
            return taxation;
        }else if(income.compareTo(LVL1_AMOUNT_LIMIT) <= 0) {
            taxation = applyTaxRateLVL1(income);
        }else if(income.compareTo(LVL1_AMOUNT_LIMIT) > 0){
            taxation = applyTaxRateLVL1(LVL1_AMOUNT_LIMIT);
            BigDecimal taxDelta = income.subtract(LVL1_AMOUNT_LIMIT);
            taxation = taxation.add(applyTaxRateLVL2(taxDelta));
        }
        return taxation;
    }

    private BigDecimal applyTaxRateLVL1(BigDecimal income){
        return income.multiply(LVL1_TAX_RATE);
    }

    private BigDecimal applyTaxRateLVL2(BigDecimal incomeDelta){
        return incomeDelta.multiply(LVL2_TAX_RATE);
    }

}

//Task_2
/*
Создайте класс TaxCalculatorImpl, который будет реализовывать интерфейс TaxCalculator.

В теле метода calculateTax() просто напишите return null; - у нас пока не будет
реализации этого метода, мы ее сделаем поже.
 */

//Task_5
/*
Реализация класса TaxCalculatorImpl:

import java.math.BigDecimal;

public class TaxCalculatorImpl implements TaxCalculator {

	@Override
	public BigDecimal calculateTax(BigDecimal income) {
		return income.multiply(new BigDecimal("0.25"));
	}
}
 */

//Task_8
/*
Реализация класса TaxCalculatorImpl:

import java.math.BigDecimal;

public class TaxCalculatorImpl implements TaxCalculator {

	@Override
	public BigDecimal calculateTax(BigDecimal income) {
		if (income.compareTo(new BigDecimal("20000")) <= 0) {
			return income.multiply(new BigDecimal("0.25"));
		} else {
			var incomeBiggerThen20000 = income.subtract(new BigDecimal("20000"));
			var taxAfter20000 = incomeBiggerThen20000.multiply(new BigDecimal("0.40"));
			var taxBefore20000 = new BigDecimal("20000").multiply(new BigDecimal("0.25"));
			return taxBefore20000.add(taxAfter20000);
		}
	}
}
 */

