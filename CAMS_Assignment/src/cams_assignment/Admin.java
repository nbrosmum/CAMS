
package cams_assignment;

import java.io.*;

public class Admin {
    private String AdminID;
    private String Name;
    String DB = "AdminData.txt";
    String Appointment = "Appointment.txt";
    String MedicalRecord = "MedicalRecord.txt";
    
    public String getAdminID(){
        return AdminID;
    }
    public String getName(){
        return Name;
    }


    public void Resgister(String AdminID, String Name, String Password){
        try{
            File f = new File(DB);
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String Data = AdminID + "," + Name + "," + Password + "\n";
            
            bw.write(Data);
            
            bw.close();
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public boolean Login(String AdminID, String Password){
        try{
            File f = new File(DB);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            
            String[][] record = new String[100][];
            String line;
            int index = 0;
            
            while((line = br.readLine())!= null){
                String[] value = line.split(",");
                record[index] = value;
                index++;
            }
            for(int i = 0; i < index; i++ ){
                if(record[i][0].equals(AdminID) && record[i][2].equals(Password)){
                    this.AdminID = record[i][0];
                    this.Name = record[i][1];
                    return true;
                }
            }
            
            return false;
            
        }catch(IOException e){
            return false;
        }
    }
    
    public void InsertAppointment(String PName, String Contact,String Date, String Time){
        try{
            File f = new File(Appointment);
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String Data = PName + "," + Contact + "," + Date + "," + Time + "," + "Approve" + "\n";
            
            bw.write(Data);
            
            bw.close();
            
        }catch(IOException e){
            e.printStackTrace();
        }        
    
    }
    public void InsertMedicalRecord(String PName, String Date , String Diagnosis){
        try{
            File f = new File(MedicalRecord);
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String Data = PName + "," + Date + "," + Diagnosis  + "\n";
            
            bw.write(Data);
            
            bw.close();
            
        }catch(IOException e){
            e.printStackTrace();
        }        
    
    }   
}