import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class Lista_Articulos {
      private static ArrayList<articulos> articulos= new ArrayList<>();

     public Lista_Articulos(ArrayList<articulos> articulos) {
         this.articulos = articulos;
     }

     public Lista_Articulos() {
     }
     public void agregar(articulos articulo){
         articulos.add(articulo);

     }

     public    Lista_Articulos obtenerdatos(Lista_Categorias listacat){
         Lista_Articulos lista_de_articulos= new Lista_Articulos();
         String path="D:\\Practica granero\\articulos.txt";
         File file =new File(path);
         try {
             Scanner scanner = new Scanner(file);
             while(scanner.hasNextLine()){
                 String linea=scanner.nextLine();
                 StringTokenizer atributo=new StringTokenizer(linea,";");
                 articulos articulo= new articulos();


                 while(atributo.hasMoreElements()){
                     articulo.setId_articulo(atributo.nextElement().toString());
                     articulo.setArticulo(atributo.nextElement().toString());
                     articulo.setCategoria(listacat.buscar2(atributo.nextElement().toString()));
                     articulo.setCantidad((atributo.nextElement().toString()));
                     articulo.setValor_compra((atributo.nextElement().toString()));


                 }
                 lista_de_articulos.agregar(articulo);



             }
             scanner.close();




         }


         catch (FileNotFoundException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
         return   lista_de_articulos;
     }

    public    void  imprimir(){
        for (articulos aux:articulos){
            System.out.println(aux.getId_articulo()+" "+aux.getArticulo()+" "+aux.getCategoria().getId_categoria()+" "+aux.getCantidad()+" "+aux.getValor_compra());
        }
    }
    public articulos buscar(String articu){
        articulos articuloprueba= new articulos();
        articuloprueba.setId_articulo("00");
        articuloprueba.setArticulo("articulo vacio");
        articuloprueba.setCantidad("0");
        articuloprueba.setValor_compra("0");
        for(articulos aux:articulos){
            if(articu.compareTo(aux.getId_articulo())==0){
                return aux;
            }

        }
        return articuloprueba;

    }

}
