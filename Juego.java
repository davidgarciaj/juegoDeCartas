
/**
 * Write a description of class Juego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Juego
{
    //Atributo que almacena el número de jugadores.
    private int numeroJugadores;
    //Atributo que almacena el mazo.
    private Mazo mazo;
    /**
     * Constructor for objects of class Juego
     */
    public Juego(int numeroJugadores)
    {
        this.numeroJugadores = numeroJugadores;
        Mazo mazo = new Mazo();
        if (numeroJugadores < 2){
            numeroJugadores = 4;
        }
    }
    
    
}
