//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Задача 1
        String firstName = "Ivanov ";
        String middleName = "Ivan ";
        String lastName = "Ivanovich";
        String fullName = firstName + middleName + lastName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println(" ");

        //Задача 2
        String bigLetter = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + bigLetter);

        System.out.println(" ");

        //Задача 3
        String fullName2 = "Иванов Семён Семёнович";
        String modifiedFullName2 = fullName2.replace("ё", "е");

        System.out.println("Данные Ф. И. О. сотрудника — " + modifiedFullName2);
    }
}