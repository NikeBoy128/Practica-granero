import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Lista_Ventas {
    ArrayList<Ventas> lisa_ventas=new ArrayList<>();

    public Lista_Ventas() {
    }

    public Lista_Ventas(ArrayList<Ventas> lisa_ventas) {
        this.lisa_ventas = lisa_ventas;
    }
    public void agregar(Ventas venta){
        lisa_ventas.add(venta);


    }
    public Lista_Ventas obtenerdatos(Lista_Articulos listaart){
        Lista_Ventas lista_de_ventas=new Lista_Ventas();
        String path="D:\\Practica granero\\Ventas.txt";
        File file =new File(path);
        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()){
                String linea=scanner.nextLine();
                StringTokenizer atributo=new StringTokenizer(linea,";");
                Ventas venta= new Ventas();
                while(atributo.hasMoreElements()){
                    venta.setId_venta(atributo.nextElement().toString());
                    venta.setId_articulo(listaart.buscar(atributo.nextElement().toString()));
                    venta.setCantidad(Integer.parseInt(atributo.nextElement().toString()));



                }
                lista_de_ventas.agregar(venta);



            }
            scanner.close();




        }


        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return   lista_de_ventas;

    }
    public void imprimir(){
        for (Ventas aux:lisa_ventas){
            System.out.println(aux.getId_venta()+" "+aux.getId_articulo().getId_articulo()+" "+aux.getCantidad()+" ");
        }
    }
    public void mirar(Lista_Articulos lista){
        lista.imprimir();


    }
    public void reporarventas(){
        String path="D:\\Practica granero\\carrito3.txt";
        File file =new File(path);
        String reportetex="";
        for(Ventas aux:lisa_ventas){
            int totalart=0;
            totalart+=aux.getCantidad()*aux.getId_articulo().getValor_compra();
           reportetex+=aux.getId_venta()+"\t"+aux.getId_articulo().getArticulo()+"\t"+aux.getCantidad()*aux.getId_articulo().getValor_compra()+"\t"+totalart+"\n";
        }
        try{
            file.createNewFile();
            FileWriter fw= new FileWriter(file);
            BufferedWriter bw= new BufferedWriter(fw);
            bw.write(reportetex);
            bw.close();


        }catch (Exception e){
            e.printStackTrace();

        }



    }




}
