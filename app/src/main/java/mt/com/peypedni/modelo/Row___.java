
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row___ {

    @SerializedName("descrip_monotributo")
    @Expose
    private String descripMonotributo;
    @SerializedName("descrip_imp_iva")
    @Expose
    private String descripImpIva;
    @SerializedName("periodo")
    @Expose
    private Integer periodo;
    @SerializedName("descrip_imp_ganancias")
    @Expose
    private String descripImpGanancias;
    @SerializedName("descrip_integrante_soc")
    @Expose
    private String descripIntegranteSoc;
    @SerializedName("descrip_empleador")
    @Expose
    private String descripEmpleador;

    public String getDescripMonotributo() {
        return descripMonotributo;
    }

    public void setDescripMonotributo(String descripMonotributo) {
        this.descripMonotributo = descripMonotributo;
    }

    public String getDescripImpIva() {
        return descripImpIva;
    }

    public void setDescripImpIva(String descripImpIva) {
        this.descripImpIva = descripImpIva;
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public String getDescripImpGanancias() {
        return descripImpGanancias;
    }

    public void setDescripImpGanancias(String descripImpGanancias) {
        this.descripImpGanancias = descripImpGanancias;
    }

    public String getDescripIntegranteSoc() {
        return descripIntegranteSoc;
    }

    public void setDescripIntegranteSoc(String descripIntegranteSoc) {
        this.descripIntegranteSoc = descripIntegranteSoc;
    }

    public String getDescripEmpleador() {
        return descripEmpleador;
    }

    public void setDescripEmpleador(String descripEmpleador) {
        this.descripEmpleador = descripEmpleador;
    }

}
