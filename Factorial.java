import java.util.Scanner;
import java.math.BigInteger;
/**
 * Write a description of class Factorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Factorial
{
    // Hallar el número de ceros al final del factorial 
    public static void main(String [] args)
    {
        BigInteger factorial= new BigInteger ("1");
        long numero;
        long x=5;
        long cero=0;
     
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese un número entre 1 y 100, para obtener su factorial y saber cuantos ceros tiene al final");
        numero = teclado.nextLong();
     if (numero <=100) {   
        for(long i=1; i<=numero; i++) {
            factorial = factorial.multiply (new BigInteger (i + ""));
            if (i%x==0){
                cero++;
            }  
           
    }
     if (numero>=25 && numero <45)
            {
              cero++;
                }
                if (numero>=45 && numero <75)
                    {
                    cero=cero+2;
                }  
                if (numero>=75 && numero <100)
                {
                    cero = cero + 3;
                }
                if (numero==100)
                   {
                       cero = cero + 4;
                    }
                    System.out.println("El factorial del número: " + numero + " es igual a " + factorial);
                    System.out.println("El factorial tiene " + cero + " ceros al final");
        
      }
      else {
        System.out.println("El número a ingresar debe ser menor a 100");
    }
        
    }
}

    