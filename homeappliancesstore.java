public class homeappliancesstore {
    static String onoma;
    static String diefthinsh;
    static int upaliloi;
    //orizw tis metavlites ws string
    public static String getOnoma() {return onoma;}
    public static void setOnoma(String onoma){
        homeappliancesstore.onoma = onoma;}
    public static String getDiefthinsh(){return diefthinsh;}
    public static void setDiefthinsh(String diefthinsh){
        homeappliancesstore.diefthinsh = diefthinsh;}
    public static int getUpaliloi(){return upaliloi;}
    public static void setUpaliloi(int upaliloi){
        homeappliancesstore.upaliloi = upaliloi;}
    public static void main(String[]args){
        try{
            //onoma=args[0]
            homeappliancesstore.setOnoma(args[0]);
            //diefthinsh=args[1]
            homeappliancesstore.setDiefthinsh(args[1]);
            try {
                //upaliloi=Integer.parseInt(args[2])
                homeappliancesstore.setUpaliloi(Integer.parseInt(args[2]));
                if(onoma == null || diefthinsh== null) {  // an h diefthinsh h to onoma einai null tha emfanhsei provlhma
                    System.out.println("provlima me to onoma h thn diefthinsh");}
                //oi upaliloi den ginete na einai null. pairnoun thn timh 0 automata
                else{
                    System.out.println("to onoma ths eterias einai: " +onoma );
                    System.out.println("h diefthinsh ths eterias einai: " + diefthinsh);
                    System.out.println("oi oipaliloi ths eterias einai: " +upaliloi);}}
            catch(NumberFormatException e){//se periptosh pou den dothei int.
                System.out.println("den dothike akeraios arithmos");}}//se periptwsh pou dwthei dekadikos se integer tote
        //to dekadiko meros apospate kai o integer pernei to akeraio meros.
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: the arguments is not enough");
        }}}