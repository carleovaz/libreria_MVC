package es.studium.LibreriaMVC;
/**
 *
 * @author Jorge
 * Libro
 * Representa un libro
 * Incluye identificador del libro, título, autor y precio
 *
 */
public class Libro
{
	private int id;
	private String titulo;
	private String autor;
	private double precio;
	public Libro()
	{
		setId(0);
		titulo = "";
		autor = "";
		precio = 0.0;
	}
	public Libro(int i, String t, String a, String e, double p)
	{
		setId(i);
		titulo = t;
		autor = a;
		precio = p;
		autor = e;
	}
	public String getTitulo()
	{
		return titulo;
	}
	public String getAutor()
	{
		return autor;
	}
	public double getPrecio()
	{
		return precio;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
}
