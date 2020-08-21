package student_lilija_g.homework.lesson_3.level_6.task_24;

class BoxDemo {
    public static void main(String[] args) {

        int newBoxWidth, newBoxHeight, newBoxDepth;
        double newBoxVolume;
        String newBoxColour;

        Box boxDemo = new Box();
        boxDemo.setBoxColour("White");
        boxDemo.setBoxWidth(10);
        boxDemo.setBoxHeight(6);
        boxDemo.setBoxDepth(4);

        newBoxWidth = boxDemo.getBoxWidth();
        newBoxHeight = boxDemo.getBoxHeight();
        newBoxDepth = boxDemo.getBoxDepth();
        newBoxColour=boxDemo.getBoxColour();

        newBoxVolume = boxDemo.boxVolume(newBoxWidth, newBoxHeight, newBoxDepth);
        boxDemo.boxParameters(newBoxColour, newBoxWidth, newBoxHeight, newBoxDepth);
        System.out.println("Box's volume is " + newBoxVolume);

    }
}
