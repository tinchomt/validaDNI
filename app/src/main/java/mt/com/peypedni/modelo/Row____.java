
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row____ {

    @SerializedName("localidad")
    @Expose
    private String localidad;
    @SerializedName("cp")
    @Expose
    private Integer cp;
    @SerializedName("cuit")
    @Expose
    private String cuit;
    @SerializedName("domicilio")
    @Expose
    private String domicilio;
    @SerializedName("razon_social")
    @Expose
    private String razonSocial;
    @SerializedName("provincia")
    @Expose
    private String provincia;

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Integer getCp() {
        return cp;
    }

    public void setCp(Integer cp) {
        this.cp = cp;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

}
