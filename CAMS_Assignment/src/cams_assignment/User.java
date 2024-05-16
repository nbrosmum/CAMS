
package cams_assignment;

import java.io.*;

public class User{
    private String Name;
    private String Email;
    private String Contact;

    
    String DataBase = "UserData.txt";
    String Appointment = "Appointment.txt";
    
    public String getName(){
        return Name;
    }
    public String getEmail(){
        return Email;
    }
    public String getContact(){
        return Contact;
    }
  
    public void Resgister(String Name, String Email, String Gender, String Age, String BOD, String Contact , String Password){
        try{
            File f = new File(DataBase);
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String Data = Name + "," + Email + "," + Gender + "," + Age + "," + BOD + "," + Contact + "," + Password + "\n";
            
            bw.write(Data);
            
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    public boolean Login(String Email,String Password){
         try{
            File f = new File(DataBase);
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
                if(record[i][1].equals(Email) && record[i][6].equals(Password)){
                    this.Name = record[i][0];
                    this.Email = record[i][1];
                    this.Contact = record[i][5];
                    return true;
                }
            }
            
            return false;
            
        }catch(IOException e){
            return false;
        }
    }
    public void BookAppointment(String PName, String Contact,String Date, String Time){
        try{
            File f = new File(Appointment);
            FileWriter fw = new FileWriter(f,true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String Data = PName + "," + Contact + "," + Date + "," + Time + "," + "On Hold" + "\n";
            
            bw.write(Data);
            
            bw.close();
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
