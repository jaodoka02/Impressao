package Multifuncional;
import copiadora.Copiadora;
import Digitalizadora.Digitalizadora;
import Impressora.Impressora;


public class Multifuncional  implements Copiadora, Digitalizadora, Impressora{

    public void copiar() {
     System.out.println("Fazendo cópia ");
        
    }

    
    public void digitalizar() {
    System.out.println("Digitalizando ");
        
    }

    public void imprimir() {
    System.out.println("Imprimindo");

    }


    
}
