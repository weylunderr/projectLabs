/*Author: Adrian Ruscau*/
public class CarsGame {


    // metoda noua
    public static void main (String[] args){


        // nume de masini
        // o sa le punem intr-un sir
        // operatii pe sir

       /* Scanner scanner = new Scanner ();*/



        // primul nume de masina

        String car1 = "Ford";
        String car2 = "Skoda";
        String car3 = "Mercedes";

        String[] myCars = new String[3];
        myCars[0]= car1;
        myCars[1]= car2;
        myCars[2]= car3;
        // myCars [] = [car1,car2,car3]; ??

        for ( int i = 0; i < 3; i++ ) {
            System.out.println("Masina :" + myCars[i]);
        }

        for(String masina: myCars){
            // tip de for -- for each
            // un tip de loop pentru strings??

            System.out.println("Masina:" + masina);
            // ca performanta (?nesemnificativ) mai incet

        }
        // toate loopurile merg pentru ca presupun ca conditia initiala e zero
        int i =0;

        while ( i<myCars.length &&
                myCars[i].charAt(0)!= 'b' &&
                myCars[i].charAt(0)!= 'B'  ){
            System.out.println("Cu while masina este:" + myCars[i]);
            i++; // pai, unary vs binary operators unary <> binary, unary este logica ??? binary nu
            // got za broblems here lmao
            // ceva legat de increment adica i=i+1 vs i++ vs i=i++ ( probabil ca aici am gresit?)
            // un while oarecare care iese daca masina are prima litera b sau B
            // || pentru SAU ; && pentru SI

            // pentru car2 ("bmw" <- "skoda" ) vom avea array index out of bounds  ( contorul creste la valoarea maxima
            // alocata in memorie si va crepa

        }
    int indexDo= 0;
        do {
            System.out.println(myCars[indexDo]);
            indexDo++;
        } while (indexDo<myCars.length);
        // charAt func lololol
    }
}
