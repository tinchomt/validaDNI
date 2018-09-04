
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row________________ {

    @SerializedName("situacion")
    @Expose
    private Integer situacion;
    @SerializedName("deuda_total")
    @Expose
    private Integer deudaTotal;
    @SerializedName("entidad")
    @Expose
    private String entidad;
    @SerializedName("fecha_sit")
    @Expose
    private String fechaSit;

    public Integer getSituacion() {
        return situacion;
    }

    public void setSituacion(Integer situacion) {
        this.situacion = situacion;
    }

    public Integer getDeudaTotal() {
        return deudaTotal;
    }

    public void setDeudaTotal(Integer deudaTotal) {
        this.deudaTotal = deudaTotal;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getFechaSit() {
        return fechaSit;
    }

    public void setFechaSit(String fechaSit) {
        this.fechaSit = fechaSit;
    }

}
