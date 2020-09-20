package student_pjotrs_grezmanis.lesson_3.level_6;

import teacher.annotations.CodeReview;

@CodeReview(approved = true)
class Car {
    public String brand;
    public String colour;
    public String fuel;
    public String repair;

    public Car(String brand, String colour, String fuel, String repair) {
        this.brand = brand;
        this.colour = colour;
        this.fuel = fuel;
        this.repair = repair;
    }

    public void driving() {
        System.out.println(brand + " driving ");
    }

    public void description() {
        System.out.println(brand + "," + colour + "," + fuel);
    }

    public void refuel() {
        System.out.println("need refuel " + fuel);
    }

    public void repair() {
        System.out.println("need repair " + repair);

    }

}


