
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row_________________ {

    @SerializedName("predictor_ingresos")
    @Expose
    private String predictorIngresos;

    public String getPredictorIngresos() {
        return predictorIngresos;
    }

    public void setPredictorIngresos(String predictorIngresos) {
        this.predictorIngresos = predictorIngresos;
    }

}
