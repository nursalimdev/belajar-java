package nursalim.dev.app;

import nursalim.dev.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("PT Angin RIbut");

        Company.Employee employee = company.new Employee();
        employee.setName("Nursalim");

        System.out.println(company.getName());
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
