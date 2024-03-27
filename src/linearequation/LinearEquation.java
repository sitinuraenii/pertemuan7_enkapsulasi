package linearequation;
import java.util.Scanner;

public class LinearEquation {
    private double a,b,c,d,e,f;
    
    public LinearEquation(){
        
    }
    public double getA(){
        return a;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public double getD(){
        return d;
    }
    public double getE(){
        return e;
    }
    public double getF(){
        return f;
    }
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }
    public void setD(double d){
        this.d = d;
    }
    public void setE(double e){
        this.e = e;
    }
    public void setF(double f){
        this.f = f;
    }
    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
    
    public static void main(String[] args) {
        Scanner linear = new Scanner(System.in);
        
        System.out.print("Masukkan nilai a: ");
        double a = linear.nextDouble();
        System.out.print("Masukkan nilai b: ");
        double b = linear.nextDouble();
        System.out.print("Masukkan nilai c: ");
        double c = linear.nextDouble();
        System.out.print("Masukkan nilai d: ");
        double d = linear.nextDouble();
        System.out.print("Masukkan nilai e: ");
        double e = linear.nextDouble();
        System.out.print("Masukkan nilai f: ");
        double f = linear.nextDouble();
        
        LinearEquation equation = new LinearEquation();
        
        equation.setA(a);
        equation.setB(b);
        equation.setC(c);
        equation.setD(d);
        equation.setE(e);
        equation.setF(f);
        
        if (equation.isSolvable()) {
            System.out.println("Solusi x: " + equation.getX());
            System.out.println("Solusi y: " + equation.getY());
        } else {
            System.out.println("Persamaan tidak memiliki solusi.");
        }
        linear.close();
    }
    
}
