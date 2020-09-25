package student_andris_tresutins.homework.lesson_4.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Why all getters has these lines? return this.companyName = companyName; We don't need to use = when we simply want to return value. It can be turned into " +
        "return this.companyName; and since there is no names conflicts, we can remove this. also.")
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
        return this.companyName = companyName;

     }
     public int getCurentPrice(){
        return this.currentPrice = currentPrice;

     }
     public int getMax(){
         return this.maxPrice = maxPrice;

     }
     public int getMin(){
         return this.minPrice = minPrice;

     }


    public void getPriceInformation(){
        System.out.println("Company = " + companyName + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max price = " + maxPrice);
    }


}
