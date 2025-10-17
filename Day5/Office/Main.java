class Main {
    public static void main(String[] args){
        OfficeBranch branch1 = new OfficeBranch("Chennai");
        OfficeBranch branch2 = new OfficeBranch("Pandicherry","Trainning");


        System.out.println("Company Name: "+branch1.getName());
        System.out.println("Location: "+ branch1.getLocation());
        System.out.println("Type: "+ branch1.getType());
        System.out.println("------------------");
        System.out.println("Company Name: "+branch2.getName());
        System.out.println("Location: "+ branch2.getLocation());
        System.out.println("Type: "+ branch2.getType());
    }
}