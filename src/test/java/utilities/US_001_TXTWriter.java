package utilities;

import pojos.US_01_Registrant;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class US_001_TXTWriter {

    public static void saveUiRegistrantData(US_01_Registrant US01Registrant) {
        try {
            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("applicant_data"), true);

            BufferedWriter bw = new BufferedWriter(fw);

            bw.append(US01Registrant.toString()+"\n");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void saveUiRegistrantData(US_01_Registrant[] US01Registrants) {
        try {
            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("api_all_registrant_data"), true);

            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i <  US01Registrants.length; i++) {
                bw.append(US01Registrants[i].toString()+"\n");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
