import java.util.Scanner;

public class N1002 {

    public static  void main(String args[]){

        double area;

        Scanner Ler = new Scanner(System.in);
        double raio = Ler.nextDouble();

        area = 3.14159 * (raio*raio);

        System.out.println("A="+area);

    }

}
