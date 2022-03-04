package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(uch());
        System.out.println(tort());
        System.out.println(besh());
        int result = uch()+tort()+besh();
        System.out.println("Total sum: " + result);
    }
    public static int uch(){
        int[] array = new int[300];
        int counter = 0;
        array[0] = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = i+1;
            if (array[i] % 3 == 0){
                counter += array[i];
            }
        }return counter;
    }
    public static int tort(){
        int[] array = new int[300];
        int counter = 0;
        array[0] = 0;
        for (int i = 0; i < array.length; i++){
            array[i] = i+1;
            if (array[i] % 4 == 0){
                counter += array[i];
            }
        }return counter;
    }
    public static int besh(){
        int[] array = new int[300];
        int counter = 0;
        array[0] = 0;
        for (int i= 0; i < array.length; i++){
            array[i] = i+1;
            if (array[i] % 5 == 0){
                counter += array[i];
            }
        }return counter;
    }
}
