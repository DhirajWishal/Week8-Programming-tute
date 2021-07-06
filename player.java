public class player{
    String Name;
    int age,rating;
    double batting_avg,bowling_avg;

    public enum Type { BATTING, BOWLING };
    private Type type;

    player(String name,Type toype,int years,double batting,double bowling,int ratting){
        Name=name;
        this.type=toype;
        age=years;
        batting_avg=batting;
        bowling_avg=bowling;
        rating=ratting;

        
    }
    public Type getAverage(){
        return type;
    }

    public void getPlayerDetails(){
        System.out.println(" Name :"+ Name +"/n Age :"+ age + "/n Type :" + type);
    }

   





    
}