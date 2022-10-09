public class Ventas {
    private String id_venta;
    private articulos id_articulo;
    private int cantidad;

    public Ventas() {
    }

    public Ventas(String id_venta, articulos id_articulo, int cantidad) {
        this.id_venta = id_venta;
        this.id_articulo = id_articulo;
        this.cantidad = cantidad;
    }

    public String getId_venta() {
        return id_venta;
    }

    public void setId_venta(String id_venta) {
        this.id_venta = id_venta;
    }

    public articulos getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(articulos id_articulo) {
        this.id_articulo = id_articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
