
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row_____ {

    @SerializedName("fecha_contrato_soc")
    @Expose
    private String fechaContratoSoc;
    @SerializedName("denominacion")
    @Expose
    private String denominacion;
    @SerializedName("cuit")
    @Expose
    private String cuit;
    @SerializedName("mes_cierre")
    @Expose
    private String mesCierre;

    public String getFechaContratoSoc() {
        return fechaContratoSoc;
    }

    public void setFechaContratoSoc(String fechaContratoSoc) {
        this.fechaContratoSoc = fechaContratoSoc;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getMesCierre() {
        return mesCierre;
    }

    public void setMesCierre(String mesCierre) {
        this.mesCierre = mesCierre;
    }

}
