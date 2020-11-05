package ud.example.calculadoramundial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText Valor01, Valor02;
    private RadioButton Oper01, Oper02, Oper03, Oper04;
    private Button Button;
    private TextView Textsal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Valor01=findViewById(R.id.editText1);
        Valor02=findViewById(R.id.editText2);
        Oper01=findViewById(R.id.radioButton1);//suma
        Oper02=findViewById(R.id.radioButton2);//resta
        Oper03=findViewById(R.id.radioButton3);
        Oper04=findViewById(R.id.radioButton4);
        //..
        //..
        //..
        Button = findViewById(R.id.button);
        Textsal = findViewById(R.id.textView2);
    }
    public void calcular(View v){



        int resultado=0;
        float resultado2=0;
        int valordown = Integer.parseInt(Valor02.getText().toString());

        if(valordown == 0 && Oper04.isChecked()){
            Textsal.setText("No se puede dividir por cero!!!");
        }else{

        if(Oper01.isChecked()){
            resultado = Integer.parseInt(Valor01.getText().toString()) + valordown;
            Textsal.setText(String.valueOf(resultado));
        }
        if(Oper02.isChecked()){
            resultado = Integer.parseInt(Valor01.getText().toString()) - Integer.parseInt(Valor02.getText().toString());
            Textsal.setText(String.valueOf(resultado));
        }
        if(Oper03.isChecked()){
            resultado = Integer.parseInt(Valor01.getText().toString()) * Integer.parseInt(Valor02.getText().toString());
            Textsal.setText(String.valueOf(resultado));
        }
        if(Oper04.isChecked()){
        resultado2 = Float.parseFloat(Valor01.getText().toString()) / Float.parseFloat(Valor02.getText().toString());
            Textsal.setText(String.valueOf(resultado2));
    }
        }
    }
}