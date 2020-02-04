




class Fraction{
   
    private int numerator,denominator;

    public Fraction(){
        //A default constructor that takes no parameters and creates a default fraction
        this.numerator = 27;
        this.denominator = 36;
        
        if(denominator == 0 ){
            System.out.print("f1 fraction: ERROR! Setting the denominator to 1:   reset");
            this.denominator =1;
        }
        
        
    }

    public Fraction(int numerator, int denominator){
        //A constructor that takes two int parameters, the value for the numerator and the value for the 
        //denominator
        this.numerator = numerator;

        if(denominator == 0){
            System.out.print("f2 fraction: ERROR! Setting it the denominator to 1:    reset ");
            this.denominator = 1;
        }else{
            this.denominator = denominator;
        }
    }

    public Fraction(String fraction){
        //A constructor that takes 1 String parameter that represents a fraction using a forward slash
        //character, such as “1/2” or “7/8”.
        int slashindex = fraction. indexOf("/"); 
        String num = fraction.substring(0,slashindex);
        String den = fraction.substring(slashindex +1);
        this. numerator = Integer.parseInt(num);
        this. denominator = Integer.parseInt(den);
        if(denominator == 0){
            System.out.print("f3 fraction: ERROR! Setting it the denominator to 1:     reset ");
            this.denominator = 1;
        }
    }

    public Fraction(Fraction f){
        // A copy constructor that takes a Fraction object as a parameter and creates a new fraction that
        //has the same numerator and denominator
        this.numerator = f.numerator;
        this.denominator = f.denominator;
        this.reduce();
        //can be here( the reduce)
    }

    /*----------------------------Accessor Methods--------------------------------------*/

    public int getNum(){
        return this.numerator;
    }

    public int getDenom(){
        return this.denominator;
    }

    public String toString(){
        return numerator + "/" + denominator;
    }

    public double toDouble(){
        
        if(denominator == 0){
            System.out.println("Error, denominator can not be 0");
            return 0;
        }
        double decimal;
        decimal = (double)numerator/denominator; 
        return decimal;
    }

    /*----------------------------Mutator Methods--------------------------------------*/
    public void reduce(){
        //reduce() - a method for reducing the Fraction object to lowest terms. This can be a void
        //method with no parameters.
        int big = 0;
        if(this.numerator >= denominator){
            big = this.numerator;
        }else{
            big = this.denominator;
        }
        for(int i = big; i>0;i--){
            if(this.numerator%i==0 &&this.denominator%i==0){
                this.numerator = this.numerator/i;
                this.denominator = this.denominator/i;
            }

        }

        
    }

    public void setNum(int numerator){
        //setNum() and setDenom() - methods for changing the values of the numerator and
        //denominator
        this.numerator = numerator;
    }

    public void setDenom(int denominator){
        this.denominator = denominator;
    }

    /*-----------------------------------Static Method-----------------------------------------*/
    public static Fraction multiply(Fraction a, Fraction b){
        int numerator = a.getNum()*b.getNum();
        int denominator = a.getDenom()*b.getDenom();
        Fraction f = new Fraction(numerator,denominator);
        f.reduce();
        return f;

    }

    public static Fraction divide(Fraction a, Fraction b){
        int numerator = a.getNum()*b.getDenom();
        int denominator = a.getDenom()*b.getNum();

        if(a.getDenom()*b.getNum()==0){
            System.out.println("ERROR");
        }
        Fraction f = new Fraction(numerator,denominator);
        f.reduce();
        return f;

    }

    public static Fraction add(Fraction a, Fraction b){
        int numerator1 = a.getNum()*b.getDenom();
        int numerator2 = a.getDenom()*b.getNum();
        int denominator = a.getDenom()*b.getDenom();
        int numerator = numerator1 + numerator2;
        Fraction f = new Fraction(numerator,denominator);
        f.reduce();
        return f;

    }

    public static Fraction subtract(Fraction a, Fraction b){
        int numerator1 = a.getNum()*b.getDenom();
        int numerator2 = a.getDenom()*b.getNum();
        int denominator = a.getDenom()*b.getDenom();
        int numerator = numerator1 - numerator2;
        Fraction f = new Fraction(numerator,denominator);
        f.reduce();
        return f;

    }

    /*-------------------------------Helper Method-------------------------------------*/
    public/*private*/ int GCF (){     //this method should be private but I changed it because private method can not be tested!
        /*A method that returns the GCF (greatest common factor) between two integers. You will also
        have to make a main method in a driver class that will create Fraction objects and demonstrate 
        the various methods.*/
        
        while(denominator!=numerator){
            if(denominator>=numerator){
                denominator = denominator - numerator;
            }else{
                numerator = numerator - denominator;
            }
        }
        return denominator;
    }
}