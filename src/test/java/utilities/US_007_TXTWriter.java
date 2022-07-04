package utilities;


import pojos.US_007_Appointments;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class US_007_TXTWriter {

    public static void saveUiRegistrantData(US_007_Appointments appointmentPojo){

        try{
            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("us_007_appointment_data"), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(appointmentPojo.toString() + "\n");
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
