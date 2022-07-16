package utilities;

import pojos.US_005_Appointment;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class US_005_TXTWriter {

    public static void saveUIAppointmentData(US_005_Appointment appointment){
        try{
            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("applicant_data"),true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(appointment.toString() + "\n");
            bw.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void saveUIAppointmentData(US_005_Appointment[] appointments){
        try {
            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("applicants_api_data"), true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < appointments.length; i++){
                bw.append(appointments[i].toString() + "\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
