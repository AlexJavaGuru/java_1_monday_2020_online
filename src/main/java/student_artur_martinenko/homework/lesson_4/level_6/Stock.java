package student_artur_martinenko.homework.lesson_4.level_6;

class Stock {
    private String companyName;
    private double currPrice;
    private double minPrice;
    private double maxPrice;

    public Stock(String companyName, double currPrice) {
        this.companyName = companyName;
        if(currPrice > 0) {
            this.currPrice = currPrice;
            minPrice = currPrice;
            maxPrice = currPrice;
        }else{
            this.currPrice = 0.0;
            minPrice = 0.0;
            maxPrice = 0.0;
        }
    }

    public double getCurrPrice() {
        return currPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    public boolean updatePrice(double newPrice){
        if(newPrice >0) {
            if(minPrice == 0 && maxPrice == 0){
                minPrice = newPrice;
                maxPrice = newPrice;
            }
            if (minPrice > newPrice) {
                minPrice = newPrice;
            } else if (maxPrice < newPrice) {
                maxPrice = newPrice;
            }
            currPrice = newPrice;
            return true;
        }
        return false;
    }

    public String getPriceInformation(){
        return "\"" + companyName + "\", Current Price = " + currPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
    }

}
