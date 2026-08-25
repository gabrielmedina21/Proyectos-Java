package Clases;

public class ItemVenta {

    private int id;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public ItemVenta() {

    }

    public ItemVenta(int id, String descripcion, int cantidad, double precioUnitario) {
        this.id = id;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double calcularPrecioTotal() {
        double precioTotal = precioUnitario * cantidad;

        return precioTotal;
    }

    @Override
    public String toString() {
        return "ItemVenta[id=" + getId() + ", " +
                            "descripcion=" + getDescripcion() + ", " +
                            "cantidad=" + getCantidad() + ", " +
                            "pUnitario=$" + getPrecioUnitario() + ", " +
                            "pTotal=$" + calcularPrecioTotal() + "]";
    }
}
