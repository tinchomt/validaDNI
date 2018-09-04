
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row__________________ {

    @SerializedName("cuit")
    @Expose
    private String cuit;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("sexo")
    @Expose
    private String sexo;
    @SerializedName("documento")
    @Expose
    private Integer documento;

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

}
