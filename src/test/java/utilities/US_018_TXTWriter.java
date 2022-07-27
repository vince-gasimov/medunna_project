package utilities;

import pojos.US_18_Physicians;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

public class US_018_TXTWriter {

    public static void saveApiUS_18_PhysiciansData(List<Object> US018Physician){
        try{
            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("applicants_data"),true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i =0; i< US018Physician.size(); i++){
                bw.append(US018Physician.get(i) + "\n");}
            bw.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void saveApiUS_18_PhysiciansData(US_18_Physicians[] us_18_physicians){
        try {
            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("applicant_api_data"), true);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < us_18_physicians.length; i++){
                bw.append(us_18_physicians[i].toString() + "\n");
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}




