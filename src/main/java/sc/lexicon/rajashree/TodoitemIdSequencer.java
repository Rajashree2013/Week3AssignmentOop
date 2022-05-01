package sc.lexicon.rajashree;

public class TodoitemIdSequencer {

    static    int currentId;

    public static int nextId() {
        return ++currentId;
    }
    public static int getCurrentId() {
        return currentId;
    }
    public static void setCurrentId(int currentId) {
        TodoitemIdSequencer.currentId = currentId;
    }
}
