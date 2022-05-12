package com.company;
import java.util.Arrays;

public class AscendingSelectionSort implements Sorting {
    @Override
    public void sort(int[] mas) {
        System.out.println("\n Сортировка выбором по возрастанию: ");
        System.out.println("Исходный массив: \t" + Arrays.toString(mas));
        for(int bar = 0; bar < mas.length-1; bar++){
            for(int i = bar+1; i<mas.length; i++){
                if(mas[i]<mas[bar]){
                    int tmp = mas[i];
                    mas[i] = mas[bar];
                    mas[bar] = tmp;
                }
            }
        }
        System.out.println("Отсортированный массив: \t" + Arrays.toString(mas));
    }

}
