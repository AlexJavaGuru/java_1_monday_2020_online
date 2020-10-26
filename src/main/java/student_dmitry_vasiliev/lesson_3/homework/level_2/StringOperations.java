package student_dmitry_vasiliev.lesson_3.homework.level_2;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Плохо, что вы используете не понятные названия переменных. Это очень важно. Сейчас у вас всего 1 класс и он не выходит за пределы экрана." +
        "Когда у вас их будет много, то переменные с названием s1,s2 будут сильно зактрюднять код. Не ленитесь. Привыкайте писать название переменных правильно." +
        "То же самое с длинной. len1 -> lengthOne")
public class StringOperations {

        public static void main(String args[]) {
            // Определение длины строки s1 и s2.
            String s1 = "Строка";
            int len1 = s1.length();
            String s2 = "Строчка";
            int len2 = s2.length();
            if (len1 < len2){
                System.out.println( s2 + " длиннее, чем " + s1 + ".");
            }
            if (len1 > len2){
                System.out.println( s1 + " длиннее, чем " + s2 + ".");
            }
            if (len1 == len2) {
                System.out.println( "Строка " + s1 + " равна строке " + s2 + ".");
}
        }
}
