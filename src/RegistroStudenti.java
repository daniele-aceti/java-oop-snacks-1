
/*Crea una classe RegistroStudenti che rappresenti un registro di studenti. Utilizza un array privato per memorizzare oggetti Studente. Implementa un costruttore senza parametri per inizializzare il registro vuoto e un metodo pubblico per aggiungere studenti al registro. Aggiungi un metodo che stampi la lista degli studenti. */

public class RegistroStudenti {


    private String [] registro;

    public RegistroStudenti(){
          registro = new String [5];
       }     
    public void setStudente (String primo, String secondo, String terzo, String quarto, String quinto){
               registro [0] = primo;
               registro [1] = secondo;
               registro [2] = terzo;
               registro [3] = quarto;
               registro [4] = quinto;
               
    }

      public void getStudete(){
       for(int index=0; index < registro.length; index++){
            System.out.println(registro[index]);
        }
      }

}
