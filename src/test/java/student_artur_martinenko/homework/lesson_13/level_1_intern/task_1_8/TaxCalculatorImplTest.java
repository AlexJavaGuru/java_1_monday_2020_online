package student_artur_martinenko.homework.lesson_13.level_1_intern.task_1_8;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import teacher.annotations.CodeReview;

import java.math.BigDecimal;
import java.math.BigInteger;

@CodeReview(approved = true)
public class TaxCalculatorImplTest {

    private TaxCalculator taxCalculator;


    @Before
    public void init(){
        taxCalculator = new TaxCalculatorImpl();
    }

    //Task_4
    @Test
    public void shouldPayZeroTaxWhenIncomeIsZero(){
        BigDecimal tax = taxCalculator.calculateTax(new BigDecimal(BigInteger.ZERO));
        Assert.assertEquals(new BigDecimal("0"), tax);
    }

    //Task_4
    @Test
    public void shouldPay25PercentTaxWhenIncomeLessThen20000(){
        BigDecimal tax = taxCalculator.calculateTax(new BigDecimal("10000.00"));
        Assert.assertEquals(new BigDecimal("2500.0000"), tax);
    }

    //Task_4
    @Test
    public void shouldPay25PercentTaxWhenIncomeEqualTo20000(){
        BigDecimal tax = taxCalculator.calculateTax(new BigDecimal("20000.00"));
        Assert.assertEquals(new BigDecimal("5000.0000"), tax);
    }

    //Task_6
    @Test
    public void shouldPay25And40PercentTaxWhenIncomeEqualTo30000(){
        BigDecimal tax = taxCalculator.calculateTax(new BigDecimal("30000.00"));
        Assert.assertEquals(new BigDecimal("9000.0000"), tax);
    }


}

//Task_3
/*
Класс TaxCalculatorImpl:

class TaxCalculatorImpl implements TaxCalculator {

    public BigDecimal calculateTax(BigDecimal income) {
        return null;
    }

}

Создайте тестовый класс (TaxCalculatorImplTest) для этого класса и при помощи библиотеки JUnit
напишите тесты для правила новер один:
- доход до 20000 облагается 25% налогом.

Один из классных приёмов при написании тестов - это
проверка граничных значений.
Как поведёт себя ваш алгоритм при доходе равном 0,
и сколько нужно будет заплатить налогов при
доходе в 20000?

Тестовый класс должен распологаться в папке src/test/java/ ... и далее в том же пакете,
что и сам тестируемый класс TaxCalculatorImpl.

Тестовый класс создаётся так: внутри класса вызываете всплывающее меню, Generate -> Test
и в появившемся диалоговом окне выбираете JUnit 4 и нажимаете ок.
 */

//Task_4
/*
Реализация класса TaxCalculatorImplTest:

public class TaxCalculatorImplTest {

	private TaxCalculator taxCalculator = new TaxCalculatorImpl();

	@Test
	public void shouldPayZeroTaxWhenIncomeIsZero() {
		var income = BigDecimal.ZERO;
		var taxToPay = taxCalculator.calculateTax(income);
		assertEquals(taxToPay, new BigDecimal("0.00"));
	}

	@Test
	public void shouldPay25PercentTaxWhenIncomeLessThen20000() {
		var income = new BigDecimal(10000);
		var taxToPay = taxCalculator.calculateTax(income);
		assertEquals(taxToPay, new BigDecimal("2500.00"));
	}

	@Test
	public void shouldPay25PercentTaxWhenIncomeEqualTo20000() {
		var income = new BigDecimal(20000);
		var taxToPay = taxCalculator.calculateTax(income);
		assertEquals(taxToPay, new BigDecimal("5000.00"));
	}

}

Реализуйте функциональность расчёта налогов в
классе TaxCalculatorImpl так, что бы все написанные
тесты проходили.
 */

//Task_6
/*
Правило номер два:
- доход свыше 20000 облагается 40% налогом.

Это занчит, что если у человека доход 30000,
то с первых 20000 он должен заплатить 25%,
а с суммы которая выше 20000 (в этом случае 10000)
он должен заплатить 40% налогов:

income 30000
tax = 20000 * 0.25 + 10000 * 0.4

Добавьте в класс TaxCalculatorImplTest
тесты для правила номер два.
 */

//Task_7
/*
Правило номер два:
- доход свыше 20000 облагается 40% налогом.

Тест для правила номер два в классе TaxCalculatorImplTest:

	@Test
	public void shouldPay40PercentTaxWhenIncomeBiggerThen20000() {
		var income = new BigDecimal(30000);
		var taxToPay = taxCalculator.calculateTax(income);
		assertEquals(taxToPay, new BigDecimal("9000.00"));
	}

Добавьте в класс TaxCalculatorImpl
реализацию второго правила расчёта налога
свыше 20000 и убедитесь, что написанный нами
тест проходит.
 */