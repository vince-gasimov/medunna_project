package utilities;


import pojos.US_007_AppointmentsPojo;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class US_007_TXTWriter {

    public static void saveUiRegistrantData(US_007_AppointmentsPojo appointmentPojo){

        try{
            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("us_007_appointment_data"), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(appointmentPojo.toString() + "\n");
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void saveUiRegistrantData(US_007_AppointmentsPojo[] appointmentPojos){

        try{
            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("us_007_appointments_data"), true);
            BufferedWriter bw = new BufferedWriter(fw);
            for(int i=0; i< appointmentPojos.length; i++){
                bw.append(appointmentPojos[i].toString() +"\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
