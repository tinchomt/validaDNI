
package mt.com.peypedni.modelo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Row_______________ {

    @SerializedName("bcra")
    @Expose
    private String bcra;

    public String getBcra() {
        return bcra;
    }

    public void setBcra(String bcra) {
        this.bcra = bcra;
    }

}
