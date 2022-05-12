package com.company;

public class Main {

    public static void main(String[] args) {
        Context client = new Context();
        int[] mas1 = {2,6,9,1,11,8,15,3};
        int[] mas2 = {4,11,3,19,1,5,10,7};
        client.setStrategy(new AscendingBubbleSort());
        client.executeStrategy(mas1);

        client.setStrategy(new DescendingBubbleSort());
        client.executeStrategy(mas1);

        client.setStrategy(new AscendingSelectionSort());
        client.executeStrategy(mas2);

        client.setStrategy(new DescendingSelectionSort());
        client.executeStrategy(mas2);

    }
}
