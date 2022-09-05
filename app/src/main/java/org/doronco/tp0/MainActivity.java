package org.doronco.tp0;

        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.service.autofill.OnClickAction;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn1);
        button.setText("Valider");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Hello world",Toast.LENGTH_LONG).show();
            }
        });
    }

    public void showMessage(View view) {
        Toast.makeText(this,"Hello world",Toast.LENGTH_LONG).show();
    }
}