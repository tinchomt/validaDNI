
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row_______ {

    @SerializedName("relacion_dep")
    @Expose
    private String relacionDep;
    @SerializedName("cuit")
    @Expose
    private String cuit;
    @SerializedName("razon_social")
    @Expose
    private String razonSocial;
    @SerializedName("periodo")
    @Expose
    private Integer periodo;
    @SerializedName("rango_socio_econom")
    @Expose
    private Integer rangoSocioEconom;

    public String getRelacionDep() {
        return relacionDep;
    }

    public void setRelacionDep(String relacionDep) {
        this.relacionDep = relacionDep;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public Integer getRangoSocioEconom() {
        return rangoSocioEconom;
    }

    public void setRangoSocioEconom(Integer rangoSocioEconom) {
        this.rangoSocioEconom = rangoSocioEconom;
    }

}
