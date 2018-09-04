
package mt.com.peypedni.modelo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RelacionDep {

    @SerializedName("row")
    @Expose
    private List<Row_______> row = null;

    public List<Row_______> getRow() {
        return row;
    }

    public void setRow(List<Row_______> row) {
        this.row = row;
    }

}
