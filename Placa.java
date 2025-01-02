import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

public class Placa {
    private String descriere;
    private int lungime;
    private int latime;
    private Orientare orientare;
    private boolean[] canturi;

    @JsonProperty("nr_bucati")
    private int nrBucati;


    public Placa() {
    }

    public Placa(String descriere, int lungime, int latime, Orientare orientare, boolean[] canturi, int nrBucati) {
        this.descriere = descriere;
        this.lungime = lungime;
        this.latime = latime;
        this.orientare = orientare;
        this.canturi = canturi;
        this.nrBucati = nrBucati;
    }

    public String getDescriere() {
        return descriere;
    }

    public int getLungime() {
        return lungime;
    }

    public int getLatime() {
        return latime;
    }

    public Orientare getOrientare() {
        return orientare;
    }

    public boolean[] getCanturi() {
        return canturi;
    }

    public int getNrBucati() {
        return nrBucati;
    }

    @Override
    public String toString() {
        return "Placa{" +
                "descriere='" + descriere + '\'' +
                ", lungime=" + lungime +
                ", latime=" + latime +
                ", orientare=" + orientare +
                ", canturi=" + Arrays.toString(canturi) +
                ", nrBucati=" + nrBucati +
                '}';
    }
}
