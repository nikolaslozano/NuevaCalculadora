package Calculadora;

public class CalculadoraTrigonométrica {
    double ángulo;
    double ánguloRadianes;

    void convertirÁngulo() {
        ánguloRadianes=Math.toRadians(ángulo);
    }
   
    double calcularSeno(){
        convertirÁngulo();
        return Math.sin(ánguloRadianes);
    }
    double calcularCoseno(){
        convertirÁngulo();
        return Math.cos(ánguloRadianes);
    }
    double calcularTangente(){
        convertirÁngulo();
        return Math.tan(ánguloRadianes);
    }
    double calcularCotangente(){
        convertirÁngulo();
        return 1/Math.tan(ánguloRadianes);
    }
    double calcularSecante(){
        convertirÁngulo();
        return 1/Math.cos(ánguloRadianes);
    }
    double calcularCosecante(){
        convertirÁngulo();
        return 1/Math.sin(ánguloRadianes);
    }   
}