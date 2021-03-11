package btssio.slam5.telethon.room.relations;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

import btssio.slam5.telethon.room.entities.Action;
import btssio.slam5.telethon.room.entities.Activite;

public class ActionAndActivities {

    @Embedded public Action action;
    @Relation(
            parentColumn = "id",
            entityColumn = "id"
    )
    public List<Activite> activite;

}
