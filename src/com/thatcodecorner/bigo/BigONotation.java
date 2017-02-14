package com.thatcodecorner.bigo;

public class BigONotation {
    private int[] array;
    private int arraySize;
    private int itemsInArray = 0;
    static long startTime;
    static long endTime;

    public static void main(String[] args) {
        BigONotation testAlgo2 = new BigONotation(100000);
        testAlgo2.generateRandomArray();

        BigONotation testAlgo3 = new BigONotation(300000);
        testAlgo3.generateRandomArray();

        BigONotation testAlgo4 = new BigONotation(10000000);
        testAlgo4.generateRandomArray();

        testAlgo2.linearSearch(20);
        testAlgo3.linearSearch(20);
        testAlgo4.linearSearch(20);
    }

    BigONotation(int size) {
        arraySize = size;
        array = new int[size];
    }


    //0(1)
    public void addItemToArray(int newItem) {
        array[itemsInArray++] = newItem;
    }

    //O(N)
    public void linearSearch(int value) {
        boolean valueInArray = false;
        String indexsWithValue = "";
        startTime = System.currentTimeMillis();
        for(int i = 0; i < arraySize; i++) {
            if(array[i] == value){
                valueInArray = true;
                indexsWithValue = indexsWithValue + " " + i;
            }
        }

        System.out.println("value found " + valueInArray);
        endTime = System.currentTimeMillis();
        System.out.println("Total Time " + (endTime - startTime));
    }


    public void generateRandomArray() {
        for(int i =0; i < arraySize; i++) {
            array[i] = (int)(Math.random() * 1000) + 10;
        }
        itemsInArray = arraySize - 1;
    }
}
