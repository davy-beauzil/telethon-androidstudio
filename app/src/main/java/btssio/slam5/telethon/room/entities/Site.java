package btssio.slam5.telethon.room.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "site")
public class Site {

    @PrimaryKey
    private int id;
    private String commune;
    private int responsable_id;

    public Site(int id, String commune, int responsable_id) {
        this.id = id;
        this.commune = commune;
        this.responsable_id = responsable_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public int getResponsable_id() {
        return responsable_id;
    }

    public void setResponsable_id(int responsable_id) {
        this.responsable_id = responsable_id;
    }
}
