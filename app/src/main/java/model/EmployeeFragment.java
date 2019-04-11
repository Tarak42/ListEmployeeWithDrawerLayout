package model;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appsmontreal.projectemployeeapp.R;

public class EmployeeFragment extends android.app.Fragment{
    boolean flag = true;

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        if (flag){
            return inflater.inflate(R.layout.contractor_fragment,container,false);
        }
        else{
            return inflater.inflate(R.layout.fulltime_fragment,container,false);
        }

    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        
    }
}

