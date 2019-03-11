package org.fasttrackit.catel;

public class Catel {


    private String name;

    private int greutate;

    private int varsta;

    public void latra (){
        System.out.println("Chiki bow Chiki Bow Chiki BOWOW");
    }


    // seteri

    // numele primit ca proprietate...
    public void setName(String wantedName){
        name = wantedName;

    }
    public void mananca (){
        greutate++;

        if (greutate >= 10) {
            varsta++;
        }
    }
    public void getVarsta(){
        return varsta;
    }

    public String getName() {
        return name;
    }

}
