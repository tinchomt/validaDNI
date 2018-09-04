
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row_________ {

    @SerializedName("es_pasivo")
    @Expose
    private String esPasivo;

    public String getEsPasivo() {
        return esPasivo;
    }

    public void setEsPasivo(String esPasivo) {
        this.esPasivo = esPasivo;
    }

}
