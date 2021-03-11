package btssio.slam5.telethon.room.relations;

import androidx.room.Embedded;
import androidx.room.Relation;

import btssio.slam5.telethon.room.entities.Responsable;
import btssio.slam5.telethon.room.entities.Site;

public class ResponsableAndSite {

    @Embedded public Responsable responsable;
    @Relation(
            parentColumn = "id",
            entityColumn = "id"
    )
    public Site site;

}
