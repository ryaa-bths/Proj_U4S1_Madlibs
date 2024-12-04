import java.util.LinkedList;

public class Story{


    protected String noun;
    protected String adjective;
    protected String verb;

    protected String line1;
    protected String line2;
    protected String line3;
    protected String line4;
    //can randomize elements index, do later
    LinkedList<String> words = new LinkedList<String>();


    /*"I once wrote a java program"
    " for a project"
    ", but my program"
    " was too complicated
     and advanced
      for me. I decided to start over on a new project
      , and so i started writing
       this."

       2 nouns: program, project
       2 adj: complicated, advanced (past)
       1 adv: writing (present)
     */

    public Story(){
        this.words = words;
    }


    //replace the add methods with just addWord. but it's easier to type those in when running/programming
    public String getNoun() {
        return noun;
    }

    //public void setWord(int word) {
    //    this.words = words.get(noun);
    //}
    public void addNoun(String noun) {
        words.add(noun);
    }



    //

    public String toString(){

        String s = ("I once wrote a java " + words.get(0) + " for a \n" + words.get(1) + ", but my " + words.get(0) + " was too " + words.get(2) + " and " + words.get(3) + "  for me. \nI decided to start over on a new " + words.get(1) + "  , and so i started " + words.get(4) + " this.");
        return s;
    }

    public static void main(String[] args){
        Story test = new Story();

    }

}
