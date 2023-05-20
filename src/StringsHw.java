public class StringsHw {
    public static void main(String[] args) {

        String firstName = "Ivan";
        String lastName = "Ivanov";
        String middleName = "Ivanovich";
        var fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + (lastName + " " + firstName + " " + middleName).toUpperCase());
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + lastName.toUpperCase() + " " + firstName + " " + middleName);

        var fullName2 = "Ёванов Семён Семёнович";
        var replaced = fullName2.replace("ё", "е").replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника — " + replaced);

        String s1 = "cat";
        String s2 = "cat";
        if (s1.equals(s2)) {
            System.out.println("Equals!");
        }
    }
}
