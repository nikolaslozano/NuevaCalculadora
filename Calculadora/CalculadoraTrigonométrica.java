
public class CalculadoraTrigonométrica {
    double ángulo;
    
    double calcularSeno(){
        return Math.sin(ángulo);
    }
    double calcularCoseno(){
        return Math.cos(ángulo);
    }
    double calcularTangente(){
        return Math.tan(ángulo);
    }
    double calcularCotangente(){
        return 1/Math.tan(ángulo);
    }
    double calcularSecante(){
        return 1/Math.cos(ángulo);
    }
    double calcularCosecante(){
        return 1/Math.sin(ángulo);
    }   
}