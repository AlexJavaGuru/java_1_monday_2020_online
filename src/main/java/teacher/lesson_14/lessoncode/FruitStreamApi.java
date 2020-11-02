package teacher.lesson_14.lessoncode;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FruitStreamApi {

	private List<Fruit> fruits = new ArrayList<>();

	public FruitStreamApi() {
		fruits.add(new Fruit("apple", "red", 50));
		fruits.add(new Fruit("apple", "green", 100));
		fruits.add(new Fruit("pear", "red", 100));
		fruits.add(new Fruit("pear", "yellow", 100));
		fruits.add(new Fruit("tomato", "red", 150));
		fruits.add(new Fruit("apple", "red", 100));
		fruits.add(new Fruit("apple", "green", 150));
		fruits.add(new Fruit("pear", "red", 50));
		fruits.add(new Fruit("pear", "yellow", 50));
		fruits.add(new Fruit("tomato", "red", 200));
		fruits.add(new Fruit("tomato", "black", 200));
	}

	public List<Fruit> getAllFruits() {
		return fruits;
	}


	public List<Fruit> findAllApples() {
		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.collect(Collectors.toList());
	}

	public List<Fruit> findAllApplesV2() {
		return fruits.stream()
				.filter(new Predicate<Fruit>() {
					@Override
					public boolean test(Fruit fruit) {
						return "apple".equals(fruit.getTitle());
					}
				})
				.collect(Collectors.toList());
	}

	public List<Fruit> findAllApplesV3() {
		Predicate<Fruit> searchCriteria = new Predicate<Fruit>() {
			@Override
			public boolean test(Fruit fruit) {
				return "apple".equals(fruit.getTitle());
			}
		};
		return fruits.stream()
				.filter(searchCriteria)
				.collect(Collectors.toList());
	}

	class AppleSearchCriteria implements Predicate<Fruit> {

		@Override
		public boolean test(Fruit fruit) {
			return "apple".equals(fruit.getTitle());
		}
	}

	public List<Fruit> findAllApplesV4() {
		return fruits.stream()
				.filter(new AppleSearchCriteria())
				.collect(Collectors.toList());
	}


	public List<Fruit> findRedApplesWithWeightBiggerThen100() {
		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.filter(fruit -> "red".equals(fruit.getColor()))
				.filter(fruit -> fruit.getWeight() > 100)
				.collect(Collectors.toList());
	}

	public Set<String> findAllFruitUniqNames() {
		Function<Fruit, String> function = new Function<Fruit, String>() {
			@Override
			public String apply(Fruit fruit) {
				return fruit.getTitle();
			}
		};
		return fruits.stream()
					 .map(fruit -> fruit.getTitle())
					 .collect(Collectors.toSet());
	}

	public Set<String> findAllFruitUniqNamesv2() {
		Function<Fruit, String> function = new Function<Fruit, String>() {
			@Override
			public String apply(Fruit fruit) {
				return fruit.getTitle();
			}
		};
		return fruits.stream()
					 .map(function)
					 .collect(Collectors.toSet());
	}

	public List<String> findAllFruitUniqueNames() {
		Stream<String> stringStream = fruits.stream()
				.map(Fruit::getTitle);
		return stringStream
				//.map(fruit -> fruit.getTitle())
				.distinct()
				.collect(Collectors.toList());
	}

	public Optional<Fruit> findAnyApple() {
		return fruits.stream()
					 .filter(fruit -> "apple".equals(fruit.getTitle()))
					 .findAny();
	}

	public Optional<Fruit> findFirstApple() {
		return fruits.stream()
				.filter(fruit -> "apple".equals(fruit.getTitle()))
				.findFirst();
	}

	public Map<Integer, List<Fruit>> groupByWeight() {
		return fruits.stream()
				.collect(Collectors.groupingBy(Fruit::getWeight));
	}
	
	public Set<String> test() {
		Map<Integer, List<Fruit>> result = groupByWeight();
		Set<Map.Entry<Integer, List<Fruit>>> entries = result.entrySet();
		return entries.stream()
//				.parallel()
				.map(Map.Entry::getValue)
//				.map(entry -> entry.getValue())
				.flatMap(Collection::stream)
				.map(Fruit::getColor)
//				.map(fruit -> fruit.getColor())
				.collect(Collectors.toSet());
	}
}
