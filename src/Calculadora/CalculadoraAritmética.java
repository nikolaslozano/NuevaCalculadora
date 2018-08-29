package Calculadora;

public class CalculadoraAritmética {
    
    double operando1;
    double operando2;
    int operador;
    
    double sumar(){
        double r;
        
        r=operando1+operando2;
        return r;
    }
    double restar(){
        double r;
        
        r=operando1-operando2;
        return r;
    }
    double multiplicar(){
        double r;
        
        r=operando1*operando2;
        return r;
    }
    double dividir(){
        double r;
        
        r=operando1/operando2;
        return r;
    }
    double calcularResiduo(){
        double r;
        
        r=operando1%operando2;
        return r;
    }
    double operar(){
        double r = 0;
        switch(operador){
            case 1:{
                r=sumar();
            }break;
            case 2:{
                r=restar();
            }break;
            case 3:{
                r=multiplicar();
            }break;
            case 4:{
                r=dividir();
            }break;
            case 5:{
                r=calcularResiduo();
            }break;
            default:{
                System.out.println("error");
            }
        }
        return r;
}
    
}
