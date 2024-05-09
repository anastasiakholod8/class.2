public class Restaurant {

    private String name;
    private String adress;
    private String worktime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    public  Restaurant(String  name, String adress , String  worktime) {
        this.name =name  ;
        this. adress  =  adress ;
        this. worktime  =  worktime ;

    }

    void Information(){
        System.out.println(" У ресторані- " + name + "за адресою -" + adress + ",робочий час :" + worktime);

    }
}
