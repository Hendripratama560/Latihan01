package id.ac.poliban.mi.hendri.latihan01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edNim = findViewById(R.id.etnim);
        EditText edName = findViewById(R.id.etname);
        EditText edAddress = findViewById(R.id.etaddress);
        EditText edPhone = findViewById(R.id.etphone);

        Button btnClear = findViewById(R.id.btclear);
        btnClear.setOnClickListener(V-> {
            //mengosongkan EditText
            edNim.setText("");
            edName.setText("");
            edAddress.setText("");
            edPhone.setText("");
            //mengembalikan kursor ke EditText.Name
            edNim.requestFocus();
        });

        Button btnSubmit = findViewById(R.id.btsubmit);
        btnSubmit.setOnClickListener(V-> {
            edNim.setText("");
            edName.setText("");
            edAddress.setText("");
            edPhone.setText("");
            edNim.requestFocus();
            //menampilkan pesan
            Toast.makeText(MainActivity.this, "Terkirim", Toast.LENGTH_SHORT).show();
        });

    }
}
