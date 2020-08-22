package student_elizabete_ket.homework.lesson_3.level_6.task_24;

class Tv {

    //Свойства:
    //1. марка
    //2. размер диагонали


    //Поведение:
    //1. показывает или нет
    //2. есть звук

   private String model;
   private double screenSize;
   private boolean isWorking;

   public String getModel() {
       return model;
   }

   public void setModel (String model) {
       this.model = model;
   }
   public double getScreenSize () {
       return screenSize;
   }
   public void setScreenSize (double screenSize) {
       this.screenSize = screenSize;
   }

   public void isSwitchedOn (boolean isWorking) {
       this.isWorking = true;
       System.out.println ("Is Working");
   }


}
