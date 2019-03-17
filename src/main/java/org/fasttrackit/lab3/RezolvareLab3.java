package org.fasttrackit.lab3;
import java.util.*;

public class RezolvareLab3 {
    // functii de intro :)                                                                        // ok!!
    public static void flytext(String myString) throws InterruptedException {

        for (char c : myString.toCharArray()) {
            System.out.print(c);
            Thread.sleep(150);
        }
        //clearScreen();
        System.out.println();

    }

    public static void prezinta() throws InterruptedException {
        flytext("Adrian Ruscau Prezinta");
        flytext("Tema lab 3");
    }                               //ok!!

    // Exercitiul 1
    // media aritmetica a doua numere
    public static int mediaAri() {
        System.out.println("Vom calcula media aritmetica a doua numere. ");
        System.out.println("Introduceti primul numar : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        int b = scanner.nextInt();
        return (a + b) / 2;

    }                                                             //ok!!

    // Exercitiul 2
    // puteam sa modific exercitiul 1 asa incat sa imi dea exercitiul 2
    // dar pentru motive stiintifice modific si las aici
    // modificata luam declararea vectorilor;
    public static int mediaAriN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vom calcula media aritmetica a n numere.");

      /*  int n = scanner.nextInt();
        int[] array1= new int[n];
        int a,sum = 0;
        for (int i=0; i<n;i++) {
            System.out.println("Introduceti numarul " + (i + 1 )+ ": ");
            // foarte interesant tot ce este in println() este interpretat ca si string daca este adunat cu +
            a = scanner.nextInt();
            sum = sum + a;
        }*/
        int[] sir = declvec();
        int sum = 0;
        for (int i : sir) {
            // si asa am invatat cum se face declararea lui for each
            // nu prin ( int i=0, sir) ci prin ( int i: sir);
            sum = sum + i;
        }
        return sum / sir.length;

    }                                                            //ok!!

    // Exercitiul 3
    // maximul dintre elementele unui sir n
    public static int maximumN() {
        System.out.println("Vom calcula maximul numerelor dintr-un sir.");
        Scanner scanner = new Scanner(System.in);
        int[] sir = declvec();
        int max = sir[0];
        for (int i : sir) {
            if (max <= i) {
                max = i;
            }
        }
        return max;
    }                                                             //ok!!


    // Exercitiul 4
    // tabla inmultirii cu n
    public static void tablaN() {
        System.out.println("Vom calcula tabla inmultirii cu n.");
        System.out.println("Introduceti n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(i + "x" + n + "=" + (i * n));
        }
    }                                                              //ok!!

    // Exercitiul 5
    // tabla inmultirii de la n la m
    public static void tablaNM() {
        System.out.println("Vom calcula tabla inmultirii de la n la m.");
        System.out.println(("Introduceti n: "));
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Introduceti m: ");
        int m = scanner.nextInt();
        int a, b;
        // a, b vor fi intotdeauna a<=b
        if (n > m) {
            a = m;
            b = n;
        } else {
            a = n;
            b = m;
        }
        for (int i = a; i <= b; i++) {
            System.out.println(i + "x" + b + "=" + (i * b));
        }
        ;
    }                                                            //ok!!

    //Exercitiul 6
    // operatii pe numarul a
    // suma cifrelor sau produsul cifrelor
    public static int sumOrProdCif(String b, int a) {
        int sum = 0, prod = 1;
        while (a != 0) {
            sum = sum + a % 10;
            prod = prod * (a % 10);
            a = a / 10;
        }
        ;
        int ret = 0;
        if (b.equals("suma")) {
            ret = sum;
        } else {
            if (b.equals("produs")) {
                ret = prod;
            }
        }
        return ret;
    }                                          //ok!!

    //  numarul cifrelor
    public static int nrCif(int a) {
        int i = 0;
        while (a != 0) {
            a = a / 10;
            i++;
        }
        ;
        return i;
    }                                                           //ok!!

    // cifra maxima si minima
    public static int[] cifMinMax(int a) {
        int min = 0, max = 0;
        min = a % 10;
        max = a % 10;
        while (a != 0) {

            if (min >= a % 10) {
                min = a % 10;
            }
            if (max <= a % 10) {
                max = a % 10;
            }

            a = a / 10;
        }


        int[] array = new int[2];
        array[0] = min;
        array[1] = max;

        return array;
    }                                                     //ok!!


    //   cifra de control a unui numar
    public static int cifraCont(int a) {
        int sum = sumOrProdCif("suma", a);
        while ((sum != 0) && ((sum / 10) != 0)) {
            sum = sumOrProdCif("suma", sum);
        }
        return sum;
    }                                                       //ok!!

    // Exercitiul 7
    // numarul invers al unui numar
    public static int numInvers(int a) {
        int b = 0;
        while (a != 0) {
            b = b * 10 + a % 10;
            a = a / 10;
        }
        return b;
    }                                                       //ok!!

    // Exercitiul 8
    // numarul palindrom
    // un numar este palindrom daca este egal cu inversul sau
    public static boolean palin(int a) {
        boolean okus = true;

        if (!(a == numInvers(a))) {
            okus = false;
        }
        return okus;
    }                                                       //ok!!

    // Exercitiul 9
    // afisarea numerului format din cifrele impare ale unui alt numar
    // presupun ca trebuie sa fie in ordine si nu invers
    public static int imp(int a) {
        int b = 0;
        int c = 0;
        while (a != 0) {
            c = a % 10;
            if (c % 2 == 1) {
                b = b * 10 + c;
            }
            ;
            a = a / 10;
        }
        return numInvers(b);
    }                                                              //ok!!

    // afisarea numarului format din cifrele pare
    public static int par(int a) {
        int b = 0;
        int c = 0;
        while (a != 0) {
            c = a % 10;
            if (c % 2 == 0) {
                b = b * 10 + c;
            }
            a = a / 10;

        }
        return numInvers(b);
    }                                                              //ok!!

    // afisarea numarului format din patratele cifrelor pare
    // aici apar cateva dileme
    // cum se poate face asta
    // adica se face patratul cifrei si se inmulteste apoi cu zece si se continua tot asa, revin
    // adica de fapt nu se inmulteste cu zece ci e de fapt o suma lololol
    // sau se face patratul cifrei se inmulteste cu o suta si se continua asa
    // for ZE LAUGHS le facem pe amandoua
    // AYYYYYYYYY
    public static int[] parPat(int a) {
        int b = 0;
        int c = 0;
        int d = 0;
        while (a != 0) {
            c = a % 10;
            if (c % 2 == 0) {
                b = b + c * c;
                if (((c * c) / 10) != 0) {
                    d = d * 100 + numInvers((c * c));
                } else {
                    d = d * 10 + c * c;
                }

            }
            a = a / 10;

        }
        int[] array = new int[2];
        array[0] = b;
        array[1] = numInvers(d);
        // s-a folosit inversul doar ca sa se afiseze " corect"
        return array;
    }                                                         //ok!!
    // am observat ca declarerea de vectori de numere intregi este deasa
    // asa ca poate fi pusa intr-o functie

    //Exercitiul zece
    // se citeste un vector , se da un numar
    // sa se verifice daca se afla in vector
    // returnam pozitia daca se afla, daca nu se afla returnam -1


    // mai este o intrebare care este diferenta daca este ordonat sau nu
    // raspunsul la aceasta intrebare se face in functie de cum abordam problema
    // daca vectorul respectiv se stie daca este ordonat sau nu                               //aparent se stie, cineva nu a citit bine problema
    // in cazul in care se stie ca este ordonat
    // daca vectorul se itereaza intr-un while totul merge cu putina memorie
    // numar mic de pasi etc. ( dar prespun ca si intr-un for daca se da cu ciocanul adica break)
    // dar intr-un for, treaba aceasta in functie de cum e iterat forul
    // din cauza conditionalelor din while, while castiga,
    // in schimb ce forul e fortat sa apeleze la if si apoi break
    // while-ul face treaba asta automat si break si if in conditia initiala
    // cica la un scurt google while si for sunt gandite la fel *cough* mai ales in java
    // revin la intrebare, diferenta daca se stie ca e ordonat din prima sau nu
    // daca e ordonat se taie din timpul de procesare pana la jumatate a oricarui sir
    // daca nu ia de doua ori mai mult vs fata de ordonat

    public static int seGas(int[] array, int n) {
        int b = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                b = i;
            }

        }
        return b;
    }                                                //ok!!


    // aici partea cu vectorul ordonat, prima e vectorul neordonat
    public static int seGasOrdo(int[] array, int n) {
        int b = -1;
        // de dragul lui while o sa pun while
        int i = 0;
        int lung = array.length;
        while (i != lung) {
            // ca sa vezi de ce
            // ma gandeam sa fac cu campionii
            // in engleza le zice campioni
            // in romana e metoda jumatatilor de sir
            if (n > array[i]) {
                i = lung / 2;
                if (n < array[i]) {
                    lung = lung / 2;
                }
            }
            if (n == array[i]) {
                b = i;
                break;
            }
        }
        // pare destul de interesant;
        return b;
    }                                            //ok!!

    // ca sa fiu putin rau la acest exercitiu (10)
    // o sa adaug o metoda noua de declarat sirurile
    // care sa verifice si daca sunt ordonate


    public static int[] declvecOrdo() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti lungimea sirului: ");
        n = scanner.nextInt();
        int[] a = new int[n];
        // pentru treaba asta o sa avem nevoie de dragul nostru while
        int i = 0;
        int verCre = 0;
        int verDes = 0;
        while (i < n) {
            System.out.println("Introduceti numarul " + (i + 1) + ": ");

            a[i] = scanner.nextInt();
            if (i > 0) {
                if (a[i] >= a[i - 1]) {
                    verCre = verCre + 1;
                } else if (a[i] <= a[i - 1]) {
                    verDes = verDes + 1;
                }
            }
            if ((verCre == n - 1) || (verDes == n - 1)) {
                System.out.println("Sirul este ordonat.");
            } else {
                if ((i + 1 == n) || ((verCre > 0) && (verDes > 0))) {
                    System.out.println("Sirul nu este ordonat.");
                    System.out.println("Va rugam reincercati.");
                    verCre = 0;
                    verDes = 0;
                    i = -1;
                }

            }
            i++;
        }
        return a;
    }                                                         //ok!!

    // Exercitiul 11: Suma numerelor naturale de la 0 la n. n predefinit sau de la tastatura
    // o sa il iau mai bine pe cel predefinit

    public static int sumaNum(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;
        }

        return sum;

    }                                                          //ok!!
    // Exercitiul 12: Sir de numere. Numerele au cel putin cate 2 cifre. Partidul doreste cel mai mare numar cu cifra de control sub 3.

    public static int numCifcon3(int[] array) {
        int con3 = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (cifraCont(array[i]) < 3) {
                if (max <= array[i]) {
                    max = array[i];
                }
            }
        }
        return max;
    }                                                 //ok!!

    // Pentru a indeplini cererile partidului vom modifica declararea sirurilor de numere conform cerintelor partidului.

    public static int[] declvec2cif() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti lungimea sirului: ");
        n = scanner.nextInt();
        int[] a = new int[n];
        // foarte posibil ca declararea sa ia exact numarul fix de pozitii
        // si nu tine seama de n ( adica nu trebuie sa tin eu seama de pozitia 0
        // decat la iterare )
        // dupa testare LUNGIMEA unui VECTOR DECLARATA este EXACTA
        for (int i = 0; i < n; i++) {
            System.out.println("Introduceti numarul " + (i + 1) + ": ");
            // foarte interesant tot ce este in println() este interpretat ca si string daca este adunat cu +
            int var = scanner.nextInt();
            if (nrCif(var) >= 2) {
                a[i] = var;
            } else {
                while (nrCif(var) < 2) {
                    System.out.println("Numarul trebuie sa aiba 2 cifre sau mai mult. Incearca din nou");
                    var = scanner.nextInt();
                }
                a[i] = var;
            }
        }
        return a;
    }                                                         //ok!!

    // Exercitiul 13
    // Un numar oarecare se afla intre 9 si 24.

    public static boolean checkstat(int n) {
        /*if ((n >= 9 ) && (n <= 24)){
            return true;
        }else {
            return false;
        } */

        // datorita partidului si a aplicatiei intellij am modificat functia de mai sus conform cerintelor partidului
        return ((n >= 9) && (n <= 24));
        // foarte tare
    }                                                      //ok!!

    //Exercitiul 14
    // a la puterea b
    // o luam conventional a= a*a*a*a de b ori, b fiind totdeauna pozitiv
    public static int aLab(int a, int b) {
        int pow = 1;
        if (a == 0) {
            pow = 0;
        }
        for (int i = 1; i <= b; i++) {
            pow = pow * a;
        }
        return pow;
    }                                                         //ok!!
    // dintr-o oarecare cauza dau vina pe shortcuturile din idea care se activeaza de fiecare data cand dau undo
    // mi s-au sters toate comentariile privind functia de declarare de siruri
    // aceasta am introdus-o din cauza ca am observat ca declar prea multe siruri

    //Exercitiul 15
    // factorial de numar
    public static int fact(int a) {
        int facto = 1;
        for (int i = 1; i <= a; i++) {
            facto = facto * i;
        }
        return facto;
    }                                                           //ok!!

    // Exercitiul 16
    // Sa se afiseze perechile de numere in care primul numar e mai mare decat al doilea
    public static void afiPerSir(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > array[i + 1]) {
                System.out.println(array[i] + " " + array[i + 1]);
            }
        }

    }                                               //ok!!

    //Exercitiul 17
    // sir de forma suma= 1+x+x^2+x^3+...+x^n;
    public static int custSum(int x, int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + aLab(x, i);

        }
        return sum;
    }                                                 //ok!!

    // Exercitiul 18
    //Partidul doreste acum un sir ordonat crescator daca nu e ordonat
    // awww voiam sa se verifice daca e ordonat in oricare directie :3
    // deci verificam daca este ordonat CRESCATOR daca nu il facem

    public static int[] verifOrdoSir(int[] a) {
        // initializari de variabile pentru while
        int i = 0; //increment while
        int verCre = 0; // increment care verifica ordinea crescatoare, totdeauna a.len-1
        boolean booli = true; // logic pentru sir ordonat din prima
        int intm = 0; // intermediar pentru schimbari de valori

        // cred ca am nevoie de doua while-uri
        // sau nu
        // la acest while am reutilizat
        //declvecOrdo()

        // test while
        while (i < a.length) {

            if (i > 0) {               // pentru ca incepem de la 1 adica al doilea element sa verificam
                if (a[i] >= a[i - 1]) { // este all doilea element mai mare sau egal ca primul?
                    verCre = verCre + 1; // daca da incrementam ordinea
                } else {                 // daca nu interschimbam
                    intm = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = intm;
                    booli = false;
                    verCre = verCre + 1;
                    i = 0;               // logicul primeste nu ii place
                    // nu am primit sir ordonat
                    // am pierdut o gramada de vreme ca sa imi dau seama ca de fapt
                    // trebuia la fiecare interschimbare sa reinitializez
                    // si vectorul
                    // ayyyy
                }
            }
            if ((verCre == a.length - 1) && (booli)) {
                System.out.println("Sirul este ordonat.");  // daca se intampla sa ajungem la sfarsit sirul e ordonat
            }
            if ((i == a.length - 1) && ((verCre < a.length - 1))) {   // verificatorul de crescator
                // se modifica daca sunt probleme
                verCre = 0;                                      // sirul se reinitializeza ca sa nu scapam
                i = 0;                                        // erori
            }


            i++;
        }


        return a;
    }                                                 //ok!!

    //Exercitiul 19
    // Sir. Prima jumatate dublata. A doua numere impare triplate.
    // Ma gandesc ca dublu inseamna x2, triplu x3
    // exact ce zice si aici
    // putea fi facut fara inca un vector
    public static int[] sircust(int[] array) {

        int[] array2 = array;

        for (int i = 0; i < array.length; i++) {

            if (i < array.length / 2) {
                array2[i] = array[i] * 2;
            } else if ((array[i] % 2 == 1)) {
                array2[i] = array[i] * 3;
            }

        }
        return array2;
    }                                                  //ok!!

    //Exercitiul 20
    // sa se extraga toate elementele dintre 2 valori din sir
    // asta inseamna ca valorile sunt date
    // si ca trebuie sa construiesc un vector nou cu elementele respective
    public static int[] neweVect(int[] array, int n, int m){

        int i=0, j=0;
        if (n>=m){
            i=m;
            j=n;
        } else {
            if (m>n){
                i=n;
                j=m;
            }
        }
        // ca sa stabilim ca i este intotdeauna mai mic ca j

                    // LEGENDARA REGULA
                    // TOTI CONTORII DE VECTOR SE INITIALIZEAZA CU 1
                    // DACA II FOLOSIM IN INT[CONTOR]
        int cont=0; // contor de while;
        int cont2=0;// contor increment vectorul nostru;
        int []primvs= new int[cont2+1];
        int[]vectorius = new int [cont2+1];
                    // trebuie while
                    // se poate si cu for dar prefer while
                    // ayy kek ne jucam cu vectori
                    while (cont<array.length) {
                        if ((array[cont] >= i) && (array[cont] <= j)) {
                            // ideea e relativ simpla
                            // cat timp ne aflam intre valori vom scoate elementele din vectorul initial
                            // si le adaugam in cel al nostru
                            vectorius=primvs;
                            vectorius[cont2] = array[cont];
                            cont2=cont2+1;

                            // aici de exemplu transferam prima valoare
                            primvs = new int[cont2+1];
                            for(int ab=0;ab<vectorius.length;ab++){
                                primvs[ab]=vectorius[ab];
                            }
/*                         //   primvs = vectorius;
                            // reinitializam un al doilea vector in care sa transferam valorile primului
                            vectorius = new int[cont2 + 1];
                            vectorius = primvs;*/

                            // reinitializam vectorul nostru si ii transferam valorile de la al doilea


                            // dimensiunile vectorilor pe care ii construim vor creste
                            // vectorul de construit si cel de transfer

                            // dupa aceea ne apucam de curatat
                            // adica de sters valorile pe care le-am luat din vectorul original
                            // folosind un alt vector de transfer
                            // presupun ca se poate refolosi un vector
                            // dar e mai bine asa momentan
                            int[] secondvs = new int[array.length - 1];
                            int cont3 = 0;
                            int cont4 = 0;
                            // contor per vector ayyyy
                            while (cont3 < array.length - 1) {
                                if (cont3 == cont) {
                                    cont4++;
                                }
                                secondvs[cont3] = array[cont4];
                                cont3++;
                                cont4++;
                            }
                            // observam ca am micsorat valoarea vectorului original
                            // ne asteptam sa il taiem
                            // in momentul in care contorul nostru va fi egal cu cel din main loop
                            // inseamna ca am ajuns la aceeasi pozitie la care ne aflam acum
                            // pozitia respectiva indeplineste toate conditiile
                            // adica pe pozitia respectiva se afla valoarea dintre valori, adica parametri dupa
                            // care ne orientam
                            // valoarea respectiva am luat-o si atunci o stergem din vectorul nostru

                            //reinitializam vectorul original, cel dupa care ne orientam
                            array = new int[secondvs.length];
                            array = secondvs;
                            cont = 0;
                            // in momentul in care am facut o schimbare o luam de la inceput;
                        }

                        // cand nu e nici o schimbare
                        // verificam o noua pozitie

                        cont++;
                    }
        return vectorius ;
    }                                //ok!!

    public static int[] declvec() {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti lungimea sirului: ");
        n = scanner.nextInt();
        int[] a = new int[n];
        // foarte posibil ca declararea sa ia exact numarul fix de pozitii
        // si nu tine seama de n ( adica nu trebuie sa tin eu seama de pozitia 0
        // decat la iterare )
        // dupa testare LUNGIMEA unui VECTOR DECLARATA este EXACTA

        for (int i = 0; i < n; i++) {
            System.out.println("Introduceti numarul " + (i + 1) + ": ");
            // foarte interesant tot ce este in println() este interpretat ca si string daca este adunat cu +
            a[i] = scanner.nextInt();
        }
        return a;
    }                                                          //ok!!

    // am initializat un array de strings pentru numarul de exercitii;
    // voiam ceva foarte interesant
    // ca switchul sa initializeze arrayul
    // si sa chem fiecare element din array in case
    // aparent nu se prea poate
    // asa ca metoda de balta:
    // si asa m-am ales cu un carnat cat mine de mare
    public static String[] array1() {
        int a = 20;
        String[] array2 = new String[20];
        for (int i = 0; i < a; i++) {
            array2[i] = "Exercitiul " + (i + 1);
        }
        return array2;
    }                                                         //ok!!

    public static boolean continuu()throws InterruptedException{
        System.out.println("Doriti sa continuati? (da/nu)");
        Scanner scan = new Scanner(System.in);
        String ofcor= scan.nextLine();
        boolean okus= true;
        if (ofcor.equals("da")){
            System.out.println("Ok.... ");
        }else
        if (ofcor.equals("nu")){
            flytext("Va multumesc. ");
            okus = false;
        }
        return okus;
    }

    public static void exercitii() throws InterruptedException {
        int be = 0;
        while (true) {
            if ( be!= 0 ){
                boolean bol =continuu();
                if (!bol) { break;}
            }
            Scanner scann = new Scanner(System.in);
            String[] exercitii = array1();

            int i = 0;

            while (true) {
                System.out.println("\nExercitii rezolvate. De la 1 la 20. ");
                System.out.println("\nIntroduceti va rog numarul exercitiului.");
                i = scann.nextInt();
                if (!((i >= 1) && (i <= 20))) {
                    System.out.println("Ati gresit. Incercati din nou.");
                } else {
                    be=be+1;
                    break;
                }
            }
            switch (i) {
                case 1: {
                    System.out.println(exercitii[0] + ": Media aritmetica a doua numere intregi.");
                    System.out.println("Media aritmetica este: " + mediaAri());
                    break;
                }                                                                          //ok!!
                case 2: {
                    System.out.println(exercitii[1] + ": Media aritmetica a n numere intregi.");
                    System.out.println("Media aritmetica este: " + mediaAriN());
                    break;
                }                                                                          //ok!!
                case 3: {
                    System.out.println(exercitii[2] + ": Maximul dintre n numere intregi.");
                    System.out.println("Maximul este: " + maximumN());
                    break;
                }                                                                          //ok!!
                case 4: {
                    System.out.println(exercitii[3] + ": Tabla inmultirii cu n. ");
                    tablaN();
                    break;
                }                                                                          //ok!!
                case 5: {
                    System.out.println(exercitii[4] + ": Tabla inmultirii de la un numar la celalalt");
                    tablaNM();
                    break;
                }                                                                          //ok!!
                case 6: {
                    int a = 64321;
                    System.out.println(exercitii[5] + ": Operatii pe un numar oarecare " + a);
                    System.out.println("Suma cifrelor lui " + a + " este:" + sumOrProdCif("suma", a) + " .");
                    System.out.println(("Produsul cifrelor lui " + a + " este " + sumOrProdCif("produs", a) + " ."));
                    System.out.println("Numarul cifrelor lui " + a + " este: " + nrCif(a));
                    int[] arr = cifMinMax(a);
                    System.out.println("Minimul cifrelor lui " + a + " este " + arr[0] + ", iar maximul cifrelor este " + arr[1] + " .");
                    System.out.println("Cifra de control lui " + a + " este " + cifraCont(a) + " .");
                    break;
                }                                                                          //ok!!
                case 7: {
                    int a = 64321;
                    System.out.println(exercitii[6] + ": Numarul invers al lui " + a + " .");
                    System.out.println("Numarul invers al lui " + a + " este " + numInvers(a) + " . ");
                    break;
                }                                                                          //ok!!
                case 8: {
                    int a = 64321;
                    System.out.println(exercitii[7] + ": Verificam daca numarul " + a + " este palindrom. ");
                    if (palin(a)) {
                        System.out.println("Numarul " + a + " este palindrom.");
                    } else {
                        System.out.println("Numarul " + a + " nu este palindrom.");
                    }
                    break;
                }                                                                          //ok!!
                case 9: {
                    int a = 64321;
                    // exercitiul 9 e foarte vag
                    // singurul indiciu ca as fi corect este singularul
                    // parafrazez: " Se se afiseze un numar b format doar din
                    // numerele impare ale numarului a, si un numar c format din patratul numerelor pare ale numarului a. "
                    // ultima parte ma da pe spate
                    // dar daca vad bine zice format din patratul numerelor si nu din patratele numerelor
                    // ceea ce inseamna mai degraba  (numardecifrepare) la patrat si nu
                    // (numardecifreparecarefiecarecareestecifrasiesteparaestelapatrat)
                    // nu ca n-ar fi greu de realizat si treaba asta dar nu ar avea sens deoarece nu se complementeaza cu
                    // cealalta parte a exercitiului
                    // mai bine fac si partea (numardecifreparecarefiecareesteparasiestelapatrat)
                    System.out.println(exercitii[8] + " : Afisarea numarului format din cifrele impare ale lui" + a + " .");
                    System.out.println("Numarul format din cifrele impare ale lui " + a + " este " + imp(a) + " . ");
                    System.out.println(exercitii[8] + " : Afisarea numarului format din cifrele pare ale lui" + a + " .");
                    System.out.println("Numarul format din cifrele pare ale lui " + a + " este " + par(a) + " . ");
                    System.out.println(exercitii[8] + " : Afisarea numarului la patrat format din cifrele pare  ale lui" + a + " .");
                    System.out.println("Numarul la patrat format din cifrele pare ale lui " + a + "  este " + (par(a) * par(a)) + " . ");
                    System.out.println(exercitii[8] + " : Afisarea numarului format din suma cifrelor pare la patrat" +
                            " in algoritm  ale lui" + a + " .");
                    int[] array = new int[2];
                    array = parPat(a);
                    System.out.println("Numarul format din suma cifrelor pare la patrat ale lui " + a + "  este " + (array[0]) + " . ");
                    System.out.println(exercitii[8] + " : Afisarea numarului format din patratele cifrelof pare" + a + " .");
                    System.out.println("Numarul format din patratele cifrelor pare in functie de rezultatul lor, ale lui " + a + "  este " + (array[1]) + " . ");
                    break;


                }                                                                          //ok!!
                case 10: {
                    System.out.println(exercitii[9] + ": La un sir de numere de la tastatura, sa se verifice daca " +
                            " un numar oarecare se regaseste in sir.");
                    int[] array = declvecOrdo();
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Introduceti numarul de verificat: ");
                    int n = scanner.nextInt();
                    int verif = seGas(array, n);
                    if (verif != -1) {
                        System.out.println(" Numarul " + n + " se gaseste in pozitia " + verif + " .");
                    } else {
                        System.out.println("Numarul " + n + " nu se regaseste in sir. Mesaj de eroare " + verif + " . ");
                    }
                    break;
                }                                                                         //ok!!
                case 11: {
                    int n = 20;
                    System.out.println(exercitii[10] + ": Sa se calculeze suma primelor " + n + " numere naturale . ");
                    System.out.println("Suma primelor " + n + " numere naturale este: " + sumaNum(n) + " . ");
                    break;

                }                                                                         //ok!!
                case 12: {
                    System.out.println(exercitii[11] + ": Se da un sir de numere naturale care au cel putin doua cifre. " +
                            " Sa se determine cel mai mare numar cu cifra de control sub 3.");
                    int[] array = declvec2cif();
                    System.out.println("Cel mai mare numar cu cifra de control sub 3 din acest sir este " + numCifcon3(array) + " . ");
                    break;
                }                                                                         //ok!!
                case 13: {
                    System.out.println(exercitii[12] + ": Sa se verifice daca un numar se afla in intervalul [9,24].");
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Introduceti un numar: ");
                    int numar = scanner.nextInt();
                    if (checkstat(numar)) {
                        System.out.println("Se gaseste.");
                    } else {
                        System.out.println("Nu");

                    }
                    break;
                }                                                                         //ok!!
                case 14: {
                    System.out.println(exercitii[13] + ": Pentru doua numere a si b, sa se calculeze a la puterea b");
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Dati primul numar:");
                    int a = scanner.nextInt();
                    System.out.println("Dati al doilea numar:");
                    int b = scanner.nextInt();
                    System.out.println(a + " la puterea " + b + " este : " + aLab(a, b));
                    break;

                }                                                                          //ok!!
                case 15: {

                    // mi-am dat seama ca variabilele care se repeta foarte des as putea sa le scot global
                    // totusi cica asta nu ar fi ok
                    // deci raman asa
                    // asa de tare m-or speriat dimensiunile factorialelor ca am crezut ca mi-o dat eroare
                    System.out.println(exercitii[14] + ": Sa se calculeze factorialul unui numar.");
                    System.out.println("Introduceti numarul: ");
                    Scanner scanner = new Scanner(System.in);
                    int a = 0;
                    a = scanner.nextInt();
                    System.out.println("Factorialul lui " + a + " este: " + fact(a) + " . ");
                    break;
                }                                                                          //ok!!
                case 16: {
                    System.out.println(exercitii[15] + ": Se da un sir. Sa se afiseze perechile de numere " +
                            "in care primul numar e mai mare decat al doilea.");
                    int[] array = declvec();
                    System.out.println("Perechile de numere corespunzatoare sunt: ");
                    afiPerSir(array);
                    break;


                }                                                                          //ok!!
                case 17: {
                    System.out.println(exercitii[16] + ": Se da un numar intreg x si un numar intreg n. Sa se calculeze urmatoarea suma:\n" +
                            "suma = 1+x+x la puterea 2 + x la puterea 3 + ….+ x la puterea n. ");
                    System.out.println("Introduceti numarul intreg x :");
                    Scanner scanner = new Scanner(System.in);
                    int x = scanner.nextInt();
                    System.out.println("Introduceti numarul intreg n: ");
                    int n = scanner.nextInt();
                    System.out.println("Suma secventei este: " + custSum(x, n) + " .");
                }                                                                          //ok!!
                case 18: {
                    System.out.println(exercitii[17] + ": Se da un sir. Sa se verifice daca sirul este ordonat crescator , " +
                            "iar daca nu este sa se ordoneze si sa se afiseze in ordine crescatoare ");
                    int[] array = declvec();
                    int[] array2 = verifOrdoSir(array);
                    for (int u : array2) {
                        System.out.print(u + " ");
                    }
                    System.out.println();
                    break;

                }                                                                          //ok!!
                case 19: {
                    System.out.println(exercitii[18] + ": Sa se afiseze la un sir dat prima jumatate dublata, a doua numerele impare triplate. ");
                    int[] array = declvec();
                    int[] array2 = sircust(array);
                    for (int a : array2) {
                        System.out.print(a + " ");
                    }
                    break;
                }                                                                          //ok!!
                case 20: {
                    System.out.println(exercitii[19] + " : Se da un sir. Sa se extraga toate elementele " +
                            "sirului, date fiind 2 valori si sa se construiasca un nou vector cu ele. Sa se afiseze vectorul. ");
                    int[] array = declvec();
                    System.out.println("Introduceti prima valoare: ");
                    Scanner scanner = new Scanner(System.in);
                    int n = scanner.nextInt();
                    System.out.println("Introduceti a doua valoare: ");
                    int m = scanner.nextInt();
                    int[] vectorivs = neweVect(array, n, m);
                    for (int a : vectorivs) {
                        System.out.print(a + " ");
                    }
                    System.out.println();
                }                                                                           //ok!!
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        prezinta();
        exercitii();
    }

}
