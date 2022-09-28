package Main;

import Libreria.ManipularCSV;

public class Main{
    public static void main(String[] args) {
        ManipularCSV archivo = new ManipularCSV();//crear objeto
        archivo.leerArchivo("C:\\Users\\PC\\Desktop\\algoritmos carpeta\\PRUEBAS_COVID_2.xlsx");
        archivo.imprimirLinea();
    }
}



