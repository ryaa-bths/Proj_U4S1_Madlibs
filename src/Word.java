public class Word {


    //needs methods to get and set word
    String thisWord;

    public Word(String thisWord) {
        this.thisWord = thisWord;
    }

    public String toString() {
        return thisWord;
    }

    public static void main(String[] args) {
        Word myWord = new Word("test");
        System.out.println(myWord);
        System.out.println("Welcome to mad libs, today we will " + myWord);
        Adj myAdj = new Adj("salty");
        System.out.println(myAdj);

    }

}
