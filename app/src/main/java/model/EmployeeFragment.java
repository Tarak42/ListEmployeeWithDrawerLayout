package model;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.appsmontreal.projectemployeeapp.MainActivity;
import com.appsmontreal.projectemployeeapp.R;

public class EmployeeFragment extends android.app.Fragment{
    boolean flag;

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

        Employee employee = (Employee) getArguments().getSerializable(MainActivity.KEY);

        if (employee instanceof FullTime){
            FullTime aFullTime = (FullTime) employee;
            flag = false;

            TextView textViewFullTimeId = getActivity().findViewById(R.id.textViewFId);
            textViewFullTimeId.setText(aFullTime.employeeId);
            TextView textViewFullTimeName = getActivity().findViewById(R.id.textViewFname);
            textViewFullTimeName.setText(aFullTime.getEmployeeName());
            TextView textViewFullTimeJob = getActivity().findViewById(R.id.textViewFJob);
            textViewFullTimeJob.setText(aFullTime.getEmployeeJob());
            TextView textViewFullTimeStartDate = getActivity().findViewById(R.id.textViewFStart);
            textViewFullTimeStartDate.setText(aFullTime.getStartDate());
            TextView textViewFullTimeSalary = getActivity().findViewById(R.id.textViewFSalary);
            textViewFullTimeSalary.setText(String.valueOf(aFullTime.getSalary()));
            Log.i("------>","I'm here");
        }
        else{
            Contractor aContractor = (Contractor) employee;
            flag = true;

            TextView textViewContractorId = getActivity().findViewById(R.id.textViewCId);
            textViewContractorId.setText(aContractor.employeeId);
            TextView textViewContractorName = getActivity().findViewById(R.id.textViewCName);
            textViewContractorName.setText(aContractor.getEmployeeName());
            TextView textViewContractorJob = getActivity().findViewById(R.id.textViewCJob);
            textViewContractorJob.setText(aContractor.getEmployeeJob());
            TextView textViewContractorStartDate = getActivity().findViewById(R.id.textViewCStart);
            textViewContractorStartDate.setText(aContractor.getStartDate());
            TextView textViewContractorEndDate = getActivity().findViewById(R.id.textViewCEnd);
            textViewContractorEndDate.setText(aContractor.getEndDate());
            TextView textViewContractorHoursCost = getActivity().findViewById(R.id.textViewCHoursCost);
            textViewContractorHoursCost.setText(String.valueOf(aContractor.getHourSalary()));
            TextView textViewContractorENumberHour = getActivity().findViewById(R.id.textViewCNumberHours);
            textViewContractorENumberHour.setText(String.valueOf(aContractor.getNumberHoursPerWeek()));
        }

//        TextView textViewCapital = getActivity().findViewById(R.id.textViewCapital);
//        textViewCapital.setText(country.getCountryCapital());


    }
}

