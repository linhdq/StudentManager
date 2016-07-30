package com.example.mrbom.studentmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtname;
    TextView tvbd;
    String s;
    Button btnsave;
    Spinner spinnerBirhPlace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        String arr[] = {"Hà Nội", "Hà Nam", "Hà Tây", "Hà Đông"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, arr);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spinnerBirhPlace.setAdapter(arrayAdapter);
        tvbd.setOnClickListener(this);
        btnsave.setOnClickListener(this);
    }
    public void init() {
        edtname = (EditText) findViewById(R.id.edtname);
        tvbd = (TextView) findViewById(R.id.tvbd);
        btnsave = (Button) findViewById(R.id.btn_add);
        spinnerBirhPlace = (Spinner) findViewById(R.id.spinner_address);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_add: {
                if (edtname.getText().toString().isEmpty() || tvbd.getText().toString().isEmpty()) {
                    Toast.makeText(this, "Hãy Nhập Đủ Dữ Liệu", Toast.LENGTH_LONG).show();
                } else {

                    s = "Name: "+ edtname.getText().toString()+"\n\n"+"Birthday: "+tvbd.getText().toString()+"\n\n"+"BirhPlace:"+spinnerBirhPlace.getSelectedItem().toString()+"\n\n";
//                    Bundle bundle = new Bundle();
//                    bundle.putString("kq", s);

//                    Intent intent = new Intent(AddEmployee.this, EmployeeDetail.class);
//                    intent.putExtra("data", bundle);
//                    startActivity(intent);
                }
                break;
            }
            case R.id.tvbd: {
                DatePickerDialog.OnDateSetListener onDateSetListener = new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        tvbd.setText(datePicker.getDayOfMonth() + " / " + (datePicker.getMonth() + 1) + " / " + datePicker.getYear());
                    }
                };
                DatePickerDialog datePickerDialog = new DatePickerDialog(this, onDateSetListener, 1995, 2, 28);
                datePickerDialog.show();
                break;
            }
        }


    }
}
