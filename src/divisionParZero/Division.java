package divisionParZero;

public class Division {
    private int numero;
    public Division(int num){
        this.numero=num;
    }
    public int divisionParZero(){
        return this.numero/0;
    }
    public ArithmeticException divisionParZeroException() throws ArithmeticException{
        int i= this.numero/0;
        return new ArithmeticException();
    }

    public int getNumero() {
        return numero;
    }
}
