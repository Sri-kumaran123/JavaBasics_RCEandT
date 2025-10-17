class OfficeBranch extends HeadOffice{

    private String location;

    OfficeBranch(String location){
        this.location = location;
        super();
    }

    OfficeBranch(String location, String type){
        super(type);
        this.location = location;
    }

    String getLocation(){
        return location;
    }

}