
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row___________ {

    @SerializedName("rango_socioeconomico")
    @Expose
    private Integer rangoSocioeconomico;

    public Integer getRangoSocioeconomico() {
        return rangoSocioeconomico;
    }

    public void setRangoSocioeconomico(Integer rangoSocioeconomico) {
        this.rangoSocioeconomico = rangoSocioeconomico;
    }

}
