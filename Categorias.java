 class Categorias {
    private String id_categoria;
    private String tipo_categoria;
    private Double ganancia;

     public String getId_categoria() {
         return id_categoria;
     }

     public Categorias() {
     }

     public Categorias(String id_categoria, String tipo_categoria, Double ganancia) {
         this.id_categoria = id_categoria;
         this.tipo_categoria = tipo_categoria;
         this.ganancia = ganancia;
     }

     public void setId_categoria(String id_categoria) {
         this.id_categoria = id_categoria;
     }

     public String getTipo_categoria() {
         return tipo_categoria;
     }

     public void setTipo_categoria(String tipo_categoria) {
         this.tipo_categoria = tipo_categoria;
     }

     public Double getGanancia() {
         return ganancia;
     }

     public void setGanancia(Double ganancia) {
         this.ganancia = ganancia;
     }
 }
