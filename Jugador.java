import java.util.ArrayList;
/**
 * Write a description of class Jugador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    //Atributo que almacena la id del jugador
    private int id;
    //Atributo que almacena la coleccion de cartas que tiene el jugador.
    private ArrayList<Carta> cartas;
    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(int id)
    {
        this.id = id;
        cartas = new ArrayList<Carta>();
    }

    /**
     * Método que devuelve la id del jugador.
     */
    public int getId()
    {
        return id;
    }

    /**
     * Método que le da una carta al jugador.
     */
    public void recibirCarta(Carta unaCarta)
    {
        cartas.add(unaCarta);
    }

    /**
     * Método que devuelve las cartas que tiene el jugador en la mano.
     */
    public void cartasQueTieneEnLaMano()
    {
        if (cartas != null){
            for (Carta carta : cartas){
                System.out.println(carta.getNombre());
            }
        }
        else{
            System.out.println("El jugador no tiene cartas en la mano");
        }
    }
}