
import java.util.List;

class Scheduler{

    //Member attributes
    private String availableServices;
    private String Survey;
    private String serviceNeed;
    private String appointment;
    private String referral;

    //public member functions
    public void requestToBeSeen(){

    }
    public void makeAppointment(){

    }

    public void makeReferral(){

    }

    
    
    //select service prompt
    public MedicalEngagement requestToBeSeen(MedicalEngagement m){
        System.out.println("Select an available service from the list or select unkown.");
        boolean check = false;
        if (check){
            makeAppointment();
        }    
      else{
            Survey survey1 = new Survey();
        System.out.println("Fill out the survey");
        ServiceNeed sn1 = new ServiceNeed();
       

        }       

      
        return m;

    }

}