package org.example.TemplateClass;

public class TemplateImp1 extends TemplateClass{
    @Override
    public double somme(double a, double b) {
        return a+b;
    }

    @Override
    public double soustration(double a, double b) {
        return a-b;
    }

    @Override
    public double multiple(double a, double b) {
        return a*b;
    }
}
