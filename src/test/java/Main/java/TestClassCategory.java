package Main.java;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestClassCategory {
    @Autowired
    private CategoryRepo сategoryRepository;

    @Test
    public void categorys() {
        Category Pizza = new Category();
        Pizza.setName("Пицца");
        Pizza.setParent(0L);
        сategoryRepository.save(Pizza);

        Category Rolls = new Category();
        Rolls.setName("Роллы");
        Rolls.setParent(0L);
        сategoryRepository.save(Rolls);

        Category Classic_rolls = new Category();
        Classic_rolls.setName("Классика");
        Classic_rolls.setParent(1L);
        сategoryRepository.save(Classic_rolls);

        Category Baked_rolls = new Category();
        Baked_rolls.setName("Запечённые");
        Baked_rolls.setParent(1L);
        сategoryRepository.save(Baked_rolls);

        Category Sweet_rolls = new Category();
        Sweet_rolls.setName("Сладкие");
        Sweet_rolls.setParent(1L);
        сategoryRepository.save(Sweet_rolls);

        Category Sets = new Category();
        Sets.setName("Сеты");
        Sets.setParent(1L);
        сategoryRepository.save(Sets);

        Category Burgers = new Category();
        Burgers.setName("Бургеры");
        Burgers.setParent(0L);
        сategoryRepository.save(Burgers);

        Category Classic_burgers = new Category();
        Classic_burgers.setName("Классические Бургеры");
        Classic_burgers.setParent(1L);
        сategoryRepository.save(Classic_burgers);

        Category Spicy_burgers = new Category();
        Spicy_burgers.setName("Острые Бургеры");
        Spicy_burgers.setParent(1L);
        сategoryRepository.save(Spicy_burgers);

        Category Beverages = new Category();
        Beverages.setName("Напитки");
        Beverages.setParent(0L);
        сategoryRepository.save(Beverages);

        Category Carbonated_drinks = new Category();
        Carbonated_drinks.setName("Газированные напитки");
        Carbonated_drinks.setParent(1L);
        сategoryRepository.save(Carbonated_drinks);

        Category Energy_drinks = new Category();
        Energy_drinks.setName("Энергетические напитки");
        Energy_drinks.setParent(1L);
        сategoryRepository.save(Energy_drinks);

        Category Juices = new Category();
        Juices.setName("Соки");
        Juices.setParent(1L);
        сategoryRepository.save(Juices);

        Category Others = new Category();
        Others.setName("Другие");
        Others.setParent(1L);
        сategoryRepository.save(Others);

        class TestClassProduct {
            @Autowired
            private ProductRepo productRepository;

            @Test
            public void products() {
                Product margarita = new Product();
                margarita.setId_category(Pizza);
                margarita.setName("Маргаритта");
                margarita.setPrice(2.1);
                margarita.setDescription("Сир");
                productRepository.save(margarita);

                Product pepperoni = new Product();
                pepperoni.setId_category(Pizza);
                pepperoni.setName("Пепперони");
                pepperoni.setPrice(5.0);
                pepperoni.setDescription("Ковбаса");
                productRepository.save(margarita);

                Product pineapple_pizza = new Product();
                pineapple_pizza.setId_category(Pizza);
                pineapple_pizza.setName("Пицца с ананасом");
                pineapple_pizza.setPrice(0.1);
                pineapple_pizza.setDescription("Бе");
                productRepository.save(pineapple_pizza);
                //Суши классичесике
                Product philadelphia = new Product();
                philadelphia.setId_category(Classic_rolls);
                philadelphia.setName("Филадельфия");
                philadelphia.setPrice(5.5);
                philadelphia.setDescription("Рыба");
                productRepository.save(philadelphia);

                Product maki_rolls = new Product();
                maki_rolls.setId_category(Classic_rolls);
                maki_rolls.setName("Маки");
                maki_rolls.setPrice(2.5);
                maki_rolls.setDescription("Мало");
                productRepository.save(maki_rolls);

                Product sushi = new Product();
                sushi.setId_category(Classic_rolls);
                sushi.setName("Суши");
                sushi.setPrice(3.6);
                sushi.setDescription("Мало+рыба");
                productRepository.save(sushi);
                //Суши Запечёные
                Product gunkans = new Product();
                gunkans.setId_category(Baked_rolls);
                gunkans.setName("Гунканы");
                gunkans.setPrice(3.6);
                gunkans.setDescription("Запенные суши");
                productRepository.save(gunkans);

                Product Baked_rolls_with_crab = new Product();
                Baked_rolls_with_crab.setId_category(Baked_rolls);
                Baked_rolls_with_crab.setName("Запечённые роллы с крабом");
                Baked_rolls_with_crab.setPrice(10.5);
                Baked_rolls_with_crab.setDescription("Крабовые палочки");
                productRepository.save(Baked_rolls_with_crab);

                Product Baked_chicken_rolls = new Product();
                Baked_chicken_rolls.setId_category(Baked_rolls);
                Baked_chicken_rolls.setName("Запечённые роллы с курицей");
                Baked_chicken_rolls.setPrice(3.6);
                Baked_chicken_rolls.setDescription("Ролл с курицей");
                productRepository.save(Baked_chicken_rolls);
                //Суши сладкие
                Product banana_sushi = new Product();
                banana_sushi.setId_category(Sweet_rolls);
                banana_sushi.setName("Суши с бананом");
                banana_sushi.setPrice(2.2);
                banana_sushi.setDescription("Банан");
                productRepository.save(banana_sushi);

                Product kiwi_sushi = new Product();
                kiwi_sushi.setId_category(Sweet_rolls);
                kiwi_sushi.setName("Суши с киви");
                kiwi_sushi.setPrice(3.0);
                kiwi_sushi.setDescription("Киви");
                productRepository.save(kiwi_sushi);

                Product orange_sushi = new Product();
                orange_sushi.setId_category(Sweet_rolls);
                orange_sushi.setName("Суши с апельсином");
                orange_sushi.setPrice(3.8);
                orange_sushi.setDescription("Апельсин");
                productRepository.save(orange_sushi);
                //Наборы
                Product Seth_Im_lucky = new Product();
                Seth_Im_lucky.setId_category(Sets);
                Seth_Im_lucky.setName("Сет Мені щастить");
                Seth_Im_lucky.setPrice(5.5);
                Seth_Im_lucky.setDescription("Ролл дракон и мне повезёт");
                productRepository.save(Seth_Im_lucky);

                Product Seth_Grand_Philadelphia = new Product();
                Seth_Grand_Philadelphia.setId_category(Sets);
                Seth_Grand_Philadelphia.setName("Сет Гранд Філадельфія");
                Seth_Grand_Philadelphia.setPrice(8.5);
                Seth_Grand_Philadelphia.setDescription("Филадельфия и мне повезёт");
                productRepository.save(Seth_Grand_Philadelphia);

                Product Seth_Jumanji = new Product();
                Seth_Jumanji.setId_category(Sets);
                Seth_Jumanji.setName("Сет Джуманджі");
                Seth_Jumanji.setPrice(12.9);
                Seth_Jumanji.setDescription("Филадельфия и запечённые(40шт.)");
                productRepository.save(Seth_Jumanji);
                //Классические бургеры
                Product Chickenburger = new Product();
                Chickenburger.setId_category(Classic_burgers);
                Chickenburger.setName("Чикенбургер");
                Chickenburger.setPrice(5.5);
                Chickenburger.setDescription("Кура");
                productRepository.save(Chickenburger);

                Product BBQ_burger = new Product();
                BBQ_burger.setId_category(Classic_burgers);
                BBQ_burger.setName("Чикенбургер");
                BBQ_burger.setPrice(5.6);
                BBQ_burger.setDescription("BBQ");
                productRepository.save(BBQ_burger);

                Product Classic_burger = new Product();
                Classic_burger.setId_category(Classic_burgers);
                Classic_burger.setName("Классик-бургер");
                Classic_burger.setPrice(4.4);
                Classic_burger.setDescription("Классика");
                productRepository.save(Classic_burger);
                //Острые бургеры
                Product Brooklyn_Burger = new Product();
                Brooklyn_Burger.setId_category(Spicy_burgers);
                Brooklyn_Burger.setName("Бургер Бруклин");
                Brooklyn_Burger.setPrice(5.5);
                Brooklyn_Burger.setDescription("Один перец");
                productRepository.save(Brooklyn_Burger);

                Product Broadway_burger = new Product();
                Broadway_burger.setId_category(Spicy_burgers);
                Broadway_burger.setName("Бургер Бродвей");
                Broadway_burger.setPrice(5.4);
                Broadway_burger.setDescription("Эльдар");
                productRepository.save(Broadway_burger);

                Product Burger_Grand_Canyon = new Product();
                Burger_Grand_Canyon.setId_category(Spicy_burgers);
                Burger_Grand_Canyon.setName("Бургер Гранд Каньон");
                Burger_Grand_Canyon.setPrice(5.0);
                Burger_Grand_Canyon.setDescription("Три перца");
                productRepository.save(Burger_Grand_Canyon);
                //Газированные напитки
                Product pepsi = new Product();
                pepsi.setId_category(Carbonated_drinks);
                pepsi.setName("Пепси");
                pepsi.setPrice(1.5);
                pepsi.setDescription("Почти колла");
                productRepository.save(pepsi);

                Product cola = new Product();
                cola.setId_category(Carbonated_drinks);
                cola.setName("Кола");
                cola.setPrice(1.5);
                cola.setDescription("Почти пепси");
                productRepository.save(cola);

                Product bailcal = new Product();
                bailcal.setId_category(Carbonated_drinks);
                bailcal.setName("Баикал");
                bailcal.setPrice(1.4);
                bailcal.setDescription("Баикал");
                productRepository.save(bailcal);
                //Энергитические напитки
                Product flash = new Product();
                flash.setId_category(Energy_drinks);
                flash.setName("Флэш");
                flash.setPrice(2.2);
                flash.setDescription("Кисло");
                productRepository.save(flash);

                Product gorilla = new Product();
                gorilla.setId_category(Energy_drinks);
                gorilla.setName("Горилла");
                gorilla.setPrice(2.0);
                gorilla.setDescription("Сладко");
                productRepository.save(gorilla);

                Product redbull = new Product();
                redbull.setId_category(Energy_drinks);
                redbull.setName("Red Bull");
                redbull.setPrice(3.0);
                redbull.setDescription("Умеренно");
                productRepository.save(redbull);
                //Сок
                Product rich = new Product();
                rich.setId_category(Juices);
                rich.setName("Rich");
                rich.setPrice(6.0);
                rich.setDescription("10/10");
                productRepository.save(rich);

                Product vkusnika = new Product();
                vkusnika.setId_category(Juices);
                vkusnika.setName("Вкусника");
                vkusnika.setPrice(2.1);
                vkusnika.setDescription("4/10");
                productRepository.save(vkusnika);

                Product Cherry_Orchard = new Product();
                Cherry_Orchard.setId_category(Juices);
                Cherry_Orchard.setName("Вишнёвый сад");
                Cherry_Orchard.setPrice(4.0);
                Cherry_Orchard.setDescription("7/10");
                productRepository.save(Cherry_Orchard);
                //Другое
                Product milkshake = new Product();
                milkshake.setId_category(Others);
                milkshake.setName("Молочный Коктейль");
                milkshake.setPrice(5.5);
                milkshake.setDescription("Молоко");
                productRepository.save(milkshake);

                Product banana_milkshake = new Product();
                banana_milkshake.setId_category(Others);
                banana_milkshake.setName("Молочный коктейль с бананом");
                banana_milkshake.setPrice(4.0);
                banana_milkshake.setDescription("Молоко с бананом");
                productRepository.save(banana_milkshake);

                Product slurm = new Product();
                slurm.setId_category(Others);
                slurm.setName("Слёрм");
                slurm.setPrice(7.5);
                slurm.setDescription("Слёрм");
                productRepository.save(slurm);
            }
        }
    }
}