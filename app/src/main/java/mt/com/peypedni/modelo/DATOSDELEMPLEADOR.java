
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DATOSDELEMPLEADOR {

    @SerializedName("row")
    @Expose
    private Row____ row;

    public Row____ getRow() {
        return row;
    }

    public void setRow(Row____ row) {
        this.row = row;
    }

}
