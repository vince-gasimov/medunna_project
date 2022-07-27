package utilities;

import pojos.US_002_RegistrantPojo;

import java.io.*;
import java.util.Map;

public class US_002_TXTWriter {
    public static void saveUIRegistrantData(US_002_RegistrantPojo registrant){

        try{
            //File creation ==>> First parameter is the path of the file.that will be created.
            FileWriter fw= new FileWriter(ConfigurationReader.getProperty("US_002_applicant_data"),false);
            // true ==>> This file will not be deleted and re-updated. It will just overload in the same file again and again.
            //If we have new record it will be overloaded.
            // false ==>> It will delete the existing file and will recreate a new file, so it will update our file.

            //Records creation
            BufferedWriter bw= new BufferedWriter(fw); // It will create the records into fw object file location.
            bw.append(registrant.toString()+"\n"); // "\n" will take all the records one by one into different lines.
            bw.close();

        }catch(Exception e){

        }
        // In our utilities class it is better to use try-catch blocks for handling exceptions.
        // Try-catch blocks are more dynamic because whenever we call this method we don't need
        // to handle it again and again.
    }

    public static void saveUIRegistrantData(US_002_RegistrantPojo[] registrants){

        try {
            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("applicants_api_data"),false);

            BufferedWriter bw = new BufferedWriter(fw);

            for (int i=0; i<registrants.length;i++){
                bw.append(registrants[i].toString()+"\n");
            }

        } catch (IOException e) {

        }
    }

    public static String readFile(String filepath)
    {
        String returnFileContent="";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            String st;
            while ((st = br.readLine()) != null){
                returnFileContent = returnFileContent +st +"\n";
                System.out.println(st);
            }
        } catch(Exception e){

        }

        return returnFileContent;
    }

    public static void SavePojoToFile(String filePath, Object pojoObj){
        try{
            FileWriter fw2 = new FileWriter(filePath,false);
            BufferedWriter bw = new BufferedWriter(fw2);
            bw.append(pojoObj +"\n");
            bw.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void saveMapToFile(Map<String, String> map){
        try {
            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("US_028_country_ui_data"),false);
            BufferedWriter bw= new BufferedWriter(fw);
            bw.append(map+"\n");
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void saveMapToFile(Map<String, Object> map, String path){
        try {
            FileWriter fw = new FileWriter(path,false);
            BufferedWriter bw= new BufferedWriter(fw);
            bw.append(map+"\n");
            bw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
