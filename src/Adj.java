public class Adj extends Word{

    public Adj(String thisWord) {
        //this method makes sure that all adjectives end in "Y"
        if (thisWord.substring(thisWord.length() - 1).equals("y")){

        }
        super(thisWord);
    }

    public static void main(String[] args) {
        Adj salty = new Adj("salty");
        System.out.println(salty);
    }
}
