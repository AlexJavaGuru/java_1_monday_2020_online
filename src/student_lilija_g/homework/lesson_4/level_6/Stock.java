package student_lilija_g.homework.lesson_4.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = true)
@CodeReviewComment(comment = "Я работу принял, но хотел оставить комментарий на счет мтода updatePrice. Он у вас получился супер сложный. Его можно было написать на много легче, как я показывал на лекции.")
class Stock {
    String companyName;
    Double currentPrice;
    Double minPrice;
    Double maxPrice;

    Stock(String companyName, double currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
        // В момент создания класса мин. и макс.цены акции равны текущей цене
    }

    void updatePrice(double newPrice) {
        if (newPrice > currentPrice) {
            if (newPrice > maxPrice) {
                maxPrice = newPrice;
            }
            currentPrice = newPrice;
        } else {
            if (newPrice < currentPrice) {
                if (newPrice < minPrice) {
                    minPrice = newPrice;
                }
                currentPrice = newPrice;
            } else {
                currentPrice = newPrice;
            }
        }
    }

    String getPriceInformation() {
        return (companyName + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice);
    }

    Double getMaxPrice() {
        return maxPrice;
    }

}




