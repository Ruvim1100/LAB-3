package com.company;
import java.util.Arrays;
public class DescendingBubbleSort implements Sorting {
    @Override
    public void sort(int[] mas) {
        System.out.println("\n Сортировка пузырьком по убыванию: ");
        System.out.println("Исходный массив: \t" + Arrays.toString(mas));
        for(int bar = mas.length-1; bar>=0; bar --){
            for(int i = 0; i<bar; i++){
                if(mas[i]<mas[i+1]){
                    int tmp = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = tmp;
                }
            }
        }
        System.out.println("Отсортированный массив: \t" + Arrays.toString(mas));
    }

}
