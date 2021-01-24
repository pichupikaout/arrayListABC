import java.util.*; 
public class ArrayListABCProgram {    
    public static void main() {
    int k = 0;
    int newPos;
    String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H"}; 
    Random a = new Random();
    String temp;
    ArrayList<String> letterList = new ArrayList<>();
    letterList.add("A"); letterList.add("B"); letterList.add("D"); 
    letterList.add("A"); letterList.add("C"); letterList.add("A"); 
    letterList.add("E"); letterList.add("H"); letterList.add("F"); 
    letterList.add("H"); letterList.add("G"); letterList.add("C"); 
    letterList.add("B");           
    System.out.println("Letter List before: " + letterList);    
    while (k < letterList.size()) {  
          if (letterList.get(k) == "A") {
               letterList.add(k, "A");
               k+=2;
            } else if (letterList.get(k) == "B") {
                letterList.set(k, "Z");
                k++;
            } else if (letterList.get(k) == "C") {
                letterList.remove(k);
            } else if (letterList.get(k) == "D") {
                newPos = a.nextInt(letterList.size());
                temp = letterList.get(newPos);
                letterList.set(newPos, "D");
                letterList.set(k, temp);
                k++;
            } else if (letterList.get(k) == "E") {
                newPos = a.nextInt(letterList.size());
                temp = letterList.get(newPos);
                letterList.add(newPos, "E");
                letterList.remove(newPos + 1);
                letterList.add(k, temp);
                letterList.remove(k+1);
                k++;
            } else if (letterList.get(k) == "F") {
                newPos = a.nextInt(letters.length);
                temp = letterList.get(newPos);
                newPos = a.nextInt(letterList.size());
                letterList.add(newPos, temp);
                k++;
            } else if (letterList.get(k) == "G") {
                newPos = a.nextInt(letters.length);
                temp = letterList.get(newPos);
                letterList.set(k, temp);
                k++;
            } else {
                k++;
            }
}
System.out.println("Letter List after: " + letterList);
}
}
          

        
         
           

   