package org.potemkin;

import org.potemkin.util.ArrayUtil;

public class MyClass extends ArrayUtil {

    public int[][] generateAndPrintMatrix(int sizeUp, int sizeString){
        int a [][] = randomArray(sizeUp,sizeString);
        printArray(a);
        return a;
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println("Рандомно сгенеренная матрица: ");
        int [][] array= myClass.generateAndPrintMatrix(2000,2000);
        System.out.println("Перевёрнутая матрица: ");
        int [][] revertArray = myClass.changeArray(array);
        myClass.printArray(revertArray);
    }
}
