package Libreria;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class ManipularCSV {
    private BufferedReader lector; //lee archivos
    private String linea; //recibe la linea de cada fila
    private String partes[] = null; //almacena cada linea caida
    private ArrayList<Objeto> arregloDinamico = new ArrayList<Objeto>();
    public void leerArchivo(String nombreArchivo){
        try{
            lector = new BufferedReader(new FileReader(nombreArchivo));
            while((linea=lector.readLine())!=null){
                partes = linea.split(",");
                imprimirLinea();
                System.out.println();
            }
            lector.close();
            linea=null;
            partes=null;
        }catch(Exception e){
            
        }
    }
    public void imprimirLinea(){
        for(int i =0;1<partes.length;i++){
            System.out.print(partes[i]+" | ");
        }
    }
}
