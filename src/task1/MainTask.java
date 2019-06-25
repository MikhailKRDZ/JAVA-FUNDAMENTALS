package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class MainTask {
    public static void main(String[] args) {
        int checksNumber = 55555;//номер заказа 5 значное число присваевается автоматически
        int clientsNumber = 1000;  // скорее всего берется из базы клиентов


        while (checksNumber<55558) {
            PizzasOrder pizzasOrder = new PizzasOrder();

            pizzasOrder.setPizzasOrder(checksNumber, clientsNumber);
            pizzasOrder.setPizzasElements();

            checksNumber = checksNumber + 1;
            clientsNumber = (int) (Math.random() * 1000 + 1);


        }

        int pizzasTypeNumber = 2;// количество типов пиццы

        ArrayList<String> ingredients1 = new ArrayList<String>();
        String ingredient1 = "Мука";
        ingredients1.add(ingredient1);// Массив ингредиентов
        ingredients1.add("Сахар");
        String pizzasName = "IvanovPizza";  //Название пиццы // Название могут придумать клиенты и заказать до 10шт,  если название не lat (4-20) то название
        Boolean typeCarlzone = Boolean.TRUE; // Тип пиццы
        int pizzasNumber = 2;// количество пицц ( если название свое то не больше 10)

        ArrayList<String> ingredients2 = new ArrayList<String>();
        String ingredient2 = "Яйца";
        ingredients2.add(ingredient2);// Массив ингредиентов
        ingredients2.add("Сахар");
        ingredients2.add("Мука");
        String pizzasName2 = "PetrovPizza";  //Название пиццы // Название могут придумать клиенты и заказать до 10шт,  если название не lat (4-20) то название
        Boolean typeCarlzone2 = Boolean.FALSE; // Тип пиццы
        int pizzasNumber2 = 3;// количество пицц ( если название свое то не больше 10)
        int pizzasObject = 4;//количество объектов  Пицца


        Object[] arrElementsPizza = new Object[4];

        ArrayList<String> arrPizzasName = new ArrayList<>();
        arrPizzasName.add(pizzasName);
        arrPizzasName.add(pizzasName2);


        String[] arrArrPizzasName = arrPizzasName.toArray(new String[0]);
        arrElementsPizza[0] = arrArrPizzasName;

        List<ArrayList<String>> arrArrIngredients = new ArrayList<>();

        arrArrIngredients.add(ingredients1);
        arrArrIngredients.add(ingredients2);

        String[][] arrArrStrIngredients = new String[arrArrIngredients.size()][];
        for (int i = 0; i < arrArrIngredients.size(); i++) {
            arrArrStrIngredients[i] = new String[arrArrIngredients.get(i).size()];
            for (int j = 0; j < arrArrIngredients.get(i).size(); j++) {
                arrArrStrIngredients[i][j] = arrArrIngredients.get(i).get(j);
            }
        }
        arrElementsPizza[1] = arrArrStrIngredients;


        ArrayList<Boolean> arrTypeCarlzone = new ArrayList<>();
        arrTypeCarlzone.add(typeCarlzone);
        arrTypeCarlzone.add(typeCarlzone2);


        Boolean[] arrStrCarlzone = arrTypeCarlzone.toArray(new Boolean[0]);
        arrElementsPizza[2] = arrStrCarlzone;

        ArrayList<Integer> arrPizzasNumber = new ArrayList<>();
        arrPizzasNumber.add(pizzasNumber);
        arrPizzasNumber.add(pizzasNumber2);

        Integer[] arrStrPizzaNumber = arrPizzasNumber.toArray(new Integer[0]);
        arrElementsPizza[3] = arrStrPizzaNumber;

//        PizzasOrder pizzasOrder = new PizzasOrder(checksNumber,clientsNumber,arrElementsPizza);

//        pizzasOrder.showPizzasMain(checksNumber, clientsNumber, pizzasName, pizzasNumber);
//
////        pizzasOrder.showPizzasMain(checksNumber, clientsNumber, pizzasName, pizzasNumber, ingredients);

//    номер заказа (пятизначное число),
//    номер клиента,
//    массив элементов Pizza, каждый из которых является объектом,
//            содержащим
//                 название пиццы,
//                 массив ингредиентов,
//                 тип пиццы
//                 количество.

//        элементы пицца


//            ArrayList<ArrayList<String>> outer = new ArrayList<ArrayList<String>>();
//            ArrayList<String> nodeList = new ArrayList<String>();

// Fill in nodeList here...

//            outer.add(nodeList);


        }
    }
