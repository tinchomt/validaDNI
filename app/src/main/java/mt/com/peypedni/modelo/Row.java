
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row {

    @SerializedName("consultas_6")
    @Expose
    private Integer consultas6;
    @SerializedName("consultas")
    @Expose
    private Integer consultas;

    public Integer getConsultas6() {
        return consultas6;
    }

    public void setConsultas6(Integer consultas6) {
        this.consultas6 = consultas6;
    }

    public Integer getConsultas() {
        return consultas;
    }

    public void setConsultas(Integer consultas) {
        this.consultas = consultas;
    }

}
