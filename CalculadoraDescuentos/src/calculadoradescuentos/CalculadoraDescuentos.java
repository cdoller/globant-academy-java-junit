package calculadoradescuentos;

public class CalculadoraDescuentos {

    private Double importeBruto;
    private Double importeConDescuento;
    private Double descuentoPorcentual;

    public CalculadoraDescuentos() {
    }

    public CalculadoraDescuentos(Double importeBruto, Double descuentoPorcentual) {
        this.importeBruto = importeBruto;
        this.descuentoPorcentual = descuentoPorcentual;
        actualizarImporteConDescuento();
    }

    public Double getImporteBruto() {
        return importeBruto;
    }

    public void setImporteBruto(Double importeBruto) {
        this.importeBruto = importeBruto;
        actualizarImporteConDescuento();
    }

    public Double getImporteConDescuento() {
        return importeConDescuento;
    }


    public Double getDescuentoPorcentual() {
        return descuentoPorcentual;
    }

    public void setDescuentoPorcentual(Double descuentoPorcentual) {
        this.descuentoPorcentual = descuentoPorcentual;
        actualizarImporteConDescuento();
    }

    private Double calcularDescuento(Double importeBruto, Double descuentoPorcentual) {
        return importeBruto * descuentoPorcentual / 100;
    }

    private void actualizarImporteConDescuento() {
        importeConDescuento = importeBruto - calcularDescuento(importeBruto, descuentoPorcentual);
    }
}
