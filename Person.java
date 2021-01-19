package geekbrains.homework;

public class Person {
    public String name;
    public String occupation;
    public String mail;
    public String cellphone;
    public long salary;
    public int age;
    public Person(String name, String occupation, String mail, String cellphone, long salary, int age) {
        this.name = name;
        this.occupation = occupation;
        this.mail = mail;
        this.cellphone = cellphone;
        this.salary = salary;
        this.age = age;
    }
    public void showPerson(){
        System.out.println("Сотрудник: " + name);
        System.out.println("Должность: " + occupation);
        System.out.println("Адрес почты: " + mail);
        System.out.println("Номер телефона: " + cellphone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
        System.out.println();
    }
}



