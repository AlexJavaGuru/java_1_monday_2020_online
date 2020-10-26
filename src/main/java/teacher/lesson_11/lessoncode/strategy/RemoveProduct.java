package teacher.lesson_11.lessoncode.strategy;

public class RemoveProduct implements UICommand{
    @Override
    public void execute() {
        System.out.println("Remove product");
    }
}
