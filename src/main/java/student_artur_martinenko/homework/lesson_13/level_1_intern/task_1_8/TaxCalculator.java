package student_artur_martinenko.homework.lesson_13.level_1_intern.task_1_8;

import teacher.annotations.CodeReview;

import java.math.BigDecimal;
@CodeReview(approved = true)
interface TaxCalculator {

    BigDecimal calculateTax(BigDecimal income);

}

//Task_1
/*
Вам поручили разработать калькулятор налогов.
В стране используется прогрессивная ставка налога.

Правило номер один:
- доход до 20000 облагается 25% налогом.

Создайте интерфейс TaxCalculator:

interface TaxCalculator {

    BigDecimal calculateTax(BigDecimal income);

}
 */
