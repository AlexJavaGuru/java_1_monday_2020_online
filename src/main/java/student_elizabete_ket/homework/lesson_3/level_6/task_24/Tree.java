package student_elizabete_ket.homework.lesson_3.level_6.task_24;

 class Tree {

     //что за деревро
     //у дерева сколько веток
     //большое или маленькое

     private String name;
     private int treeBranch;
     private boolean isBig;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getTreeBranch() {
         return treeBranch;
     }

     public void setTreeBranch (int treeBranch) {
         this.treeBranch = treeBranch;
     }

     public boolean isBig() {
         return isBig;
     }

     public void setBig(boolean big) {
         isBig = big;
     }

     //гид рассказывает пол дерево
     public void gidStory () {
         System.out.println("Gid is telling a story about old " + name + ", it`s a tree with " + treeBranch + " tree branches");

     }
     //заставить дерево шуметь
     
     public void makeNoise() {
         this.isBig = true;
        System.out.println("It`s noisy, because  the tree is big");

     }

     public void makeNoise2() {
         this.isBig = false;
         System.out.println("It`s not noisy because thee is small");
     }
 }


