package student_dmitry_vasiliev.lesson_3.level_6;

class Plane {
    private String company;
    private int seat;
    private int flightRange;
    private boolean flying;


    public void setCompany(String company) {
        this.company = company;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public void setFlightRange(int flightRange) {
        this.flightRange = flightRange;
    }

    public void setTakeOff(boolean flying) {
        this.flying = flying;
    }

    public String getCompany() {
        return company;
    }

    public int getSeat() {
        return seat;
    }

    public int getFlightRange() {
        return flightRange;}

    public boolean getTakeOff() {
        return flying;
    }

}
