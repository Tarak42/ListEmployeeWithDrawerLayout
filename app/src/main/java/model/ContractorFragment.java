package model;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.appsmontreal.projectemployeeapp.MainActivity;
import com.appsmontreal.projectemployeeapp.R;

public class ContractorFragment extends android.app.Fragment implements View.OnClickListener {
    Button exitButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            return inflater.inflate(R.layout.contractor_fragment,container,false);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Contractor aContractor = (Contractor) getArguments().getSerializable(MainActivity.KEY);

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
        Button exitButton = getActivity().findViewById(R.id.exitButtonContractor);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.exitButtonContractor){
//            finish();

        }
    }
}

