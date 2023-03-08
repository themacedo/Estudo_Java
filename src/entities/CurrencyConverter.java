package src.entities;


public class CurrencyConverter {




    public static double porcent(double dollar, double vdolar) {


        return (dollar * vdolar * 6) /  100 ;


    }

    public static double converter(double dollar, double vdolar) {


        return dollar * vdolar + porcent(dollar,vdolar) ;


    }

}
