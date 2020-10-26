package teacher.lesson_11.lessoncode.strategy;

public class AddProduct implements UICommand {
    @Override
    public void execute() {
        System.out.println("Add product");
    }
}
