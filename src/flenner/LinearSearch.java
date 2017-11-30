package flenner;

import java.util.Scanner;

/**
 * LinearSearch.java
 *
 * Denne klasse har til formål at give et simpelt eksempel på en metode til at lave en lineær søgning.
 * I dette eksempel har jeg oprettet et array med navne og brugeren promptes til at skrive et navn der skal søges på
 * i array'et
 *
 * OBS!: Når man benytter et array, som er statisk i størrelse, er det vigtigt at ingen af index er tomme/null, med
 * denne metode. Man kan muligvis implementere et ekstra if statement som inddrager nullproblematikken.
 *
 * @author kasp4770
 * @version 1.0
 * @since december 2017
 * */

public class LinearSearch {

    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in); //Tilføjer Scanner obj til brugerindtastning i output
        String name = input.next(); //variabel til brugerindtastning i konsollen
        boolean found = false;

        //opretter et array 'classList' af String's, i størrelse 10 (indexes)
        String[] classList = new String[9];

        //Tilføjer Strings til mit array
        classList[0] = "Lars";
        classList[1] = "Flemming";
        classList[2] = "Ole";
        classList[3] = "Andreas";
        classList[4] = "Line";
        classList[5] = "Katrine";
        classList[6] = "Mogens";
        classList[7] = "Axel";
        classList[8] = "Nicolai";

        //For loop som gennemgår om navnet, som bruger har indtastet,
        for(int i = 0; i < classList.length; i++){
            if (classList[i].equalsIgnoreCase(name) ){
                found = true; //variablen bliver ændret fra 'false' til 'true' hvis navnet findes
                System.out.println("Person er mødt op! " + name + " findes på index " +i);
                break;
            }
        }
        if (found == false){
            System.out.println(name + " er ikke mødt op!");
        }

    }
}
