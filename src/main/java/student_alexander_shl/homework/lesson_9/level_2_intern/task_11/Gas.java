package student_alexander_shl.homework.lesson_9.level_2_intern.task_11;

class Gas extends Car {

    public Gas(String model, String fuel, String transmission, int productionDate, int doors) {
        super(model, fuel, transmission, productionDate, doors);
    }

    @Override
    void engine() {
        String gas = "Gas";
    }
}
