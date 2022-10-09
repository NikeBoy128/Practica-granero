import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class main {
    public static void main(String[] args) {
          Lista_Categorias lista_categorias= new Lista_Categorias();
        lista_categorias=lista_categorias.obtenerdatos();
        lista_categorias.imprimir();
        Lista_Articulos lista_articulos= new Lista_Articulos();
        lista_articulos=lista_articulos.obtenerdatos(lista_categorias);
        lista_articulos.imprimir();
        Lista_Ventas lista_de_ventas=new Lista_Ventas();
        lista_de_ventas=lista_de_ventas.obtenerdatos(lista_articulos);
        lista_de_ventas.imprimir();
        lista_de_ventas.reporarventas();
        Guardar_ventas gv= new Guardar_ventas();
        gv.guardar(lista_de_ventas);





       /*List<articulos> lista_de_articulos=new ArrayList<>();
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
                articulo.setCategoria(atributo.nextElement().toString());
                articulo.setCantidad((atributo.nextElement().toString()));
                articulo.setCantidad((atributo.nextElement().toString()));


            }
            lista_de_articulos.add(articulo);



        }
        scanner.close();
        lista_de_articulos.forEach(
            c->System.out.println(c)
        );
        
    }
    
     catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }*/
       


        
    }
    
}
