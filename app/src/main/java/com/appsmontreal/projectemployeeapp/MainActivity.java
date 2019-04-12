package com.appsmontreal.projectemployeeapp;

import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import model.ContractorFragment;
import model.Employee;
import model.EmployeeFileManagment;
import model.FullTime;
import model.FullTimeFragment;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    public static final String KEY = "keyOk";
    public static final String FILENAME = "Employees";

    ArrayList<Employee> listEmployee;
    ArrayAdapter<Employee> employeeArrayAdapter;
    ListView listViewEmployee;
    DrawerLayout drawerLayout;

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
        drawerLayout = findViewById(R.id.drawerLayout);
        listEmployee = EmployeeFileManagment.readFile(this,FILENAME);
        employeeArrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listEmployee);
        listViewEmployee.setAdapter(employeeArrayAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(KEY,listEmployee.get(position));

        //REPLACE THE LINEAR LAYOUT WITH FRAGMENT
        if (listEmployee.get(position) instanceof FullTime){
            FullTimeFragment fulltimeFragment = new FullTimeFragment();
            fulltimeFragment.setArguments(bundle);
            buildFragment(fulltimeFragment);

        }else{
            ContractorFragment contractorFragment = new ContractorFragment();
            contractorFragment.setArguments(bundle);
            buildFragment(contractorFragment);
        }
        setTitle(listEmployee.get(position).getEmployeeName());
        drawerLayout.closeDrawer(listViewEmployee);
    }


    private void buildFragment(android.app.Fragment fragment){
        //REFERENCE THE FRAGMENT MANAGER
        android.app.FragmentManager fragmentManager = getFragmentManager();
        //BEGIN THE TRANSACTION
        android.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        //REPLACE LINEAR LAYOUT MAIN_UI WITH THE FRAGMENT
        fragmentTransaction.replace(R.id.main_ui,fragment);
        fragmentTransaction.commit();
    }
}


