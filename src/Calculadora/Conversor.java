package Calculadora;

public class Conversor {
    double unidades;
    
    double kelvinToFahrenheit(){
        return (unidades*9/5)-459.67;
    }
    double kelvinToCelsius(){
        return unidades-273.15;
    }
    double celsiusToFahrenheit(){
        return (unidades*9/5)+32;
    }
    double celsiusToKelvin(){
        return unidades+273.15;
    }
    double fahrenheitToCelsius(){
        return ((unidades-32)*5)/9;
    }
    double fahrenheitToKelvin(){
        return ((unidades+459.67)*5)/9;
    }
    double gramToOunce(){
        return unidades/28.3495;
    }
    double ounceToGram(){
        return unidades*28.3495;
    }
    double poundToGram(){
        return unidades*453.592;
    }
    double gramToPound(){
        return unidades/453.592;
    }
    double tonneToKilogramAndKtG(){
        return unidades*1000;
    }
    double kilogramToTonneAndGtK(){
        return unidades/1000;
    }
    double metresToFeet(){
        return unidades*3.28084;   
    }
    double feetToMetres(){
        return unidades/3.28084;
    }
    double inchesToFeet(){
        return unidades/12;
    }
    double feetToInches(){
        return unidades*12;
    }
    double centimetresToMetres(){
        return unidades/100;
    }
    double metresToCentimetres(){
        return unidades*100;
    }
    double milesToMetres(){
        return unidades*1609.34;
    }
    double metresToMiles(){
        return unidades/1609.34;
    }
}   
