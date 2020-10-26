package student_pjotrs_grezmanis.lesson_3.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Computer {
    private String manufacturer;
    private String model;

    public Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }
}
