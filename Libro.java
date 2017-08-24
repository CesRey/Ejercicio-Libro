
public class Libro
{
    private String Titulo;
    private String Autor;
    private int Paginas;
    
    public Libro(String Titule, String Autore)
    {
        Titulo=Titule;
        Autor=Autore;
        Paginas=5;
    }
    
    public int dimePaginas(int pag)
    {
        Paginas=pag;
        return pag;
    }
    
    public String dimeAutor()
    {
       return Autor;
    }
    
    public String dimeTitulo()
    {
       return Titulo;
    }
    
    public String dimedetalles()
    {
        String detalles;
        detalles= "Titulo"+Titulo+" "+"Autor"+Autor+"Paginas"+Paginas;
        return detalles;
    }
}
