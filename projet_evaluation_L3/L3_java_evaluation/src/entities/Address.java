
package entities;

import java.util.ArrayList;




public class Adresse {

    private Long id;
    private String ville;
    private int quartier;
    private String numvilla;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getquartier() {
        return quartier;
    }

    public void setquartier(String quartier) {
        this.quartier = quartier;
    }

    public Client getnumvilla() {
        return numvilla;
    }

    public void setnumvilla(int numvilla) {
        this.numvilla = numvilla;
    }

}
