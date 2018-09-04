
package mt.com.peypedni.modelo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CONSTANCIADEINSCRIPCIONAFIPDOMIC {

    @SerializedName("row")
    @Expose
    private List<Row______> row = null;

    public List<Row______> getRow() {
        return row;
    }

    public void setRow(List<Row______> row) {
        this.row = row;
    }

}
