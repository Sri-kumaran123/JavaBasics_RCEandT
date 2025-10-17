class HeadOffice {

    private String company;
    private String type = "Software development";

    HeadOffice(){
        company = "JavaBeans";
    }

    HeadOffice(String type){
//        this.type = type;
        this();
        this.type = type;
//        company = "JavaBeans";
    }

    String getName(){
        return company;
    }

    String getType(){
        return type;
    }
}