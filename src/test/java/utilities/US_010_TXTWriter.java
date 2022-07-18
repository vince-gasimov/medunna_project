package utilities;


import pojos.US_010_AppointmentsList;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class US_010_TXTWriter {

    public static void saveAppointmentsListData(US_010_AppointmentsList appointmentPojo){

        try{
            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("us_010_appointmentsList_data"), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(appointmentPojo.toString() + "\n");
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
