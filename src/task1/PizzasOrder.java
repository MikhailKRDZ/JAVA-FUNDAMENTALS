package task1;

import java.util.*;

public class PizzasOrder<calzone> {

    private int checksNumber;//номер заказа 5 значное число присваевается автоматически не подл изм
    private int clientsNumber;  // Номер клиента скорее всего берется из базы клиентов

    private ArrayList<ArrayList<String>> arrElementsPizza = new ArrayList<>();// Массив элементов пицца каждый из которых объект


    private ArrayList<String> ingredients;


    public void setPizzasOrder(int checksNumber, int clientsNumber) {
        if (checksNumber < 10000 || checksNumber > 99999) {
            throw new IllegalArgumentException("Order number (Main Task (int checksNumber)) must be a five-digit number.");
        }
        this.checksNumber = checksNumber;
        this.clientsNumber = clientsNumber;
        System.out.println(this.checksNumber);
        System.out.println(this.clientsNumber);
    }


    //Конструктор объектов:
    public void setPizzasElements() {//Название пиццы массив ингр тип пиццы  количество) {
        ArrayList<String> add = new ArrayList<>();
        ArrayList<ArrayList<String>> bcd = new ArrayList<>();
        ArrayList<String> cde = new ArrayList<>();
        ArrayList<String> def = new ArrayList<>();


        System.out.println("привет я setPizzasElements");

        int i = 0;
        do {
            i++;
            /// добавить проверку  существ название или новое  если новое то проверку названия <4lat<20
            //( Подумать о возможности  добавлять неизвестное название, и составе)
            add.add(getPizzasName());
            bcd.add(getIngredients());
            cde.add(getPizzasType());
            def.add(getPizzasValue());


        } while (i < 2);
        System.out.println("add" + Arrays.asList(add));
        System.out.println("bcd" + Arrays.asList(bcd));
        System.out.println("cde" + Arrays.asList(cde));
        System.out.println("def" + Arrays.asList(def));
//        changePizzasValue(def);

        System.out.println(String.valueOf(0));// печатает 0

         }

    //Конструктор в котором ингредиенты не обозначены:

    public ArrayList<String> getIngredients() {
        ArrayList<String> ingridients = new ArrayList<>(Arrays.asList("Мука", "Сало", "Соль", "Яйца"));
// switch   casex  неизвестное название пиццы ( Подумать о возможности  добавлять неизвестное название, и составе)
        System.out.println("привет я getIngredients()");

        return ingridients;


    }

    //        добавить товар Название пиццы  к Заказу
    public String getPizzasName() {
        String pizzasName = "Pizza1";
//        pizzasName = "NewPizza";
//         проверить название пиццы   4<lat<20 если нет то имя_клиента_Номер пиццы по порядку в звказе

        return pizzasName;
    }

    //        добавить товар Тип пиццы  к Заказу Если Calzone то true
    public String getPizzasType() {
        String calzone = "true";
        return calzone;
    }

    //добавить товар Количество к Заказу
    public String getPizzasValue() {
        String pizzasNumber = String.valueOf(5);
        return pizzasNumber;
    }

////В случае, когда клиент хочет изменить желаемое количество пицц, должна быть возможность исправления и удаления введённых параметров.
public List<String> changePizzasValue(ArrayList<String> oldArray ) {
    List<String> newArray = new ArrayList<>(oldArray.size());
    Collections.copy(newArray, oldArray);
    System.out.println("Вы ввели , Хотите изменить количество");
    //дописать про продумать и удалить
    newArray.set(0, "0");
    return newArray;
        }

//    Реализовать метод для вывода атрибутов пиццы, в котором данные о пицце выводятся следующим образом: [Заказ : Клиент : Название : Количество]
//
//    Например: [10001 : 7717 : Margarita : 2]
    // доработать!!!!!!!!!!!
    public static void showPizzasMain(String checksNumber, String clientsNumber, ArrayList<String> pizzasName,  ArrayList<String> pizzasNumber) {
          System.out.print("[" + checksNumber + ":" + clientsNumber);
//        + pizzasName + ":" + pizzasNumber + "]"
        for (int i = 0; i < pizzasName.size(); i++) {
            System.out.print(":" + pizzasName.get(i) + ":" + pizzasNumber.get(i));
        }
        System.out.println("]");
    }

}
