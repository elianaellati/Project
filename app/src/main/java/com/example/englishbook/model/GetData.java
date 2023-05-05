package com.example.englishbook.model;

import java.util.ArrayList;

public class GetData {
    private ArrayList<English> english=new ArrayList<>();
    private int counter;
public GetData(){
english.add(new English("Went","Past Simple"));
english.add(new English("Saw","Past Simple"));
english.add(new English("Did","Past Simple"));
english.add(new English("Study","Present Simple"));
english.add(new English("Washes up","Present Simple"));
english.add(new English("Don't","Present Simple"));

}

public String score(String answer,String text){
    counter =0;
    String correct="";
    String[] tokens=answer.split(",");
    for(int i=0;i<tokens.length;++i){
        for( int j=0;j< english.size();++j){
            if(tokens[i].compareToIgnoreCase(english.get(j).getAnswer())==0  ) {
                ++counter;
            } if(text.compareToIgnoreCase(english.get(j).getType())==0 && !correct.contains(english.get(j).getAnswer())){
                correct=correct+" - "+english.get(j).getAnswer();
            }
        }
    }

    String result="The Final Score : "+counter+"/3"+"\n"+"" +
                  "The Correct answers is : "+correct;
    return result;
}
    public String [] types(){
         String [] types=new String []{"Past Simple", "Present Simple"};
         return types;
    }

}
