package student_dmitry_vasiliev.lesson_3.homework.Level_2;

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
