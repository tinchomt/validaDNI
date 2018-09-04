
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row________ {

    @SerializedName("fecha")
    @Expose
    private String fecha;
    @SerializedName("consultante")
    @Expose
    private String consultante;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getConsultante() {
        return consultante;
    }

    public void setConsultante(String consultante) {
        this.consultante = consultante;
    }

}
