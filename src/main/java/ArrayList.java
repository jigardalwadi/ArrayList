package main.java;

public class ArrayList {

    private int[] array = new int[10];
    private int length = array.length;
    private int pointer = 0;

    public void add(int n) {
        if (pointer < length) {
            array[pointer] = n;
            pointer++;
        } else {
            length = length * 2;
            int[] newArray = new int[length];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = new int[length];
            for (int i = 0; i < newArray.length; i++) {
                array[i] = newArray[i];
            }
            array[pointer] = n;
            pointer++;
        }
    }

    public int remove(int index) {
        if (index < pointer) {
            int temp = array[index];
            for (int i = index; i < pointer - 1; i++) {
                array[i] = array[i + 1];
            }
            pointer--;
            return temp;
        } else {
            throw new ArrayIndexOutOfBoundsException(index);
        }
    }

    public int get(int index) {
        if (index >= pointer) {
            throw new ArrayIndexOutOfBoundsException(index);
        }

        return array[index];
    }

    public int size() {
        return pointer;
    }

    public void printArray() {
        int count = 0;
        while (count < pointer) {
            System.out.println(array[count++]);
        }
    }

}

