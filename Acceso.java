
/**
 * Write a description of class Acceso here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Acceso
{
    // instance variables - replace the example below with your own
    private int anio;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;
    
    public Acceso(int anio, int mes, int dia, int hora, int minutos)
    {
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minutos = minutos;
    }
    
    public int getHora()
    {
        return hora;
    }

	public int getAnio()
	{
		return anio;
	}

	public int getDia()
	{
		return dia;
	}

	public int getMes()
	{
		return mes;
	}

	public int getMinutos()
	{
		return minutos;
	}
}
