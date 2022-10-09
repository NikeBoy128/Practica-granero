import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

class Guardar_ventas {
    private   String reportetex="";
    private int totalart=0;
    private String totalcarrito="";

    public void guardar(Lista_Ventas listvent){
        String path="D:\\Practica granero\\carrito.txt";
        File file =new File(path);

        for(Ventas aux:listvent.lisa_ventas){


            totalart+=aux.getCantidad()*aux.getId_articulo().getValor_compra();

            reportetex+=aux.getId_venta()+"\t articulo "+aux.getId_articulo().getArticulo()+"\t sub total "+aux.getCantidad()*aux.getId_articulo().getValor_compra()+"\t cantidad "+aux.getCantidad()+"\t valor compra "+aux.getId_articulo().getValor_compra()+"\n";

        }
        totalcarrito=Integer.toString(totalart);
        try{
            file.createNewFile();
            FileWriter fw= new FileWriter(file);
            BufferedWriter bw= new BufferedWriter(fw);
            bw.write(reportetex);
            bw.write("el total del carrito es "+totalcarrito);
            bw.close();


        }catch (Exception e){
            e.printStackTrace();

        }

    }
}
