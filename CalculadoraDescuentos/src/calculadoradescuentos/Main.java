package calculadoradescuentos;

public class Main{
    
    public static void main(String[] args) {
        CalculadoraDescuentos calculadora = new CalculadoraDescuentos(100.0, 10.0);
        System.out.println(calculadora.getImporteConDescuento());
    }
}