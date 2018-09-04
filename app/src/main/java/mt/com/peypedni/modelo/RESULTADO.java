
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RESULTADO {

//    @SerializedName("consultas")
//    @Expose
//    private Consultas consultas;
//    @SerializedName("Telef_xy_por_doc_")
//    @Expose
//    private TelefXyPorDoc telefXyPorDoc;
    @SerializedName("Existencia_Fisica_Resumido_")
    @Expose
    private ExistenciaFisicaResumido existenciaFisicaResumido;

//    @SerializedName("CONSTANCIA_DE_INSCRIPCION_AFIP_-_CONSTANCIA_DE_INS_")
//    @Expose
//    private CONSTANCIADEINSCRIPCIONAFIPCONSTANCIADEINS cONSTANCIADEINSCRIPCIONAFIPCONSTANCIADEINS;
//    @SerializedName("DATOS_DEL_EMPLEADOR_")
//    @Expose
//    private DATOSDELEMPLEADOR dATOSDELEMPLEADOR;
//    @SerializedName("CONSTANCIA_DE_INSCRIPCION_AFIP_-_DATOS_")
//    @Expose
//    private CONSTANCIADEINSCRIPCIONAFIPDATOS cONSTANCIADEINSCRIPCIONAFIPDATOS;
//    @SerializedName("CONSTANCIA_DE_INSCRIPCION_AFIP_-_DOMIC_")
//    @Expose
//    private CONSTANCIADEINSCRIPCIONAFIPDOMIC cONSTANCIADEINSCRIPCIONAFIPDOMIC;
//    @SerializedName("relacion_dep_")
//    @Expose
//    private RelacionDep relacionDep;
//    @SerializedName("CONSULTADO_POR")
//    @Expose
//    private CONSULTADOPOR cONSULTADOPOR;
//    @SerializedName("Pasivos_titular_valida")
//    @Expose
//    private PasivosTitularValida pasivosTitularValida;
//    @SerializedName("Celulares_")
//    @Expose
//    private Celulares celulares;
//    @SerializedName("Rango_Socioeconomico_")
//    @Expose
//    private RangoSocioeconomico rangoSocioeconomico;

    @SerializedName("Limite_Credito_")
    @Expose
    private LimiteCredito limiteCredito;
    @SerializedName("Motor_Decision_")
    @Expose
    private MotorDecision motorDecision;

//    @SerializedName("DATOS_DEL_TRABAJADOR_")
//    @Expose
//    private DATOSDELTRABAJADOR dATOSDELTRABAJADOR;
//    @SerializedName("bcra_")
//    @Expose
//    private Bcra bcra;
//    @SerializedName("Situacion_BCRA")
//    @Expose
//    private SituacionBCRA situacionBCRA;
//    @SerializedName("predictor_ingreso")
//    @Expose
//    private PredictorIngreso predictorIngreso;
//    @SerializedName("email_")
//    @Expose
//    private Email email;
//    @SerializedName("CONSTANCIA_DE_INSCRIPCION_AFIP_-_CATEG_")
//    @Expose
//    private CONSTANCIADEINSCRIPCIONAFIPCATEG cONSTANCIADEINSCRIPCIONAFIPCATEG;

//    public Consultas getConsultas() {
//        return consultas;
//    }
//
//    public void setConsultas(Consultas consultas) {
//        this.consultas = consultas;
//    }
//
//    public TelefXyPorDoc getTelefXyPorDoc() {
//        return telefXyPorDoc;
//    }
//
//    public void setTelefXyPorDoc(TelefXyPorDoc telefXyPorDoc) {
//        this.telefXyPorDoc = telefXyPorDoc;
//    }

    public ExistenciaFisicaResumido getExistenciaFisicaResumido() {
        return existenciaFisicaResumido;
    }

    public void setExistenciaFisicaResumido(ExistenciaFisicaResumido existenciaFisicaResumido) {
        this.existenciaFisicaResumido = existenciaFisicaResumido;
    }

//    public CONSTANCIADEINSCRIPCIONAFIPCONSTANCIADEINS getCONSTANCIADEINSCRIPCIONAFIPCONSTANCIADEINS() {
//        return cONSTANCIADEINSCRIPCIONAFIPCONSTANCIADEINS;
//    }
//
//    public void setCONSTANCIADEINSCRIPCIONAFIPCONSTANCIADEINS(CONSTANCIADEINSCRIPCIONAFIPCONSTANCIADEINS cONSTANCIADEINSCRIPCIONAFIPCONSTANCIADEINS) {
//        this.cONSTANCIADEINSCRIPCIONAFIPCONSTANCIADEINS = cONSTANCIADEINSCRIPCIONAFIPCONSTANCIADEINS;
//    }
//
//    public DATOSDELEMPLEADOR getDATOSDELEMPLEADOR() {
//        return dATOSDELEMPLEADOR;
//    }
//
//    public void setDATOSDELEMPLEADOR(DATOSDELEMPLEADOR dATOSDELEMPLEADOR) {
//        this.dATOSDELEMPLEADOR = dATOSDELEMPLEADOR;
//    }
//
//    public CONSTANCIADEINSCRIPCIONAFIPDATOS getCONSTANCIADEINSCRIPCIONAFIPDATOS() {
//        return cONSTANCIADEINSCRIPCIONAFIPDATOS;
//    }
//
//    public void setCONSTANCIADEINSCRIPCIONAFIPDATOS(CONSTANCIADEINSCRIPCIONAFIPDATOS cONSTANCIADEINSCRIPCIONAFIPDATOS) {
//        this.cONSTANCIADEINSCRIPCIONAFIPDATOS = cONSTANCIADEINSCRIPCIONAFIPDATOS;
//    }
//
//    public CONSTANCIADEINSCRIPCIONAFIPDOMIC getCONSTANCIADEINSCRIPCIONAFIPDOMIC() {
//        return cONSTANCIADEINSCRIPCIONAFIPDOMIC;
//    }
//
//    public void setCONSTANCIADEINSCRIPCIONAFIPDOMIC(CONSTANCIADEINSCRIPCIONAFIPDOMIC cONSTANCIADEINSCRIPCIONAFIPDOMIC) {
//        this.cONSTANCIADEINSCRIPCIONAFIPDOMIC = cONSTANCIADEINSCRIPCIONAFIPDOMIC;
//    }
//
//    public RelacionDep getRelacionDep() {
//        return relacionDep;
//    }
//
//    public void setRelacionDep(RelacionDep relacionDep) {
//        this.relacionDep = relacionDep;
//    }
//
//    public CONSULTADOPOR getCONSULTADOPOR() {
//        return cONSULTADOPOR;
//    }
//
//    public void setCONSULTADOPOR(CONSULTADOPOR cONSULTADOPOR) {
//        this.cONSULTADOPOR = cONSULTADOPOR;
//    }
//
//    public PasivosTitularValida getPasivosTitularValida() {
//        return pasivosTitularValida;
//    }
//
//    public void setPasivosTitularValida(PasivosTitularValida pasivosTitularValida) {
//        this.pasivosTitularValida = pasivosTitularValida;
//    }
//
//    public Celulares getCelulares() {
//        return celulares;
//    }
//
//    public void setCelulares(Celulares celulares) {
//        this.celulares = celulares;
//    }
//
//    public RangoSocioeconomico getRangoSocioeconomico() {
//        return rangoSocioeconomico;
//    }
//
//    public void setRangoSocioeconomico(RangoSocioeconomico rangoSocioeconomico) {
//        this.rangoSocioeconomico = rangoSocioeconomico;
//    }

    public LimiteCredito getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(LimiteCredito limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public MotorDecision getMotorDecision() {
        return motorDecision;
    }

    public void setMotorDecision(MotorDecision motorDecision) {
        this.motorDecision = motorDecision;
    }

//    public DATOSDELTRABAJADOR getDATOSDELTRABAJADOR() {
//        return dATOSDELTRABAJADOR;
//    }
//
//    public void setDATOSDELTRABAJADOR(DATOSDELTRABAJADOR dATOSDELTRABAJADOR) {
//        this.dATOSDELTRABAJADOR = dATOSDELTRABAJADOR;
//    }
//
//    public Bcra getBcra() {
//        return bcra;
//    }
//
//    public void setBcra(Bcra bcra) {
//        this.bcra = bcra;
//    }
//
//    public SituacionBCRA getSituacionBCRA() {
//        return situacionBCRA;
//    }
//
//    public void setSituacionBCRA(SituacionBCRA situacionBCRA) {
//        this.situacionBCRA = situacionBCRA;
//    }
//
//    public PredictorIngreso getPredictorIngreso() {
//        return predictorIngreso;
//    }
//
//    public void setPredictorIngreso(PredictorIngreso predictorIngreso) {
//        this.predictorIngreso = predictorIngreso;
//    }
//
//    public Email getEmail() {
//        return email;
//    }
//
//    public void setEmail(Email email) {
//        this.email = email;
//    }
//
//    public CONSTANCIADEINSCRIPCIONAFIPCATEG getCONSTANCIADEINSCRIPCIONAFIPCATEG() {
//        return cONSTANCIADEINSCRIPCIONAFIPCATEG;
//    }
//
//    public void setCONSTANCIADEINSCRIPCIONAFIPCATEG(CONSTANCIADEINSCRIPCIONAFIPCATEG cONSTANCIADEINSCRIPCIONAFIPCATEG) {
//        this.cONSTANCIADEINSCRIPCIONAFIPCATEG = cONSTANCIADEINSCRIPCIONAFIPCATEG;
//    }

}
