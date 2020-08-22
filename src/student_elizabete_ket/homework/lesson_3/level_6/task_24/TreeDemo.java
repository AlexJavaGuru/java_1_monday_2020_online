package student_elizabete_ket.homework.lesson_3.level_6.task_24;

public class TreeDemo {
    public static void main(String[] args) {
        Tree firstTree = new Tree();
        firstTree.setName("Klen");
        firstTree.setTreeBranch(156);
        firstTree.setBig(true);

        firstTree.gidStory();
        firstTree.makeNoise();

        Tree secondTree = new Tree ();
        secondTree.setName("Rjabina");
        secondTree.setTreeBranch(5);
        secondTree.setBig(false);

        secondTree.gidStory();
        secondTree.makeNoise2();

    }

}
