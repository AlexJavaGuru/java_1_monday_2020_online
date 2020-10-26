package student_andris_tresutins.homework.lesson_4.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
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

     public void updatePrice(int newPrice) {

         currentPrice = newPrice;

         if (newPrice > maxPrice) {
             maxPrice = newPrice;
         }
         else if (newPrice < minPrice) {
             minPrice = newPrice;
         }
     }

     public String getName(){
        return companyName;

     }
     public int getCurentPrice(){
        return currentPrice;

     }
     public int getMax(){
         return maxPrice;

     }
     public int getMin(){
         return minPrice;

     }


    public void getPriceInformation(){
        System.out.println("Company = " + companyName + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max price = " + maxPrice);
    }


}
