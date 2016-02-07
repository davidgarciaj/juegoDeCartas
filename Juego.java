import java.util.ArrayList;
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
    //Atributo que guarda la coleccion de jugadores.
    private ArrayList<Jugador> jugadores;
    /**
     * Constructor for objects of class Juego. Añadir un entero para asignar el numero de jugadores.
     */
    public Juego(int numeroJugadores)
    {
        this.numeroJugadores = numeroJugadores;
        mazo = new Mazo();
        jugadores = new ArrayList<Jugador>();
        int cont = 1;
        if (numeroJugadores < 2){
            numeroJugadores = 4;
        }
        while (cont <= numeroJugadores){
            Jugador jugador = new Jugador(cont);
            jugadores.add(jugador);
            cont++;
        }
    }
    
    /**
     * Metodo que reparte las cartas del mazo hasta que se acaben o hasta que queden menos cartas que jugadores una vez que ha repartido a todos.
     */
    public void repartir()
    {
        int cont = 1;
        mazo.barajar();
        while(mazo.quedan() > jugadores.size() || cont <= jugadores.size()){
            jugadores.get(cont - 1).recibirCarta(mazo.tomarPrimera());
            if (cont == jugadores.size() && mazo.quedan() > jugadores.size()){
                cont = 0;
            }
            cont++;
        }
    }
    
    /**
     *  Método que muestra por pantalla el id de cada jugador junto a la cartas que tiene en la mano.
     */
    public void mostrarCartasJugadores()
    {
        for (Jugador jugador : jugadores){
            System.out.println("El jugador con la Id " + jugador.getId() + " tiene en la mano las siguiente/s carta/s: ");
            jugador.cartasQueTieneEnLaMano();
        }
    }
}
