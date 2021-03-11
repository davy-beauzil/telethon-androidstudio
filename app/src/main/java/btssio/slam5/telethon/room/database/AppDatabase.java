package btssio.slam5.telethon.room.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import btssio.slam5.telethon.room.daos.ActionDao;
import btssio.slam5.telethon.room.daos.ActiviteDao;
import btssio.slam5.telethon.room.daos.ResponsableDao;
import btssio.slam5.telethon.room.daos.SiteDao;
import btssio.slam5.telethon.room.daos.VisiteurDao;
import btssio.slam5.telethon.room.entities.Action;
import btssio.slam5.telethon.room.entities.Activite;
import btssio.slam5.telethon.room.entities.Responsable;
import btssio.slam5.telethon.room.entities.Site;
import btssio.slam5.telethon.room.entities.Utilisateur;
import btssio.slam5.telethon.room.entities.Visiteur;

@Database(entities = {Utilisateur.class, Visiteur.class, Responsable.class, Activite.class, Action.class, Site.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract ActionDao actionDao();

    public abstract ActiviteDao activiteDao();

    public abstract ResponsableDao responsableDao();

    public abstract SiteDao siteDao();

    public abstract VisiteurDao visiteurDao();

}
