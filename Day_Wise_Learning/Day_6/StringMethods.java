class StringMethods {
 public static void main(String[] args) {
 String st="Lovely Panda";
 System.out.println(st);
 System.out.println(st.length());
 System.out.println(st.charAt(5));
 System.out.println(st.indexOf('P'));
 System.out.println(st.lastIndexOf("e"));
 System.out.println(st.contains("v"));
 System.out.println(st.startsWith("Lov"));
 System.out.println(st.endsWith("nda"));
 System.out.println(st.equals("Panda"));
 System.out.println(st.equalsIgnoreCase("PAnDa"));
 System.out.println(st.compareTo("Panda"));
 System.out.println(st.compareToIgnoreCase("PAnDa"));
 System.out.println(st.contentEquals("Lovely Panda"));
 System.out.println(st.replace("e","!"));
 System.out.println(st.replaceFirst("a","@"));
 System.out.println(st.toUpperCase());
 System.out.println(st.toLowerCase());
 System.out.println(String.join(" ","Lovely","Panda"));

 String x[]=st.split("P");
 System.out.println(x[1]);

 char y[]=st.toCharArray();
 System.out.println(y[4]);

 String st2="He is %s and %d Years Old";
 System.out.println(String.format(st2,"Laddu",21));

 String st3="Adabala\nSuresh";
 System.out.println(st3);
 }
}
