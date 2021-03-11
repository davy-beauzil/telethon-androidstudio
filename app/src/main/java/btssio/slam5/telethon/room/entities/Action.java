package btssio.slam5.telethon.room.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.Date;

import btssio.slam5.telethon.room.DateConverter;


@Entity(tableName = "action")
public class Action {

    @PrimaryKey
    private int id;
    private Long dateDeb;
    private Long dateFin;
    private int site_id;

    public Action(Long dateDeb, Long dateFin, int site_id){
        this.dateDeb = dateDeb;
        this.dateFin = dateFin;
        this.site_id = site_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getDateDeb() {
        return dateDeb;
    }

    public void setDateDeb(Long dateDeb) {
        this.dateDeb = dateDeb;
    }

    public Long getDateFin() {
        return dateFin;
    }

    public void setDateFin(Long dateFin) {
        this.dateFin = dateFin;
    }

    public int getSite_id() {
        return site_id;
    }

    public void setSite_id(int site_id) {
        this.site_id = site_id;
    }
}
