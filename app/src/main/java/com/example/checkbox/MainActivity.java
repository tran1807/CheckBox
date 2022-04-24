package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox cbAndroid,cbIos,cbPhp;
    Button btnXacnhan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();

        cbAndroid.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "Bạn đã chọn android", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Bạn đã bỏ chọn android", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cbIos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "Bạn đã chọn ios", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Bạn đã bỏ chọn ios", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cbPhp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    Toast.makeText(MainActivity.this, "Bạn đã chọn php", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this, "Bạn đã bỏ chọn php", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnXacnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String monhoc = "Bạn đã chọn môn học: \n ";
                if(cbAndroid.isChecked()){
                    monhoc += cbAndroid.getText()+"\n";
                }
                if (cbIos.isChecked()){
                    monhoc += cbIos.getText()+"\n";
                }
                if (cbPhp.isChecked()){
                    monhoc += cbPhp.getText()+"\n";
                }
                Toast.makeText(MainActivity.this, monhoc, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Anhxa() {
        cbAndroid = (CheckBox) findViewById(R.id.checkBoxAndroid);
        cbIos = (CheckBox) findViewById(R.id.checkBoxIOS);
        cbPhp = (CheckBox) findViewById(R.id.checkBoxPHP);
        btnXacnhan = (Button) findViewById(R.id.buttonXacnhan);

    }
}