package src.entities;

public class employee {

    public String name;

    public double GrossSalary;

    public double Tax;

    public double Percentage;

    public double NetSalary() {

return GrossSalary - Tax;
    }

    public double IncreaseSalary() {



        return  NetSalary() + (GrossSalary * Percentage) / 100;


    }

}
