import java.io.*;
import java.util.*;
public class File 
{
  public static void main(String[] args)throws Exception 
  { 
  File file = new File("C:\\Users\\userName\\Desktop\\test.txt");   //Read file
  BufferedReader br = new BufferedReader(new FileReader(file));     //Store in buffered Reader (br.readLine() will retern File Line)
  String tmp;
  List<String> isoGram = new ArrayList<String>();                   //No letter more than once
  List<String> lipoGram = new ArrayList<String>();                  //Word without e,z,j,q,x,t,a
  List<String> panagrammaticLipogram = new ArrayList<String>();     //All alpha except one alpha
  List<String> tautoGram = new ArrayList<String>();                 //All starting word with same letter
  while ((tmp = br.readLine()) != null){
      String[] strArray = tmp.split(" ");
      for(String strn: strArray){
        
        //check if string doesnt contains e,z,j,q,x,t,a
        if(!strn.contains("e") && !strn.contains("z") && !strn.contains("j") && !strn.contains("q") && 
        !strn.contains("x") && !strn.contains("t") && !strn.contains("a")){
            lipoGram.add(strn);
        }

        // check for duplicate is present
        int f=0;
        for (int i = 0; i < strn.length(); i++){ 
            for (int j = i + 1; j < strn.length(); j++){ 
                if (strn.charAt(i) == strn.charAt(j)){ 
                    f=1;
                    break 
                }
            }
        }
        if(f!=1){
            isoGram.add(strn);
        }

        // check for all alpha except one alpha
        Map<String,Integer> counting = new HashMap<String,Integer>();
        counting.put("a",0);counting.put("b",0);counting.put("c",0);counting.put("d",0);counting.put("e",0);
        counting.put("f",0);counting.put("g",0);counting.put("h",0);counting.put("i",0);counting.put("j",0);
        counting.put("k",0);counting.put("l",0);counting.put("m",0);counting.put("n",0);counting.put("o",0);
        counting.put("p",0);counting.put("q",0);counting.put("r",0);counting.put("s",0);counting.put("t",0);
        counting.put("u",0);counting.put("v",0);counting.put("x",0);counting.put("y",0);counting.put("z",0);
        counting.put("w",0);
        for(int i=0;i<strn.length();i++){
            counting.put(String.valueOf(strn.charAt(i)).toLowerCase(),1);
        }
        String[] alpha = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"]
        int isNotOccured = 0;
        for(String al: alpha){
            if(counting.get(al)==0){
                isNotOccured+=1;
            }
        }
        if(isNotOccured==1){
            panagrammaticLipogram.put(strn);
        }
      }
    }
    //check all the first character of a word is same example: [All Are Array A] (contains a in every word first character)
    int isFirstSame = 1;
    for(int i=0;i<strArray.length-1;i++){
        if(strArray[i].charAt(0)!=strArray[i+1].charAt(0){
            isFirstSame = 0;
        } 
    }
    if(isFirstSame==1){
        panagrammaticLipogram.add(tmp);
    }



    //File writer
    String str = "File Handling in Java using FileWriter and FileReader"; 
    FileWriter fw=new FileWriter("output.txt"); 
    for (int i = 0; i < str.length(); i++){
         fw.write(str.charAt(i));
    }
    fw.close(); 
  } 
} 