package student_andris_tresutins.homework.lesson_4.level_6;

 class Stock {
    String companyName;
    int currentPrice;
    int maxPrice;
    int minPrice;

    Stock(String companyName, int currentPrice){
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        maxPrice = currentPrice;
        minPrice = currentPrice;

    }

    public void updatePrice(int currentPrice, int maxPrice, int minPrice){
        this.currentPrice = currentPrice;
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;

    }

    public void getPriceInformation(){
        System.out.println("Company = " + companyName + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max price = " + maxPrice);
    }


}
