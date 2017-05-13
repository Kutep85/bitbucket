package bitbucket;

import java.util.ArrayList;

/**
 * Created by Evgeny.Kutepov on 12.05.2017.
 */
public class Collection {

    private ArrayList<Integer> list;

    Collection () {

        list = new ArrayList<Integer>();
    }


    void add (int value) {

        list.add(value);
    }


    void addValue(int value) {

        addToArray(value);
        list.add(value);
        System.out.println("Element added to collection.");
    }


    void delElementByIndex(int index) {

        int value = list.get(index);
        list.remove(index);
        System.out.println("Element " + index +" removed from collection.");
        addToArray(-1 * value);
    }


    void delElementByValue(int value) {

        boolean isValue = false;
        for (int i = 0; i < list.size(); i++){
            if (list.get(i) == value) {
                list.remove(i);
                System.out.println("Element " + i +" removed from collection.");
                i--;
                isValue = true;
            }
        }
        if (isValue)
        addToArray(-1 * value);
      }


    private void addToArray(int value) {
        for (int i = 0; i < list.size(); i++)
            list.set(i, list.get(i) + value);
    }


    void findValue(int value) {

        boolean isValue = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == value) {
                System.out.println("Value found. Have index:  " + i);
                isValue = true;
             }
           }
        if (!isValue)
            System.out.println("This value is not in collection");
    }


    void findIndex(int index) {

        System.out.println("The element of index " + index + " have value:  " + list.get(index));
    }


    void maxElement(){

        int max = list.get(0);
        for (int element : list) {
            if (element > max)
                max = element;
        }

        System.out.println("Maximum value in collection is:  " + max);
    }


    void minElement(){

        int min = list.get(0);
        for (int element : list) {
            if (element < min)
                min = element;
        }

        System.out.println("Minimum value in collection is:  " + min);
    }


    void middleValue() {

        int sum = 0;
        for (int element : list) {
            sum += element;
        }

        System.out.println("Middle value of collection is:  " + ((double)sum / (double)list.size()));
    }


    void printCollection (){

        for (int i = 0; i < list.size(); i++) {
            if (i < list.size() - 1)
                System.out.print(list.get(i) + ", ");
            else
                System.out.println(list.get(i) + ".");
        }
    }


    boolean isEmpty(){

        return list.isEmpty();
    }


    void clear() {

        list.clear();
    }
}
