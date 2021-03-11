package btssio.slam5.telethon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import btssio.slam5.telethon.room.entities.Visiteur;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button registerButton = findViewById(R.id.registerButton);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView error = findViewById(R.id.errorText);

                EditText nomEdit, prenomEdit, dateNaissanceEdit, mailEdit, passwordEdit, confirmPasswordEdit;
                nomEdit = findViewById(R.id.nomEdit);
                prenomEdit = findViewById(R.id.prenomEdit);
                dateNaissanceEdit = findViewById(R.id.dateNaissanceEdit);
                mailEdit = findViewById(R.id.mailEdit);
                passwordEdit = findViewById(R.id.passwordEdit);
                confirmPasswordEdit = findViewById(R.id.confirmPasswordEdit);

                // on vérifie si un champ est vide
                if(nomEdit.getText().toString().isEmpty() ||
                    prenomEdit.getText().toString().isEmpty() ||
                    dateNaissanceEdit.getText().toString().isEmpty() ||
                    mailEdit.getText().toString().isEmpty() ||
                    passwordEdit.getText().toString().isEmpty() ||
                    confirmPasswordEdit.getText().toString().isEmpty()){

                    error.setText("Vous devez remplir tous les champs pour pouvoir vous inscrire.");

                }else {

                    error.setText("");

                    // on vérifie si la confirmation du mot de passe est bonne
                    if(!passwordEdit.getText().toString().equals(confirmPasswordEdit.getText().toString())){

                        error.setText("La confirmation de votre ot de passe n'est pas bonne.");

                    }else {

                        error.setText("");

                        

                    }

                }

            }
        });

    }
}