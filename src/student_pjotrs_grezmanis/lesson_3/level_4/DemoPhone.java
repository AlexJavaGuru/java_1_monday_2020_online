package student_pjotrs_grezmanis.lesson_3.level_4;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
 class DemoPhone {
    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}
