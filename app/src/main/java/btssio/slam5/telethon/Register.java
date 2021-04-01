package btssio.slam5.telethon;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;

import btssio.slam5.telethon.room.entities.Utilisateur;
import btssio.slam5.telethon.room.entities.Visiteur;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button registerButton = findViewById(R.id.registerButton);
        EditText nomEdit, prenomEdit, mailEdit, passwordEdit, confirmPasswordEdit;
        Spinner dateNaissanceDaysEdit, dateNaissanceMonthsEdit, dateNaissanceYearsEdit;

        nomEdit = findViewById(R.id.nomEdit);
        prenomEdit = findViewById(R.id.prenomEdit);
        dateNaissanceDaysEdit = findViewById(R.id.dateNaissanceDaysEdit);
        dateNaissanceMonthsEdit = findViewById(R.id.dateNaissanceMonthsEdit);
        dateNaissanceYearsEdit = findViewById(R.id.dateNaissanceYearsEdit);
        mailEdit = findViewById(R.id.mailEdit);
        passwordEdit = findViewById(R.id.passwordEdit);
        confirmPasswordEdit = findViewById(R.id.confirmPasswordEdit);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView error = findViewById(R.id.errorText);



                // on vérifie si un champ est vide
                if(nomEdit.getText().toString().isEmpty() ||
                    prenomEdit.getText().toString().isEmpty() ||
                    mailEdit.getText().toString().isEmpty() ||
                    passwordEdit.getText().toString().isEmpty() ||
                    confirmPasswordEdit.getText().toString().isEmpty() ||
                    dateNaissanceDaysEdit.getSelectedItem().toString().isEmpty() ||
                    dateNaissanceMonthsEdit.getSelectedItem().toString().isEmpty() ||
                    dateNaissanceYearsEdit.getSelectedItem().toString().isEmpty())
                        {

                    error.setText("Vous devez remplir tous les champs pour pouvoir vous inscrire.");

                }else {

                    error.setText("");

                    // on vérifie si la confirmation du mot de passe est bonne
                    if(!passwordEdit.getText().toString().equals(confirmPasswordEdit.getText().toString())){

                        error.setText("La confirmation de votre ot de passe n'est pas bonne.");

                    }else {

                        error.setText("");

                        String postUrl = "http://172.20.10.2/PPE/telethon/createVisiteur.php";
                        RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());

                        JSONObject postData = new JSONObject();

                        try {
                            postData.put("nom", nomEdit.getText().toString());
                            postData.put("prenom", prenomEdit.getText().toString());
                            postData.put("dateNaissance", dateNaissanceYearsEdit.getSelectedItem().toString() + "-" + dateNaissanceMonthsEdit.getSelectedItem().toString() + "-" + dateNaissanceDaysEdit.getSelectedItem().toString());
                            postData.put("mail", mailEdit.getText().toString());
                            postData.put("mdp", passwordEdit.getText().toString());
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, postUrl, postData, new Response.Listener<JSONObject>() {
                            @Override
                            public void onResponse(JSONObject response) {
                                try {
                                    if(response.getString("code").equals("1")){
                                        Intent intent = new Intent(getApplicationContext(), Connexion.class);
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

            }
        });

    }
}