package student_lilija_g.homework.lesson_4.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Это не тесты")
class StockTest {

    public static void main(String[] args) {

        Stock google = new Stock("GOOG", 10.00);
        String priceInformation = google.getPriceInformation();

        System.out.println(priceInformation);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        System.out.println(google.getPriceInformation());

    }
}

