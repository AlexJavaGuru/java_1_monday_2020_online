package student_artur_martinenko.homework.lesson_12.level_3_junior.task_20;

//Task_20
/*
Правильно ли написан try catch блок? Откомпилируется ли код?

try {

} catch (Exception e) {

} catch (ArithmeticException a) {

}

Создайте класс MultiCatchExample и в его main() методе
поместите правильный try catch блок и в коментариях напишите пояснение.
 */
class MultiCatchExample {
    public static void main(String[] args) {

        try {

        } catch (ArithmeticException a) {
            //ArithmeticException более узкая ошибка, сеперклассом которой является Exception.
            //Должна ставиться перед Exception, иначе Exception поймает её и не будет смысла ловть ArithmeticException.
        } catch (Exception e) {

        }

    }
}
