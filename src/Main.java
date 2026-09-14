public class Main {
    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();

        System.out.println(book.newEmployee(new Employee("Иванов И.И.",     1, 100)));
        System.out.println(book.newEmployee(new Employee("Петров П.П.",     1, 200)));
        System.out.println(book.newEmployee(new Employee("Сидоров С.С.",    2, 150)));
        System.out.println(book.newEmployee(new Employee("Кузнецов К.К.",   2, 300)));
        System.out.println(book.newEmployee(new Employee("Смирнов С.С.",    3, 50)));
        System.out.println(book.newEmployee(new Employee("Попов П.П.",      3, 400)));
        System.out.println(book.newEmployee(new Employee("Волков В.В.",     4, 250)));
        System.out.println(book.newEmployee(new Employee("Морозов М.М.",    4, 350)));
        System.out.println(book.newEmployee(new Employee("Новиков Н.Н.",    5, 120)));
        System.out.println(book.newEmployee(new Employee("Фёдоров Ф.Ф.",    5, 450)));
        System.out.println(book.newEmployee(new Employee("Одиннадцатый О.О.", 1, 90))); // false

        book.printAllOfEmployee();

        System.out.println(book.averageSlary());

        book.taxCalculation("PROPORTIONAL");

        book.taxCalculation("PROGRESSIVE");

        book.salaryChange(1, 10);
        book.printAllOfEmployee();

        book.theHighestSalary(2, 200);

        book.lowerEmployeeSalaries(300, 3);

        System.out.println(book.IsEmployee(new Employee("Кто-то", 1, 250)));
        System.out.println(book.IsEmployee(new Employee("Кто-то", 1, 999)));
    }
}