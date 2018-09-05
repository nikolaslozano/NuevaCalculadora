/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ultracalculadora {
    
    public static void main (String[] args) {
        
        int opción;
        CalculadoraAritmética calc=new CalculadoraAritmética();
        CalculadoraTrigonométrica calc2=new CalculadoraTrigonométrica();
        Conversor calc3=new Conversor();
        Scanner entradaTeclado;
        entradaTeclado = new Scanner(System.in);
        
        do{
            System.out.println("Seleccione una opción:\n1.Calculadora Aritmética\n2.Calculadora Trigonométrica\n3.Conversor\n4.Salir");
            int teclado=entradaTeclado.nextInt();
            opción = teclado;
            switch (opción){
                    case 1:{
                        System.out.println("Digite el primer número a operar");
                        calc.operando1=entradaTeclado.nextDouble();
                        System.out.println("Digite el segundo número a operar");
                        calc.operando2=entradaTeclado.nextDouble();
                        do{
                            System.out.println("Digite el número correspondiente a la opción deseada:\n1.Sumar\n2.Restar\n3.Multiplicar\n4.Dividir\n5.Calcular Residuo");
                            calc.operador=entradaTeclado.nextInt();
                        }while(calc.operador>5||calc.operador<1);
                        System.out.println(calc.operar());
                    }break;
                    case 2:{
                        System.out.println("Digite el ángulo");
                        calc2.ángulo=entradaTeclado.nextDouble();
                        do{
                            System.out.println("Digite el número correspondiente a la operación deseada:\n1.Seno\n2.Coseno\n3.Tangente\n4.Cotangente\n5.Secante\n6.Cosecante");
                            opción=entradaTeclado.nextInt();
                            switch(opción)
                            {
                                case 1:{
                                    System.out.println(calc2.calcularSeno());
                                }break;
                                case 2:{
                                    System.out.println(calc2.calcularCoseno());
                                }break;
                                case 3:{
                                    System.out.println(calc2.calcularTangente());
                                }break;
                                case 4:{
                                    System.out.println(calc2.calcularCotangente());
                                }break;
                                case 5:{
                                    System.out.println(calc2.calcularSecante());
                                }break;
                                case 6:{
                                    System.out.println(calc2.calcularCosecante());
                                }break;
                                default:{
                                    System.out.println("Error, intente nuevamente");
                                }
                            }
                        }while(opción<1||opción>6);
                    }break;
                    case 3:{
                        do{
                            System.out.println("Digite el número correspondiente al sistema de unidades deseado:\n1.Temperatura\n2.Peso\n3.Longitud");
                            opción=entradaTeclado.nextInt();
                        switch(opción){
                            case 1:{
                                System.out.println("Digite el valor a convertir");
                                calc3.unidades=entradaTeclado.nextInt();
                                do{
                                    System.out.println("Digite el número correspondiente a la conversión deseada:\n1.Fahrenheit a Celsius\n2.Fahrenheit a Kelvin\n3.Kelvin a Cesius\n4.Kelvin a Fahrenheit\n5.Celsius a Kelvin\n3.Celsius a Fahrenheit");
                                    opción=entradaTeclado.nextInt();
                                    switch(opción){
                                        case 1:{
                                            System.out.println(calc3.fahrenheitToCelsius());
                                        }break;
                                        case 2:{
                                            System.out.println(calc3.fahrenheitToKelvin());
                                        }break;
                                        case 3:{
                                            System.out.println(calc3.kelvinToCelsius());
                                        }break;
                                        case 4:{
                                            System.out.println(calc3.kelvinToFahrenheit());
                                        }break;
                                        case 5:{
                                            System.out.println(calc3.celsiusToKelvin());
                                        }break;
                                        case 6:{
                                            System.out.println(calc3.celsiusToFahrenheit());
                                        }break;
                                        default:{
                                            System.out.println("Seleccón Incorrecta, intente nuevamente");
                                        }
                                    }
                                }while(opción<1||opción>6);
                            }break;
                            case 2:{
                                 System.out.println("Digite el valor a convertir");
                                calc3.unidades=entradaTeclado.nextInt();
                                do{
                                    System.out.println("Digite el número correspondiente a la conversión deseada:\n1.Gramos a Onzas\n2.Onzas a Gramos\n3.Libras a Gramos\n4.Gramos a Librat\n5.Kilogramos a Toneladas\n6.Toneladas a Kilogramos");
                                    opción=entradaTeclado.nextInt();
                                    switch(opción){
                                        case 1:{
                                            System.out.println(calc3.gramToOunce());
                                        }break;
                                        case 2:{
                                            System.out.println(calc3.ounceToGram());
                                        }break;
                                        case 3:{
                                            System.out.println(calc3.poundToGram());
                                        }break;
                                        case 4:{
                                            System.out.println(calc3.gramToPound());
                                        }break;
                                        case 5:{
                                            System.out.println(calc3.kilogramToTonneAndGtK());
                                        }break;
                                        case 6:{
                                            System.out.println(calc3.tonneToKilogramAndKtG());
                                        }break;
                                        default:{
                                            System.out.println("Seleccón Incorrecta, intente nuevamente");
                                        }
                                    }
                                }while(opción<1||opción>6);
                            }break;
                            case 3:{
                                 System.out.println("Digite el valor a convertir");
                                calc3.unidades=entradaTeclado.nextInt();
                                do{
                                    System.out.println("Digite el número correspondiente a la conversión deseada:\n1.Metros a Pies\n2.Pies a Metros\n3.Pulgadas a Pies\n4.Pies a Pulgadas\n5.Centímetros a Metros\n6.Metros a Centímetros\n7,Millas a Metros\n8,Metros a Millas");
                                    opción=entradaTeclado.nextInt();
                                    switch(opción){
                                        case 1:{
                                            System.out.println(calc3.feetToMetres());
                                        }break;
                                        case 2:{
                                            System.out.println(calc3.feetToMetres());
                                        }break;
                                        case 3:{
                                            System.out.println(calc3.inchesToFeet());
                                        }break;
                                        case 4:{
                                            System.out.println(calc3.feetToInches());
                                        }break;
                                        case 5:{
                                            System.out.println(calc3.centimetresToMetres());
                                        }break;
                                        case 6:{
                                            System.out.println(calc3.metresToCentimetres());
                                        }break;
                                        case 7:{
                                            System.out.println(calc3.milesToMetres());
                                        }break;
                                        case 8:{
                                            System.out.println(calc3.metresToMiles());
                                        }break;
                                        default:{
                                            System.out.println("Seleccón Incorrecta, intente nuevamente");
                                        }
                                    }
                                }while(opción<1||opción>8);
                            }break;
                        }
                        }while(opción<1||opción>3);
                    }
            }
        }while(opción!=4);
}
}
