import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 * Write a description of class AnalizadorAccesosAlServidor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnalizadorAccesosAlServidor
{
    // instance variables - replace the example below with your own
    private ArrayList<Acceso> accesos;
    /**
     * Constructor for objects of class AnalizadorAccesosAlServidor
     */
    public AnalizadorAccesosAlServidor()
    {
        accesos = new ArrayList<>();
    }

    public void analizarArchivoDeLog(String nombre){
        accesos.clear();        
        try{
            File archivo = new File(nombre);
            Scanner sc = new Scanner(archivo);
            int contador = 0;

            while(sc.hasNextLine()){
                String lineaLeida = sc.nextLine();
                System.out.println(lineaLeida);
                String[] cadenaAPartir = lineaLeida.split(" ");
                int año = Integer.parseInt(cadenaAPartir[0]);
                int mes = Integer.parseInt(cadenaAPartir[1]);
                int dia =Integer.parseInt(cadenaAPartir[2]);
                int hora =Integer.parseInt(cadenaAPartir[3]);
                int minuto =Integer.parseInt(cadenaAPartir[4]);
                Acceso nuevoAcceso = new Acceso(año,mes,dia,hora,minuto);
                accesos.add(nuevoAcceso);
            }
            sc.close();
        }
        catch(Exception exc){
            exc.printStackTrace();
        }
    }

    /**
     * 
     */
    public void obtenerHoraMasAccesos(){
       
    }
}