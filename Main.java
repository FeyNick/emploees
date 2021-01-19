package geekbrains.homework;

public class Main {

    public static void main(String[] args) {
        Person[] persArr = new Person[5];
        persArr[0] = new Person("Ivanov Ivan", "Engineer", "ivanovI@mailbox.com", "892312312", 30000, 31);
        persArr[1] = new Person("Menshikov Dmitriy", "Lead manager", "menshikovD@mailbox.com", "892356712", 90000, 43);
        persArr[2] = new Person("Zabiev Andrey", "Chief Engineer", "zabievA@mailbox.com", "892301198", 70000, 41);
        persArr[3] = new Person("Kuznecova Oksana", "Assistant manager ", "kuznezovaO@mailbox.com", "892312345", 40000, 30);
        persArr[4] = new Person("Sharikov Dmitriy", "Janitor", "sharikovD@mailbox.com", "892390123", 25000, 23);
        for(int i =0; i < persArr.length; i++){
            if(persArr[i].age >= 40)
                persArr[i].showPerson();
            }
        }
    }

