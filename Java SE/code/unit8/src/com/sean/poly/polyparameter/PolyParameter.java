package com.sean.poly.polyparameter;

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("tom", 2500);
        Manager jack = new Manager("jack", 5000, 200000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(jack);
        polyParameter.showEmpAnnual(tom);
        polyParameter.testWork(tom);
        polyParameter.testWork(jack);

    }
    //获取年工资
    public void showEmpAnnual(Employee e){
        System.out.println(e.getAnnual());
    }
    //工作
    public void testWork(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        }else if(e instanceof Manager){
            ((Manager) e).Manage();
        }
    }
}
