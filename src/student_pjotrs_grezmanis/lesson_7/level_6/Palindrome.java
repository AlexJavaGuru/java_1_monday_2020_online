package student_pjotrs_grezmanis.lesson_7.level_6;

/*Написать программу, которая определяет, является ли строка палиндромом.
Палиндром - это буквосочетание, слово или текст, одинаково читающееся в обоих направлениях.
Иногда палиндромом называют любой симметричный относительно своей середины набор символов,
например: "racecar", "level", "sum summus mus", "А роза упала на лапу Азора".

Создать класс Palindrome, который реализует следующий метод:

boolean isPalindrome(String text) - метод возвращает true, если строка является палиндромом, в противном случае false;

Ограничения:
- Логику проверки необходимо реализовать при помощи массивов;
- Знаки препинания и регистр при проверке необходимо игнорировать (Le,VEl = level);

Написать тестовые сценарии для класса Palindrome в классе PalindromeTest.
Все тестовые сценарии должны отрабатывать без ошибок.

 */
class Palindrome {
    public static void main(String[] args) {
        Palindrome task = new Palindrome();
        boolean result = task.isPalindrome("А роза упала на лапу Азора");
        System.out.println(result);
    }

    public boolean isPalindrome(String text) {
        StringBuilder reverse = new StringBuilder();
        String clean = text.replaceAll("\\P{L}", "").toLowerCase();
        char[] array = clean.toCharArray();
        for (int i = array.length - 1; i >= 0; i--) {
            reverse.append(array[i]);

        }
        return reverse.toString().equals(clean);
    }

}


