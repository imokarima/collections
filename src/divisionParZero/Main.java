package divisionParZero;

public class Main {
    public static void main(String[] args) {
        Division div=new Division(13);
        //System.out.println(div.divisionParZero());

        try{
            System.out.println(div.divisionParZeroException());

        }catch (Exception e){
            System.out.println(div.getNumero() / 1);
        }
    }
}
