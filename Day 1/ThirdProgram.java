class ThirdProgram {
    
    public static void main(String[] args) {
if(args.length !=2){
System.out.println("Invalid number of arguments!");
return;
}
try{
int count = Integer.parseInt(args[1]);
     for(int i =0;i<count;i++)
           System.out.println(args[0]);
}
catch(NumberFormatException n){
System.out.println("Second arg isn't a Number!");
}




}
}