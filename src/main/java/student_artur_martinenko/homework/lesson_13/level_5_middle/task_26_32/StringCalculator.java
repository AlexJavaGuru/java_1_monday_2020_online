package student_artur_martinenko.homework.lesson_13.level_5_middle.task_26_32;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class StringCalculator {

    public int add(String numbers) {
        if (numbers.startsWith("//[")) {
            return sumNumbers(regexDelimiter(numbers));
        }
        numbers = numbers.replaceAll("[,\n]", "");
        char[] charArray = numbers.toCharArray();
        return sumNumbers(charArray);
    }

    private int sumNumbers(char[] charArray) {
        int sum = 0;
        for (char number : charArray) {
            sum += Integer.parseInt(String.valueOf(number));
        }
        return sum;
    }

    private char[] regexDelimiter(String text) {
        String[] delimitersAndNumbers = text.split("\n");
        String regex = delimitersAndNumbers[0].replaceAll("[/]", "");
        String numbers = delimitersAndNumbers[1];

        regex = regex.replace("][", "] [");
        String[] regexArray = regex.split(" ");

        for (String delimiter : regexArray) {
            numbers = numbers.replaceAll(delimiter, "");
        }
        return numbers.toCharArray();
    }

}

//Task_26
/*
Создайте класс StringCalculator со следующим методом:

    int add(String numbers);

Метод может принимать до двух чисел разделённые запятой и возвращает их сумму.
Пример входной строки: “” or “1” or “1,2”. Для пустой строки сумма равна 0.
 */

//Task_27
/*
Если вы еще не создали класс StringCalculatorTest то создайте его
и напишите автоматические тесты для проверки метода add().
 */

//Task_29
/*
Дайте возможность методу add() принимать строку с неограниченным
числом чисел разделённых запятой.

Не забывайте писать тесты!
 */

//Task_30
/*
Дайте возможность методу add() принимать строку с числами разделёнными не
только запятой, но и символом новой строки: "\n".

Пример:
- “1\n23,4” (результат 10) - разрешённый ввод
- “1\n” - не разрешённый ввод

Не забывайте писать тесты!
 */

//Task_31
/*
Дайте возможность методу add() поддерживать разные разделители.
Для задания другого разделителя в начале строки должна быть указана
строка следующего формата: “//[delimiter]\n[numbers…]”.

Пример:
- “//[;]\n1;2” (результат 3) - разрешённый ввод

Строка с указанием разделителя является не обязательной, все предыдущие
сценарии должны поддерживаться.

Не забывайте писать тесты!
 */
