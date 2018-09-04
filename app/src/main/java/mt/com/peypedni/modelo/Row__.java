
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row__ {

    @SerializedName("direc_calle")
    @Expose
    private String direcCalle;
    @SerializedName("localidad")
    @Expose
    private String localidad;
    @SerializedName("cdi")
    @Expose
    private String cdi;
    @SerializedName("edad")
    @Expose
    private Integer edad;
    @SerializedName("apellido_materno")
    @Expose
    private String apellidoMaterno;
    @SerializedName("ape_nom")
    @Expose
    private String apeNom;
    @SerializedName("codigo_postal")
    @Expose
    private String codigoPostal;
    @SerializedName("clase")
    @Expose
    private Integer clase;
    @SerializedName("t_docu")
    @Expose
    private String tDocu;
    @SerializedName("provincia")
    @Expose
    private String provincia;
    @SerializedName("fecha_nacimiento")
    @Expose
    private String fechaNacimiento;
    @SerializedName("nume_docu")
    @Expose
    private Integer numeDocu;

    public String getDirecCalle() {
        return direcCalle;
    }

    public void setDirecCalle(String direcCalle) {
        this.direcCalle = direcCalle;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getCdi() {
        return cdi;
    }

    public void setCdi(String cdi) {
        this.cdi = cdi;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getApeNom() {
        return apeNom;
    }

    public void setApeNom(String apeNom) {
        this.apeNom = apeNom;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public Integer getClase() {
        return clase;
    }

    public void setClase(Integer clase) {
        this.clase = clase;
    }

    public String getTDocu() {
        return tDocu;
    }

    public void setTDocu(String tDocu) {
        this.tDocu = tDocu;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getNumeDocu() {
        return numeDocu;
    }

    public void setNumeDocu(Integer numeDocu) {
        this.numeDocu = numeDocu;
    }

}
