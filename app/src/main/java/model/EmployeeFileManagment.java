package model;

import android.content.Context;
import android.content.res.AssetManager;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class EmployeeFileManagment {

    public static ArrayList<Employee> readFile(Context context, String fileName){
        ArrayList<Employee> listOfEmployee = new ArrayList<>();

        AssetManager assetManager = context.getResources().getAssets();

        try {
            InputStreamReader isr = new InputStreamReader(assetManager.open(fileName));

            BufferedReader br = new BufferedReader(isr);

            String oneLine = br.readLine();

            while (oneLine != null){
                StringTokenizer st = new StringTokenizer(oneLine,",");
                String type = st.nextToken();
                if (type.equals("F") || type.equals("f")){
                    listOfEmployee.add(new FullTime(st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken(),Float.parseFloat(st.nextToken())));
                }else if (type.equals("C") || type.equals("c")){
                    listOfEmployee.add(new Contractor(st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken(),st.nextToken(),Float.parseFloat(st.nextToken()),Float.parseFloat(st.nextToken())));
                }

                oneLine = br.readLine();
            }
            br.close();
            isr.close();

        } catch (IOException e) {
            Toast.makeText(context,e.getMessage(),Toast.LENGTH_SHORT).show();
        }

        return listOfEmployee;

    }
}
