
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TelefXyPorDoc {

    @SerializedName("row")
    @Expose
    private Row_ row;

    public Row_ getRow() {
        return row;
    }

    public void setRow(Row_ row) {
        this.row = row;
    }

}
