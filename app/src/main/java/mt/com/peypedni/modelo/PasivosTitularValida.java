
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PasivosTitularValida {

    @SerializedName("row")
    @Expose
    private Row_________ row;

    public Row_________ getRow() {
        return row;
    }

    public void setRow(Row_________ row) {
        this.row = row;
    }

}
