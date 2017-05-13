package bitbucket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Evgeny.Kutepov on 12.05.2017.
 */
public class MenuCollection {

    private Collection collection = new Collection();

    void startMenu() throws IOException {

        System.out.println("========= MENU =========\n");
        System.out.println("1. Create and fill collection\n" +
                "2. Add value to collection\n" +
                "3. Remove element by index\n" +
                "4. Remove element by value\n" +
                "5. Find element by value\n" +
                "6. Find element by index\n" +
                "7. Find maximum of collection\n" +
                "8. Find minimum of collection\n" +
                "9. Find middle value\n" +
                "0. Close program\n\n" +
                "Change function:");

        logicMenu();
    }


    void logicMenu() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command = reader.readLine();

        try {
            switch (command) {
                case "1":
                    collection.clear();
                    for (int i = 0; i < 20; i++) {
                        collection.add((int) (Math.random() * 15));
                    }
                    collection.printCollection();
                    System.out.println();
                    startMenu();
                    break;

                case "2":
                    if (!collection.isEmpty()){
                        System.out.println("Enter value:");
                        collection.addValue(Integer.parseInt(reader.readLine()));
                        collection.printCollection();
                        System.out.println();
                        startMenu();
                    }
                    else {
                        System.out.println("You need create collection");
                        startMenu();
                    }
                    break;

                case "3":
                    if (collection.isEmpty()){
                        System.out.println("You need create collection");
                        startMenu();
                    }
                    else
                        System.out.println("Enter index:");
                        collection.delElementByIndex(Integer.parseInt(reader.readLine()));
                        collection.printCollection();
                        System.out.println();
                        startMenu();
                    break;

                case "4":
                    if (collection.isEmpty()){
                        System.out.println("You need create collection");
                        startMenu();
                    }
                    else
                        System.out.println("Enter value:");
                    collection.delElementByValue(Integer.parseInt(reader.readLine()));
                    collection.printCollection();
                    System.out.println();
                    startMenu();
                    break;

                case "5":
                    if (collection.isEmpty()){
                        System.out.println("You need create collection");
                        startMenu();
                    }
                    else
                        System.out.println("Enter value:");
                        collection.findValue(Integer.parseInt(reader.readLine()));
                        collection.printCollection();
                        System.out.println();
                        startMenu();
                    break;

                case "6":
                    if (collection.isEmpty()){
                        System.out.println("You need create collection");
                        startMenu();
                    }
                    else
                        System.out.println("Enter index:");
                        collection.findIndex(Integer.parseInt(reader.readLine()));
                        collection.printCollection();
                        System.out.println();
                        startMenu();
                    break;

                case "7":
                    if (collection.isEmpty()){
                        System.out.println("You need create collection");
                        startMenu();
                    }
                    else
                        collection.maxElement();
                        collection.printCollection();
                        System.out.println();
                        startMenu();
                    break;

                case "8":
                    if (collection.isEmpty()){
                        System.out.println("You need create collection");
                        startMenu();
                    }
                    else
                        collection.minElement();
                        collection.printCollection();
                        System.out.println();
                        startMenu();
                    break;

                case "9":
                    if (collection.isEmpty()){
                        System.out.println("You need create collection");
                        startMenu();
                    }
                    else
                        collection.middleValue();
                        collection.printCollection();
                        System.out.println();
                        startMenu();
                    break;

                case "0":
                    break;

                default:
                    System.err.println("ENTER NUMBER FROM 1 TO 8!!!\n");
                    startMenu();
                    break;
            }
        }
        catch (NumberFormatException e) {
            System.err.println("VALUE IS NOT INTEGER!!!");
            startMenu();
        }
        catch (IndexOutOfBoundsException e) {
            System.err.println("NUMBER MORE THAN COLLECTIONS SIZE!!!");
            startMenu();
        }
    }
}
