package src.entities;

public class Aluno {

    public String name;
    public double N1;
    public double N2;
    public double N3;

    public double FinalGrade() {

        return N1 + N2 + N3;


    }
    public double media() {

        return (N1 + N2 + N3) / 3;


    }

    public double Missing ( ){


        return 60 - FinalGrade();


    }

}