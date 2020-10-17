package student_lilija_g.homework.lesson_9.level_7_senior.super_task_2;

class DemoBuilder {

    public static void main(String[] args) {

        BeforeBuilderClassOne myBeforeBuilderClassOne1 = new BeforeBuilderClassOne(10, 20);
        System.out.println(myBeforeBuilderClassOne1.toString());

        BeforeBuilderClassOne myBeforeBuilderClassOne2 = new BeforeBuilderClassOne(10, 20, 30);
        System.out.println(myBeforeBuilderClassOne2.toString());

        BeforeBuilderClassOne myBeforeBuilderClassOne3 = new BeforeBuilderClassOne(10, 20, 30, 40);
        System.out.println(myBeforeBuilderClassOne3.toString() + "\n");

        BeforeBuilderClassTwo myBeforeBuilderClassTwo1 = new BeforeBuilderClassTwo();
        System.out.println(myBeforeBuilderClassTwo1.toString());

        BeforeBuilderClassTwo myBeforeBuilderClassTwo2 = new BeforeBuilderClassTwo();
        myBeforeBuilderClassTwo2.setObligatoryFieldTwo(20);

        BeforeBuilderClassTwo myBeforeBuilderClassTwo3 = new BeforeBuilderClassTwo();
        myBeforeBuilderClassTwo3.setOptionalFieldThree(30);
        System.out.println(myBeforeBuilderClassTwo3.toString());

        BeforeBuilderClassTwo myBeforeBuilderClassTwo4 = new BeforeBuilderClassTwo();
        myBeforeBuilderClassTwo4.setOptionalFieldThree(30);
        myBeforeBuilderClassTwo4.setOptionalFieldFour(40);
        System.out.println(myBeforeBuilderClassTwo4.toString() + "\n");

        WithBuilderClass myWithBuilderClass1 = new WithBuilderClass.Builder(10, 20)
                .build();
        System.out.println(myWithBuilderClass1.toString());

        WithBuilderClass myWithBuilderClass2 = new WithBuilderClass.Builder(10, 20)
                .optionalFieldThree(30)
                .build();
        System.out.println(myWithBuilderClass2.toString());

        WithBuilderClass myWithBuilderClass3 = new WithBuilderClass.Builder(10, 20)
                .optionalFieldThree(30)
                .optionalFieldFour(40)
                .build();
        System.out.println(myWithBuilderClass3.toString());
    }
}
