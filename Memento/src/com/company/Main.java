package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        Repository repository = new Repository();

        System.out.println("\nСоздание проекта...");
        project.setVersionDate("1.0");
        System.out.println(project);

        System.out.println("Сохранение текущей версии...");
        repository.setMemento(project.save());
        Thread.sleep(5000);

        System.out.println("Обновление проекта...");
        project.setVersionDate("1.1");
        System.out.println(project);

        System.out.println("Возврат к прошлой версии...");
        project.load(repository.getMemento());
        System.out.println(project);

    }
}
