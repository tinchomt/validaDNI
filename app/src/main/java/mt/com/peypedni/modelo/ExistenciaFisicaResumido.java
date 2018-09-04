
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExistenciaFisicaResumido {

    @SerializedName("row")
    @Expose
    private Row__ row;

    public Row__ getRow() {
        return row;
    }

    public void setRow(Row__ row) {
        this.row = row;
    }

}
