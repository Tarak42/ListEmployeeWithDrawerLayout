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

public class FullTimeFragment extends android.app.Fragment implements View.OnClickListener {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            return inflater.inflate(R.layout.fulltime_fragment,container,false);
    }


    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        FullTime aFullTime = (FullTime) getArguments().getSerializable(MainActivity.KEY);

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
        Button exitButton = getActivity().findViewById(R.id.exitButtonFT);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.exitButtonFT){
//            finish();

        }
    }

}
