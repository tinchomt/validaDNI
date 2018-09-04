
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Celulares {

    @SerializedName("row")
    @Expose
    private Row__________ row;

    public Row__________ getRow() {
        return row;
    }

    public void setRow(Row__________ row) {
        this.row = row;
    }

}
