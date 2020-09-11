/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BilKomplexs;


public class cKomplek {
    
    private double real, imajiner;
    public cKomplek(){
    
    }
    
    public cKomplek(double r, double i){
        real = r;
        imajiner = i;
    }
    
    public void setReal(double r){
        real = r;
    }
    
    public double getReal(){
        return real;
    }
    
    public void setImajiner(double i){
        imajiner = i;
    }
    
    public double getImajiner(){
        return imajiner;
    }
    
    public double modulus(){
        double mod = Math.sqrt(Math.pow(real, 2)+Math.pow(imajiner, 2));
        return mod;
    }
    
    public double argument(){
        double argument = Math.atan(imajiner/real);
        return argument;
    }
    
    public cKomplek konjugate(){
        cKomplek z = new cKomplek(real, -1*imajiner);
        real = z.getReal();
        imajiner = z.getImajiner();
        return z;
    }
    
    public cKomplek addkomplek(cKomplek z1){
        cKomplek z = new cKomplek();
        z.setReal(real+z1.getReal());
        z.setImajiner(imajiner+z1.getImajiner());
        real = z.getReal();
        imajiner = z.getImajiner();
        return z;
    }
    
    public cKomplek subkomplek(cKomplek z1){
        cKomplek z = new cKomplek();
        z.setReal(real-z1.getReal());
        z.setImajiner(imajiner-z1.getImajiner());
        real = z.getReal();
        imajiner = z.getImajiner();
        return z;
    }
    
    public cKomplek mulkomplek(cKomplek z1){
        cKomplek z = new cKomplek();
        z.setReal(real*z1.getReal()+imajiner*z1.getImajiner());
        z.setImajiner(imajiner*z1.getReal()+real*z1.getImajiner());
        real = z.getReal();
        imajiner = z.getImajiner();
        return z;
    }
    
    public cKomplek kuadrat(){
        cKomplek z = new cKomplek(real*real+imajiner*imajiner,2*real*imajiner);
        real = z.getReal();
        imajiner = z.getImajiner();
        return z;
    }
    
    public cKomplek pangkat3(){
        cKomplek z = new cKomplek(real*real*real-3*real*imajiner*imajiner,3*real*real*imajiner-imajiner*imajiner*imajiner);
        real = z.getReal();
        imajiner = z.getImajiner();
        return z;
    }
    
    public String bentukpolar(){
        double r = modulus()*Math.cos(imajiner/real);
        double im = Math.sin(imajiner/real);
        String a = r + " + " +im +"i";
        return a;
    }
    
    public String infokomplek(){
        String a;
        if(getImajiner() < 0 )
            a= real + " - " + String.valueOf(Math.abs(imajiner)) + "i";
        else
            a= real + " + " + imajiner + "i";
        return a;
    }
    
}
