package Calculadora;

public class CalculadoraTrigonométrica {
    double ángulo;
    double ánguloRadianes;
    
    void convertirÁngulo(){
        ánguloRadianes=Math.toRadians(ángulo);
    } 
    double calcularSeno(){
        return Math.sin(ánguloRadianes);
    }
    double calcularCoseno(){
        return Math.cos(ánguloRadianes);
    }
    double calcularTangente(){
        return Math.tan(ánguloRadianes);
    }
    double calcularCotangente(){
        return 1/Math.tan(ánguloRadianes);
    }
    double calcularSecante(){
        return 1/Math.cos(ánguloRadianes);
    }
    double calcularCosecante(){
        return 1/Math.sin(ánguloRadianes);
    }   
}