
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row____________ {

    @SerializedName("rci_nuevos")
    @Expose
    private Double rciNuevos;
    @SerializedName("lct")
    @Expose
    private Double lct;
    @SerializedName("rci_viejos")
    @Expose
    private Double rciViejos;

    public Double getRciNuevos() {
        return rciNuevos;
    }

    public void setRciNuevos(Double rciNuevos) {
        this.rciNuevos = rciNuevos;
    }

    public Double getLct() {
        return lct;
    }

    public void setLct(Double lct) {
        this.lct = lct;
    }

    public Double getRciViejos() {
        return rciViejos;
    }

    public void setRciViejos(Double rciViejos) {
        this.rciViejos = rciViejos;
    }

}
