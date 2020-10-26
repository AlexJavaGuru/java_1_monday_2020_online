package student_dmitry_vasiliev.lesson_8.level_2.task_8;

/* Task_8 - Исправьте код программы так, что бы он компилировался.
         Изменения можно вносить только в класс HumanPlayer.
   Task_9 - Внесите изменения в код программы так,
        чтобы можно было создать экземпляр класса
        ComputerPlayer. Класс ComputerPlayer должен
        наследоваться от класса Player. Изменения
        в код можно вносить только в класс ComputerPlayer.*/

class Player {

    private String name;

    Player(String name) {
        this.name = name;
    }

}

class HumanPlayer extends Player {

    HumanPlayer(String name) {
        super(name);
    }

}

class ComputerPlayer extends Player {

    ComputerPlayer(String name){
        super(name);
    }

}
