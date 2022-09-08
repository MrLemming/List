import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> purchases = new ArrayList<>();

        while (true) {
            System.out.println();
            System.out.println("Выберите операцию и введите её номер");
            System.out.println("1. Добавить покупку в список");
            System.out.println("2. Показать список покупок");
            System.out.println("3. Удалить покупку из списка");
            System.out.println("4. Поиск");
            System.out.println("Для завершения введите end");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                System.out.println("Программа завершена!");
                break;
            } else {
                int operation = Integer.parseInt(input);
                switch (operation) {
                    case 1:
                        System.out.println("Какую покупку хотите добавить?");
                        input = scanner.nextLine();
                        purchases.add(input);
                        System.out.println("Итого в списке покупок: " + purchases.size());
                        break;

                    case 2:
                        System.out.println("Список покупок:");
                        for (int i = 0; i < purchases.size(); i++) {
                            System.out.println((i + 1) + " " + purchases.get(i));
                        }
                        break;

                    case 3:
                        System.out.println("Список покупок:");
                        for (int i = 0; i < purchases.size(); i++) {
                            System.out.println((i + 1) + " " + purchases.get(i));
                        }
                        System.out.println("Какую хотите удалить? Введите номер или название:");
                        input = scanner.nextLine();
                        int numberProduct;
                        try {
                            numberProduct = Integer.parseInt(input);
                            purchases.remove(numberProduct - 1);
                        } catch (NumberFormatException e) {
                            purchases.remove(input);
                        }
                        break;

                    case 4:
                        System.out.println("Введите текст для поиска:");
                        input = scanner.nextLine();
                        String queryLower = input.toLowerCase();
                        System.out.println("Найдено:");
                        for (int i = 0; i < purchases.size(); i++) {
                            String itemLower = purchases.get(i).toLowerCase();
                            if (itemLower.contains(queryLower)) {
                                System.out.println((i + 1) + " " + purchases.get(i));
                            }
                        }
                        break;

                    default:
                        System.out.println("Такой операции нет");
                        break;
                }
            }
        }
    }
}