public class Main {
    public static void main(String[] args) {
        String task = "\nTask-"; //ctrl or command
        System.out.println(task + 1);
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = firstName + " " + middleName + " " + lastName;
        String fullName2 = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
        String fullName3 = String.format("%s %s %s", firstName, middleName, lastName);
        String fullName4 = "%s %s %s".formatted(firstName, middleName, lastName);
        String fullName5 = String.join(" ", firstName, middleName, lastName);


        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println("Ф. И. О. сотрудника — " + fullName2);
        System.out.println("Ф. И. О. сотрудника — " + fullName3);
        System.out.println("Ф. И. О. сотрудника — " + fullName4);
        System.out.println("Ф. И. О. сотрудника — " + fullName5);


        System.out.println(task + 2);
        System.out.printf("Данные Ф. И. О. сотрудника для заполнения отчета — %s%n", fullName.toUpperCase());

        System.out.println(task + 3);
        fullName = "Иванов Семён Семёнович";
        String correctedFullName = fullName.replace("ё", "e"); //ctrl + alt <-
        System.out.printf("Данные Ф. И. О. сотрудника — %s%n", correctedFullName);
    }
}