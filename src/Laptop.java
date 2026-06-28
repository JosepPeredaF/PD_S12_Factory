public class Laptop implements Reporte{
    protected String marca;
    protected String modelo;
    protected int anioFabricacion;
    protected String tipoProcesador;
    protected double tamanoPantalla;

    public Laptop(String marca, String modelo, int anioFabricacion,
                  String tipoProcesador, double tamanoPantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.tipoProcesador = tipoProcesador;
        this.tamanoPantalla = tamanoPantalla;
    }

    @Override
    public void ejecutarPrueba() {

    }

    public String getMarca() {
        return marca; }

    public String getModelo() {
        return modelo; }

    public int getAnioFabricacion() {
        return anioFabricacion; }

    public String getTipoProcesador() {
        return tipoProcesador; }

    public double getTamanoPantalla() {
        return tamanoPantalla; }



}
