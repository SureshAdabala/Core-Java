class Break2 
{
    public static void main(String[] args) 
    {
           String Name="Suresh";
           for(int i=0;i<Name.length();i++)
           {
               if(Name.charAt(i)=='r'|| Name.charAt(i)=='h')
               {
                   break;
               }
               System.out.println(Name.charAt(i));
           }
    }
}
