package student_pjotrs_grezmanis.lesson_3.level_6;

import teacher.annotations.CodeReview;
import teacher.annotations.CodeReviewComment;

@CodeReview(approved = false)
@CodeReviewComment(comment = "Не все требования выполнены. Если я правильно понял, то это задание 26. Там сказано, что необходимо в продукт добавлять стоимость и скидку. " +
        "При выводе стоимости продукта, продукт должен сам посчитать свою скидку и показать пользователю. " +
        "" +
        "Опять мимо. А если я захочу потом для уже созданного продукта поменять его цену или назначить другую скидку? В вашем варианте, мне для этого надо будет " +
        "создать новый объект. А мне бы хотелось чтобы продукт всегда мог сказать, сколько он стоит с учетом скидки, даже если цела или скидка поменялась. Переделать =)")
class Product {
    public String name;
    public double regularPrice;
    public double discount;
    public double actualPriceProduct;

    public Product(String name) {
        this.name = name;

    }

    public void actualPrice(double regularPrice, double discount) {
        this.regularPrice = regularPrice;
        this.discount = discount;
        actualPriceProduct = ((100 - discount) * regularPrice / 100);

    }

    public void printInformation() {
        System.out.println(name + " " + regularPrice + " euro with " + discount + "% cost: " + actualPriceProduct + "euro");

    }

}
