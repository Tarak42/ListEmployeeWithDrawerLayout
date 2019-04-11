package com.appsmontreal.projectemployeeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import model.Employee;
import model.EmployeeFileManagment;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public static final String KEY = "keyOk";
    public static final String FILENAME = "Employees";

    ArrayList<Employee> listEmployee;
    ArrayAdapter<Employee> employeeArrayAdapter;
    ListView listViewEmployee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        listEmployee = new ArrayList<>();
        listViewEmployee = findViewById(R.id.listViewEmployees);
        listViewEmployee.setOnItemClickListener(this);
        listEmployee = EmployeeFileManagment.readFile(this,FILENAME);
        employeeArrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listEmployee);
        listViewEmployee.setAdapter(employeeArrayAdapter);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Bundle bundle = new Bundle();
//        bundle.putSerializable(KEY,);
    }
}


