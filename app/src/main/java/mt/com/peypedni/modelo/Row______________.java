
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row______________ {

    @SerializedName("fecha_nac")
    @Expose
    private String fechaNac;
    @SerializedName("apenom")
    @Expose
    private String apenom;
    @SerializedName("localidad")
    @Expose
    private String localidad;
    @SerializedName("cp")
    @Expose
    private Integer cp;
    @SerializedName("domicilio")
    @Expose
    private String domicilio;
    @SerializedName("doc")
    @Expose
    private Integer doc;
    @SerializedName("sexo")
    @Expose
    private String sexo;
    @SerializedName("cuil")
    @Expose
    private String cuil;
    @SerializedName("provincia")
    @Expose
    private String provincia;

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getApenom() {
        return apenom;
    }

    public void setApenom(String apenom) {
        this.apenom = apenom;
    }

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

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Integer getDoc() {
        return doc;
    }

    public void setDoc(Integer doc) {
        this.doc = doc;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

}
