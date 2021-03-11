package btssio.slam5.telethon.room.relations;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

import btssio.slam5.telethon.room.entities.Action;
import btssio.slam5.telethon.room.entities.Activite;
import btssio.slam5.telethon.room.entities.Site;

public class SiteAndActions {

    @Embedded public Site site;
    @Relation(
            parentColumn = "id",
            entityColumn = "id"
    )
    public List<Action> actions;

}
