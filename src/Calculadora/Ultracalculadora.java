package Calculadora;

import java.util.Scanner;

public class Ultracalculadora {
    
    CalculadoraAritmética miCalculadora=new CalculadoraAritmética();
    CalculadoraTrigonométrica ángulos=new CalculadoraTrigonométrica();
    Conversor unidades=new Conversor();
    Scanner teclado=new Scanner(System.in);
    int numero=teclado.nextInt();
        
        void ultraCalculadora (){
            System.out.println("Seleccione una opción:\n1.Aritmética\n2.Trigonometría\n3.Conversor\n4.Salir");
            teclado.nextInt();
        }
    
    public static void main(String[]args){
        
        
        
        
    }
}
