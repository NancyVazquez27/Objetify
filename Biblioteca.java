import java.util.ArrayList;
/**
 * La clase biblioteca fue creada para simular que los archivos
 * de musica se guardaran aqui.
 * Su constructor no recibe parametros.
 * 
 * @author Nancy Vazquez
 * @version 08.31.17
 */
public class Biblioteca
{
    private ArrayList<String> canciones;
    private Reproductor reproductor;
    
    public Biblioteca()
    {
        canciones = new ArrayList<String>();
        reproductor = new Reproductor();
    }
    /**
     * El metodo agregarCancion permite agregar un archivo ala biblioteca.
     * @param recibe la varible nombreArchivo.
     * no retorna nada.
     */
    public void agregarCancion(String nombreArchivo)
    {
        this.canciones.add(nombreArchivo);
    }
    
    /**
     * El metodo reproducir permite recibir la posicion en la que se
     * encuentra en el arreglo de listas  la cancion que se desea reproducir
     * @param numCancion
     * 
     */
    public void reproducir(int numCancion)
    {
        reproductor.reproducir(canciones.get(numCancion));
    }
    
}