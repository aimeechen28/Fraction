
public class Driver{
 public static void main(String[] args){
     
     //Constructors
     Fraction f1 = new Fraction();
     System.out.println("f1 fraction: "+f1);
     
     //
     Fraction f2 = new Fraction(1,2);
     System.out.println("f2 fraction: "+f2);
     //
     Fraction f3 = new Fraction("1/0");
     System.out.println("f3 fraction: "+f3);
     //
     Fraction f4 = f2;
     System.out.println("f4 fraction: "+f4);
     //Accesstor
     int x  = f1.getNum();
     int x2 = f2.getNum();
     int x3 = f3.getNum();
     int x4 = f4.getNum();
     System.out.println("f1's numerator: " + x);
     System.out.println("f2's numerator: " + x2);
     System.out.println("f3's numerator: " + x3);
     System.out.println("f4's numerator: " + x4);
     //
     int y  = f1.getDenom();
     int y2 = f2.getDenom();
     int y3 = f3.getDenom();
     int y4 = f4.getDenom();
     System.out.println("f1's denominator: " + y);
     System.out.println("f2's denominator: " + y2);
     System.out.println("f3's denominator: " + y3);
     System.out.println("f4's denominator: " + y4);
     //
     String t  = f1.toString();
     String t2 = f2.toString();
     String t3 = f3.toString();
     String t4 = f4.toString();
     System.out.println("f1 string: " + t);
     System.out.println("f2 string: " + t2);
     System.out.println("f3 string: " + t3);
     System.out.println("f4 string: " + t4);
     //
     double e  = f1.toDouble();
     double e2 = f2.toDouble();
     double e3 = f3.toDouble();
     double e4 = f4.toDouble();
     System.out.println("f1 decimal: " + e);
     System.out.println("f2 decimal: " + e2);
     System.out.println("f3 decimal: " + e3);
     System.out.println("f4 decimal: " + e4);
     //Mutator checked in fraction
     
     //static methods
     //multiply
     Fraction prod;
     prod = Fraction.multiply(f3,f4);
     System.out.println(f3 + "*"+ f4 + "=" + prod);
     Fraction prod1;
     prod1 = Fraction.multiply(f1,f2);
     System.out.println(f1 + "*"+ f2 + "=" + prod1);
     
     //divide
     Fraction divi;
     divi = Fraction.divide(f3,f4);
     System.out.println(f3 + " / "+ f4 + "=" + divi);
     Fraction divi1;
     divi1 = Fraction.divide(f1,f2);
     System.out.println(f1 + "/"+ f2 + "=" + divi1);
     //add
     Fraction addi;
     addi = Fraction.add(f3,f4);
     System.out.println(f3 + "+"+ f4 + "=" + addi);
     Fraction addi1;
     addi1 = Fraction.add(f1,f2);
     System.out.println(f1 + "+"+ f2 + "=" + addi1);
     //substract
     Fraction subs;
     subs = Fraction.subtract(f3,f4);
     System.out.println(f3 + "-"+ f4 + "=" + subs);
     Fraction subs1;
     subs1 = Fraction.subtract(f1,f2);
     System.out.println(f1 + "-"+ f2 + "=" + subs1);
      
     //helper method
     int first = x;
     int second = y;
     int number = f1.GCF(); 
     System.out.println("the greatest common factor bewteen " + x + " and " + y +" is: " + number );
     
     
     
     System.out.println("REMINDER: reduce method, setNum method and setDenom method are tested in the +-*/ section!" );
    }
}
