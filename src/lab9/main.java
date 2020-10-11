package lab9;

public class main {

    public static void main(String[] args) {
        Company company = new Company();
        company.hireAll();
        System.out.println(" Список высоких зарплат: ");
        System.out.println(company.getTopSalaryStaff(10));
        System.out.println(" Список низких зарплат: ");
        System.out.println(company.getLowestSalaryStaff(30));
        int size=company.employees.size()-1;
        for (int i=0;i<size;i++){
            size-=1;
            company.fire();
        }
        System.out.println("Сотрудники уволены :(");
        System.out.println(" Список высоких зарплат: ");
        System.out.println(company.getTopSalaryStaff(10));
        System.out.println(" Список низких зарплат: ");
        System.out.println(company.getLowestSalaryStaff(30));
    }
}
