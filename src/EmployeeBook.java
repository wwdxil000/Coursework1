public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    public void printAllOfEmployee() {
        for (Employee em : employees) {
            if (em != null) {
                System.out.println(em);
            }
        }
    }

    public double averageSlary() {
        int summ = 0;
        int count = 0;
        for (Employee em : employees) {
            if (em != null) {
                summ += em.getSalary();
                count++;
            }
            else {
                break;
            }
        }
        return (double) summ / count;
    }

    public void taxCalculation(String option) {
        for (Employee em : employees) {
            double tax = 0;
            switch (option){
                case "PROPORTIONAL":
                    tax = em.getSalary() * 0.13;
                    break;
                case "PROGRESSIVE":
                    if (em.getSalary() <= 150) {
                        tax = em.getSalary() * 0.13;
                    }
                    else if (em.getSalary() <= 350) {
                        tax = em.getSalary() * 0.17;
                    }
                    else {
                        tax = em.getSalary() * 0.21;
                    }
                    break;
            }
            System.out.println( "Налог для сотрудника: " + em.getName() + " равен " + tax);
        }
    }

    public void salaryChange (int departament, int procent) {
        for (Employee em : employees) {
            if (em.getDepartment() != departament) {
                continue;
            }
            em.setSalary((int) (em.getSalary() * (1 + procent / 100.0)));        }
    }

    public void theHighestSalary (int departament, int bigSelary) {
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            if (employee.getDepartment() != departament) {
                continue;
            }
            if (employee.getSalary() > bigSelary) {
                System.out.print("Порядковый номер: " + (i + 1) + " — ");
                employee.printShortInfo();
                break;
            }
        }
    }

    public void lowerEmployeeSalaries(int count, int wage) {
        int i = 0;
        while (count != 0 && i < employees.length) {
            Employee employee = employees[i];
            i++;
            if (employee.getSalary() < wage) {
                employee.printShortInfo();
                count--;
                if (count == 0) break;
            }
        }
    }

    public boolean IsEmployee (Employee employee) {
        for (Employee em : employees) {
            if (em.equals(employee)) {
                return true;
            }
        }
        return false;
    }

    public boolean newEmployee(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public Employee getById(int id) {
        for (Employee em : employees) {
            if (em.getId() == id) {
                return em;
            }
        }
        return null;
    }

}
