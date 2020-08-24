package student_lilija_g.homework.lesson_4.level_6;

class Stock {
    String companyName;
    Double currentPrice;
    Double minPrice;
    Double maxPrice;

   Stock(String companyName,double currentPrice) {
       this.companyName = companyName;
       this.currentPrice = currentPrice;
       this.minPrice = currentPrice;
       this.maxPrice = currentPrice;
       // В момент создания класса мин. и макс.цены акции равны текущей цене
   }

       void updatePrice ( double newPrice){
           if (newPrice > currentPrice) {
               maxPrice = newPrice;
               currentPrice = newPrice;
           } else {
               if (newPrice < currentPrice) {
                   minPrice = newPrice;
                   currentPrice = newPrice;
               } else {
                   currentPrice = newPrice;
               }
           }
       }

       String getPriceInformation() {
           return (companyName + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice);
   }


   }




