package student_artur_martinenko.homework.lesson_12.level_5_middle.task_27_48;

import java.util.Objects;

class Product {
    private String title;
    private Integer price;
    private String description;

    public Product(String title, Integer price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(title.toLowerCase(), product.title.toLowerCase()) &&
                Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}


//Task_27
/*
Нам поручили разработать процесс валидации данных для
продуктов в интернет магазине.

Описание контекста задачи: интернет магазин решил разработать
функциональность с помощью которой работники магазина смогут
заводить в систему информацию про новые продукты. Интренет
магазин понимает, что при вводе данных вручную может сработать
человеческий фактор (человек при вводе информации может часто ошибаться).
Поэтому интернет магазин хочет ввести строгую проверку (валидацию)
вводимой вручную информации.

Вам поручили разработать прототип проверки (валидации) вводимой
вручную информации о новых продукта.

На первом этапе пользователи будут вводить о продукте следующую информацию:
- название
- цену
- описание

К названию продукта выдвигаются следующие требования:
- не должно быть пустым
- не должно быть короче 3 символов
- не должно быть длиннее 100 символов
- должно содержать только английские буквы и цифры, другие символы не допустимы

К цене продукта выдвигаются следующие требования:
- не должна быть пустой
- должна содержать только цифры
- не может быть 0

К описанию продукта выдвигаются следующие требования:
- не должно быть длиннее 2000 символов
- должно содержать только английские буквы и цифры, другие символы не допустимы


С чего вы начнёте разработку прототипа процесса валидации?
 */

//Task_28
/*
Разработку функциональности можно начать с создания доменной модели.
Доменная модель - это классы, которые описывают данные с которыми
будет работать компьютерная программа.

В нашем случае речь идёт о продукте.

Поэтому создаём класс Product:

class Product {

    // создайте нужные свойства класса
    // создайте конструктор класса
    // создайте get() set() методы
    // переопределите методы:
    //      equals()
    //      hashCode()
    //      toString()

}
 */

//Task_29
/*
Класс Product:

import java.util.Objects;

class Product {

	private String title;
	private Integer price;    // указана в центах
	private String description;

	public Product(String title,
				   Integer price,
				   String description) {
		this.title = title;
		this.price = price;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Product product = (Product) o;
		return Objects.equals(title, product.title) &&
				Objects.equals(price, product.price) &&
				Objects.equals(description, product.description);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, price, description);
	}

	@Override
	public String toString() {
		return "Product{" +
				"title='" + title + '\'' +
				", price=" + price +
				", description='" + description + '\'' +
				'}';
	}
}

Далее давайте подумаем над тем, как и кто будет пользоватся
нашим процессом валидации данных по продукту? Сдесь имеется
в виду какое место будет занимать наш прототип процесса валидации
вводимых сотрудниками данных по новым продуктам в общей картине.
Как и кто им будет пользоваться? Что соответственно хотят получить
те кто будет пользоваться нашим процессом валидации?

Всегда важно перед тем как создавать решение задачи, встать на сторону
того кто будет пользоваться вашим решением и посмотреть его глазами
на вашу функциональность (которой ещё даже нет). Что хотят получить
от вашей функциональности те кто будет ей пользоваться? Ответ на
этот главный вопрос поможет вам разработать качественное решение,
которое будет востребовано у ваших клиентов и будет удовлетворять
их ожидания.

Какое место в общей картине занимает разрабатываемое нами решение?

Кто будет пользоваться нашим решением?

Что хотят получить от нашего решения те кто будет им пользоваться?
 */

//Task_46
/*
Убедитесь, что вы не забыли написать тесты, когда в данных есть много ошибок.

Например:
- не правильно указано название продукта и его цена
- не правильно указано название продукта и его описание
- и так далее
- не правильно указаны все три свойства!

Во всех этих случаях валидация будет возвращать список в котором будет
указана больше чем одна ошибка. Так как порядок, в котором должны лежать
ошибки в списке нигде не описан, это значит, что в тестах нельзя завязываться
на то в каком порядке ошибки будут указаны в списке. Нас должно интересовать
есть ли нужная нам ошибка в списке или ее нет, а под каким индексом в списке
она расположена нас не должно интересовать. Для этого мы можем воспользоваться
методом списка contains(), с помощью которого можно проверить есть ли
указанный объект в списке или нет. Для правильной работы метода contains()
необходимо переопределить метод equals() в классе Product. Если вы этого
еще не сделали то сделайте это.

Напишите автоматические тесты на выше указанные сценарии.
 */
