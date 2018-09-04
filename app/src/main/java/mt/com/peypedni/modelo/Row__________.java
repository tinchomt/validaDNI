
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row__________ {

    @SerializedName("fecha_activacion")
    @Expose
    private String fechaActivacion;
    @SerializedName("cuit")
    @Expose
    private String cuit;
    @SerializedName("empresa")
    @Expose
    private String empresa;
    @SerializedName("documento")
    @Expose
    private Integer documento;
    @SerializedName("celular")
    @Expose
    private Integer celular;

    public String getFechaActivacion() {
        return fechaActivacion;
    }

    public void setFechaActivacion(String fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

}
