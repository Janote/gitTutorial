package aed;
import java.util.*;


public class tries {
    Nodo raiz ;
    int tamaño ;

    private class Nodo{

        String significado;

        ArrayList<Nodo> siguientes ;

    

    private Nodo( String significado)
    {
        this.significado = significado ;

    }
    
}

public tries()
{
    Nodo nuevo_nodo = new Nodo("") ;
    raiz = nuevo_nodo ;
    

}

// for cada caracterde valor 
// insertarAux(,caracter,)

private void insertar(String valor)
{
    for (int i = 0; i < valor.length(); i++) {
         insertarAux(valor.charAt(i), valor);
        
    }
}

private void insertarAux(char caracter, String valor)
{
    Nodo puntero = raiz ;
    boolean esta = false ;
    int j ;

    if(puntero.siguientes.size() == 0 )
    {

    }

    for (int i = 0; i < puntero.siguientes.size(); i++) {

        if(puntero.siguientes.get(i).significado == caracter) // usar compareTo
        {
            esta = true ;
            j = i ;
            
        }
        
    }

    if(esta == true )
    {
        puntero = puntero.siguientes.get(j) ; 

    }

    else
    {
        
    }




}    
}

