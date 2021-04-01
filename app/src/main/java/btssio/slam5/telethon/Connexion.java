package btssio.slam5.telethon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Database;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.sql.Date;

import btssio.slam5.telethon.room.database.AppDatabase;
import btssio.slam5.telethon.room.entities.Utilisateur;

//TODO : créer le utilisateurDAO
//TODO : Gérer l'unicité d'une adresse mail lors de l'inscription
//TODO : Enregistrer l'utilisateur en local

public class Connexion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        Button connexionButton = findViewById(R.id.connexionButton);
        EditText mailEdit, passwordEdit;

        mailEdit = findViewById(R.id.mailEdit);
        passwordEdit = findViewById(R.id.passwordEdit);

        connexionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView error = findViewById(R.id.errorText);

                // on vérifie si un champ est vide
                if(mailEdit.getText().toString().isEmpty() ||
                        passwordEdit.getText().toString().isEmpty())
                {

                    error.setText("Vous devez remplir tous les champs pour pouvoir vous connecter");

                }else {

                    error.setText("");

                    String postUrl = "http://172.20.10.2/PPE/telethon/connexion.php";
                    RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());

                    JSONObject postData = new JSONObject();

                    try {
                        postData.put("mail", mailEdit.getText().toString());
                        postData.put("mdp", passwordEdit.getText().toString());
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }

                    JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, postUrl, postData, new Response.Listener<JSONObject>() {
                        @Override
                        public void onResponse(JSONObject response) {
                            try {

                                System.out.println(response.getString("response"));

                                AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                                        AppDatabase.class, "telethon").build();

                                Utilisateur userConnected = new Utilisateur(response.getInt("id"), response.getString("nom"), response.getString("prenom"), response.getString("dateNaissance") ,response.getString("mail"));

                                if(response.getString("code").equals("1")){
                                    Intent intent = new Intent(getApplicationContext(), Register.class); // <----- À CHANGER POUR ENVOYER SUR L'ACCUEIL
                                    intent.putExtra("id", response.getString("response"));
                                    intent.putExtra("nom", response.getString("response"));
                                    intent.putExtra("registered", response.getString("response"));
                                    intent.putExtra("registered", response.getString("response"));
                                    intent.putExtra("registered", response.getString("response"));
                                    startActivity(intent);
                                }else{
                                    error.setText(response.getString("response"));
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        }
                    }, new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            System.out.println("ECHEC");
                            Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_LONG).show();
                            error.printStackTrace();
                        }
                    });
                    requestQueue.add(jsonObjectRequest);


                }

            }
        });
    }
}