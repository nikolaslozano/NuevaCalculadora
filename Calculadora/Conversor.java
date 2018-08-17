public class Conversor {
    double unidades;
    
    double kelvinToFahrenheit(){
        return unidades*(9/5)-459.67;
    }
    double kelvinToCelsius(){
        return unidades-273.15;
    }
    double celsiusToFahrenheit(){
        return unidades*(9/5)+32;
    }
    double celsiusToKelvin(){
        return unidades+273.15;
    }
    double fahrenheitToCelsius(){
        return (unidades-32)*(5/9);
    }
    double fahrenheitToKelvin(){
        return (unidades+459.67)*(5/9);
    }   
}
