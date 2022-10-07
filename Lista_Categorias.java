import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Lista_Categorias {
    ArrayList<Categorias> lista_categorias=new ArrayList<>();

    public Lista_Categorias() {
    }

    public Lista_Categorias(ArrayList<Categorias> lista_categorias) {
        this.lista_categorias = lista_categorias;
    }
    public void agregar(Categorias categorias){
        lista_categorias.add(categorias);


    }
    public Lista_Categorias obtenerdatos(){
        Lista_Categorias lista_de_categorias=new Lista_Categorias();
        String path="D:\\Practica granero\\Categorias.txt";
        File file =new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String linea=scanner.nextLine();
                StringTokenizer atributo=new StringTokenizer(linea,";");
                Categorias categoria= new Categorias();
                while(atributo.hasMoreElements()){
                    categoria.setId_categoria(atributo.nextElement().toString());
                    categoria.setTipo_categoria(atributo.nextElement().toString());
                    categoria.setGanancia(Double.parseDouble(atributo.nextElement().toString()));



                }
                lista_de_categorias.agregar(categoria);



            }
            scanner.close();




        }


        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return   lista_de_categorias;






    }
    public Categorias buscar(String categoria){
        for(Categorias aux:lista_categorias){
            if(aux.getId_categoria()==categoria){
                return aux;

            }

        }
        return null;

    }
    public  void imprimir(){
        for (Categorias aux:lista_categorias){
            System.out.println(aux.getId_categoria()+" "+aux.getTipo_categoria()+" "+aux.getGanancia()+" ");
        }
    }
    public Categorias buscar2(String categoria){
        Categorias catprueba=new Categorias();
        catprueba.setId_categoria("A");
        catprueba.setTipo_categoria("Categoria vacia");
        catprueba.setGanancia(0.0);
        for(Categorias aux:lista_categorias){
            if(aux.getId_categoria().compareTo(categoria)==0){

                return aux;



            }

        }

        return catprueba;

    }
}
