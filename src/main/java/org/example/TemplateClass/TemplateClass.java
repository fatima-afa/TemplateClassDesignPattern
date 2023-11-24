package org.example.TemplateClass;

public abstract class TemplateClass {

    public  double operation(String a,double x1, double x2){
        if(a.equals("+"))
            return somme(x1,x2);
        if(a.equals("-"))
            return soustration(x1,x2);
        if(a.equals("*"))
            return multiple(x1,x2);
       else
        {
            System.out.println("operateur not found");
            return 0;
        }

    }
    public abstract double somme(double a, double b);
    public abstract double soustration(double a, double b);
    public abstract double multiple(double a, double b);



}
