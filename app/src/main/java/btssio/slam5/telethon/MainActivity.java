package btssio.slam5.telethon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

import btssio.slam5.telethon.room.daos.VisiteurDao;
import btssio.slam5.telethon.room.database.AppDatabase;
import btssio.slam5.telethon.room.entities.Visiteur;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "telethon").allowMainThreadQueries().build();
        VisiteurDao visiteurDao = db.visiteurDao();


        Visiteur visiteur = new Visiteur("Dupont", "Jacques", "2020-10-10", "jacques.dupont@gmail.com", "jacques.dupont", "menuisier", false, true, "user1725192");
        visiteurDao.insert(visiteur);


        TextView test = findViewById(R.id.test);
    }
}