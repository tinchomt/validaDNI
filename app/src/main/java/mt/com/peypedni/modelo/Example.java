
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("RESULTADO")
    @Expose
    private RESULTADO rESULTADO;

    public RESULTADO getRESULTADO() {
        return rESULTADO;
    }

    public void setRESULTADO(RESULTADO rESULTADO) {
        this.rESULTADO = rESULTADO;
    }

}
