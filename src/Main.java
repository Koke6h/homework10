public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1(){
        String firstName = "Иван ";
        String middleName = "Иванович ";
        String lastName = "Иванов ";
        String fullName = lastName+firstName+middleName;
        System.out.println("ФИО сотрудника - "+fullName);
    }
    public  static  void task2(){
        String firstName = "Иван ";
        String middleName = "Иванович ";
        String lastName = "Иванов ";
        String fullNameLower = lastName+firstName+middleName;
        String fullName = fullNameLower.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета —  "+fullName);
    }
    public static void task3(){
        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String fullName2 = lastName+firstName+middleName;
        String fullName = fullName2.replace("ё","е");
        System.out.println("Данные Ф. И. О. сотрудника — "+fullName);
    }
}