
package cams_assignment;

import java.io.*;
import java.util.*;
import javax.swing.JTable;

public class DBFile {
    String Database = "UserData.txt";
    String AdminDB = "AdminData.txt";
    String Appointment = "Appointment.txt";
    public boolean CheckEmail(String Email){
        try{
           File f = new File(Database);
           FileReader fr = new FileReader(f);
           BufferedReader br = new BufferedReader(fr);

           String line;
           String[][] record = new String[100][];
           int index = 0;

           while((line = br.readLine())!= null){
               String[] value = line.split(",");
                record[index] = value;
                index++;
           }
            for(int i = 0; i < index; i++ ){
                if(record[i][1].equals(Email)){
                    return false;
                }
            }
           
           br.close();
           return true;
        }catch(IOException e){
            e.printStackTrace();
            return false;
        }
    }
    public boolean CheckAdminIDList(String AdminID){
        String[] AdminList = {"A001","A002","A003","A004","A005","A006","A007","A008"};

        for(int i = 0;i<AdminList.length; i++){
            if(AdminList[i].equals(AdminID)){
                return false;
            }
        }

        return true;

    }

    public boolean CheckAdminID(String AdminID){
         try{
             File f = new File(AdminDB);
             FileReader fr = new FileReader(f);
             BufferedReader br = new BufferedReader(fr);

             String line;
             String[][] record = new String[100][];
             int index = 0;

             while((line = br.readLine())!= null){
                String[] value = line.split(",");
                record[index] = value;
                index++;
            }
            for(int i = 0; i < index; i++ ){
                if(record[i][0].equals(AdminID)){
                    return false;
                }
            }
             br.close();
             return true;
         }catch(IOException e){
             e.printStackTrace();
             return false;
         }
    }
    public void ExportTable(String FileName, JTable Table){
        try{
            File f = new File(FileName);
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            for(int i = 0 ; i < Table.getRowCount(); i++){
                for(int j = 0 ; j < Table.getColumnCount(); j++){
                    bw.write(Table.getValueAt(i,j).toString());
                    if(j < Table.getColumnCount() - 1){
                        bw.write(",");
                    }else{
                        bw.write(" ");
                    }

                }
                bw.newLine();
            }

            bw.close();

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public boolean CheckAppointmentAvailable(String Date, String Time){
       try{
           File f = new File(Appointment);
           FileReader fr = new FileReader(f);
           BufferedReader br = new BufferedReader(fr);

           String Line;
           int Count = 0;

           while((Line = br.readLine()) != null){
                   String[] field = Line.split(",");
                   String DateSlot = field[2];
                   String TimeSlot = field[3];
                   if(DateSlot.equals(Date) && TimeSlot.equals(Time)){
                       Count++;
                       if(Count >= 5){
                           br.close();
                           return false;
                       }
               }
           }
           br.close();
           return true;
       }catch(IOException e){
          e.printStackTrace();
          return false;
       }
    }
    
    public boolean CheckDateValid(Date SelectDate){
       Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
       Date today = calendar.getTime();
       calendar.add(Calendar.DATE, 1);
       Date tmr = calendar.getTime();
       
       return SelectDate.after(today) && SelectDate.before(tmr);
    }
    
    public boolean CheckContact(String Contact){
        return Contact.matches("[0-9]+");
    }
}
