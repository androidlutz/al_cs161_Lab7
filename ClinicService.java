import java.util.List;

class ClinicService{
    //Members
    private int serviceNumber;
    private List Name;
    private List serviceDescription;

    //Member Functions
    public int getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(int s) {
      serviceNumber = s;

    }
    public List getName() {
        return Name;
    }

    public void setName(List n) {
        Name = n;
    }

    public List getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(List desc) {
        serviceDescription = desc;
    }

     public void getAvailableService(){

     } 
     public ServiceNeed compare(ServiceNeed s){
        return s;

     }
          
    
}