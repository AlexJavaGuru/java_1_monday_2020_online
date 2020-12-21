package student_alexander_shl.homework.lesson_8.level_3_junior.task_13;

class Gas extends Car{

    public Gas(String model, String fuel, String transmission, int productionDate, int doors) {
        super(model, fuel, transmission, productionDate, doors);
    }

    @Override
    void engine() {
        String gas = "Gas";
    }
}
