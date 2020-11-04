package student_andris_tresutins.homework.lesson_14.level_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FruitStorage {

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }
    List<Apple> appleList = new ArrayList<>(getAllApples());


    List<Apple> findGreenApples() {
        return appleList.stream()
                .filter(apple -> "green".equals(apple.getColor()))
                .collect(Collectors.toList());
    }

    List<Apple> findRedApples() {
        return appleList.stream()
                .filter(apple -> "red".equals(apple.getColor()))
                .collect(Collectors.toList());
    }

    List<Apple> filterApplesByColor(String color) {
        return appleList.stream()
                .filter(apple -> color.equals(apple.getColor()))
                .collect(Collectors.toList());
    }

    List<Apple> filterLightApples() {
        return appleList.stream()
                .filter(apple -> apple.getWeight() < 150)
                .collect(Collectors.toList());
    }

    List<Apple> filterHeavyApplesByWeight(int weight) {
        return appleList.stream()
                .filter(apple -> apple.getWeight() > weight)
                .collect(Collectors.toList());
    }


}



