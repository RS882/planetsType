import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of planet (1 - 9) :");
        char num = sc.nextLine().charAt(0);

        if (num > '0' && num <= '9') {
            int indexOfPl = (int) num - '0' - 1;
            PlanetsOfSolarSystem planet = PlanetsOfSolarSystem.getByPlanetIndex(indexOfPl);

            System.out.printf("You choose %s%n", planet.getName());
            getTypeOfPlanet(indexOfPl+1);

        } else {
            System.out.println(" Number of planet entered incorrectly");
        }


        sc.close();
    }

    public static void getTypeOfPlanet(int numOfPlanet) {
        switch (numOfPlanet) {
            case 1, 2, 4:
                System.out.println("Class : Lifeless rock.");
                break;
            case 3:
                System.out.println("Class : Habitable planet.");
                break;
            case 5, 6, 7, 8:
                System.out.println("Class : Gas giant.");
                break;
            case 9:
                System.out.println("Class : Ice planet.");
                System.out.println("Pluto has been reclassified as a dwarf planet and is not considered a planet");
                break;
            default:
                System.out.println(" Number of planet entered incorrectly");
        }
    }

}

//   A lifeless rock, a habitable planet, a gas giant, or an ice planet.
//    Классификация планет
//
//    Создать перечисление "Планеты солнечной системы", перечислить в
//    нем все планеты.
//
//        Для перечисления указать поле название планеты, конструктор,
//        в который можно передать название.
//
//        В классе Main сделать метод, который выведет тип планеты:
//        Безжизненный камень, обитаемаая планета, газовый гигант или ледяная
//        планета.
//        В методе main предложить пользователю выбрать планету и в ответ
//        вывести класификацию этой планеты,
//        используя разработанный ранее метод.
//
//        Обратите внимание: плутон не считается планетой, так как
//        находится в поясе Койпера,
//        где были найдены планетоиды больших размеров
//
//        Дополнительное задание: добавить в перечисление поля "радиус"
//        и "масса".
//        Вывести эту информацию после класификации.
//        Дополнительное задание к дополнительному заданию: Добавить в
//        перечисление метод, который посчитает g для планеты по формуле
//        Gm/r^2, где m - масса, r - радиус, и G - гравитационная константа,
//        равная 6.6743e-11
//        Вывести эту информацию после информации о массе и радиусе.
//        Справка: g - ускорение свободного падения. На земле оно равно в
//        среднем 9.8 метров на секунду в квадрате
//
//        Пример:
//        Вывод:
//        Напишите номер планеты.
//        Ввод:
//        5
//        Вывод:
//        Вы выбрали планету Юпитер
//        Класс: газовый гигант