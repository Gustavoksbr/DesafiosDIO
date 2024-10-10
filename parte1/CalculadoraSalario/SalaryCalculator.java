import java.util.Scanner;

// Classe Employee para representar os detalhes do funcionário:
class Employee {
    private int hoursWorked;
    private double hourlyRate;

    public Employee(int hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

// TODO: Implemente a classe Factory para criar objetos Employee:
class Factory{
  
    // TODO: Implemente o método createEmployee:
    public static Employee createEmployee(int hw, double hr){
    // TODO: Implemente do método para criar e retornar um objeto Employee:
      return new Employee(hw,hr);
    }

     }


public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        int hoursWorked = scanner.nextInt();
        double hourlyRate = scanner.nextDouble();
        
        // TODO: Utilize o Factory Method para criar um objeto Employee:
        Employee employee = Factory.createEmployee(hoursWorked,hourlyRate);
        double salary = employee.calculateSalary();

        System.out.printf("Salario total: %.1f%n", salary);
    }
}