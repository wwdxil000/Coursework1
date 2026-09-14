public class Employee {
    private static int counter = 1;
    private int id;
    private String name;
    private int department;
    private int salary;

    public Employee (String name, int department, int salary) {
        this.id = counter++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int selary) {
        this.salary = selary;
    }

    public void printShortInfo() {
        System.out.println("Краткая информация о сотруднике: " + "имя=" + this.name + ", зарплата=" + this.salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == employee.salary;
    }

    @Override
    public String toString() {
        return "Информация о сотруднике: " + "id=" + this.id + ", Ф.И.О=" + this.name + ", отдел=" + this.department + ", зарплата=" + this.salary;
    }
}
