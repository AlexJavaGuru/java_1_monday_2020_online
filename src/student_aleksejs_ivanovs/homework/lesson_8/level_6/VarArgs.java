package student_aleksejs_ivanovs.homework.lesson_8.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class VarArgs {

    public static void main(String[] args) {
        VarArgs obj = new VarArgs();

        System.out.println(obj.differentVariants(1,2));
        System.out.println(obj.differentVariants(1,2,3));
    }

    public String differentVariants(int ... numbers) {
        int sum = 0, i;
        for (i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return ("Sum = " + sum + ", " + "Number of arguments = " + i);
    }

}
