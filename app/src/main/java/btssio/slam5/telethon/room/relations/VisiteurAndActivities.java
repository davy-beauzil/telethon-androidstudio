package btssio.slam5.telethon.room.relations;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

import btssio.slam5.telethon.room.entities.Activite;
import btssio.slam5.telethon.room.entities.Visiteur;

public class VisiteurAndActivities {

    @Embedded public Visiteur visiteur;
    @Relation(
            parentColumn = "id",
            entityColumn = "id"
    )
    public List<Activite> activite;

}
