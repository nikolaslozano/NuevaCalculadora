package Calculadora;

public class CalculadoraAritmética {
    
    int operando1;
    int operando2;
    
    int sumar(){
        int r;
        
        r=operando1+operando2;
        return r;
    }
    int restar(){
        int r;
        
        r=operando1-operando2;
        return r;
    }
    int multiplicar(){
        int r;
        
        r=operando1*operando2;
        return r;
    }
    int dividir(){
        int r;
        
        r=operando1/operando2;
        return r;
    }
    int calcularResiduo(){
        int r;
        
        r=operando1%operando2;
        return r;
    }
}
