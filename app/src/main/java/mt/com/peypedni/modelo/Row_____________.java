
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row_____________ {

    @SerializedName("habilitado_credito")
    @Expose
    private String habilitadoCredito;
    @SerializedName("seven_afectacion")
    @Expose
    private String sevenAfectacion;

    public String getHabilitadoCredito() {
        return habilitadoCredito;
    }

    public void setHabilitadoCredito(String habilitadoCredito) {
        this.habilitadoCredito = habilitadoCredito;
    }

    public String getSevenAfectacion() {
        return sevenAfectacion;
    }

    public void setSevenAfectacion(String sevenAfectacion) {
        this.sevenAfectacion = sevenAfectacion;
    }

}
