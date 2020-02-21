
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
          //create survey object
        Survey survey1 = new Survey();

        //request client fill out survey
        System.out.println("Fill out the survey");

        //create a ServiceNeed object
        ServiceNeed sn1 = new ServiceNeed();

        //execute identifyNeed method in the ServiceNeed object
        sn1.identifyNeed(Survey s);
        
        //Execute the compare method in the ClinicService object
        ClinicService service = new ClinicService();
        service.compare(ServiceNeed s);

        //if clinic provides required service execute make appointment
        if (check){
            makeAppointment();
        }
        else{
            makeReferral()
        } 
        //Return Medical Engagement Object      
        return m;

    }

}