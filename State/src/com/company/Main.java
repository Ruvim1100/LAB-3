package com.company;

public class Main {

    public static void main(String[] args) {
	Activity activity = new Sleeping();
    Student student = new Student();

    student.setActivity(activity);

    for (int i = 0; i < 7; i++)
    {
        student.Execution();
        student.changeActivity();
    }
    }
}
