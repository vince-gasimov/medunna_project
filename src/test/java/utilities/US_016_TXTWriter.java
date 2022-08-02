package utilities;

import pojos.US_016_Rooms;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class US_016_TXTWriter {

    public static void saveUIRegistrantData(US_016_Rooms rooms) {

        try{
            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("us_016_room_data"), false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(rooms.toString() + "\n");
            bw.close();


        }catch (Exception e){
            e.printStackTrace();
        }

    }



    public static void saveAPIRegistrantData(US_016_Rooms [] allRooms) {

        try{
            FileWriter fw = new FileWriter(ConfigurationReader.getProperty("us_016_allRoom_api_data"), false);
            BufferedWriter bw = new BufferedWriter(fw);

            for (int i = 0; i < allRooms.length; i++) {
                bw.append(allRooms[i].toString() + "\n");

            }
            bw.close();


        }catch (Exception e){
            e.printStackTrace();
        }

    }








}
