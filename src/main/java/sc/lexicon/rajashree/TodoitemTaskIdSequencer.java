package sc.lexicon.rajashree;

public class TodoitemTaskIdSequencer {

    static    int currentId;

    public static int nextId() {
        return ++currentId;
    }
    public static int getCurrentId() {
        return currentId;
    }
    public static void setCurrentId(int currentId) {
        TodoitemTaskIdSequencer.currentId = currentId;
    }
}
