package model;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.appsmontreal.projectemployeeapp.R;

public class EmployeeFragment extends android.app.Fragment{
    boolean flag = false;

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

        Employee employee = (Employee) getArguments().getSerializable("country");

        if (employee instanceof FullTime){
            FullTime aFullTime = (FullTime) employee;
            TextView textViewFullTimeId = getActivity().findViewById(R.id.textViewFId);
            textViewFullTimeId.setText(aFullTime.getEmployeeId());
            TextView textViewFullTimeJob = getActivity().findViewById(R.id.textViewFJob);
            textViewFullTimeJob.setText(aFullTime.getEmployeeName());
            TextView textViewFullTimeStartDate = getActivity().findViewById(R.id.textViewFStart);
            textViewFullTimeStartDate.setText(aFullTime.getStartDate());
            TextView textViewFullTimeSalary = getActivity().findViewById(R.id.textViewFSalary);
            textViewFullTimeSalary.setText(String.valueOf(aFullTime.getSalary()));
            Log.i("------>","I'm here");
        }
        else{
            TextView textViewContractorId = getActivity().findViewById(R.id.textViewCId);
            TextView textViewContractoreName = getActivity().findViewById(R.id.textViewCName);
            TextView textViewContractorJob = getActivity().findViewById(R.id.textViewCJob);
            TextView textViewContractorStartDate = getActivity().findViewById(R.id.textViewCStart);
            TextView textViewContractorEndDate = getActivity().findViewById(R.id.textViewCEnd);
            TextView textViewContractorHoursCost = getActivity().findViewById(R.id.textViewCHoursCost);
            TextView textViewContractorENumberHour = getActivity().findViewById(R.id.textViewCNumberHours);
        }

//        TextView textViewCapital = getActivity().findViewById(R.id.textViewCapital);
//        textViewCapital.setText(country.getCountryCapital());


    }
}

