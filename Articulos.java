class articulos {
    private String id_articulo;
    private String articulo;
    private String categoria;
    private String cantidad;
    private String valor_compra;
    public String getId_articulo() {
        return id_articulo;
    }
    public void setId_articulo(String id_articulo) {
        this.id_articulo = id_articulo;
    }
    public String getArticulo() {
        return articulo;
    }
    public void setArticulo(String articulo) {
        this.articulo = articulo;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getCantidad() {
        return cantidad;
    }
    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    public String getValor_compra() {
        return valor_compra;
    }
    public void setValor_compra(String valor_compra) {
        this.valor_compra = valor_compra;
    }
    public articulos() {
    }
    public articulos(String id_articulo, String articulo, String categoria, String cantidad, String valor_compra) {
        this.id_articulo = id_articulo;
        this.articulo = articulo;
        this.categoria = categoria;
        this.cantidad = cantidad;
        this.valor_compra = valor_compra;
    }

    @Override
    public String toString() {
        return "articulos{" +
                "id_articulo='" + id_articulo + '\'' +
                ", articulo='" + articulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", cantidad='" + cantidad + '\'' +
                ", valor_compra='" + valor_compra + '\'' +
                '}';
    }
}
